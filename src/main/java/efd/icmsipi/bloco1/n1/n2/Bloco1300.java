package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class Bloco1300 {

    @Inclui
    private final String reg = "1300";

    @Inclui
    private String codItem;

    @Inclui
    private LocalDate dtFech;

    @Inclui(casasDecimais = 3)
    private BigDecimal estqAbert;

    @Inclui(casasDecimais = 3)
    private BigDecimal volEntr;

    @Inclui(casasDecimais = 3)
    private BigDecimal volDisp;

    @Inclui(casasDecimais = 3)
    private BigDecimal volSaidas;

    @Inclui(casasDecimais = 3)
    private BigDecimal estqEscr;

    @Inclui(casasDecimais = 3)
    private BigDecimal valAjPerda;

    @Inclui(casasDecimais = 3)
    private BigDecimal valAjGanho;

    @Inclui(casasDecimais = 3)
    private BigDecimal fechFisico;

}