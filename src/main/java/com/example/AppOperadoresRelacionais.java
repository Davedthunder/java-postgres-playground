package com.example;

public class AppOperadoresRelacionais {
    
    public static void main(String[] args) {
        
        var cliente1 = new Cliente();
        cliente1.setAnoNascimento(2007);

        var cliente2 = new Cliente();
        cliente2.setAnoNascimento(2005);


       // if(cliente1.getAnoNascimento() == cliente2.getAnoNascimento()){
           // System.out.println("Os clientes nasceram no mesmo ano ");
           // System.out.println("O ano de nascimento dos clientes é " + cliente1.getAnoNascimento());

        // } 
         //else {
         //     System.out.println("Os clientes nasceram em anos diferentes ");
         //     System.out.println("O ano de nascimento do cliente 1 é " + cliente1.getAnoNascimento());
         //      System.out.println("O ano de nascimento do cliente 2 é " + cliente2.getAnoNascimento());
         // }
           
       
       
        boolean cliente1Maisjovem = cliente1.getAnoNascimento() > cliente2.getAnoNascimento();
        boolean cliente2Maisvelho = cliente1.getAnoNascimento() < cliente2.getAnoNascimento();
       
         if(cliente1Maisjovem){
            System.out.println("Cliente 1 é mais jovem que o cliente 2");
        }
          else if(cliente2Maisvelho){
            System.out.println("Cliente 1 é mais velho que o cliente 2");
         }
         else System.out.println("Os clientes tem a mesma idade ");

        








    }





}
