package efd.icmsipi.blocoC.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.BlocoC310;
import efd.icmsipi.blocoC.n1.n2.n3.BlocoC790;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class BlocoC700 {

    @Inclui
    private final String reg = "C700";

    @Inclui
    private String codMod;

    @Inclui
    private String ser;

    @Inclui
    private Integer nroOrdIni;

    @Inclui
    private Integer nroOrdFin;

    @Inclui
    private LocalDate dtDocIni;

    @Inclui
    private LocalDate dtDocFin;

    @Inclui
    private String nomMest;

    @Inclui
    private String chvCodDig;

    @Filho
    private List<BlocoC790> blocoC790;

}