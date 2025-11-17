//Name: Paul Hudalla
//Date: 11/10/25
//this program will check whether a string is valid or not

public class solver {
    public static boolean isValid(String s) {
        s = s.substring(1);
        while (s.length() > 0) {
            boolean removed = false;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.substring(i, i + 1).equals("(")) {
                    if (s.substring(i + 1, i + 2).equals(")")) {
                        s = s.substring(0, i) + s.substring(i + 2);
                        removed = true;
                    }
                }
                    // check for the other symbols
                if (s.substring(i, i + 1).equals("[")) {
                    if (s.substring(i + 1, i + 2).equals("]")) {
                        s = s.substring(0, i) + s.substring(i + 2);
                        removed = true;
                    }
                }
                if (s.substring(i, i + 1).equals("{")) {
                    if (s.substring(i + 1, i + 2).equals("}")) {
                        s = s.substring(0, i) + s.substring(i + 2);
                        removed = true;
                    }
                if (removed == false) {
                        return false;
                    }
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("(){}[]")); //true
        // System.out.println(isValid("(]")); //false
        // System.out.println(isValid("([{({})}])")); //true
        // System.out.println(isValid("(([]){})")); //true
        // System.out.println(isValid("{}[())()(]")); //false
        // System.out.println(isValid("(){}{")); //false
        // System.out.println(isValid("([)]")); //false
        // System.out.println(isValid("([{}([)])]")); //false
    }
}
