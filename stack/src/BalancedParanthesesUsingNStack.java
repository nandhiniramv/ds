

public class BalancedParanthesesUsingNStack {
    public String check(String s) {
        boolean balanced = isBalanced(s);
        if (balanced)
            return "Balanced";
        else {
            return "Not Balanced";
        }
    }

    public boolean isBalanced(String s) {
        NStack<Character> st = new NStack<>();
        char[] cArray = s.toCharArray();
        for (Character c : cArray) {

            if (c == '{' || c == '[' || c == '(')
                st.push(c);
            else if (st.isEmpty()) {
                //first entry is closing bracket
                return false;
            }
            else{
                Character peeked = st.peek();//can be popped too but want to use stack peek too
                if ((c == '}' && peeked == '{') || (c == ']' && peeked == '[') || (c == ')' && peeked == '('))
                    {
                        st.pop();
                    }
                else
                    //mismatching closing bracket
                    return false;

            }

        }

        return true;


    }


    public static void main(String[] s){
        BalancedParanthesesUsingNStack bp = new BalancedParanthesesUsingNStack();
        String s1 = "[{}]";
        System.out.println(s1 + " is "+ bp.check(s1));

        s1 = "[{(}]";
        System.out.println(s1 + " is "+ bp.check(s1));

        s1 = "[](})";
        System.out.println(s1 + " is "+ bp.check(s1));

        s1 = "[{}]()";

        System.out.println(s1 + " is "+ bp.check(s1));
        s1 = "()[{(}]";

        System.out.println(s1 + " is "+ bp.check(s1));
        s1 = ")";

        System.out.println(s1 + " is "+ bp.check(s1));


    }

}
