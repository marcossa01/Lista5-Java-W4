package com.company.domain;

public class Triangulo extends FiguraGeometrica{

    private Double baseTriangulo;
    private Double alturaTriangulo;
    private Double areatriangulo;

    public Triangulo(Double baseTriangulo, Double alturaTriangulo){
        this.baseTriangulo = baseTriangulo;
        this.alturaTriangulo = alturaTriangulo;
    }

    @Override
    public Double getArea() {
        return this.areatriangulo;
    }

    @Override
    public double area() {
        return areatriangulo = (baseTriangulo * alturaTriangulo) / 2;
    }


}
