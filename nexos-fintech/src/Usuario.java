public class Usuario {

    String email;
    String nome;
    String senha;


    public Usuario() {
    }


    public Usuario(String email, String nome, String senha) {
        this.email = email;
        this.nome = nome;
        this.senha = senha;
    }

    public void cadastrarUsuario() {
        System.out.println("Cadastrando usuário: " + nome);
    }

    public void autenticar() {
        System.out.println("Autenticando usuário: " + email);
    }



}
