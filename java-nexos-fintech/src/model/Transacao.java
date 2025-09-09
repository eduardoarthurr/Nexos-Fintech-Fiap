package model;

public class Transacao {
    private int idTransacao;
    private double valorTransacao;
    private boolean receita;
    private String dataTransacao;
    private Usuario usuario;
    private Categoria categoria;

    public Transacao() {}

    public Transacao(int idTransacao, double valorTransacao, boolean receita, String dataTransacao, Usuario usuario, Categoria categoria) {

        this.idTransacao = idTransacao;
        this.valorTransacao = valorTransacao;
        this.receita = receita;
        this.dataTransacao = dataTransacao;
        this.usuario = usuario;
        this.categoria = categoria;

        usuario.atualizarSaldo(valorTransacao, receita);

    }


    public int getIdTransacao() {
        return idTransacao;
    }
    public void setIdTransacao(int idTransacao) {
        this.idTransacao = idTransacao;
    }

    public double getValorTransacao() {
        return valorTransacao;
    }
    public void setValorTransacao(double valorTransacao) {
        this.valorTransacao = valorTransacao;
    }

    public boolean isReceita() {
        return receita;
    }
    public void setReceita(boolean receita) {
        this.receita = receita;
    }

    public String getDataTransacao() {
        return dataTransacao;
    }
    public void setDataTransacao(String dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getTipoReceita() {
        if (receita) {
            return "Receita";
        } else {
            return "Despesa";
        }
    }


    public void registrarTransacao() {
        System.out.println("Registrando transação...");
        String nomeCategoria;

        if (categoria != null) {
            nomeCategoria = categoria.exibirCategoria();
        } else {
            nomeCategoria = "Sem categoria";
        }

        System.out.println(getTipoReceita() + ": " + getValorTransacao() + " | Categoria: " + nomeCategoria + " | Data: " + getDataTransacao() + " | Usuário: " + usuario.exibirUsuario() + " | Saldo: " + usuario.getSaldo());
    }

}
