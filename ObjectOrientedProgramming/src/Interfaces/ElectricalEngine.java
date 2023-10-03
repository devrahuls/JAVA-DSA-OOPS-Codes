package Interfaces;

public class ElectricalEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electrical Engine start");
    }

    @Override
    public void stop() {
        System.out.println("Electrical Engine stops");
    }

    @Override
    public void acc() {
        System.out.println("Electrical Engine accelerate");
    }
}
