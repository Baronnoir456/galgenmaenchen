package main.geometry;

public class Triangle implements Shape {


    private double base;


    public Triangle( double base){
        this.base = base;
    }

    public double aire(){
        return base * base - Math.sqrt(3) /4;
    }
    public double perimetre(){
        return base*3;
    }

    @Override
    public double vergleicheFlaeche(Shape other) {
        return aire()- other.aire();
    }

    public double getBase() {
        return base;
    }





}
