import java.util.Iterator;

public class ControleAcervo {

    public static Integer contarLivrosAlugadosBiblioteca(Biblioteca biblioteca) {
        int quantidade = 0;
        for (Livro livro : biblioteca) {
            if (livro.isAlugado()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalLivrosBiblioteca(Biblioteca biblioteca) {
        int quantidade = 0;
        for (Iterator l = biblioteca.iterator(); l.hasNext(); ) {
            quantidade++;
            l.next();
        }
        return quantidade;
    }

}