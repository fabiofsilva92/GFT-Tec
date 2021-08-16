package Questao2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o salário do colaborador: ");
        Double salario = scn.nextDouble();
        Double reajuste;

        if(salario<=1600){
            reajuste = 1.25;
        }else if( salario > 1600 && salario < 3000){
            reajuste = 1.20;
        }else if( salario >= 3000 && salario < 5000){
            reajuste = 1.15;
        }else{
            reajuste = 1.10;
        }

        Double percentual = (reajuste*100)-100;
        Double aumento = (salario*reajuste) - salario;
        Double novoSalario = (salario*reajuste);


        System.out.println("Salário antes do reajuste: R$ "+salario);
        System.out.println("Percentual de aumento aplicado: " +percentual+ "%");
        System.out.println("Valor do aumento: R$" + aumento);
        System.out.println("Novo salário: R$" +novoSalario);



    }

}
