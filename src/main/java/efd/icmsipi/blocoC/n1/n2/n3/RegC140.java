package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.RegC141;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
public class RegC140 {

    @Inclui
    private final String reg = "C140";

    @Inclui
    private String indEmit;

    @Inclui
    private String indTit;

    @Inclui
    private String descTit;

    @Inclui
    private String numTit;

    @Inclui
    private Integer qtdParc;

    @Inclui
    private BigDecimal vlTit;

    @Filho
    private List<RegC141> regC141;

    public RegC140(String indEmit, String indTit, String descTit, String numTit, Integer qtdParc, BigDecimal vlTit) {
        this.indEmit = indEmit;
        this.indTit = indTit;
        this.descTit = descTit;
        this.numTit = numTit;
        this.qtdParc = qtdParc;
        this.vlTit = vlTit;
    }

    public RegC140(){}
}
