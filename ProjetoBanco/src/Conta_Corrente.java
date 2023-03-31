public class Conta_Corrente {

    int saldo;
    Cliente cliente;
    public void deposita(int valorDeposito) {
        saldo = saldo + valorDeposito;
    }

    public int getSaldo() {
        return saldo;
    }
}