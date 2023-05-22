import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class Biblioteca implements Iterable<Livro>{
    private List<Livro> livros = new ArrayList<Livro>();

    public Biblioteca(Livro... livros){
        this.livros = Arrays.asList(livros);
    }

    public List<Livro> getLivros(){
        return livros;
    }

    public boolean verificaDisponibilidadeLivro(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id && !livro.isAlugado()) {
                return true;
            }
        }
        return false;
    }
    @Override
    public Iterator<Livro> iterator(){
        return livros.iterator();
    }
}
