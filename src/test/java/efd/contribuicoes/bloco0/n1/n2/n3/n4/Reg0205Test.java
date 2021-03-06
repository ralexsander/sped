package efd.contribuicoes.bloco0.n1.n2.n3.n4;

import efd.Conversor;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Reg0205Test {

    @Test
    public void teste(){
        Assert.assertEquals("0205", new Reg0205().getReg());
    }

    @Test
    public void teste2() {
    Reg0205 obj = new Reg0205("Teste", LocalDate.parse("2019-07-10"), LocalDate.parse("2019-07-10"), "Teste");

        String parseado = Conversor.converte(obj);
        String esperado = "|0205|Teste|10072019|10072019|Teste|" + System.getProperty("line.separator");

        Assert.assertEquals(esperado, parseado);
    }
}
