package view;

import model.*;

public class MainTestes {
    public static void main(String[] args) {

        //Criando usuario

        Usuario usuario1 = new Usuario("eduardoarthur@gmail.com", "Eduardo Arthur", "asenhaede1a10");

        //Criando Categoria de transação comum
        Categoria categoriaSalario = new Categoria(1, "Salario");
        Categoria categoriaNotebook = new Categoria(2, "Notebook");

        //Criando Transação comum (fora da meta)
        Transacao transacaoSalario = new Transacao(1,5000,true,"09-09-2025",usuario1,categoriaSalario);

        //Chamando metodo para registrar, exibir transação e saldo atual ( ex de transação comum: recebimento de salario)

        transacaoSalario.registrarTransacao();

        System.out.println(" ");

        //Criando Meta Financeira

        MetaComTransacao metaNotebook = new MetaComTransacao(1, "Comprar Notebook", 2000, "31-12-2025", usuario1);

        //Exibindo meta financeira

        metaNotebook.registrarMeta();

        //Criando Transação para meta

        Transacao depositoMeta1 = new Transacao(2, 1000, true, "10-09-2025", usuario1, categoriaNotebook);

        //Registrando e exibindo transações meta

        metaNotebook.registrarTransacaoNaMeta(depositoMeta1);

        //Teste para ver se meta será concluida
//        Transacao depositoMeta2 = new Transacao(2, 1000.0, true, "10-09-2025", usuario1, categoriaNotebook);
//        metaNotebook.registrarTransacao(depositoMeta2);









    }
}
