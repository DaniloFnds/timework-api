package br.com.danilo.timework.domain;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalTime;
import java.util.Date;

@Document("timer")
@Getter
public class Timer {

    @Id
    private String id;
    private String descricao;
    private String contador;
    private String nota;
    private String dataLancamento;
    private Date inicio;
    private Date fim;
    private boolean tempoCorrendo;
}
