package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegC111 {

    @Inclui
    private final String reg = "C111";

    @Inclui
    private String numProc;

    @Inclui
    private String indProc;

    public RegC111(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegC111(){}
}
