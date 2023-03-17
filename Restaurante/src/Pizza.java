public class Pizza {
    public String nome;
    public Double valor;
    public Boolean possuiBorda;

    public Pizza() {
        this.nome = nome;
        this.valor = valor;
        this.possuiBorda = possuiBorda;
    }


    public Double calcularValor(boolean possuiBorda) {
        if (possuiBorda) {
            return valor + 5.00;
        }
        return valor;
    }

    public String consultarNome() {
        return nome;
    }
}
