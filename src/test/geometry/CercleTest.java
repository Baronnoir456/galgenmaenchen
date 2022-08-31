package test.geometry;

import main.geometry.Cercle;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

public class CercleTest{

    @Test
    public void ensureAireReturnsCorrectValue() {
        Cercle cercle = new Cercle(6);
        assertEquals(37.69911184307752, cercle.aire());
    }


    @Test
    void getRayonEnCm() {
    }

    @Test
    void aire() {
    }

    @Test
    void perimetre() {
    }

    @Test
    void vergleicheFlaeche() {
    }
}
