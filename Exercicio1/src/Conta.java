public class Conta {
    int numero;
    double saldo, limite;

    public void sacar(double valor){
        if(valor > saldo){
            System.out.println("Saldo insuficiente!");
        } else{
            saldo = saldo - valor;
        }    
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public double consultarSaldo(){
        return saldo;
    }

    public String retornarDados(){
        return "{Numero conta: " + numero + " | Saldo: " + saldo + " | Limite: " + limite + "}";
    }

    public String gerarExtrato(){
        String a="a";
        return a;
    }

    public String gerarExtrato(int dias){
        String a="a";
        return a;
    }

    public void transferir(Conta destino, double valor){
        this.saldo -= valor;
        destino.saldo += valor;
    }
}
