
package projetolivro;

import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Vector;

public class Livro {
    protected String nomeLivro;
    protected String autorLivro;
    protected String editoraLivro;
    protected int nPaginas;
    protected int quantidade;
    static Vector<Livro> livros;

    public Livro() {
        this.livros = new Vector<>();
    }

    public Livro(String nomeLivro, String autorLivro, String editoraLivro, int nPaginas, int quantidade) {
        this.livros = new Vector<>();
        this.nomeLivro = nomeLivro;
        this.autorLivro = autorLivro;
        this.editoraLivro = editoraLivro;
        this.nPaginas = nPaginas;
        this.quantidade=quantidade;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public String getEditoraLivro() {
        return editoraLivro;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public Vector<Livro> getLivros() {
        return livros;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public static void cadastroLivro(){
        Scanner teclado = new Scanner(new BufferedInputStream(System.in));
        System.out.println("Deseja cadastrar o livro na biblioteca(1) ou livraria(2)?");
        int x = teclado.nextInt();
        if(x==1){
            System.out.println("informe o numero do cadatro do usuario, o numero de cadastro do livro, "
                    + "\no nome do livro, o autor, a editora, o numero de paginas e a quantidade");
            int ncadusu = teclado.nextInt();
            int ncadliv = teclado.nextInt();
            String nome = teclado.nextLine();
            String autor = teclado.nextLine();
            String editora = teclado.nextLine();
            int npag = teclado.nextInt();
            int quant=teclado.nextInt();
            livros.add(new LivroBiblioteca(ncadusu, ncadliv, nome, autor, editora, npag, quant));
            
        }else{
            System.out.println("informe o preco do livro, "
                    + "\no nome do livro, o autor, a editora, o numero de paginas e a quantidade");
            double preco = teclado.nextInt();
            String nome = teclado.nextLine();
            String autor = teclado.nextLine();
            String editora = teclado.nextLine();
            int npag = teclado.nextInt();
            int quant=teclado.nextInt();
            livros.add(new LivroLivraria(preco, nome, autor, editora, npag, quant));
        }
    }
    
    
}
