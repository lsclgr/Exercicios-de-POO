
package projetoempregado;

public class Diretor extends Funcionario{
    private String dataDePromocao;

    public Diretor() {
    }

    public Diretor(String dataDePromocao) {
        this.dataDePromocao = dataDePromocao;
    }
    public Diretor(Funcionario temp){
        this.nome=temp.getNome();
        this.dataNas=temp.getDataNas();
        this.identidade=temp.getIdentidade();
        this.dataDePromocao = dataDePromocao;
    } 
}
