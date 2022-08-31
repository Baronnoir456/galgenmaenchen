package main.geometry;

public class Main {
    public static void main(String[] args) {
        Shape cercle = new Cercle(6);
        Shape cercle1 = new Cercle(9);
        Shape rectangle = new Rectangle(5, 7);
        Shape rectangle2 = new Rectangle(9, 23);









        System.out.println();
        System.out.println(rectangle.vergleicheFlaeche(rectangle2));
        System.out.println(cercle.vergleicheFlaeche(cercle1));

        System.out.println(cercle.perimetre());
        System.out.println(String.format("der kreis 2 hat eine %s cm grosse flaeche", Math.round(cercle1.aire() * 100.0) / 100.0));

        System.out.println(String.format("flaeche = %s cm~, perimeter = %s cm, laenge = %s cm, breite = %s cm.", Math.round(rectangle.aire() * 100.0) / 100.0, Math.round(rectangle.perimetre() * 100.0) / 100.0, ((Rectangle) rectangle).getLongeur(), ((Rectangle) rectangle).getLargeur()));
        System.out.println(String.format("flaeche = %s cm~, perimeter = %s cm, radius = %s cm.", Math.round(cercle.aire() * 100.0) / 100.0, Math.round(cercle.perimetre() * 100.0) / 100.0, ((Cercle) cercle).getRayonEnCm()));
    }


}
