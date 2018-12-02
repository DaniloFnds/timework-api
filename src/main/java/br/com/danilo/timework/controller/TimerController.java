package br.com.danilo.timework.controller;

import br.com.danilo.timework.domain.Timer;
import br.com.danilo.timework.repository.TimerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping
public class TimerController {

    private final TimerRepository timerRepository;

    @Autowired
    public TimerController(TimerRepository timerRepository) {
        this.timerRepository = timerRepository;
    }

    @RequestMapping(value = "/timer", method = RequestMethod.GET)
    public Flux<Timer> getAll() {
        return timerRepository.findAll();
    }

    @GetMapping("/timer/{data}")
    public Flux<Timer> getAll(@PathVariable String data) {
        return timerRepository.findByDataLancamento(data);
    }

    @PostMapping("/timer")
    public Mono<Timer> adicionarTimer(@RequestBody Timer timer) {
        return timerRepository.save(timer);
    }

    @PutMapping("/timer")
    public Mono<Timer> atualizarTime(@RequestBody Timer timer) {
        return timerRepository.save(timer);
    }
}
