import java.util.ArrayList;
import java.util.List;

public class Sessao {

    private long idSessao;
    private int horario;
    private Double valor;
    private int ingressosVendidos;
    private boolean disponivel;
    private List<Filmes> filmes = new ArrayList<Filmes>();

    public Sessao() {}

    public Sessao(long idSessao, int horario, Double valor, int ingressosVendidos, boolean disponivel) {
        this.idSessao = idSessao;
        this.horario = horario;
        this.valor = valor;
        this.ingressosVendidos = ingressosVendidos;
        this.disponivel = disponivel;
    }

    public long getIdSessao() {
        return idSessao;
    }

    public void setIdSessao(long idSessao) {
        this.idSessao = idSessao;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void setIngressosVendidos(int ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public List<Filmes> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filmes> filmes) {
        this.filmes = filmes;
    }

    public void isDisp(){
        this.disponivel = true;
    }

    public void isIndisp(){
        this.disponivel = false;
    }

    public Double vendaSessao(){
        return this.valor * this.ingressosVendidos;
    }

    @Override
    public String toString() {
        return "Sessao " +
                "idSessao: \n" + idSessao + "\n" +
                "horario= " + horario + "\n" +
                "valor= " + valor + "\n" +
                "ingressosVendidos= " + ingressosVendidos + "\n" +
                "disponivel= " + disponivel + "\n" +
                "filmes= " + filmes;
    }
}
