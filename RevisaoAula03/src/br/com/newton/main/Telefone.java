package br.com.newton.main;

import br.com.newton.agenda.Contato;

import java.util.Scanner;
public class Telefone{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Contato contato = new Contato();

        System.out.println("Digite o nome de contato: ");
        String nome = entrada.nextLine();


        System.out.println("Digite um número de telefone: ");
        String numero = entrada.nextLine();

        if(numero.length() != 9){
            System.out.println("Telefone inválido");
        }
        else{
            System.out.println("Contato: " + nome);
            System.out.println("Telefone: " + numero);
        }
    }
}
