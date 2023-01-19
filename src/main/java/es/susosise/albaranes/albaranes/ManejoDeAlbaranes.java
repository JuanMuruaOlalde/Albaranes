package es.susosise.albaranes.albaranes;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

    public void guardar(Albaran unAlbaran) {
        albaranes.save(unAlbaran);
    }

}
