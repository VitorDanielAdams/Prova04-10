public class Main {

    public static void main(String[] args) {

        Categorias cat = new Categorias(0 , "Romance");
        Categorias cat2 = new Categorias(1, "Comedia");

        Filmes filme1 = new Filmes(0, "Algum filme do Adam Sandler", 15, 5, true);
        filme1.getCategoria().add(cat);
        filme1.getCategoria().add(cat2);
        System.out.println(filme1);
        filme1.isDesactive();
        System.out.println(filme1);

        Filmes filme2 = new Filmes(1, "As branquelas", 16, 5, false);

        filme2.getCategoria().add(cat2);
        filme2.isActive();

        System.out.println(filme2);

        Sessao session = new Sessao(0, 18, 15.50, 20, true);
        session.getFilmes().add(filme1);
        session.getFilmes().add(filme2);
        System.out.println(session);


    }
}
