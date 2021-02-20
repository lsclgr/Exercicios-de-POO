
package projetocinema;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class IngressoCinema {
    private int diaCompra;
    private String horaCompra;
    private String nomecomprador;
    private int idadeComprador;
    private int assento;
    private String poltronas[];

    public IngressoCinema() {
    }

    public IngressoCinema(int diaCompra, String horaCompra, String nomecomprador, int idadeComprador, int assento, String[] poltronas) {
        this.diaCompra = diaCompra;
        this.horaCompra = horaCompra;
        this.nomecomprador = nomecomprador;
        this.idadeComprador = idadeComprador;
        this.assento = assento;
        this.poltronas = poltronas;
        
    }

    public int getDiaCompra() {
        return diaCompra;
    }

    public String getHoraCompra() {
        return horaCompra;
    }

    public String getNomecomprador() {
        return nomecomprador;
    }

    public int getIdadeComprador() {
        return idadeComprador;
    }

    public int getAssento() {
        return assento;
    }

    public String[] getPoltronas() {
        return poltronas;
    }

    public void vetPoltronas(int capmax){
        poltronas=new String[capmax];
        for(int i = 0;i<capmax;i++){
            poltronas[i]="";
        }
    }
    
    public void venderIngresso(int capMax){
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        System.out.println("Informe o nome do comprador, a idade do comprador, o dia da compra e a hora da compra");
        String nome = teclado.nextLine();
        int idade = teclado.nextInt();
        int dia = teclado.nextInt();
        String hora = teclado.nextLine();
        System.out.println("Informe o assento, capacidade máxima: "+capMax);
        int assentos = teclado.nextInt();
        while(true){
            if(poltronas[assentos]!=""){
                System.out.println("Esolha outra poltrona, esta já está ocupada");
            }else{
                poltronas[assentos] = nome;
                break;
            }
        }
        System.out.println("o preço é: "+Sessao.calculaPrecoIngesso());
    }
    public String quemEstaSentadoEm(int x){
        return poltronas[x];
    }
}
