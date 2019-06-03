package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK235;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class RegK230 {

    @Inclui
    private final String reg = "K230";

    @Inclui
    private LocalDate dtIniOp;

    @Inclui
    private LocalDate dtFinOp;

    @Inclui
    private String codDocOp;

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdEnc;

    @Filho
    private List<RegK235> regK235;

    public RegK230(LocalDate dtIniOp, LocalDate dtFinOp, String codDocOp, String codItem, BigDecimal qtdEnc) {
        this.dtIniOp = dtIniOp;
        this.dtFinOp = dtFinOp;
        this.codDocOp = codDocOp;
        this.codItem = codItem;
        this.qtdEnc = qtdEnc;
    }

    public RegK230(){}
}