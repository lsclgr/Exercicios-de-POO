
package projetoempregado;

public class ProjetoEmpregado {

    public static void mostraDados(Empregado x){
        System.out.println(x);
        
    }
    
    public static void main(String[] args) {
        Empregado e = new Empregado("bla", "diretoria", 33, 5);
        mostraDados(e);
        System.out.println("o salario mensal é: "+e.calculaSalariomensal());
    }
    
}
