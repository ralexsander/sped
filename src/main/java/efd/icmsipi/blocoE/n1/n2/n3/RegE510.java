package efd.icmsipi.blocoE.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegE510 {

    @Inclui
    private final String reg = "E510";

    @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Inclui
    private String cstIpi;

    @Inclui
    private BigDecimal vlContIpi;

    @Inclui
    private BigDecimal vlBcIpi;

    @Inclui
    private BigDecimal vlIpi;

    public RegE510(Integer cfop, String cstIpi, BigDecimal vlContIpi, BigDecimal vlBcIpi, BigDecimal vlIpi) {
        this.cfop = cfop;
        this.cstIpi = cstIpi;
        this.vlContIpi = vlContIpi;
        this.vlBcIpi = vlBcIpi;
        this.vlIpi = vlIpi;
    }

    public RegE510(){}

}