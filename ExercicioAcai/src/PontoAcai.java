import javax.swing.JOptionPane;
public class PontoAcai {
    public static void main(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o tamanho do Açaí desejado?"+ "\n1 - 300" +  "\n2 - 500" + "\n3 - 700"));
        boolean temSorvete = JOptionPane.showConfirmDialog(null, "Deseja adicionar sorvete?") == JOptionPane.YES_OPTION;
        Acai acai = new Acai(tamanho, temSorvete);
        JOptionPane.showMessageDialog(null, "O seu açaí ficou no valor de: R$" + acai.calcularValor());
    }
}

