package com.company;

import com.company.domain.Circulo;
import com.company.domain.FiguraGeometrica;
import com.company.domain.Retangulo;
import com.company.domain.Triangulo;

public class Main {

    public static void main(String[] args) {

        FiguraGeometrica f1 = new Circulo(3.0);
        System.out.println(f1);

        FiguraGeometrica f2 = new Retangulo(5.0, 8.0);
        System.out.println(f2);

        FiguraGeometrica f3 = new Triangulo(5.0, 8.0);
        System.out.println(f3);

        FiguraGeometrica[] arrayFiguras = new FiguraGeometrica[3];
        arrayFiguras[0] = f1;
        arrayFiguras[1] = f2;
        arrayFiguras[2] = f3;

        System.out.println("A média de area das Figuras Geométricas é de: " + areaMedia(arrayFiguras));
    }

    public static Double areaMedia (FiguraGeometrica figurasGeometricas[]) {
        Double total = 0.0;
        for (int i = 0; i < figurasGeometricas.length; i++) {
            total = total + figurasGeometricas[i].getArea();
        }
        return total / figurasGeometricas.length;
    }
}
