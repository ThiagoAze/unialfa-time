package com.unialfa.timefutebol.controller;

import com.unialfa.timefutebol.model.Cidade;
import com.unialfa.timefutebol.service.CidadeService;
import com.unialfa.timefutebol.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cidade")
public class CidadeController {

    private static final String FORMULARIO_BOASVINDAS = "UniALFA - Formulário de Cidades";
    private static final String LISTA_BOASVINDAS = "UniALFA - Lista de Cidades";

    @Autowired
    private CidadeService service;

    @RequestMapping("novo")
    public String iniciar(Cidade cidade, Model model) {
        model.addAttribute("boasVindas", FORMULARIO_BOASVINDAS);
        return "cidade/formulario";
    }

    @PostMapping("salvar")
    public String salvar(Cidade cidade, Model model) {
        service.salvar(cidade);
        return "redirect:/cidade/listar";
    }

    @GetMapping("listar")
    public String listar(Model model) {
        model.addAttribute("boasVindas", LISTA_BOASVINDAS);
        model.addAttribute("listaCidades", service.listarTodos());
        return "cidade/lista";
    }

    @GetMapping("alterar/{id}")
    public String alterar(@PathVariable Long id, Model model) {
        model.addAttribute("boasVindas", FORMULARIO_BOASVINDAS);
        model.addAttribute("cidade", service.buscarPorId(id));
        return "cidade/formulario";
    }

    @GetMapping("remover/{id}")
    public String remover(@PathVariable Long id, Model model) {
        service.remover(id);
        return "redirect:/cidade/listar";
    }
}
