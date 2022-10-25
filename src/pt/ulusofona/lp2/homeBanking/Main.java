package pt.ulusofona.lp2.homeBanking;

import org.apache.groovy.contracts.ast.GContractsASTTransformation;

public class Main {

    // teste zero
    // teste
    // Ola Mundo
    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria(100);
        conta.depositar(50);
        conta.levantar(70);
        System.out.println(conta.getSaldo());

    }

}
