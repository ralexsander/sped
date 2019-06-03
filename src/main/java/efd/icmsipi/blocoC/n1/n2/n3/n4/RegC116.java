package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class RegC116 {

    @Inclui
    private final String reg = "C116";

    @Inclui
    private String codMod;

    @Inclui
    private Long nrSat;

    @Inclui
    private String chvNfe;

    @Inclui
    private Integer numCfe;

    @Inclui
    private LocalDate dtDoc;

    public RegC116(String codMod, Long nrSat, String chvNfe, Integer numCfe, LocalDate dtDoc) {
        this.codMod = codMod;
        this.nrSat = nrSat;
        this.chvNfe = chvNfe;
        this.numCfe = numCfe;
        this.dtDoc = dtDoc;
    }

    public RegC116(){}
}
