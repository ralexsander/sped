package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegC509 {

    @Inclui
    private final String reg = "C509";

    @Inclui
    private String numProc;

    @Inclui
    private String indProc;

}
