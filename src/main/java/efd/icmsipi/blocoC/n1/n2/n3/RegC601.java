package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegC601 {

    @Inclui
    private final String reg = "C601";

    @Inclui
    private Integer numDocCanc;

    public RegC601(Integer numDocCanc) {
        this.numDocCanc = numDocCanc;
    }

    public RegC601(){}
}