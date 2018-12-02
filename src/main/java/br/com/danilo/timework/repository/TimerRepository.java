package br.com.danilo.timework.repository;

import br.com.danilo.timework.domain.Timer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface TimerRepository extends ReactiveMongoRepository<Timer, Integer> {

    Flux<Timer> findByDataLancamento(String dataLancamento);

}
