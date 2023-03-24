import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class AluguelDeVeiculos extends JFrame {

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        AluguelDeVeiculos field = new AluguelDeVeiculos();
        field.testaJformattedTextField();
    }

    private void testaJformattedTextField() {
        Container janela = getContentPane();
        setLayout((null));

        JLabel labelNome = new JLabel("Nome: ");
        JLabel labelCpf = new JLabel("CPF: ");
        JLabel labelTel = new JLabel("Telefone: ");
        JLabel labelNomeCarro = new JLabel("Nome do Carro: ");
        JLabel labelPlaca = new JLabel("Nº da Placa: ");
        JLabel labelAno = new JLabel("Fabricação: ");
        JLabel labelLocacao = new JLabel("Data de locação: ");
        JLabel labelEntrega = new JLabel("Data de entrega: ");
        labelNome.setBounds(50, 40, 100, 20);
        labelCpf.setBounds(50, 80, 100, 20);
        labelTel.setBounds(50, 120, 100, 20);
        labelNomeCarro.setBounds(50,160,100,20);
        labelPlaca.setBounds(50,200,100,20);
        labelAno.setBounds(50,240,100,20);
        labelLocacao.setBounds(50,280,100,20);
        labelEntrega.setBounds(50,320,100,20);

        MaskFormatter mascaraNome = null;
        MaskFormatter mascaraCpf = null;
        MaskFormatter mascaraTel = null;
        MaskFormatter mascaraNomeCarro = null;
        MaskFormatter mascaraPlaca = null;
        MaskFormatter mascaraAno = null;
        MaskFormatter mascaraLocacao = null;
        MaskFormatter mascaraEntrega = null;

        try {
            mascaraNome = new MaskFormatter("******************");
            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraTel = new MaskFormatter("(##)#####-####");
            mascaraNomeCarro = new MaskFormatter("******************");
            mascaraPlaca = new MaskFormatter("UUU-####");
            mascaraAno = new MaskFormatter("####");
            mascaraLocacao = new MaskFormatter("##/##/####");
            mascaraEntrega = new MaskFormatter("##/##/####");
            mascaraNome.setPlaceholderCharacter('_');
            mascaraCpf.setPlaceholderCharacter('-');
            mascaraTel.setPlaceholderCharacter('-');
            mascaraNomeCarro.setPlaceholderCharacter('_');
            mascaraPlaca.setPlaceholderCharacter('-');
            mascaraAno.setPlaceholderCharacter('-');
            mascaraLocacao.setPlaceholderCharacter('-');
            mascaraEntrega.setPlaceholderCharacter('-');
        }
        catch (ParseException excp) {
            System.err.println("Erro na formatação: " + excp.getMessage());
            System.exit(-1);
        }
        JFormattedTextField jFormattedTextNome = new JFormattedTextField(mascaraNome);
        JFormattedTextField jFormattedTextCpf = new JFormattedTextField(mascaraTel);
        JFormattedTextField jFormattedTextTel = new JFormattedTextField(mascaraCpf);
        JFormattedTextField jFormattedTextNomeCarro = new JFormattedTextField(mascaraNomeCarro);
        JFormattedTextField jFormattedTextPlaca = new JFormattedTextField(mascaraPlaca);
        JFormattedTextField jFormattedTextAno = new JFormattedTextField(mascaraAno);
        JFormattedTextField jFormattedTextLocacao = new JFormattedTextField(mascaraLocacao);
        JFormattedTextField jFormattedTextEntrega = new JFormattedTextField(mascaraEntrega);
        jFormattedTextNome.setBounds(150, 40, 100, 20);
        jFormattedTextTel.setBounds(150, 80, 100, 20);
        jFormattedTextCpf.setBounds(150, 120, 100, 20);
        jFormattedTextNomeCarro.setBounds(150,160,100,20);
        jFormattedTextPlaca.setBounds(150,200,100,20);
        jFormattedTextAno.setBounds(150,240,100,20);
        jFormattedTextLocacao.setBounds(150,280,100,20);
        jFormattedTextEntrega.setBounds(150,320,100,20);


        janela.add(labelNome);
        janela.add(labelCpf);
        janela.add(labelTel);
        janela.add(labelNomeCarro);
        janela.add(labelPlaca);
        janela.add(labelAno);
        janela.add(labelLocacao);
        janela.add(labelEntrega);
        janela.add(jFormattedTextNome);
        janela.add(jFormattedTextCpf);
        janela.add(jFormattedTextTel);
        janela.add(jFormattedTextNomeCarro);
        janela.add(jFormattedTextPlaca);
        janela.add(jFormattedTextAno);
        janela.add(jFormattedTextLocacao);
        janela.add(jFormattedTextEntrega);
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
