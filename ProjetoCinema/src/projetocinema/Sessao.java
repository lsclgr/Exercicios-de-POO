
package projetocinema;

import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Vector;

public class Sessao {
    private static String nomeFilme;
    private static String generoFilme;
    private static int faixaEtaria;
    private static double precoSug;
    private static String diasCartaz;
    static Vector<Sessao> novaSessao;
    

    public Sessao() {
        this.novaSessao = new Vector<>();
    }

    public Sessao(String nomeFilme, String generoFilme, int faixaEtaria, double preco, String diasCartaz) {
        this.novaSessao = new Vector<>();
        this.nomeFilme = nomeFilme;
        this.generoFilme = generoFilme;
        this.faixaEtaria = faixaEtaria;
        this.precoSug = preco;
        this.diasCartaz = diasCartaz;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public String getGeneroFilme() {
        return generoFilme;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public double getPreco() {
        return precoSug;
    }

    public String getDiasCartaz() {
        return diasCartaz;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public void setGeneroFilme(String generoFilme) {
        this.generoFilme = generoFilme;
    }

    public void setPreco(double preco) {
        this.precoSug = preco;
    }

    public void setDiasCartaz(String diasCartaz) {
        this.diasCartaz = diasCartaz;
    }
    
    public void criarSessao(){
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        System.out.println("Informe o nome do filme, o genero do filme, a faixa etária, o preco sugerido e os dias que o filme estará em cartaz");
        String nome = teclado.nextLine();
        String genero = teclado.nextLine();
        int faiet = teclado.nextInt();
        double preco = teclado.nextDouble();
        String dias = teclado.nextLine();
        novaSessao.add(new Sessao(nome, genero, faiet, preco, dias));
    }
     
    public static double calculaPrecoIngesso(){
        Scanner teclado = new Scanner(System.in);
        for(int i = 0;i<novaSessao.size();i++){
            System.out.println((i+1)+novaSessao.get(i).getNomeFilme());
        }
        System.out.println("Escolha o filme");
        int x = teclado.nextInt();
        System.out.println("É um estudante? 1 - sim / 2 - não");
        if(teclado.nextInt()==1){
            return novaSessao.get(x-1).getPreco()/2;
        }else{
            return novaSessao.get(x-1).getPreco();  
        }
    }
}
