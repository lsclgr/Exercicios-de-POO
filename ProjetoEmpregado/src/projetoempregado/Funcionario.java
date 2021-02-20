
package projetoempregado;

public class Funcionario {
    public String nome;
    public String dataNas;
    public int identidade;

    public Funcionario() {
    }

    public Funcionario(String nome, String dataNas, int identidade) {
        this.nome = nome;
        this.dataNas = dataNas;
        this.identidade = identidade;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNas() {
        return dataNas;
    }

    public int getIdentidade() {
        return identidade;
    }

    
}
