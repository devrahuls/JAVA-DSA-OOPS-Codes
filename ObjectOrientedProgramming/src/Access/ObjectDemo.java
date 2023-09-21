package Access;

public class ObjectDemo {
    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    //Hashcode - A unique number representation of an object
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);  //ORIGINAL
        return this.num == ((ObjectDemo)obj).num; //Modified to check.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34, 67.6f);
        ObjectDemo obj2 = new ObjectDemo(34, 56.6f); //for every object the hashcode will be different.
        ObjectDemo obj3 = obj; //Its hashcode value will be the same as for the obj1.

        if (obj == obj2){
            System.out.println("Yoyo");
        }

        //Used to check the values.
        if (obj.equals(obj2)){
            System.out.println("KoKo");
        }

        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());

    }
}
