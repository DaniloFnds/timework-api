package br.com.danilo.timework.repository;

import br.com.danilo.timework.domain.Timer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TimerRepository extends JpaRepository<Timer, Integer> {

    List<Timer> findByDataLancamento(String dataLancamento);

}
