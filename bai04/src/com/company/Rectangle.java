package com.company;

public class Rectangle extends Shape {
    private Double width = 0.0;
    private Double height =0.0;

    Rectangle(Double width, Double height){
        //custom constructor
        this.width = width;
        this.height = height;
    }

    @Override
    public Double calculateArea() {
        return width * height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Width = "+this.width+",Height = "+this.height;
    }
}
