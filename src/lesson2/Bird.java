package lesson2;

public abstract class Bird extends Animal {

    public Bird(Double height, Double weight, int eyeColor, String sound, Double flightAlt) {
        super(height, weight, eyeColor, sound);
        this.flightAlt = flightAlt;
    }

    public Double getFlightAlt() {
        return flightAlt;
    }

    public void setFlightAlt(Double flightAlt) {
        this.flightAlt = flightAlt;
    }

    private Double flightAlt;

    public void doFlight() {
        if (flightAlt > 0)
            System.out.println("Я лечу на высоте " + flightAlt + " м над землей");
        else
            System.out.println("Низко");
    }
}
