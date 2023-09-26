package Interfaces;

public class Car implements Brake, Engine{
    //In the Car class, all the implemented class's constructor must be declared.

    @Override
    public void brake(){
        System.out.println("I just brake like a normal car");
    }

    @Override
    public void start(){
        System.out.println("I just start like a normal car");
    }

    @Override
    public void stop(){
        System.out.println("I just stop like a normal car");
    }

    @Override
    public void acc(){
        System.out.println("I just accelerate like a normal car");
    }
}
