
package projetocontabancaria;

import java.util.Scanner;

public class ProjetoContaBancaria {

    public static void main(String[] args) {
        ContaBancaria contaSeuJose = new ContaBancaria("Seu José", 10, 100000000, false);
        ContaBancaria contaProfessor = new ContaBancaria("Professor", 10, 10, false);
        
        contaSeuJose.transferencia(contaProfessor, 1500);
        
        contaSeuJose.extratoConta();
        contaProfessor.extratoConta();
        
        Scanner teclado = new Scanner(System.in);
        
        
    }
    
}
