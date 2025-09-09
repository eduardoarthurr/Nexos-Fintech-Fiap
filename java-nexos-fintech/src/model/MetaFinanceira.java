package model;

public class MetaFinanceira {
    private int idMeta;
    private String nomeMeta;
    private double valorObjetivo;
    private double valorAcumulado;
    private String dataLimite;
    private String status;
    private Usuario usuario;


    public MetaFinanceira() {
        this.status = "Em andamento";
        this.valorAcumulado = 0.0;
    }

    public MetaFinanceira(int idMeta, String nomeMeta, double valorObjetivo, String dataLimite, Usuario usuario) {

        this.idMeta = idMeta;
        this.nomeMeta = nomeMeta;
        this.valorObjetivo = valorObjetivo;
        this.dataLimite = dataLimite;
        this.usuario = usuario;
        this.status = "Em andamento";
        this.valorAcumulado = 0.0;

    }


    public int getIdMeta() {
        return idMeta;
    }
    public void setIdMeta(int idMeta) {
        this.idMeta = idMeta;
    }

    public String getNomeMeta() {
        return nomeMeta;
    }
    public void setNomeMeta(String nomeMeta) {
        this.nomeMeta = nomeMeta;
    }

    public double getValorObjetivo() {
        return valorObjetivo;
    }
    public void setValorObjetivo(double valorObjetivo) {
        this.valorObjetivo = valorObjetivo;
    }

    public double getValorAcumulado() {
        return valorAcumulado;
    }
    public void setValorAcumulado(double valorAcumulado) {
        this.valorAcumulado = valorAcumulado;
    }

    public String getDataLimite() {
        return dataLimite;
    }
    public void setDataLimite(String dataLimite) {
        this.dataLimite = dataLimite;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public void registrarMeta() {

        System.out.println("Registrando meta financeira...");

        System.out.println("Meta: " + getNomeMeta() + " | Objetivo: " + getValorObjetivo() + " | Data limite: " + dataLimite + " | Status: " + getStatus() + " | Usuário: " + usuario.exibirUsuario());
    }


    public void concluirMeta() {
        status = "Concluída";
        System.out.println("Meta concluída: " + nomeMeta);
    }


    public void registrarTransacaoNaMeta(Transacao transacaoMeta) {
        if (status.equals("Em andamento")) {
            if (transacaoMeta.isReceita()) {

                valorAcumulado = valorAcumulado + transacaoMeta.getValorTransacao();
                System.out.println("Transação de " + transacaoMeta.getValorTransacao() + "R$" +" registrada na meta " + nomeMeta + " | Saldo: " + usuario.getSaldo());
                if (valorAcumulado >= valorObjetivo) {
                    concluirMeta();
                }
            }
        }
    }

}
