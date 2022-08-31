package main.geometry;

public class Rectangle implements Shape{

    private double longeur;
    private double largeur;

    public Rectangle(double largeur,double longeur){
        this.largeur = largeur;
        this.longeur = longeur;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getLongeur() {
        return longeur;
    }

    public double aire(){
        return longeur*largeur;
    }
    public double perimetre(){
        return longeur*2 + largeur*2;
    }

    public double vergleicheFlaeche(Shape other){
        return aire() - other.aire();
    }

}
