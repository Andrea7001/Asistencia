package esfe.Asistencia.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class homeController {
    @RequestMapping("/")

    public String index(){
        return "home/index";
    }
}
