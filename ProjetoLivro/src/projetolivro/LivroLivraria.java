
package projetolivro;

public class LivroLivraria extends Livro{
    private double preco;

    public LivroLivraria() {
    }
    
    public LivroLivraria( double preco) {
        this.preco = preco;
    }

    public LivroLivraria(double preco, String nomeLivro, String autorLivro, String editoraLivro, int nPaginas, int quantidade) {
        super(nomeLivro, autorLivro, editoraLivro, nPaginas, quantidade);
        
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
    
    
    
}
