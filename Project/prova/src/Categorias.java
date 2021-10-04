public class Categorias {

    private long idCategoria;
    private String genero;

    public Categorias() {}

    public Categorias(long idCategoria, String genero) {
        this.idCategoria = idCategoria;
        this.genero = genero;
    }

    public long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Categorias{" +
                "idCategoria=" + idCategoria +
                ", genero='" + genero + '\'' +
                '}';
    }
}
