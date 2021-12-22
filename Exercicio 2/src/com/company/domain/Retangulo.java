package com.company.domain;

public class Retangulo extends FiguraGeometrica{

    private Double baseRetangulo;
    private Double alturaRetangulo;
    private Double areaRetangulo;

    public Retangulo(Double baseRetangulo, Double alturaRetangulo) {
        this.baseRetangulo = baseRetangulo;
        this.alturaRetangulo = alturaRetangulo;
    }

    @Override
    public Double getArea() {
        return this.areaRetangulo;
    }

    @Override
    public double area() {
        return areaRetangulo = baseRetangulo * alturaRetangulo;
    }
}
