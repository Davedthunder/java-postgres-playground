package com.example;

import java.util.Scanner;

public class AppScanner {
    public static void main(String[] args) {
        System.out.println("Criando Classes");
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Digite o Nome: ");
        cliente.setNome(scanner.nextLine());
    
        System.out.println("Digite o CPF: ");
        cliente.setCpf(scanner.nextLine());

        System.out.println("Digite a Cidade: ");
        cliente.setCidade(scanner.nextLine());

        System.out.println("Digite a Renda: ");
        cliente.setrenda(scanner.nextDouble());

        System.out.println("Digite o Ano do Nascimento: ");
        cliente.setAnoNascimento(scanner.nextInt());

        scanner.nextLine();
        System.out.println("Digite o Sexo: ");
        String sexo = scanner.nextLine();
        cliente.setSexo(sexo.charAt(0));

      
        System.out.println("Nome " + cliente.getNome());
        System.out.println("renda " + cliente.getrenda());
        System.out.println("sexo " + cliente.getSexo());
        System.out.println("Ano do Nascimento " + cliente.getAnoNascimento());
        System.out.println("Especial " + cliente.isEspecial());





    }



}
