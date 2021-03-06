package efd.icmsipi.blocoK.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class RegK215 {

    @Getter @Inclui
    private final String reg = "K215";

    @Getter @Setter @Inclui
    private String codItemDes;

    @Getter @Setter @Inclui(casasDecimais = 6)
    private BigDecimal qtdDes;

    public RegK215(String codItemDes, BigDecimal qtdDes) {
        this.codItemDes = codItemDes;
        this.qtdDes = qtdDes;
    }

    public RegK215(){}
}