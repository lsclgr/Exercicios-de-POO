
package ListaMaquinaKaraoke;

import java.util.Scanner;
import java.util.Vector;

public class ListaMaquinaKaraoke {

    public static void linhasBranco(int linhas) {
        for (int i = 1; i <= linhas; i++) {
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        
        CDMusica novoCD = new CDMusica();
        
        CDMusica coldPlay = new CDMusica(2018, "vevo", "ColPlay");
        
        Vector<Musica> musicasCD = new Vector<>();
        musicasCD.add(new Musica("coldplay", "something just like this", 180, 2016, "pop"));
        
        CDMusica cdComMusicas = new CDMusica(2018, "IFMG", "INF 2 ano", musicasCD);
        
        Scanner teclado = new Scanner(System.in);
        MaquinaKaraoke maquinaIFMG = new MaquinaKaraoke("IFMG", "v1.0");
        
        while (true) {
            System.out.println(" 1 - add playlist \n 2 - listar playlist \n 3 - play \n 4 - sair");
            int op = teclado.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("Musicas Disponíveis: ");
                    maquinaIFMG.listarMusicasDisponiveis();
                    linhasBranco(2);
                    System.out.println("Escolha a musica para ser adicionada à playList");
                    int indiceMusica = teclado.nextInt();
                    maquinaIFMG.addMusica(indiceMusica);
                    
                }
                    
                break;
                case 2: {
                    linhasBranco(2);
                    maquinaIFMG.listarPlayList();
                }
                break;
                case 3: {
                    maquinaIFMG.play();
                    linhasBranco(2);
                }
                break;
                case 4: {
                }
                break;
                default: {
                    System.err.println("Informe um numero que esta no menu");
                }
            }
        }
    }
    
}
