package efd.icmsipi.blocoK.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class BlocoK292 {

    @Inclui
    private final String reg = "K292";

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtd;

}