import java.util.HashSet;
import java.util.Set;

class Livro {
    private String isbn;
    private String nome;
    private String autor;
    private String genero;

    public Livro(String isbn, String nome, String autor, String genero) {
        this.isbn = isbn;
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "isbn='" + isbn + '\'' +
                ", nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                '}';

    }
}
public class Biblioteca {
    private Set<Livro> livros;

    public Biblioteca() {
        livros = new HashSet<>();

    }
}
