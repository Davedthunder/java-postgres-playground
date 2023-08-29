package com.example;

public class AppClasses {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setrenda(10000);
        cliente.setSexo('M');
        cliente.setAnoNascimento(1980);
        System.out.println( "renda: " + cliente.getrenda());
        System.out.println( "sexo: " + cliente.getSexo());
        System.out.println( "Ano do Nascimento: " + cliente.getAnoNascimento());
        System.out.println();

        Cliente client2 = new Cliente();
        client2.setrenda(2000);
        client2.setSexo('F');
        client2.setAnoNascimento(1970);

        System.out.println( "renda: " + client2.getrenda());
        System.out.println( "sexo: " + client2.getSexo());
        System.out.println( "Ano do Nascimento: " + client2.getAnoNascimento());
    }
}
