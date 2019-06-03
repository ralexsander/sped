package efd.icmsipi.blocoK.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegK302 {

    @Inclui
    private final String reg = "K302";

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtd;

    public RegK302(String codItem, BigDecimal qtd) {
        this.codItem = codItem;
        this.qtd = qtd;
    }

    public RegK302(){}
}