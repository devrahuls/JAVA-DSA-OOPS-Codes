package generics;

import java.util.Arrays;

public class CustomGenericsArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; //Also worked as an index

    public CustomGenericsArrayList(){
        data = new Object[DEFAULT_SIZE];
    }

    //To add the element in the arraylist
    public void add(T num){
//So what happens in arraylist is - at the very first the array initialized as the DEFAULT_SIZE given, and if the size of the array gonna be increase,
// then it gets doubles as the previous size of the array.
        if (isFull()){
            resize();
        }

        data[size++] = num;
    }
    private boolean isFull(){
        return size == data.length;
    }
    private void resize(){
        Object[] temp = new Object[data.length * 2];

        //Copy all the 'data' items in the new 'temp' array.
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }


    //TO REMOVE AN ELEMENT FROM THE LAST OF THE ARRAY.
    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }


    //TO GET THE VALUE FROM THE ARRAY.
    public T get(int index){
        return (T)(data[index]);
    }

    //TO GET THE SIZE OF THE ARRAY
    public int size(){
        return size;
    }


    //TO SET A VALUE AT A PARTICULAR INDEX.
    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenericsArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

        //This is known as Generics
        CustomGenericsArrayList<Integer> list2 = new CustomGenericsArrayList<>();

        for (int i = 0; i < 14; i++) {
            list2.add(2 * i);
        }
        System.out.println(list2);

    }

}
