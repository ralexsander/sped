package efd.icmsipi.blocoE.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.BlocoE510;
import efd.icmsipi.blocoE.n1.n2.n3.BlocoE520;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class BlocoE500 {

    @Inclui
    private final String reg = "E500";

    @Inclui
    private String indApur;

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

    @Filho
    private List<BlocoE510> blocoE510;

    @Filho
    private BlocoE520 blocoE520;


}