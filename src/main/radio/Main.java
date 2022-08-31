package main.radio;

public class Main {
    public static void main(String[] args){
        Radio radio = new Radio(true, 4, 98.8);

        System.out.println(radio);

        radio.decVolume();

        System.out.println(radio);

    }
}
