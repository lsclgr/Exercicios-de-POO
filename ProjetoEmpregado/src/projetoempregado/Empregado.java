
package projetoempregado;

public class Empregado {
  private String nome;
  private String departamento;
  private int horasTrabalhadasNoMes;
  private int horasExtras;
  private double salarioPorHora;

    public Empregado() {
    }

    public Empregado(String nome, String departamento, int horasTrabalhadasNoMes, double salarioPorHora) {
        this.nome = nome;
        this.departamento = departamento;
        this.horasTrabalhadasNoMes = horasTrabalhadasNoMes;
        this.salarioPorHora = salarioPorHora;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getHorasTrabalhadasNoMes() {
        return horasTrabalhadasNoMes;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    
  @Override
    public String toString(){
        return "Departamento: "+this.departamento+"\n Nome: "+this.nome+"\n Horas trabalhadas no mês: "+this.horasTrabalhadasNoMes+"\n Horas Extras: "+this.horasExtras+"\n Salario por hora: "+this.salarioPorHora;
    }

    public double calculaSalariomensal(){
        if(this.departamento.equalsIgnoreCase("Diretoria")){
            return (this.salarioPorHora*this.horasTrabalhadasNoMes+(this.horasExtras*this.salarioPorHora))+((this.salarioPorHora*this.horasTrabalhadasNoMes+(this.horasExtras*this.salarioPorHora))*0.10);
        }else{
            return this.salarioPorHora*this.horasTrabalhadasNoMes+(this.horasExtras*this.salarioPorHora);
        }
    }
    
    
}
