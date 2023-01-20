package es.susosise.albaranes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;

import es.susosise.albaranes.albaranes.Albaran;
import es.susosise.albaranes.albaranes.ManejoDeAlbaranes;

@Controller
public class EndpointsApplication {

    @Autowired
    ManejoDeAlbaranes albaranes;

    @GetMapping("/")
    public String mostrarPaginaPrincipal(Model model) {
        Page<Albaran> ultimosAlbaranes = albaranes.getUltimosAlbaranes(10);
        model.addAttribute("albaranes", ultimosAlbaranes.toList());
        return "index";
    }

}
