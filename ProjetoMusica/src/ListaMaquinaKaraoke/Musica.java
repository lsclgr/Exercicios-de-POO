
package ListaMaquinaKaraoke;

public class Musica {
    private String artista;
    private String nomeMusica;
    private double duracao;
    private int anoLancamento;
    private String genero;

    public Musica() {
    }

    public Musica(String artista, String nomeMusica, double duracao, int anoLancamento, String genero) {
        this.artista = artista;
        this.nomeMusica = nomeMusica;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return this.nomeMusica + "  /   "  +this.artista+"   /   "+this.duracao; 
    }
}
