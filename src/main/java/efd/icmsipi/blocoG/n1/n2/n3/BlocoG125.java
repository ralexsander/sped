package efd.icmsipi.blocoG.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoG.n1.n2.n3.n4.BlocoG126;
import efd.icmsipi.blocoG.n1.n2.n3.n4.BlocoG130;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class BlocoG125 {

    @Inclui
    private final String reg = "G125";

    @Inclui
    private String codIndBem;

    @Inclui
    private LocalDate dtMov;

    @Inclui
    private String tipoMov;

    @Inclui
    private BigDecimal vlImobIcmsOp;

    @Inclui
    private BigDecimal vlImobicmsSt;

    @Inclui
    private BigDecimal vlImobIcmsFrt;

    @Inclui
    private BigDecimal vlImobIcmsDif;

    @Inclui
    private Integer numParc;

    @Inclui
    private  BigDecimal vlParcPass;

    @Filho
    private List<BlocoG126> blocoG126;

    @Filho
    private List<BlocoG130> blocoG130;

}