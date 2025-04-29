package com.unialfa.timefutebol.service;

import com.unialfa.timefutebol.model.Cidade;
import com.unialfa.timefutebol.repositoy.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public void salvar(Cidade cidade) {
        cidadeRepository.save(cidade);
    }

    public List<Cidade> listarTodos() {
        return cidadeRepository.findAll();
    }

    public Cidade buscarPorId(Long id) {
        return cidadeRepository.findById(id).get();
    }

    public void remover(Long id) {
        cidadeRepository.deleteById(id);
    }

    public Cidade listarPorId(Long id) {
        return cidadeRepository.findById(id).get();
    }
}
