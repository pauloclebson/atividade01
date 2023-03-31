package br.com.atividade01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class AtividadeController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/ola")
    public ModelAndView greeting(
        @RequestParam(name = "name", required = false, defaultValue = "Mundo") String name) {

        ModelAndView model = new ModelAndView();        
        model.addObject("name", name);
        model.setViewName("ola");
        return model;
    }

    
}
