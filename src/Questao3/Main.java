package Questao3;

public class Main {
    public static void main(String[] args) {

        Pessoa [] pessoas = new Pessoa[6];
        pessoas[0] = new Paulista();
        pessoas[1] = new Mineiro();
        pessoas[2] = new Carioca();
        pessoas[3] = new Paulista();
        pessoas[4] = new Mineiro();
        pessoas[5] = new Carioca();

        for (int i = 0; i < 6; i++) {
            System.out.println(pessoas[i].giria());
        }


    }
}
