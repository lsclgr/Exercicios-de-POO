
package projetolivro;

public class ProjetoLivro {

    public static void main(String[] args) {
        Livro l = new Livro("A rainha vermelha", "victoria aveyard", "seguinte", 356, 5);
        Livro.livros.add(l);
        Livro.cadastroLivro();
        
    }
    
}
