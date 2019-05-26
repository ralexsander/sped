package efd.icmsipi.blocoE.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.n4.n5.BlocoE531;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class BlocoE530 {

    @Inclui
    private final String reg = "E330";

    @Inclui
    private String indAj;

    @Inclui
    private BigDecimal vlAj;

    @Inclui
    private String codAj;

    @Inclui
    private String indDoc;

    @Inclui
    private String numDoc;

    @Inclui
    private String descrAj;

    @Filho
    private List<BlocoE531> blocoE531;

}