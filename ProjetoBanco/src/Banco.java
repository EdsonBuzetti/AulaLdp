import java.util.ArrayList;
import java.util.List;

public class Banco {

    public static void main(String[] args) {
        Cliente cl1 = new Cliente();
        cl1.nome = "Edson";
        Conta_Corrente c1 = new Conta_Corrente();
        c1.deposita(100);
        c1.cliente = cl1;

        Cliente cl2 = new Cliente();
        cl2.nome = "Ricardo";
        Conta_Corrente c2 = new Conta_Corrente();
        c2.deposita(200);
        c2.cliente =cl2;

        List contas = new ArrayList();
        contas.add(c1);
        contas.add(c2);


        System.out.println("O tamanho da lista de contas é: "+ contas.size());

        for(int i=0;i< contas.size();i++){

            Conta_Corrente contaTeste = (Conta_Corrente) contas.get(i);
            System.out.println("O valor do saldo conta de " + contaTeste.cliente.nome + " é: " + contaTeste.getSaldo());
        }
    }
}
