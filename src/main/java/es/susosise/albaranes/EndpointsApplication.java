package es.susosise.albaranes;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

import es.susosise.albaranes.albaranes.Albaran;
import es.susosise.albaranes.albaranes.Albaran_dto;
import es.susosise.albaranes.albaranes.ManejoDeAlbaranes;

@Controller
public class EndpointsApplication {

    @Autowired
    ManejoDeAlbaranes albaranes;

    @Autowired
    MisPropiedades mispropiedades;

    @GetMapping("/")
    public String mostrarElUltimoAlbaran() {
        return "redirect:/ConsultarAlbaranes/1";
    }
    @GetMapping("/ConsultarAlbaranes/{cuantosAlbaranes}")
    public String mostrarLosUltimosAlbaranes(@PathVariable(value = "cuantosAlbaranes") int cuantosAlbaranes, Model model) {
        if (cuantosAlbaranes < 1) {cuantosAlbaranes = 1;}
        Page<Albaran> ultimosAlbaranes = albaranes.getUltimosAlbaranes(cuantosAlbaranes);
        ArrayList<Albaran_dto> albaranes_dto = new ArrayList<>();
        for (Albaran albaran : ultimosAlbaranes.toList()) {
            albaranes_dto.add(new Albaran_dto(albaran));
        }
        model.addAttribute("albaranes", albaranes_dto);
        model.addAttribute("myGoogleMapsAPIKey", mispropiedades.getGoogleMapsAPIkey());
        return "ConsultarAlbaranes";
    }

    @PostMapping("/ConsultarAlbaranes")
    public String mostrarLosUltimosAlbaranes(@RequestParam(name = "cuantosAlbaranes") String cuantosAlbaranes) {
        return "redirect:/ConsultarAlbaranes/" + cuantosAlbaranes;
    }

}
