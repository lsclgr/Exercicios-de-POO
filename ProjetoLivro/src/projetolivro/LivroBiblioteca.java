
package projetolivro;

public class LivroBiblioteca extends Livro{
    private int nCadastroUsuario;
    private int nCadastroLivro;

    public LivroBiblioteca() {
    }

    public LivroBiblioteca(int nCadastroUsuario, int nCadastroLivro) {
        this.nCadastroUsuario = nCadastroUsuario;
        this.nCadastroLivro = nCadastroLivro;
    }

    public LivroBiblioteca(int nCadastroUsuario, int nCadastroLivro, String nomeLivro, String autorLivro, String editoraLivro, int nPaginas, int quantidade) {
        super(nomeLivro, autorLivro, editoraLivro, nPaginas, quantidade);
        this.nCadastroUsuario = nCadastroUsuario;
        this.nCadastroLivro = nCadastroLivro;
    }

    public int getnCadastroUsuario() {
        return nCadastroUsuario;
    }

    public int getnCadastroLivro() {
        return nCadastroLivro;
    }
    
}
