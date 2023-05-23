import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControleAcervoTest {

    @Test
    void testaLivroDisponivel() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro(1, "Harry Potter e a pedra filosofal", false),
                new Livro(2, "O Senhor dos Anéis: A sociedade do anel", true),
                new Livro(3, "Percy Jackson e o ladrão de raios", false)
        );

        boolean resultado = biblioteca.verificaDisponibilidadeLivro(1);
        assertTrue(resultado);
    }

    @Test
    void testaLivroIndisponivel() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro(1, "Harry Potter e a pedra filosofal", false),
                new Livro(2, "O Senhor dos Anéis: A sociedade do anel", true),
                new Livro(3, "Percy Jackson e o ladrão de raios", false)
        );

        boolean resultado = biblioteca.verificaDisponibilidadeLivro(2);

        assertFalse(resultado);
    }

    @Test
    void testIsLivroDisponivel_LivroNaoExistente() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro(1, "Harry Potter e a pedra filosofal", false),
                new Livro(2, "O Senhor dos Anéis: A sociedade do anel", true),
                new Livro(3, "Percy Jackson e o ladrão de raios", false)
        );

        boolean resultado = biblioteca.verificaDisponibilidadeLivro(4);

        assertFalse(resultado);
    }

    @Test
    void deveContarLivrosAlugadosBiblioteca() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro(1, "Harry Potter e a pedra filosofal", true),
                new Livro(2, "O Senhor dos Anéis: A sociedade do anel", true),
                new Livro(3, "Harry Potter e o prisioneiro de azkaban", false),
                new Livro(4, "O código DaVinci", false),
                new Livro(5, "Harry Potter e o prisioneiro de azkaban", true)
        );
        assertEquals(3, ControleAcervo.contarLivrosAlugadosBiblioteca(biblioteca));
    }

    @Test
    void deveContarTotalAlunosCurso() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro(1, "Harry Potter e a pedra filosofal", true),
                new Livro(2, "O Senhor dos Anéis: A sociedade do anel", true),
                new Livro(3, "Harry Potter e a pedra filosofal", true),
                new Livro(4, "Harry Potter e a pedra filosofal", true)
        );
        assertEquals(4, ControleAcervo.contarTotalLivrosBiblioteca(biblioteca));
    }

}