package com.unialfa.timefutebol.service;

import com.unialfa.timefutebol.model.Time;
import com.unialfa.timefutebol.repositoy.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class TimeService {

    @Autowired
    private TimeRepository timeRepository;

    public void salvarTime(Time time) {
        timeRepository.save(time);
    }

    public List<Time> listarTodos() {
        return timeRepository.findAll();
    }

    public Time buscarPorId(Integer id) {
        return timeRepository.findById(id).get();
    }

    public void remover(Time time){
        timeRepository.delete(time);
    }
}
