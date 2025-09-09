public class Main {
    public static void main(String[] args) {

        // Testes de classes

        Usuario usuario1 = new Usuario("joao@email.com", "João Silva", "12345");
        usuario1.cadastrarUsuario();
        usuario1.autenticar();


        Transacao transacao1 = new Transacao(1, 250.00, "Receita", "2025-08-26", usuario1.email);
        transacao1.registrarTransacao();
        transacao1.exibirDetalhes();


        MetaFinanceira meta1 = new MetaFinanceira(1, usuario1.email, "Comprar carro", 50000.00, "2026-12-31");
        meta1.criarMeta();
        meta1.verificarProgresso();


        Categoria categoria1 = new Categoria(1, "Despesa");
        categoria1.cadastrarCategoria();
        categoria1.listarCategoria();
    }
}
