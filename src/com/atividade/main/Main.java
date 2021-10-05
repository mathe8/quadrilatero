package com.atividade.main;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Trocar o valor caso queira adicionar mais formas
        int qntFormas = 5;

        Random random = new Random();

        Quadrilatero formas[] = new Quadrilatero[qntFormas];

        for(int cont = 0; cont < formas.length; cont++) {

            int num = random.nextInt(formas.length*2);
            int h = random.nextInt(formas.length*2);

            System.out.print("\n");

            if (num % 3 == 0) {
                formas[cont] = new Circulo(num);
                System.out.println(cont+1+". Circulo");
                System.out.println("---------------");
                System.out.println("Raio: "+num);

            } else if(num % 3 == 1) {
                formas[cont] = new Retangulo(num, h);
                System.out.println(cont+1+". Retangulo");
                System.out.println("---------------");
                System.out.println("Lado: "+num);
                System.out.println("Altura: "+h);

            } else {
                formas[cont] = new Quadrado(num);
                System.out.println(cont+1+". Quadrado");
                System.out.println("---------------");
                System.out.println("Lado: "+num);
            }

            System.out.println("Área: "+formas[cont].calcularArea());
            System.out.println("Perímetro: "+formas[cont].calcularPerimetro());

        }

    }

}
