package com.unialfa.timefutebol.service;

import com.unialfa.timefutebol.model.Time;
import com.unialfa.timefutebol.repositoy.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TimeService {

    @Autowired
    private TimeRepository timeRepository;

    @Transactional
    public void salvarTime(Time time) {
        timeRepository.save(time);
    }

    public List<Time> listarTodos() {
        return timeRepository.findAll();
    }

    public Time buscarPorId(Integer id) {
        return timeRepository.findById(id).get();
    }

    public void remover(Integer id) {
        timeRepository.deleteById(id);
    }

    public Time listarPorId(Integer id) {
        return timeRepository.findById(id).get();

    }
}
