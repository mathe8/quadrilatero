package com.atividade.main;

import java.lang.Math;

public class Circulo extends Quadrilatero {

    float raio;

    Circulo(float raio) {
        this.raio = raio;
    }

    @Override
    public float calcularArea() {
        return (float) Math.PI * (this.raio * this.raio);
    }

    @Override
    public float calcularPerimetro() {
        return (float) (2 * Math.PI) * this.raio;
    }

}
