public class Categoria {

    int idCategoria;
    String tipo;


    public Categoria() {
    }


    public Categoria(int idCategoria, String tipo) {
        this.idCategoria = idCategoria;
        this.tipo = tipo;
    }

    public void cadastrarCategoria() {
        System.out.println("Cadastrando categoria: " + tipo);
    }

    public void listarCategoria() {
        System.out.println("Categoria " + idCategoria + " | Tipo: " + tipo);
    }
}
