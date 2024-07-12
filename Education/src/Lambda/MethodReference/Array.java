package Lambda.MethodReference;

public class Array {
    public Object [] array;

    public Array(Object[] array) {
        this.array = array;
    }

    public void forEach(ObjectConsumer oc){
        for (Object o:array){
            oc.consume(o);
        }
    }
}
