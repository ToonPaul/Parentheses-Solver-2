//Name: Paul Hudalla
//Date: 11/10/25
//this program will check whether a string is valid or not

public class solver {
    public static boolean isValid(String s){
        s = s.substring(1);
        while(s.length()>0){
            boolean removed = false;
        //If the first character is "(", then check all the other characters in the string for a match ")" character
            if(s.substring(0,1).equals("(")){
            for(int i = 0; i < s.length(); i++){
                if(s.substring(i, i+1).equals(")")){
                    s = s.substring(0,i+1) + s.substring(i+2);
                    removed = true;
                }
            }
        //If the first character is "[", then check all the other characters in the string for a match "]" character
        } else if (s.substring(0,1).equals("[")){
            for(int i = 0; i < s.length(); i++){
                if(s.substring(i, i+1).equals("]")){
                    s = s.substring(0,i+1) + s.substring(i+2);
                     removed = true;
                }
            }
        //If the first character is "{", then check all the other characters in the string for a match "}" character    
        } else if (s.substring(0,1).equals("{")){
            for(int i = 0; i < s.length(); i++){
                if(s.substring(i, i+1).equals("}")){
                    s = s.substring(0,i+1) + s.substring(i+2);
                     removed = true;
                }}
            //If the string starts with a closing parenthese, the string should immidently return false
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
        //System.out.println(isValid("(){}[]")); //true, wrong result
        //System.out.println(isValid("(]")); //false, correct
        //System.out.println(isValid("([{({})}])")); //true, error
        //System.out.println(isValid("(([]){})")); //true, error
        //System.out.println(isValid("{}[())()(]")); //false, correct
        //System.out.println(isValid("(){}{")); //false,error
        //System.out.println(isValid("([)]")); //false, correct
        //System.out.println(isValid("([{}([)])]")); //false, error
    }
    }
