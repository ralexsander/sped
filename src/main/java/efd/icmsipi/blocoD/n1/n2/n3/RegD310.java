package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegD310 {

    @Inclui
    private final String reg = "D310";

    @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Inclui
    private BigDecimal vlServ;

    @Inclui
    private BigDecimal vlbcIcms;

    @Inclui
    private BigDecimal vlIcms;

    public RegD310(Integer codMunOrig, BigDecimal vlServ, BigDecimal vlbcIcms, BigDecimal vlIcms) {
        this.codMunOrig = codMunOrig;
        this.vlServ = vlServ;
        this.vlbcIcms = vlbcIcms;
        this.vlIcms = vlIcms;
    }

    public RegD310(){}
}