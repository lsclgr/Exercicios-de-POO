
package projetocarta;

public class Carta {
    private int naipe;
    private int valor;

    public Carta() {
    }

    public Carta(int naipe, int valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public int getNaipe() {
        return naipe;
    }

    public int getValor() {
        return valor;
    }
    
    public String toString(){
        String stValor="";
        String stNaipe="";
        
        switch(this.valor){
            case 1:{
                stValor = "Ás";
            }break;
            case 2:{
                stValor = "Dois";
            }break;
            case 3:{
                stValor = "Três";
            }break;
            case 4:{
                stValor = "Quatro";
            }break;
            case 5:{
                stValor = "Cinco";
            }break;
            case 6:{
                stValor = "Seis";
            }break;
            case 7:{
                stValor = "Sete";
            }break;
            case 8:{
                stValor = "Oito";
            }break;
            case 9:{
                stValor = "Nove";
            }break;
            case 10:{
                stValor = "Dez";
            }break;
            case 11:{
                stValor = "Valete";
            }break;
            case 12:{
                stValor = "Dama";
            }break;
            case 13:{
                stValor = "Rei";
            }break;
            
        }
        switch(this.naipe){
            case 1:{
                stNaipe = "ouros";
            }break;
            case 2:{
                stNaipe = "paus";
                if(this.valor==4){
                    return "ZAP!!!";
                }
            }break;
            case 3:{
                stNaipe = "copas";
            }break;
            case 4:{
                stNaipe = "espadas";
            }break;
        }
        return stValor+" "+stNaipe;
    }
}
