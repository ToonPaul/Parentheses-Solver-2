//Name: Paul Hudalla
//Date: 11/10/25
//this program will check whether a string is valid or not

public class solver {
    public static boolean isValid(String s){
        String firstCharcter = s.substring(0,1);
        s = s.substring(1);
        while(s.length()>0){
            boolean removed = false;
        if(firstCharacter.equals("(")){
            for(int i = 0; i < s.length(); i++){
                if(s.chatAt(i).equals(")")){
                    s = s.substring(0,i+1) + s.substring(i+2);
                    removed = true;
                }
            }
        } else if (firstCharacter.equals("[")){
            for(int i = 0; i < s.length(); i++){
                if(s.chatAt(i).equals("]")){
                    s = s.substring(0,i+1) + s.substring(i+2);
                     removed = true;
                }
            }
            } else if (firstCharacter.equals("{")){
            for(int i = 0; i < s.length(); i++){
                if(s.chatAt(i).equals("}")){
                    s = s.substring(0,i+1) + s.substring(i+2);
                     removed = true;
                }}
            } else{
            return false;
            }
            if(!removed){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isValid("(){}[]")); //true
        //System.out.println(isValid("(]")); //false
        //System.out.println(isValid("([{({})}])")); //true
        //System.out.println(isValid("(([]){})")); //true
        //System.out.println(isValid("{}[())()(]")); //false
        //System.out.println(isValid("(){}{")); //false
        //System.out.println(isValid("([)]")); //false
        //System.out.println(isValid("([{}([)])]")); //false
    }
    }
