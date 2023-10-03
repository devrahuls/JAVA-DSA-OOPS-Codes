package Interfaces;

public class NiceCar {

    private Engine engine = new PowerEngine();
    private MediaPlayer player = new CDPlayer();

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void accelerate(){
        engine.acc();
    }
    
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }

    public void upgradeEngine(){
        this.engine = new ElectricalEngine();
    }
}
