package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Bloco1105;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class Bloco1100 {

    @Inclui
    private final String reg = "1100";

    @Inclui
    private Integer indDoc;

    @Inclui
    private String nroDe;

    @Inclui
    private LocalDate dtDe;

    @Inclui
    private Integer natExp;

    @Inclui
    private Integer nroRe;

    @Inclui
    private LocalDate dtRe;

    @Inclui
    private String chcEmb;

    @Inclui
    private LocalDate dtChc;

    @Inclui
    private LocalDate dtAvb;

    @Inclui(zerosEsquerda = 2)
    private Integer tpChc;

    @Inclui
    private Integer pais;

    @Filho
    private List<Bloco1105> bloco1105;

}