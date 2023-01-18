package es.susosise.albaranes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import es.susosise.albaranes.albaranes.ManejoDeAlbaranes;

@Controller
public class EndpointsApplication {

    @Autowired
    ManejoDeAlbaranes albaranes;

    @GetMapping("/")
    public String mostrarPaginaPrincipal(Model model) {
        return "index";
    }
}
