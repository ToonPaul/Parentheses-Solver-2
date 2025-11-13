//Name: Paul Hudalla
//Date: 11/10/25
//this program will check whether a string is valid or not

public class solver{
    public static void isValid(String s){
        String firstCharcter = s.substring(0,1);
        s = s.substring(1);
        if(firstCharacter.equals("(")){
            for(int i = 0; i < s.length(); i++){
                if(s.chatAt(i).equals(")")){
                    s = s.substring(0,i) + s.substring(i+1);
                }
            }
        } else if (firstCharacter.equals("[")){
            for(int i = 0; i < s.length(); i++){
                if(s.chatAt(i).equals("]")){
                    s = s.substring(0,i) + s.substring(i+1);
                }
        } else if (firstCharacter.equals("{")){
            for(int i = 0; i < s.length(); i++){
                if(s.chatAt(i).equals("}")){
                    s = s.substring(0,i) + s.substring(i+1);
                }
        } else{
            return false;
        }
    }
    public static void main(String[] args){

    }
}
