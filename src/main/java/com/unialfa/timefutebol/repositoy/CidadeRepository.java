package com.unialfa.timefutebol.repositoy;

import com.unialfa.timefutebol.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
