package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.n4.BlocoD120;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class BlocoD110 {

    @Inclui
    private final String reg = "D110";

    @Inclui
    private Integer numItem;

    @Inclui
    private String codItem;

    @Inclui
    private BigDecimal vlServ;

    @Inclui
    private BigDecimal vlOut;

    @Filho
    private List<BlocoD120> blocoD120;

}