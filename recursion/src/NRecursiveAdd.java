import java.util.ArrayList;
import java.util.List;

public class NRecursiveAdd {
    public static int count(List<Integer> a){
       int first  = a.get(0);
       a.remove(0);
       if (a.size()==0) return first;
       return first + count(a);


    }
    public static void main(String[] a){
        List<Integer> i = new ArrayList<>();
        i.add(25);i.add(125);i.add(25);i.add(25);
        System.out.println(count(i));
    }
}
