package com.unialfa.timefutebol.repositoy;

import com.unialfa.timefutebol.model.Time;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeRepository extends JpaRepository<Time, Integer> {
}
