package efd.contribuicoes.blocoD.n1.n2.n3.n4;

import org.junit.Assert;
import org.junit.Test;

public class RegD509Test {

    @Test
    public void teste(){
        Assert.assertEquals("D509", new RegD509().getReg());
    }

}
