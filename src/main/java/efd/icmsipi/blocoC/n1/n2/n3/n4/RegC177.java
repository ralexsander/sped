package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegC177 {

    @Inclui
    private final String reg = "C177";

    @Inclui
    private String codSeloIpi;

    @Inclui
    private Long qtSeloIpi;

    @Inclui
    private String codInfItem;

    public RegC177(String codSeloIpi, Long qtSeloIpi, String codInfItem) {
        this.codSeloIpi = codSeloIpi;
        this.qtSeloIpi = qtSeloIpi;
        this.codInfItem = codInfItem;
    }

    public RegC177(){}
}