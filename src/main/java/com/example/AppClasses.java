package com.example;

public class AppClasses {
    public static void main(String[] args) {
        System.out.println("Criando Classes");
        Cliente cliente = new Cliente();
        cliente.setrenda (10000);
        cliente.setSexo('M');
        cliente.setAnoNascimento(1980); 
        System.out.println("renda " + cliente.getrenda());
        System.out.println("sexo " + cliente.getSexo());
        System.out.println("Ano do Nascimento " + cliente.getAnoNascimento());

        Cliente cliente2 = new Cliente();

        cliente2.setrenda (2000);
        cliente2.setSexo('F');
        cliente2.setAnoNascimento(1970);
        System.out.println();

        System.out.println("renda " + cliente2.getrenda());
        System.out.println("sexo " + cliente2.getSexo());
        System.out.println("Ano do Nascimento " + cliente2.getAnoNascimento());





    }



}
