package com.example;

public class AppClasses {
    public static void main(String[] args) {
        System.out.println("Criando Classes");
        Cliente cliente = new Cliente();
        cliente.setrenda (-10000);
        cliente.setAnoNascimento(2001); 
        cliente.setNome ("davi sizenando");
        cliente.setSexo('M');
        cliente.setCpf("99999999999"); 
        cliente.setCidade("Palmas");

        var vetorNome = cliente.getNome().split(" ");
        System.out.println(vetorNome[0]);
        System.out.println(vetorNome[1]);
        
        System.out.println("1o caractere do nome " + cliente.getNome().charAt(0));
        
        
        System.out.println("Nome " + cliente.getNome());
        System.out.println("renda " + cliente.getrenda());
        System.out.println("sexo " + cliente.getSexo());
        System.out.println("Ano do Nascimento " + cliente.getAnoNascimento());
        System.out.println("Especial " + cliente.isEspecial());

        Cliente cliente2 = new Cliente(2000, 'F');
        cliente2.setCidade("PALMAS");
        cliente2.setNome ("Joana");
        cliente2.setCpf("99999999999"); 
        
        System.out.println();
        
        if(cliente.getCpf() .equals(cliente2.getCpf()))
        System.out.println("Cliente 1 e 2 tem o mesmo cpf");
        else System.out.println("CPFs são diferentes");
        
        
        if(cliente.getCidade() .equalsIgnoreCase(cliente2.getCidade()))
        System.out.println("Cliente 1 e 2 moram  na mesma cidade");
        else System.out.println("CLientes moram em cidades diferentes");

        System.out.println("Nome " + cliente2.getNome());
        System.out.println("renda " + cliente2.getrenda());
        System.out.println("sexo " + cliente2.getSexo());
        System.out.println("Ano do Nascimento " + cliente2.getAnoNascimento());
        System.out.println("Especial " + cliente2.isEspecial());





    }



}
