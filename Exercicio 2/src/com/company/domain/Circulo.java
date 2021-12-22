package com.company.domain;

public class Circulo extends FiguraGeometrica {

    private Double areaCirculo;
    private Double area;

    public Circulo(Double areaCirculo) {
        this.areaCirculo = areaCirculo;
    }

    public Double getArea(){
        return this.area;
    }

    @Override
    public double area() {
        double pi = 3.14;
        area = pi * (areaCirculo * areaCirculo);
        return area;
    }
}
