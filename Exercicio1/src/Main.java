public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.depositar(500);
        conta.sacar(125);

        System.out.println(conta.retornarDados());
    }
}
