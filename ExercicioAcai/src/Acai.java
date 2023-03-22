public class Acai {
    private int tamanho;
    private double valor;
    private boolean temSorvete;

    public Acai(int tamanho, boolean temSorvete) {
        this.tamanho = tamanho;
        this.temSorvete = temSorvete;
        if (tamanho == 300) {
            this.valor = 8.00;
        } else if (tamanho == 500) {
            this.valor = 10.00;
        } else if (tamanho == 700) {
            this.valor = 12.00;
        }
        if (temSorvete) {
            this.valor += 2.00;
        }
    }

    public double calcularValor() {
        return this.valor;
    }
}
