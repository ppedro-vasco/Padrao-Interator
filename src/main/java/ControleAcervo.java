import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ControleAcervo {
    public static int contarTotalLivrosBiblioteca(Biblioteca biblioteca) {
        int quantidade = biblioteca.getLivros().size();
        return quantidade;
    }

    public static int contarTotalLivrosAlugadosBiblioteca(Biblioteca biblioteca) {
        Set<Livro> livrosAlugados = new HashSet<>();

        for (Livro livro : biblioteca) {
            if (livro.isAlugado()) {
                livrosAlugados.add(livro);
            }
        }

        return livrosAlugados.size();
    }
}


