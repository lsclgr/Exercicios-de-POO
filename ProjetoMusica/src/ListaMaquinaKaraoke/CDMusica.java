
package ListaMaquinaKaraoke;

import java.util.Vector;

public class CDMusica {
    //atributos
    private int anoLancamento;
    private String gravadora;
    private String nomeCD;
    private Vector<Musica> musicas;

    //construtores
    public CDMusica() {
        this.musicas = new Vector<>();
    }

    public CDMusica(int anoLancamento, String gravadora, String nomeCD) {
        this.anoLancamento = anoLancamento;
        this.gravadora = gravadora;
        this.nomeCD = nomeCD;
        this.musicas = new Vector<>();
    }

    public CDMusica(int anoLancamento, String gravadora, String nomeCD, Vector<Musica> musicas) {
        this.anoLancamento = anoLancamento;
        this.gravadora = gravadora;
        this.nomeCD = nomeCD;
        this.musicas = musicas;
    }
    
    //encapsulamento
    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getGravadora() {
        return gravadora;
    }

    public String getNomeCD() {
        return nomeCD;
    }
    
    
}
