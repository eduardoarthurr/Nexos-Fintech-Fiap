public class Transacao {

    int idTransacao;
    double valor;
    String tipo;
    String dataTransacao;
    String emailUsuario; // relação com o usuário


    public Transacao() {
    }


    public Transacao(int idTransacao, double valor, String tipo, String dataTransacao, String emailUsuario) {
        this.idTransacao = idTransacao;
        this.valor = valor;
        this.tipo = tipo;
        this.dataTransacao = dataTransacao;
        this.emailUsuario = emailUsuario;
    }

    public void registrarTransacao() {
        System.out.println("Registrando transação: " + tipo + " de valor " + valor);
    }

    public void exibirDetalhes() {
        System.out.println("Transação " + idTransacao + " | " + tipo + " | " + valor + " | Usuário: " + emailUsuario);
    }

}
