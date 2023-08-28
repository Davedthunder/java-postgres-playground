package com.example;

import java.util.Arrays;

public class AppArrays{

public static void main(String[] args) {

    int x = 10;
    System.out.println(x);
    x = 20;
    
    double vetorDouble1[] ={1,2,3};
    double vetorDouble2[] = vetorDouble1;
    System.out.println(Arrays.toString(vetorDouble1));  

    System.out.println("valor da posição 0 " + vetorDouble2 [0]);
    System.out.println("valor da posição 1 " + vetorDouble2[1]);
    System.out.println("valor da posição 2 " + vetorDouble2[2]);
    
    int vetor3[] = new int[4];

    vetor3[0]= 100;
    vetor3[1]= 200;
    vetor3[2]= 300;
    vetor3[3]= 400;
    System.out.println(Arrays.toString(vetor3));

    double matriz[][]={{10,20,30},{40,50,60}};
    
    matriz[0] = new double[] {10,20,30,40};
    matriz[1] = new double[] {50,60,70,80,90,100};
    System.out.println(Arrays.toString(matriz[0]));
    System.out.println(Arrays.toString(matriz[1]));









}





























}