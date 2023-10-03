package Interfaces;

public class CDPlayer implements MediaPlayer{

    @Override
    public void start() {
        System.out.println("Music start");
    }

    @Override
    public void stop() {
        System.out.println("Music stops");
    }
}
