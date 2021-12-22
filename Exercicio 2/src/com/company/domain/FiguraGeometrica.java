package com.company.domain;

public abstract class FiguraGeometrica {

    public abstract double area();

    public abstract Double getArea();

    @Override
    public String toString() {
        return "A medida total da área é de: " + area();
    }
}
