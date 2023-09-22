package AbstractClasses;

public class Son extends Parent{
    @Override
    void career(String name){
        System.out.println("I want to become" + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " +name+ "she is " +age);
    }

}
