package model;

public class MetaComTransacao extends MetaFinanceira {
    private Transacao ultimaTransacao;

    public MetaComTransacao() {
        super();
    }

    public MetaComTransacao(int idMeta, String nomeMeta, double valorObjetivo, String dataLimite, Usuario usuario) {

        super(idMeta, nomeMeta, valorObjetivo, dataLimite, usuario);

    }


    public Transacao getUltimaTransacao() {
        return ultimaTransacao;
    }
    public void setUltimaTransacao(Transacao ultimaTransacao) {
        this.ultimaTransacao = ultimaTransacao;
    }


    public void registrarTransacao(Transacao transacaoMeta) {
        setUltimaTransacao(transacaoMeta);
        super.registrarTransacaoNaMeta(transacaoMeta);

        System.out.println("Última transação registrada na meta: " + transacaoMeta.getValorTransacao() + "R$"+ " | Data: " + transacaoMeta.getDataTransacao());
    }
}
