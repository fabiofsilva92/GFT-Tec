package Questao1;

import java.util.Random;
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {

        Integer [] pessoas = new Integer[10];
        Scanner scn = new Scanner(System.in);
        Integer[] faixaEtaria = new Integer[5];

        //limpando o vetor
        for (int i = 0; i < 5; i++) {
            faixaEtaria[i] = 0;
        }


        for(int i = 0; i<10; i++){
            System.out.println("Forneça a idade da pessoa "+(i+1)); //o usuário deve fornecer a idade das pessoas
            pessoas[i] = scn.nextInt();

            if(pessoas[i] > 0 && pessoas[i]<= 14){
                faixaEtaria[0]++; //Até 14 anos
            }
            else if(pessoas[i] >14 && pessoas[i]<=29){
                faixaEtaria[1]++; //De 15 a 29 anos
            }
            else if (pessoas[i] > 29 && pessoas[i] <=44) {
                faixaEtaria[2]++;//De 30 a 44 anos
            }
            else if (pessoas[i] > 44 && pessoas[i] <=59){
                faixaEtaria[3]++; // De 45 a 59 anos
            }else{
                faixaEtaria[4]++; //Acima de 60
            }
        }

        System.out.println("Quantidade de pessoas até 14 anos: " + faixaEtaria[0]);
        System.out.println("Quantidade de pessoas De 15 a 29 anos: " + faixaEtaria[1]);
        System.out.println("Quantidade de pessoas De 30 a 44 anos: " + faixaEtaria[2]);
        System.out.println("Quantidade de pessoas De 45 a 59 anos: " + faixaEtaria[3]);
        System.out.println("Quantidade de pessoas Acima de 60: " + faixaEtaria[4]);

        //parte b

        System.out.println("Porcentagem da primeira faixa etária de até 14 anos: "+ faixaEtaria[0]*10 + "%"); //Como a quantidade de pessoas é 10, a porcentagem em relação ao total será *10
        System.out.println("Porcentagem da ultima faixa etária de acima de 60 anos: "+ faixaEtaria[4]*10 + "%");

    }

}
