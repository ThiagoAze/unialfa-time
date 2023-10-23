package com.unialfa.timefutebol.api;

import com.unialfa.timefutebol.model.Time;
import com.unialfa.timefutebol.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiTimeController {

    @Autowired
    private TimeService timeService;

    @GetMapping("listar")
    public List<Time> listarTimes(){
        return timeService.listarTodos();
    }
    @GetMapping("listar/{id}")
    public Time listarTimesPorId(@PathVariable(name = "id") Integer id){
        return timeService.listarPorId(id);
    }
}
