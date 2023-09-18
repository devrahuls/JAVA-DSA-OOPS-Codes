package Access;

public class A {
    private int num;
    public String name;
    protected int[] arr;

    public A(int num , String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    //Getter method - is used to access/get those methods that are declared as private.
    public int getNum(){
        return num;
    }

    //Setter method - is used to set the value of those methods that are declared as private.
    public void setNum(){
        this.num = num;
    }


}
