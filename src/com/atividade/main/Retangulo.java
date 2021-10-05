package com.atividade.main;

public class Retangulo extends Quadrilatero {

    float lado;
    float altura;

    public Retangulo(float lado, float altura) {
      this.lado = lado;
      this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return this.lado * this.altura;
    }

    @Override
    public float calcularPerimetro() {
        return (2*this.lado) + (2*this.altura);
    }

}
