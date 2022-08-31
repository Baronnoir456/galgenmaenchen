package main.geometry;

public class Cercle implements Shape{

    private double rayonEnCm;

    public Cercle(double rayonEnCm){
        this.rayonEnCm = rayonEnCm;
    }

    public double getRayonEnCm() {
        return rayonEnCm;
    }
    public double aire(){
        return Math.PI*rayonEnCm*rayonEnCm;
    }
    public double perimetre(){
        return 2*Math.PI*rayonEnCm;
    }
    public double vergleicheFlaeche(Shape other){
        return aire() - other.aire();
    }
}

