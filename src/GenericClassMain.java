public class GenericClassMain<T>{
    T obj;

     GenericClassMain(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void displayObjTypeDetail(){
        System.out.printf("Type of obj is:  " +  obj.getClass().getName());
    }

}

