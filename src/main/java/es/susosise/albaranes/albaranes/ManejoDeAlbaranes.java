package es.susosise.albaranes.albaranes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManejoDeAlbaranes {

    @Autowired
    AlbaranCabecera_persistencia cabeceras;

    @Autowired
    AlbaranLinea_persistencia lineas;

    public ManejoDeAlbaranes(AlbaranCabecera_persistencia cabeceras, AlbaranLinea_persistencia lineas) {
        this.cabeceras = cabeceras;
        this.lineas = lineas;
    }

}
