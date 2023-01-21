package es.susosise.albaranes;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import es.susosise.albaranes.albaranes.ManejoDeAlbaranes;
import es.susosise.albaranes.albaranes.ManejoDeAlbaranesParaPruebas;
import es.susosise.albaranes.albaranes.Albaran;
import es.susosise.albaranes.albaranes.Albaran_dto;

@RestController
public class EndpointsAPI {

    @Autowired
    ManejoDeAlbaranes albaranes;

    @GetMapping("/albaranes/ultimos/{cuantos}")
    public List<Albaran> enviarDatosDeLosUltimosAlbaranes(@PathVariable int cuantos) {
        return albaranes.getUltimosAlbaranes(cuantos).getContent();
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

    @GetMapping("/albaranes/pruebas/{n}")
    public Albaran_dto enviarUnAlbaranDePrueba_usandoDTO(@PathVariable int n) {
        Albaran albaranAEnviar = ManejoDeAlbaranesParaPruebas.getAlbaranDePrueba(n);
        return new Albaran_dto(albaranAEnviar);
    }

    @GetMapping("/albaranes/pruebasdirectas/{n}")
    public Albaran enviarUnAlbaranDePrueba_DIRECTO(@PathVariable int n) {
        Albaran albaranAEnviar = ManejoDeAlbaranesParaPruebas.getAlbaranDePrueba(n);
        return albaranAEnviar;
    }

}
