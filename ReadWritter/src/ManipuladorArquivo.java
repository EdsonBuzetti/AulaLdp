import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManipuladorArquivo {

    public static void main(String[] args) throws IOException {
        String caminhoNomes = "C:\\Users\\12116222\\Desktop\\Projeto\\ArquivoNomes.txt";
        String caminhoSobrenomes = "C:\\Users\\12116222\\Desktop\\Projeto\\Sobrenomes.txt";
        String caminhoResultados = "C:\\Users\\12116222\\Desktop\\Projeto\\nomeSobrenome.txt";

        try {
            BufferedReader leitorNomes = new BufferedReader(new FileReader(caminhoNomes));
            String linhaNome;
            while ((linhaNome = leitorNomes.readLine()) != null) {
                System.out.println(linhaNome);
            }
            leitorNomes.close();

            BufferedReader leitorSobrenomes = new BufferedReader(new FileReader(caminhoSobrenomes));
            String linhaSobrenome;
            while ((linhaSobrenome = leitorSobrenomes.readLine()) != null) {
                System.out.println(linhaSobrenome);
            }
            leitorSobrenomes.close();

            BufferedReader leitorNomes2 = new BufferedReader(new FileReader(caminhoNomes));
            BufferedReader leitorSobrenomes2 = new BufferedReader(new FileReader(caminhoSobrenomes));
            BufferedWriter escritorResultados = new BufferedWriter(new FileWriter(caminhoResultados));
            String linhaNome2, linhaSobrenome2;
            while ((linhaNome2 = leitorNomes2.readLine()) != null && (linhaSobrenome2 = leitorSobrenomes2.readLine()) != null) {
                String nomeCompleto = linhaNome2 + " " + linhaSobrenome2;
                escritorResultados.write(nomeCompleto);
                escritorResultados.newLine();
            }
            leitorNomes2.close();
            leitorSobrenomes2.close();
            escritorResultados.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

