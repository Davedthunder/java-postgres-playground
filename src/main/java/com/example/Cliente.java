package com.example;

public class Cliente {
    private double renda;
    private char sexo;
    public char getSexo() {
        return sexo;

    }
    public void setSexo(char sexo) {
    if (sexo == 'M'|| sexo == 'F')
        this.sexo = sexo;
    else System.out.println("sexo invalido");  


    }
    public int getAnoNascimento() {
        return anoNascimento;

    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;

    }

    private int anoNascimento;

    public double getrenda(){
        return renda;

    }
    public void setrenda(double renda){
        if(renda >= 0)
            this.renda = renda;
        else System.out.println("A renda deve ser maior que zero");    

    }

     




}