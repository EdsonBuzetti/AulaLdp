import java.util.List;

public class Pedido {
    Cliente c;
    Massa m;
    List<Ingrediente> ListaIngrediente;

    public double CalculaValor(){
        //pegando o valor inicial da massa para calculo
        double valorInicial = m.valor;
        //pegando o tamanho da lista que corresponde a quantidade de ingredientes escolhidos
        int qtdeIngredienteEscolhido = ListaIngrediente.size();
        //sabemos que cada ingrediente custa 2 reais
        double valorTotalIngredientes = qtdeIngredienteEscolhido * 2;
        double valorTotalPedido = valorInicial + valorTotalIngredientes;
        return valorTotalPedido;

    }
}
