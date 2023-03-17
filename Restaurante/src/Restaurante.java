import javax.swing.*;


public class Restaurante {
    public static void main(String[] args){
        Hamburger h = new Hamburger();
        Pizza p = new Pizza();
        int tituloDaTela = Integer.parseInt(JOptionPane.showInputDialog("Informe o pedido do cliente"+"\n 1.Hamburger" +"\n 2.Pizza" + "\n 3.Sair"));
        switch (tituloDaTela){
            case 1:
                h.nome = JOptionPane.showInputDialog("Insira o nome do hamburger :");
                h.valor = Double.valueOf(JOptionPane.showInputDialog("Insira o valor do hamburger: "));
                int artesanal = Integer.parseInt(JOptionPane.showInputDialog("O hamburger é artesanal ? \n 1.Sim \n 2.Não"));

                if(artesanal == 1){
                    h.artesanal = true;
                }
                else
                    h.artesanal = false;
                h.valor = h.calculaValor(h.artesanal);

                JOptionPane.showMessageDialog(null, "O valor do seu pedido é: " + h.valor);
                break;
            case 2:
                p.nome = JOptionPane.showInputDialog("Insira o nome da pizza :");
                p.valor = Double.valueOf(JOptionPane.showInputDialog("Insira o valor da pizza : "));
                int possuiBorda = Integer.parseInt(JOptionPane.showInputDialog("A pizza possui borda ? \n 1.Sim \n 2.Não"));
                if(possuiBorda == 1){
                    p.possuiBorda = true;
                }
                else
                    p.possuiBorda = false;
                p.valor = p.calcularValor(p.possuiBorda);

                JOptionPane.showMessageDialog(null, "O valor do pedido é: " + p.valor);
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Pedido não inserido, tente novamente");
                break;

        }


    }
}
