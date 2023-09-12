package com.example;

public class Cliente{
    private String cpf;
    private String nome;
    private String cidade;
    private double renda;
    private char sexo ;
    private boolean especial;

    

    public Cliente(){
    //   System.out.println("Criando Cliente sem parâmetros");
        double aleatorio = Math.random();
        if(aleatorio > 0.5)
            especial = true;


    }
    public Cliente(double renda, char sexo ){
        this();
        System.out.println("Criando Cliente com parâmetros");
        setrenda(renda);        
        this.sexo= sexo;


    }
    
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getCpf() {
        return cpf;
    }
    
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        if(nome.isBlank())
            System.out.println("Nome é obrigatório");
        else this.nome = nome.toUpperCase().trim();
    }
    
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        if(sexo == 'M'||sexo == 'F'|| sexo =='m'|| sexo == 'f')
            this.sexo = sexo;
        else System.out.println("Sexo inválido");   

    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public int anoNascimento;

    public double getrenda(){
        return renda;

    }
    public void setrenda(double renda){
        if(renda >= 0)
             this.renda = renda;
        else System.out.println("A renda deve ser maior ou igual a zero");
    }   
    public boolean isEspecial() {
        return especial;
    }


    public void setEspecial(boolean especial) {
        this.especial = especial;
    }



}