import java.util.ArrayList;
import java.util.Scanner;

import Model.NaoPerecivel;
import Model.Perecivel;

public class App {
    public static void main(String[] args) throws Exception {
        Perecivel cPerecivel = new Perecivel();
        NaoPerecivel cNaoPerecivel = new NaoPerecivel();
        ArrayList<Perecivel>ListaPereciveis = new ArrayList();
        ArrayList<NaoPerecivel>ListaNaoPereciveis = new ArrayList();
        Scanner e = new Scanner(System.in);
        int opcao = 0;
        do{
            try{
                System.out.println("Digite uma opção" +
                "\n 1 - Cadastrar produto perecivel" +
                "\n 2 - Cadastrar produto não perecivel" +
                "\n 3 - Listar produtos pereciveis" +
                "\n 4 - Listar produtos não pereciveis" +                                
                "\n 5 - Sair");
                opcao = e.nextInt();
                switch (opcao) {
                    case 1:
                        cPerecivel = new Perecivel();
                        cPerecivel.Cadastrar();
                        ListaPereciveis.add(cPerecivel);
                        break;
                    case 2:
                        cNaoPerecivel = new NaoPerecivel();
                        cNaoPerecivel.Cadastrar();
                        ListaNaoPereciveis.add(cNaoPerecivel);
                        break;
                    case 3:
                        for (Perecivel c:ListaPereciveis){
                            System.out.println(c.toString());
                        }
                        break;
                    case 4:
                        for (NaoPerecivel c:ListaNaoPereciveis){
                            System.out.println(c.toString());
                        }
                        break;
                }
                    }catch (Exception ex) {
                            System.out.println("Ocorreu um erro: "+ex.getMessage());
            }
        } while (opcao !=5);
    }

}
