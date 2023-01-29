package es.susosise.albaranes;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;

import es.susosise.albaranes.albaranes.Albaran;
import es.susosise.albaranes.albaranes.Albaran_dto;
import es.susosise.albaranes.albaranes.ManejoDeAlbaranes;

@Controller
public class EndpointsApplication {

    @Autowired
    ManejoDeAlbaranes albaranes;

    @GetMapping("/ConsultaConPaginaCompleta")
    public String enviarUnaPaginaCompletaConDatosDeLosUltimosAlbaranes(Model model) {
        Page<Albaran> ultimosAlbaranes = albaranes.getUltimosAlbaranes(10);
        ArrayList<Albaran_dto> albaranes_dto = new ArrayList<>();
        for (Albaran albaran : ultimosAlbaranes.toList()) {
            albaranes_dto.add(new Albaran_dto(albaran));
        }
        model.addAttribute("albaranes", albaranes_dto);
        return "ConsultaConPaginaCompleta";
    }

    @GetMapping("/ConsultaConPaginaDinamica")
    public String enviarLaPaginaBaseDesdeLaQueConsultarAlbaranes() {
        return "ConsultaConPaginaDinamica";
    }

    @GetMapping("/pruebadirecta")
    public String mostrarPaginaPrincipal_conDirectos(Model model) {
        Page<Albaran> ultimosAlbaranes = albaranes.getUltimosAlbaranes(10);
        model.addAttribute("albaranes", ultimosAlbaranes.toList());
        return "index";
    }

}
