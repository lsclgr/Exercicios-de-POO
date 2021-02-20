
package projetocarta;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class Baralho {
   private Vector<Carta> cartas;

    public Baralho() {
        this.cartas=new Vector<>();
        criarCarta();
    }

    public Baralho(Vector<Carta> cartas) {
        this.cartas = cartas;
    }

    public void criarCarta(){
        for(int i = 1;i<=13;i++){
            for(int j = 1;j<=4;j++){
                Carta temp = new Carta(j,i);
                this.cartas.add(temp);
            }
        }
    }
   
   public Vector<Carta> distibuiCartas(int numCartas){
       //embaralhando
       Collections.shuffle(this.cartas);
       Vector<Carta> cartasUsuario = new Vector<>();
       for(int i = 0;i<numCartas;i++){
           if(!this.cartas.isEmpty()){
            cartasUsuario.add(this.cartas.remove(0));
           }
       }
       return cartasUsuario;
   }
   
   public void novaRodada(){
       this.cartas.clear();
       criarCarta();
   }
}
