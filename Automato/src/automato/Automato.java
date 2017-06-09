/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automato;

import java.util.ArrayList;

/**
 *
 * @author erick
 */
public class Automato {

    /**
     * @param args the command line arguments
     */
    ArrayList<String> fita;
    Dados dados;
    char estado = 'A';
    boolean certo = false;

    public static void main(String[] args) {
        ArrayList <String> var1 = new ArrayList<String>();
        var1.add("snzow0oomied!j5ytvt$dhgbb2ox5ni*eavvn");
        var1.add("vbbdh2ipjkmgce#lplob5ueef$zfbb9j5ipinn*s");
        var1.add("ogz0olkmihce!mjpgh9ztytud&zrabh38kjlm%uft");
        var1.add("pfw4mmhb#jinfga5uwyffea$c17kjnoj*fjc");
        var1.add("ee2iikcgd!hdcg8qrxug%rvaf39k%xpnx");
        var1.add("wnt2kiafbc@kf6urybd%sredd0njnx9noioj@zkqwn");
        var1.add("pow4lpecgfc@mii5s$wruyafg2frna5kn*ys");
        
        
        
        String var = "xb0moef!jiljag5wsebdc%sxxrh7mxi6m&q";
        Automato aut = new Automato(var);
        System.out.println(aut.teste(var));
        
        for(String in : var1){
            System.out.println(aut.teste(in));
            aut.estado = 'A';
        }
    }

    public Automato(String senha) {
        dados = new Dados();
        fita = new ArrayList<String>();
        for (int i = 0; i < senha.length(); i++) {
            String x = "" + senha.charAt(i);
            fita.add(x);

        }
        fita.add("fim");

    }

    // regex A = [a-z]+.*
    //trocar no J -> K com um numero e nao vazio
    String teste(String senha) {

        switch (estado) {

            case 'A':
                if (senha.matches("[a-z][a-z]+.+")) {
                    senha = senha.replaceFirst("[a-z]", "");
                    estado = 'A';
                    String resp = teste(senha);
                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {

                        return "Erro";
                    }
                } else if (senha.matches("[a-z].+")) {
                    senha = senha.replaceFirst("[a-z]", "");
                    estado = 'M';
                    String resp = teste(senha);
                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {
                        return "Erro";
                    }

                } else {
                    return "Erro";
                }

            case 'B':
                if (senha.matches("[i-p][i-p]+.+")) {
                    senha = senha.replaceFirst("[i-p]", "");
                    estado = 'B';
                    String resp = teste(senha);
                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {
                        return "Erro";
                    }
                } else if (senha.matches("[i-p].+")) {
                    senha = senha.replaceFirst("[i-p]", "");
                    estado = 'C';
                    String resp = teste(senha);

                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {
                        return "Erro";
                    }

                } else {
                    return "Erro";
                }

            case 'C':
                if (senha.matches("[a-h][a-h]+.+")) {
                    senha = senha.replaceFirst("[a-h]", "");
                    estado = 'C';
                    String resp = teste(senha);

                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {
                        return "Erro";
                    }
                } else if (senha.matches("[a-h].+")) {
                    senha = senha.replaceFirst("[a-h]", "");
                    estado = 'N';
                    String resp = teste(senha);

                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {
                        return "Erro";
                    }

                } else {
                    return "Erro";
                }

            case 'D':
                if (senha.matches("[i-p].+")) {
                    senha = senha.replaceFirst("[i-p]", "");
                    estado = 'D';
                    String resp = teste(senha);

                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {
                        System.out.println("");
                        return "Erro";
                    }
                } else {
                    senha = senha.replaceFirst("[i-p]", "");
                    estado = 'E';
                    String resp = teste(senha);

                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {
                        return "Erro";
                    }
                }

            case 'E':
                if (senha.matches("[a-h]+.+")) {
                    senha = senha.replaceFirst("[a-h]", "");
                    estado = 'E';
                    String resp = teste(senha);

                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {
                        return "Erro";
                    }
                } else if (senha.matches("[5-9].+")) {
                    senha = senha.replaceFirst("[5-9]", "");
                    estado = 'F';
                    String resp = teste(senha);

                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {
                        return "Erro";
                    }
                }

            case 'F':
                if (senha.matches("[q-z][q-z]+.+")) {
                    senha = senha.replaceFirst("[q-z]", "");
                    estado = 'F';
                    String resp = teste(senha);

                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {
                        return "Erro";
                    }
                } else if (senha.matches("[q-z].+")) {
                    senha = senha.replaceFirst("[q-z]", "");
                    estado = 'G';
                    String resp = teste(senha);

                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {
                        return "Erro";
                    }

                } else {
                    return "Erro";
                }

            case 'G':
                if (senha.matches("[a-h]+.+")) {
                    senha = senha.replaceFirst("[a-h]", "");
                    estado = 'G';
                    String resp = teste(senha);

                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {
                        return "Erro";
                    }
                } else if (senha.matches("[$%&*].+")) {
                    senha = senha.replaceFirst("[$%&*]", "");
                    estado = 'H';
                    String resp = teste(senha);

                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {
                        return "Erro";
                    }
                } else {
                    return "Erro";
                }

            case 'H':
                if (senha.matches("[q-z]+.+")) {
                    senha = senha.replaceFirst("[q-z]", "");
                    estado = 'H';
                    String resp = teste(senha);

                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {
                        return "Erro";
                    }
                } else {
                    estado = 'I';
                    String resp = teste(senha);

                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {
                        return "Erro";
                    }
                }

            case 'I':
                if (senha.matches("[a-h][a-h]+.+")) {
                    senha = senha.replaceFirst("[a-h]", "");
                    estado = 'I';
                    String resp = teste(senha);

                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {
                        return "Erro";
                    }
                } else if (senha.matches("[a-h].+")) {
                    senha = senha.replaceFirst("[a-h]", "");

                    estado = 'O';
                    String resp = teste(senha);

                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {
                        return "Erro";
                    }
                } else {
                    return "Erro";
                }

            case 'J':
                if (senha.matches("[a-z]+.+")) {
                    senha = senha.replaceFirst("[a-z]", "");
                    estado = 'J';
                    String resp = teste(senha);

                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {
                        return "Erro";
                    }
                } else if (senha.matches("[0-9].+")) {
                    senha = senha.replaceFirst("[0-9]", "");
                    estado = 'K';
                    String resp = teste(senha);

                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {
                        return "Erro";
                    }
                } else {
                    return "Erro";
                }

            case 'K':
                if (senha.matches("[i-p][i-p]+.+")) {
                    senha = senha.replaceFirst("[i-p]", "");
                    estado = 'K';
                    String resp = teste(senha);

                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {
                        return "Erro";
                    }
                } else if (senha.matches("[i-p].+")) {
                    senha = senha.replaceFirst("[i-p]", "");

                    estado = 'P';
                    String resp = teste(senha);

                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {
                        return "Erro";
                    }
                } else {
                    return "Erro";
                }

            case 'L':
                if (senha.matches("[a-z]+")) {
                    senha = senha.replaceFirst("[a-z]", "");
                    estado = 'L';
                    String resp = teste(senha);

                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {
                        return "Erro";
                    }
                } else {
                    return "Acabou";
                }

            case 'M':
                if (senha.matches("[0-4].+")) {
                    senha = senha.replaceFirst("[0-4]", "");

                    estado = 'B';
                    String resp = teste(senha);

                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {
                        return "Erro";
                    }
                } else {
                    return "Erro";
                }

            case 'N':
                if (senha.matches("[!@#].+")) {
                    senha = senha.replaceFirst("[!@#]", "");

                    estado = 'D';
                    String resp = teste(senha);

                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {
                        return "Erro";
                    }
                } else {
                    return "Erro";
                }

            case 'O':
                if (senha.matches("[0-9].+")) {
                    senha = senha.replaceFirst("[0-9]", "");

                    estado = 'J';
                    String resp = teste(senha);

                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {
                        return "Erro";
                    }
                } else {
                    return "Erro";
                }

            case 'P':
                if (senha.matches("[!@#$%&*].+")) {
                    senha = senha.replaceFirst("[!@#$%&*]", "");

                    estado = 'L';
                    String resp = teste(senha);

                    if (resp.equals("Acabou")) {
                        return "Acabou";
                    } else {
                        return "Erro";
                    }
                } else {
                    return "Erro";
                }

            default:
                System.out.println("Error");
                return "Erro";

        }

    }
}
