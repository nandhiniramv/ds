import java.util.ArrayList;
import java.util.List;

public class NStack<Object> {
    private List<Object> l = new ArrayList<>();
    public void push(Object o){
        l.add(o);
    }
    public Object pop(){
        int lastElement = l.size()-1;
        Object o = l.get(lastElement);
        l.remove(lastElement);
        return o;
    }
    public Object peek(){return l.get(l.size()-1);}
    public boolean isEmpty(){return l.isEmpty();}
}
