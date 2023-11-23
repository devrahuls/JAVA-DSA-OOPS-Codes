package com.rahul;

public class DynamicStack extends CustomStack{

    public DynamicStack(){
        super(); //It will call CustomStack().
    }

    public DynamicStack(int size){
        super(size); //It will call CustomStack(int size).
    }

    @Override
    public boolean push(int item) {
        //It takes care when the stack is being full.
        if (this.isFull()){
            //double the array size.
            int[] temp = new int[data.length * 2];

            //Copy all the elements to the temp.
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        //At this point we know, that temp array isnt full.
        //So Insert the item.
        return super.push(item);
    }
}
