package multithreading;

public class StackWithoutSync {

    private int[] array;
    private int stackIndex;
    public StackWithoutSync(int capacity) {
        this.array = new int[capacity];
        this.stackIndex= -1;
    }

    public boolean push(int value) {
        if(isFull()) {
            return false;
        }
       ++stackIndex;
        try {
            Thread.sleep(1000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        array[stackIndex] = value;
        return true;
    }

    public int pop(){
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        int obj = array[stackIndex];
        array[stackIndex]= Integer.MIN_VALUE;
        try {
            Thread.sleep(1000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        stackIndex--;
        return obj;
    }
    public boolean isFull(){
        return stackIndex == array.length - 1;
    }

    public boolean isEmpty(){
        return stackIndex < 0;
    }

}
