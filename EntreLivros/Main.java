import model.Emprestimo;
import model.Livro;
import model.Usuario;

public class Main {
    public static void main(String[] args) {
    
    Usuario usuario1 = new Usuario(0, "luiz claudio",true);
    Usuario usuario2 = new Usuario(1, "Maria",true);
    
    Livro livro1 = new Livro(
    0,
    "O Poder do Hábito",
    "Charles Duhigg",
    2012,
    "Desenvolvimento pessoal",
    usuario1,
    true);

    Livro livro2 = new Livro(
    1,
    "saia da tangente",
    "Charles Duhigg",
    2012,
    "Desenvolvimento pessoal",
    usuario1,
    true);

    Livro livro3 = new Livro(
    2,
    "a arte de ligar o foda-se",
    "Charles Duhigg",
    2012,
    "Desenvolvimento pessoal",
    usuario2,
    true);

    Emprestimo emprestimo1 = new Emprestimo(
    0,
    livro3,
    livro3.getProprietario(),
    usuario1
    );
    
    System.out.println(emprestimo1);
    
    }
}
