
package projetocinema;

public class Cinema {
    private String endereco;
    private String nome;
    private int capMaxima;
    private int horaAbert;
    private int horaFechamento;
    private double telefone;
    private String email;

    public Cinema() {
    }

    public Cinema(String endereco, String nome, int capMaxima, int horaAbert, int horaFechamento, double telefone, String email) {
        this.endereco = endereco;
        this.nome = nome;
        this.capMaxima = capMaxima;
        this.horaAbert = horaAbert;
        this.horaFechamento = horaFechamento;
        this.telefone = telefone;
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public int getHoraAbert() {
        return horaAbert;
    }

    public void setHoraAbert(int horaAbert) {
        this.horaAbert = horaAbert;
    }

    public int getHoraFechamento() {
        return horaFechamento;
    }

    public void setHoraFechamento(int horaFechamento) {
        this.horaFechamento = horaFechamento;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
