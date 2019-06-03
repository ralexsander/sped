package efd.icmsipi.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegD697 {

    @Inclui
    private final String reg = "D697";

    @Inclui
    private String uf;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal vlIcms;

    public RegD697(String uf, BigDecimal vlBcIcms, BigDecimal vlIcms) {
        this.uf = uf;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
    }

    public RegD697(){}
}