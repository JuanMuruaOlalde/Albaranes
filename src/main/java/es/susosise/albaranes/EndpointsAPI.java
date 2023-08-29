package es.susosise.albaranes;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import es.susosise.albaranes.albaranes.ManejoDeAlbaranes;
import es.susosise.albaranes.albaranes.Albaran;
import es.susosise.albaranes.albaranes.Albaran_dto;

@RestController
public class EndpointsAPI {

    @Autowired
    ManejoDeAlbaranes albaranes;

    @GetMapping("/albaranes")
    public List<Albaran_dto> enviarDatosDeLosUltimosAlbaranes(@RequestParam(name = "cuantos") int cuantos)  {
        Page<Albaran> ultimosAlbaranes = albaranes.getUltimosAlbaranes(cuantos);
        ArrayList<Albaran_dto> albaranes_dto = new ArrayList<>();
        for (Albaran albaran : ultimosAlbaranes.toList()) {
            albaranes_dto.add(new Albaran_dto(albaran));
        }
        return albaranes_dto;
    }

    @GetMapping("/albaranes/{numeroDeAlbaran}")
    public Albaran_dto enviarDatosDeUnAlbaran(@PathVariable String numeroDeAlbaran) {
        Optional<Albaran> resultado = albaranes.getAlbaran(numeroDeAlbaran);
        if (resultado.isPresent()) {
            return new Albaran_dto(resultado.get());
        } else {
            throw new NoSuchElementException("No se ha encontrado el albarán " + numeroDeAlbaran);
        }
    }

}
