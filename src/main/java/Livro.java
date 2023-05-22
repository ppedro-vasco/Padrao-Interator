public class Livro {

    int id;
    private String titulo;
    private boolean alugado;

    public Livro(int id, String titulo, boolean alugado){
        this.id = id;
        this.titulo = titulo;
        this.alugado = alugado;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public boolean isAlugado(){
        return alugado;
    }
    public void setAlugado(){
        this.alugado = alugado;
    }
}
