package efd.icmsipi.blocoD.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.RegD301;
import efd.icmsipi.blocoD.n1.n2.n3.RegD310;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class RegD300 {

    @Inclui
    private final String reg = "D300";

    @Inclui
    private String codMod;

    @Inclui
    private String ser;

    @Inclui
    private Integer sub;

    @Inclui
    private Integer numDocIni;

    @Inclui
    private Integer numDocFin;

    @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Inclui
    private BigDecimal aliqIcms;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private BigDecimal vlOpr;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private BigDecimal vlServ;

    @Inclui
    private BigDecimal vlSeg;

    @Inclui
    private BigDecimal vlOutDesp;

    @Inclui
    private BigDecimal vlbcIcms;

    @Inclui
    private BigDecimal vlIcms;

    @Inclui
    private BigDecimal vlRedBc;

    @Inclui
    private String codObs;

    @Inclui
    private String codCta;

    @Filho
    private List<RegD301> regD301;

    @Filho
    private List<RegD310> regD310;

    public RegD300(String codMod, String ser, Integer sub, Integer numDocIni, Integer numDocFin, Integer cstIcms, Integer cfop, BigDecimal aliqIcms, LocalDate dtDoc, BigDecimal vlOpr, BigDecimal vlDesc, BigDecimal vlServ, BigDecimal vlSeg, BigDecimal vlOutDesp, BigDecimal vlbcIcms, BigDecimal vlIcms, BigDecimal vlRedBc, String codObs, String codCta) {
        this.codMod = codMod;
        this.ser = ser;
        this.sub = sub;
        this.numDocIni = numDocIni;
        this.numDocFin = numDocFin;
        this.cstIcms = cstIcms;
        this.cfop = cfop;
        this.aliqIcms = aliqIcms;
        this.dtDoc = dtDoc;
        this.vlOpr = vlOpr;
        this.vlDesc = vlDesc;
        this.vlServ = vlServ;
        this.vlSeg = vlSeg;
        this.vlOutDesp = vlOutDesp;
        this.vlbcIcms = vlbcIcms;
        this.vlIcms = vlIcms;
        this.vlRedBc = vlRedBc;
        this.codObs = codObs;
        this.codCta = codCta;
    }

    public RegD300(){}
}