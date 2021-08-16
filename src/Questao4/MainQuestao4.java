package Questao4;

import java.util.Locale;
import java.util.Scanner;

public class MainQuestao4 {

    public static void main(String[] args) {

        String opcao;
        Scanner scn = new Scanner(System.in);

        do{
            System.out.println("Em que turno você trabalha? \n M - Manhã \n T - tarde \n N - noite");
            opcao = scn.next();
            if(opcao.toUpperCase().equals("M")){
                System.out.println("Bom dia!");
            }else if(opcao.toUpperCase().equals("T")){
                System.out.println("Boa tarde");
            }else if(opcao.toUpperCase().equals("N")){
                System.out.println("Boa noite!");
            }else{
                System.out.println("Valor inválido");
            }
        }while(opcao.length()>1); //do while para caso digitem mais de um caractére.


    }
}
