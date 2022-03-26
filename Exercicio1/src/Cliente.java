public class Cliente {
    String nome, cpf;
    Conta conta;
    CartaoDeCredito cartaoDeCredito;

    public String retornarDados(){
        return "{Nome:" + nome + "| CPF: " + cpf + 
               "\nCartão de crédito-> " + cartaoDeCredito.retornarDados() + 
               "\nConta=> " + conta.retornarDados() + "}";
    }
}

