
package projetocinema;

import java.util.Scanner;

public class ProjetoCinema {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        Cinema cin = new Cinema("rua Seu José", "CineX", 100, 16, 22, 9999999, "cinex@programacao.com");
        IngressoCinema in =new IngressoCinema();
        System.out.println("1 - Criar Sessao\n"
                         + "2 - Calcular Preco do Ingresso \n"
                         + "3 - Vender Ingresso \n"
                         + "4 - Verificar quem está sentado na poltrona X ");
        
        
    }
    
}
