package efd.icmsipi.blocoB.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoB.n1.n2.n3.RegB510;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;


public class RegB500 {

    @Getter @Inclui
    private final String reg = "B500";

    @Getter @Setter @Inclui
    private BigDecimal vlRec;

    @Getter @Setter @Inclui
    private Integer qtdProf;

    @Getter @Setter @Inclui
    private BigDecimal vlOr;

    @Getter @Setter @Filho
    private List<RegB510> regB510;

    public RegB500(BigDecimal vlRec, Integer qtdProf, BigDecimal vlOr) {
        this.vlRec = vlRec;
        this.qtdProf = qtdProf;
        this.vlOr = vlOr;
    }

    public RegB500(){}
}
