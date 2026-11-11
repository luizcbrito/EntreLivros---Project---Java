package model;

import java.util.ArrayList;

public class BibliotecaIndividual {
    
    private int id;
    private ArrayList<Livro> livros;


    public BibliotecaIndividual(int id) {
        this.id = id;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        if (livro.getProprietario().getId() == this.id){
              livros.add(livro);
              return;
        }else{
            System.out.println("O livro: " + livro.getTitulo() + " não pertence ao proprietário-> " + livro.getProprietario().getNome());
        }
    }

    public void listarLivros(){
        System.out.println("--- Livros na Biblioteca ID: " + id + " ---");
        for(int i = 0; i < livros.size(); i++){
        System.out.println(livros.get(i));
       }
    }  
    
    public void removerLivro(int idLivro){
        for(int i = 0; i < livros.size(); i++ ){
            if (idLivro == livros.get(i).getId()){
                livros.remove(i);
                return ;
            }
        }
        System.out.println("Livro não encontrado na biblioteca.");  
    }

    
    public Emprestimo solicitarEmprestimo(int id, Livro livro, Usuario solicitante) {

    boolean disp = livro.isDisponivelParaEmprestimo();
    Usuario proprietario = livro.getProprietario();

        if (disp) {
            Emprestimo emprestimo = new Emprestimo(
                id, livro, proprietario, solicitante
            );

            return emprestimo;
        }
        return null;
    }

    public int getQuantidadeLivros() {
        return livros.size();
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public ArrayList<Livro> getLivros() {
        return livros;
    }


    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }


    @Override
    public String toString() {
        return "BibliotecaIndividual [id=" + id + ", livros=" + livros + "]";
    }

}
