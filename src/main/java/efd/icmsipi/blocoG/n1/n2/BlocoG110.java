package efd.icmsipi.blocoG.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoG.n1.n2.n3.BlocoG125;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class BlocoG110 {

    @Inclui
    private final String reg = "G110";

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

    @Inclui
    private BigDecimal saldoInIcms;

    @Inclui
    private BigDecimal somParc;

    @Inclui
    private BigDecimal vlTribExp;

    @Inclui
    private BigDecimal vlTotal;

    @Inclui(casasDecimais = 8)
    private BigDecimal indPerSai;

    @Inclui
    private BigDecimal icmsAprop;

    @Inclui
    private BigDecimal somIcmsOc;

    @Filho
    private List<BlocoG125> blocoG125;

}