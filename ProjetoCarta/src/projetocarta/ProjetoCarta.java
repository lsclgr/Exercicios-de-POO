
package projetocarta;

import java.util.Stack;
import java.util.Vector;

public class ProjetoCarta {

    public static void main(String[] args) {
        Baralho novoBaralho = new Baralho();
         Vector<Carta> jg1 = novoBaralho.distibuiCartas(3);
         Vector<Carta> jg2 = novoBaralho.distibuiCartas(3);
         Vector<Carta> jg3 = novoBaralho.distibuiCartas(3);
         Vector<Carta> jg4 = novoBaralho.distibuiCartas(3);
         System.out.println(jg1);
         System.out.println(jg2);
         System.out.println(jg3);
         System.out.println(jg4);
    }
    
}
