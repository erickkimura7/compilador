/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerador;

import java.util.ArrayList;

/**
 *
 * @author erickkimura
 */
public class Compiladores {

    Dados dados = new Dados();

    public static void main(String args[]) {
        ArrayList<String> testes = new ArrayList<String>();
        Compiladores ger = new Compiladores();
        int maior = 0;
        int menor = 100;
        int realizados = 0;

        for (int p = 0; p < 100000; p++) {
            String novo = "";
            int teste[] = {1, 6, 3, 2, 9, 3, 2, 7, 4, 2, 10, 4, 2, 5, 1,7, 3, 8, 1};
                        //56-24 = 32
                        //32/6 = 5
                        //9,11,14,17
            for (int i = 0; i < teste.length; i++) {
                
                if (teste[i] >= 5) {
                    novo += ger.generate(teste[i], 1);
                } else if (i == 5 || i == 6 || i == 9 || i == 11 || i == 14 || i == 17) {
                    novo += ger.generate(teste[i], ger.random(5));
                } else  {
                    novo += ger.generate(teste[i], ger.random(5)+1);
                }

            }
            System.out.println(novo);
            System.out.println("tamanho : " + novo.length());
            testes.add(novo);
            realizados++;
            if (novo.length() < menor) {
                menor = novo.length();
            }
            if (novo.length() > maior) {
                maior = novo.length();
            }
            
        }
        int l = 0;
        
        System.out.println("maior : " + maior);
        System.out.println("menor : " + menor);
        System.out.println("testes : " + realizados);

    }

    // gera um numero aleatorio
    int random(int max) {
        int rand = (int) (Math.random() * max);
        return rand;
    }

    // Gera uma String que ira fazer parte da senha gerada
    String generate(int escolha, int rand) {
        String novo = "";
        String temp;
        for (int i = 0; i < rand; i++) {
            switch (escolha) {
                case 1:
                    novo += dados.L1.charAt(random(dados.L1.length()));
                    break;
                case 2:
                    novo += dados.L2.charAt(random(dados.L2.length()));
                    break;
                case 3:
                    novo += dados.L3.charAt(random(dados.L3.length()));
                    break;
                case 4:
                    novo += dados.L4.charAt(random(dados.L4.length()));
                    break;
                case 5:
                    novo += dados.N1.charAt(random(dados.N1.length()));
                    break;
                case 6:
                    novo += dados.N2.charAt(random(dados.N2.length()));
                    break;
                case 7:
                    novo += dados.N3.charAt(random(dados.N3.length()));
                    break;
                case 8:
                    novo += dados.E1.charAt(random(dados.E1.length()));
                    break;
                case 9:
                    novo += dados.E2.charAt(random(dados.E2.length()));
                    break;
                case 10:
                    novo += dados.E3.charAt(random(dados.E3.length()));
                    break;

                default:
                    break;
            }

            if (escolha >= 5) {
                break;
            }
        }

        return novo;
    }

}
