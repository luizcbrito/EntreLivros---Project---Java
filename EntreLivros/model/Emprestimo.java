package model;
//Representa a relação entre quem empresta e quem recebe o livro.
import java.time.LocalDate;

 
public class Emprestimo {
    private int id;
    private Livro livro;
    private Usuario proprietario;
    private Usuario solicitante;
    private LocalDate dataSolicitacao;
    private LocalDate dataDevolucao;
    private StatusEmprestimo status;

    public Emprestimo(int id, Livro livro, Usuario proprietario, Usuario solicitante) {
        this.id = id;
        this.livro = livro;
        this.proprietario = proprietario;
        this.solicitante = solicitante;
        
        this.dataSolicitacao = LocalDate.now();
        this.status = StatusEmprestimo.SOLICITADO;
        this.dataDevolucao = null;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Livro getLivro() {
        return livro;
    }
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    public Usuario getProprietario() {
        return proprietario;
    }
    public void setProprietario(Usuario proprietario) {
        this.proprietario = proprietario;
    }
    public Usuario getSolicitante() {
        return solicitante;
    }
    public void setSolicitante(Usuario solicitante) {
        this.solicitante = solicitante;
    }
    public LocalDate getDataSolicitacao() {
        return dataSolicitacao;
    }
    public void setDataSolicitacao(LocalDate dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }
    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }
    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    public StatusEmprestimo getStatus() {
        return status;
    }
    public void setStatus(StatusEmprestimo status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Emprestimo [id=" + id + ", livro=" + livro + ", proprietario=" + proprietario + ", solicitante="
                + solicitante + ", dataSolicitacao=" + dataSolicitacao + ", dataDevolucao=" + dataDevolucao
                + ", status=" + status + "]";
    }

}
