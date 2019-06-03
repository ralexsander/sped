package efd.icmsipi.blocoK.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegK275 {

    @Inclui
    private final String reg = "K275";

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdCorPos;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdCorNeg;

    @Inclui
    private String codInsSubst;

    public RegK275(String codItem, BigDecimal qtdCorPos, BigDecimal qtdCorNeg, String codInsSubst) {
        this.codItem = codItem;
        this.qtdCorPos = qtdCorPos;
        this.qtdCorNeg = qtdCorNeg;
        this.codInsSubst = codInsSubst;
    }

    public RegK275(){}
}