package com.rahul;

public class DynamicQueue extends CircularQueue{
    //what happen when the circular queue is getting full and still you want to add some elements.

    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean add(int item) {

        //It takes care when the stack is being full.
        if (this.isFull()){
            //double the array size.
            int[] temp = new int[data.length * 2];

            //Copy all the elements to the temp.
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }

        //At this point we know, that temp array isnt full.
        //So Insert the item.
        return super.add(item);
    }
}
