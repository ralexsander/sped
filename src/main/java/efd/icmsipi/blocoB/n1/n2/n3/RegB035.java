package efd.icmsipi.blocoB.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegB035 {

    @Inclui
    private final String reg = "B035";

    @Inclui
    private BigDecimal vlContP;

    @Inclui
    private BigDecimal vlBcIssP;

    @Inclui
    private BigDecimal aliqIss;

    @Inclui
    private BigDecimal vlIssP;

    @Inclui
    private BigDecimal vlIsntIssP;

    @Inclui
    private String codServ;

    public RegB035(BigDecimal vlContP, BigDecimal vlBcIssP, BigDecimal aliqIss, BigDecimal vlIssP, BigDecimal vlIsntIssP, String codServ) {
        this.vlContP = vlContP;
        this.vlBcIssP = vlBcIssP;
        this.aliqIss = aliqIss;
        this.vlIssP = vlIssP;
        this.vlIsntIssP = vlIsntIssP;
        this.codServ = codServ;
    }

    public RegB035(){}
}
