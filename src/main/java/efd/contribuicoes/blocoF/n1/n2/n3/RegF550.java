package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoF.n1.n2.n3.n4.RegF211;
import efd.contribuicoes.blocoF.n1.n2.n3.n4.RegF559;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

public class RegF550 {

    @Getter @Inclui
private final String reg = "F550";

    @Getter @Setter @Inclui
    private BigDecimal vlRecComp;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Setter @Inclui
    private BigDecimal vlDescPis;

    @Getter @Setter @Inclui
    private BigDecimal vlBcPis;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Getter @Setter @Inclui
    private BigDecimal vlPis;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Setter @Inclui
    private BigDecimal vlDescCofins;

    @Getter @Setter @Inclui
    private BigDecimal vlBcCofins;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Getter @Setter @Inclui
    private BigDecimal vlCofins;

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Inclui
    private String infoCompl;

    @Getter @Setter @Filho
    private List<RegF559> regF559;

    public RegF550(BigDecimal vlRecComp, Integer cstPis, BigDecimal vlDescPis, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal vlPis, Integer cstCofins, BigDecimal vlDescCofins, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal vlCofins, String codMod, Integer cfop, String codCta, String infoCompl) {
        this.vlRecComp = vlRecComp;
        this.cstPis = cstPis;
        this.vlDescPis = vlDescPis;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.vlPis = vlPis;
        this.cstCofins = cstCofins;
        this.vlDescCofins = vlDescCofins;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.vlCofins = vlCofins;
        this.codMod = codMod;
        this.cfop = cfop;
        this.codCta = codCta;
        this.infoCompl = infoCompl;
    }

    public RegF550(){}
}
