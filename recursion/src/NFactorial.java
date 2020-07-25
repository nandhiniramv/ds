public class NFactorial {
    public static void main(String a[]){
        System.out.print(NReverse("Malayalam"));
    }

    private static String NReverse(String str) {
        int size=str.length();
        char c = str.charAt(size-1);
        if (size==1)
            return ""+ c;
        return c + NReverse(str.substring(0,size-1));
    }
}
