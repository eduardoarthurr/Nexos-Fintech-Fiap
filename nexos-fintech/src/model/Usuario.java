package model;

public class Usuario {
    private String email;
    private String nome;
    private String senha;
    private double saldo;

    public Usuario() {

    }

    public Usuario(String email, String nome, String senha) {
        this.email = email;
        this.nome = nome;
        this.senha = senha;
        this.saldo = 0.0;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void atualizarSaldo(double valor, boolean receita) {
        if (receita) {
            saldo += valor;
        } else {
            saldo -= valor;
        }
    }

    public String exibirUsuario() {
        return nome + " (" + email + ")";
    }
}
