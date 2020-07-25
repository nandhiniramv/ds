public class NToString {
    public static void main(String a[]){
        System.out.println(NtoStr(65535,16));
    }

    private static String NtoStr(int i,int base) {
        if(i / base == 0) return ""+i%base;
        return  (NtoStr(i/base,base))+i%base;
    }
}
