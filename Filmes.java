import java.util.ArrayList;
import java.util.List;

public class Filmes {

    private long idFilme;
    private String nomeFilme;
    private int idadePermitida, avaliação;
    private boolean emCartaz;
    private List<Categorias> categoria = new ArrayList<Categorias>();

    public Filmes() {}

    public Filmes(long idFilme, String nomeFilme, int idadePermitida, int avaliação, boolean emCartaz) {
        this.idFilme = idFilme;
        this.nomeFilme = nomeFilme;
        this.idadePermitida = idadePermitida;
        this.avaliação = avaliação;
        this.emCartaz = emCartaz;
    }

    public long getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(long idFilme) {
        this.idFilme = idFilme;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public int getIdadePermitida() {
        return idadePermitida;
    }

    public void setIdadePermitida(int idadePermitida) {
        this.idadePermitida = idadePermitida;
    }

    public int getAvaliação() {
        return avaliação;
    }

    public void setAvaliação(int avaliação) {
        this.avaliação = avaliação;
    }

    public boolean isEmCartaz() {
        return emCartaz;
    }

    public void setEmCartaz(boolean emCartaz) {
        this.emCartaz = emCartaz;
    }

    public List<Categorias> getCategoria() {
        return categoria;
    }

    public void setCategoria(List<Categorias> categoria) {
        this.categoria = categoria;
    }

    public void isActive(){
        this.emCartaz = true;
    }

    public void isDesactive(){
        this.emCartaz = false;
    }

    @Override
    public String toString() {
        return "Filmes: \n" +
                "idFilme= " + idFilme + '\n' +
                "nomeFilme= " + nomeFilme + '\n' +
                "idadePermitida= " + idadePermitida + '\n' +
                "avaliação= " + avaliação + '\n' +
                "emCartaz= " + emCartaz + '\n' +
                "categoria= " + categoria + '\n';
    }
}
