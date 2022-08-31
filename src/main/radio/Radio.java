package main.radio;


public class Radio {

    private boolean on;
    private int volume;
    private double frequency;


    public Radio(){
        frequency = 85.0;
        volume = 3;
        on = false;
    }
    public Radio(boolean on, int volume, double frequency){
        this.on = on;
        this.volume = volume;
        this.frequency = frequency;
    }
    public void incVolume(){
        if(on && volume < 10){
            volume++;
        }

    }
    public void decVolume(){
        if(on && volume > 0){
            volume--;
        }

    }
    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void setFrequency(double frequency) {
        if(frequency > 102.0 || frequency < 85.0){
            frequency = 99.9;
        }
        this.frequency = frequency;

    }

    @Override
    public String toString() {
        return "Radio " +
                (on ? "an" : "aus")+
                ", Lautstaerke " + volume +
                ", Frequenz " + frequency +
                " Mhz";
    }
}

