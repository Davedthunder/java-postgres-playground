package com.example;

import java.time.LocalDate;

public class AppEleitor {
    public static void main(String[] args) {
        var cidadao = new Cidadao();
        cidadao.setDataNascimento(LocalDate.of(2001, 8, 30));
        System.out.println(cidadao.eleitor());
        System.out.println(cidadao.idade());

    }



}

