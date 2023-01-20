package es.susosise.albaranes.albaranes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class ManejoDeAlbaranes {

    @Autowired
    Albaran_persistencia albaranes;

    @Autowired
    LineaDeAlbaran_persistencia lineas;

    public ManejoDeAlbaranes(Albaran_persistencia cabeceras, LineaDeAlbaran_persistencia lineas) {
        this.albaranes = cabeceras;
        this.lineas = lineas;
    }

    public Optional<Albaran> getAlbaran(String numeroDeAlbaran) {
         return albaranes.findByNumeroDeAlbaran(numeroDeAlbaran);
    }

    public Page<Albaran> getUltimosAlbaranes(int cuantos) {
        return albaranes.findAll(PageRequest.of(0, cuantos));
    }

    public void guardar(Albaran unAlbaran) {
        albaranes.save(unAlbaran);
    }

}
