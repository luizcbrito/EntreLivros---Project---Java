package model;
//Representa um livro que pertence a determinado usuário.
public class Livro {
    
    private int id;
    private String titulo;
    private String autor;
    private int anoPublicado;
    private String categoria;
    private Usuario proprietario;
    private boolean disponivelParaEmprestimo;

    public Livro(int id, String titulo, String autor, int anoPublicado, String categoria, Usuario proprietario,
            boolean disponivelParaEmprestimo) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicado = anoPublicado;
        this.categoria = categoria;
        this.proprietario = proprietario;
        this.disponivelParaEmprestimo = disponivelParaEmprestimo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicado() {
        return anoPublicado;
    }

    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Usuario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Usuario proprietario) {
        this.proprietario = proprietario;
    }

    public boolean isDisponivelParaEmprestimo() {
        return disponivelParaEmprestimo;
    }

    public void setDisponivelParaEmprestimo(boolean disponivelParaEmprestimo) {
        this.disponivelParaEmprestimo = disponivelParaEmprestimo;
    }

    @Override
    public String toString() {
        return "Livro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", anoPublicado=" + anoPublicado
                + ", categoria=" + categoria + ", proprietario=" + proprietario + ", disponivelParaEmprestimo="
                + disponivelParaEmprestimo + "]";
    }
}
