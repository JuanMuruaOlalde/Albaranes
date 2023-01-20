package es.susosise.albaranes;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import es.susosise.albaranes.albaranes.ManejoDeAlbaranes;
import es.susosise.albaranes.albaranes.ManejoDeAlbaranesParaPruebas;
import es.susosise.albaranes.clientes.ManejoDeClientes;
import es.susosise.albaranes.albaranes.Albaran;
import es.susosise.albaranes.albaranes.Albaran_dto;

@RestController
public class EndpointsAPI {

    @Autowired
    ManejoDeAlbaranes albaranes;

    @GetMapping("/albaranes/{id}")
    public Albaran_dto enviarDatosDeUnAlbaran(@PathVariable String id) {
        // TODO _pendiente completar esta funcion para realmente enviar el albaran
        // solicitado.
        return new Albaran_dto(ManejoDeAlbaranesParaPruebas.getAlbaranDePrueba(42));
    }
}
