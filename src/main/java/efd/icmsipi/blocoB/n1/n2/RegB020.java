package efd.icmsipi.blocoB.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoB.n1.n2.n3.RegB025;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class RegB020 {

    @Inclui
    private final String reg = "B020";

    @Inclui
    private String indOper;

    @Inclui
    private String indEmit;

    @Inclui
    private String codPart;

    @Inclui
    private String codMod;

    @Inclui
    private String codSit;

    @Inclui
    private String ser;

    @Inclui
    private Integer numDoc;

    @Inclui
    private String chvNfe;

    @Inclui
    private LocalDate dtDoc;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunServ;

    @Inclui
    private BigDecimal vlCont;

    @Inclui
    private BigDecimal vlMatTerc;

    @Inclui
    private BigDecimal vlSub;

    @Inclui
    private BigDecimal vlInstIss;

    @Inclui
    private BigDecimal vlDedBc;

    @Inclui
    private BigDecimal vlBcIss;

    @Inclui
    private BigDecimal vlBsIssRt;

    @Inclui
    private BigDecimal vlIssRt;

    @Inclui
    private BigDecimal vlIss;

    @Inclui
    private String codInfObs;

    @Filho
    private List<RegB025> regB025;

    public RegB020(String indOper, String indEmit, String codPart, String codMod, String codSit, String ser, Integer numDoc, String chvNfe, LocalDate dtDoc, Integer codMunServ, BigDecimal vlCont, BigDecimal vlMatTerc, BigDecimal vlSub, BigDecimal vlInstIss, BigDecimal vlDedBc, BigDecimal vlBcIss, BigDecimal vlBsIssRt, BigDecimal vlIssRt, BigDecimal vlIss, String codInfObs) {
        this.indOper = indOper;
        this.indEmit = indEmit;
        this.codPart = codPart;
        this.codMod = codMod;
        this.codSit = codSit;
        this.ser = ser;
        this.numDoc = numDoc;
        this.chvNfe = chvNfe;
        this.dtDoc = dtDoc;
        this.codMunServ = codMunServ;
        this.vlCont = vlCont;
        this.vlMatTerc = vlMatTerc;
        this.vlSub = vlSub;
        this.vlInstIss = vlInstIss;
        this.vlDedBc = vlDedBc;
        this.vlBcIss = vlBcIss;
        this.vlBsIssRt = vlBsIssRt;
        this.vlIssRt = vlIssRt;
        this.vlIss = vlIss;
        this.codInfObs = codInfObs;
    }

    public RegB020(){}
}
