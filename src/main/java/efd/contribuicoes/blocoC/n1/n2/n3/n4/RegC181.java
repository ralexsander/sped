package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegC181 {

    @Inclui
    private final String reg = "C181";

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Inclui
    private BigDecimal vlItem;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private BigDecimal vlBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui(casasDecimais = 3)
    private BigDecimal quantBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPisQuant;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private String codCta;

}
