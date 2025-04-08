package com.unialfa.timefutebol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    private static final String FORMULARIO_BOASVINDAS = "UniALFA - Times";

    @RequestMapping("/")
    public String iniciar(Model model) {
        model.addAttribute("boasVindas", FORMULARIO_BOASVINDAS);
        return "index";
    }
}
