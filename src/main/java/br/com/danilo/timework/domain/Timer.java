package br.com.danilo.timework.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "TB_TIMER")
@AttributeOverride(name = "id", column = @Column(name = "ID_TIMER"))
@DynamicUpdate
@Getter @Setter
public class Timer extends AbstractPersistable<Integer> {

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "CONTADOR")
    private String contador;

    @Column(name = "NOTA")
    private String nota;

    @Column(name = "DATA_LANCAMENTO")
    private String dataLancamento;

    @Column(name = "DT_INICO")
    private Date inicio;

    @Column(name = "DT_FIM")
    private Date fim;

    @Column(name = "IC_TEMPO_OCORRENDO")
    private boolean tempoCorrendo;
}
