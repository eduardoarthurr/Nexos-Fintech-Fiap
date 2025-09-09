public class MetaFinanceira {

    int idMeta;
    String emailUsuario;
    String nomeMeta;
    double valorMeta;
    String dataLimite;


    public MetaFinanceira() {
    }


    public MetaFinanceira(int idMeta, String emailUsuario, String nomeMeta, double valorMeta, String dataLimite) {
        this.idMeta = idMeta;
        this.emailUsuario = emailUsuario;
        this.nomeMeta = nomeMeta;
        this.valorMeta = valorMeta;
        this.dataLimite = dataLimite;
    }

    public void criarMeta() {
        System.out.println("Criando meta: " + nomeMeta + " no valor de " + valorMeta);
    }

    public void verificarProgresso() {
        System.out.println("Meta: " + nomeMeta + " | Progresso ainda não implementado.");
    }
}
