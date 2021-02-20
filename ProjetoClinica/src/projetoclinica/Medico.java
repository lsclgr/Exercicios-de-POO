package projetoclinica;

public class Medico {
    //atributos
    private double CPF;
    private String nome;
    private String dataNasc;
    private String especializacao;
    private String salaConsultorio;
    private String email;
    private double telefone;
    private int nregistro;
    //email, telefone, n de registro no conselho regional de medicina
    
    //construtores
    public Medico() {
    }

    public Medico(double CPF, String nome, String dataNasc, String especializacao, String salaConsultorio, String email, double telefone, int nregistro) {
        this.CPF = CPF;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.especializacao = especializacao;
        this.salaConsultorio = salaConsultorio;
        this.email = email;
        this.telefone = telefone;
        this.nregistro = nregistro;
    }

    public void setCPF(double CPF) {
        this.CPF = CPF;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public void setSalaConsultorio(String salaConsultorio) {
        this.salaConsultorio = salaConsultorio;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public void setNregistro(int nregistro) {
        this.nregistro = nregistro;
    }
    
    
}
