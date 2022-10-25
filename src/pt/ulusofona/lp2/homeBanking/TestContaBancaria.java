package pt.ulusofona.lp2.homeBanking;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class TestContaBancaria {


    @Test
    public void testContaBancaria()
    {
        ContaBancaria conta1 = new ContaBancaria(3);
        assertEquals("3",conta1.getSaldo());


        ContaBancaria conta2 = new ContaBancaria(-3);
        assertEquals("-3",conta2.getSaldo());

    }

    @Test
    public void testDepositar(){
        ContaBancaria conta1 = new ContaBancaria(3);
        conta1.depositar(7);
        assertEquals("10",conta1.getSaldo());

        ContaBancaria conta2 = new ContaBancaria(-5);
        conta2.depositar(6);
        assertEquals("1",conta2.getSaldo());

        ContaBancaria conta3 = new ContaBancaria(1000);
        conta3.depositar(-8);
        assertEquals("Erro",conta3.getSaldo());
    }


    @Test
    public void testLevantar(){


        ContaBancaria conta2 = new ContaBancaria(100000);
        conta2.levantar(100000);
        assertEquals("0", conta2.getSaldo());

        ContaBancaria conta1 = new ContaBancaria(5);
        conta1.levantar(8);
        assertEquals("Erro",conta1.getSaldo());

        ContaBancaria conta3 = new ContaBancaria(9);
        conta3.levantar(0);
        assertEquals("9", conta3.getSaldo());
    }

    @Test
    public void testTransferirPara(){
        ContaBancaria conta1 = new ContaBancaria(7);
        ContaBancaria conta2 = new ContaBancaria(8);

        conta1.transferirPara(conta2,9);
        assertEquals("Erro", conta2.getSaldo());


        conta1.transferirPara(conta1,5);
        assertEquals("Erro",conta1.getSaldo());
    }

        @Test
        public void testTransferirPara2(){
        ContaBancaria conta1 = new ContaBancaria(7);
        ContaBancaria conta2 = new ContaBancaria(8);

        conta1.transferirPara(conta1,5);
        assertEquals("Erro",conta1.getSaldo());
    }

    @Test
    public void testTransferirPara3(){
        ContaBancaria conta1 = new ContaBancaria(10);
        ContaBancaria conta2 = new ContaBancaria(10);

        conta1.transferirPara(conta2,10);

        assertEquals("20",conta2.getSaldo());
        assertEquals("0",conta1.getSaldo());
    }



    @Test
    public void testGetSaldo(){
        ContaBancaria conta5 = new ContaBancaria(8);

        conta5.getSaldo();
        System.out.print(conta5);
    }

}
