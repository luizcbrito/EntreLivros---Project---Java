package model;

public class Usuario {
    
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private boolean ativo;
    private BibliotecaIndividual biblioteca;


    public Usuario(int id, String nome, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.ativo = ativo;

        this.biblioteca = new BibliotecaIndividual(id);
    }

    public Usuario(int id, String nome, String email, String telefone, boolean ativo,BibliotecaIndividual biblioteca) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.ativo = ativo;

        this.biblioteca = new BibliotecaIndividual(id);
    }


    public int getId (){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public BibliotecaIndividual getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(BibliotecaIndividual biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", ativo="
                + ativo + "]";
    }
}
