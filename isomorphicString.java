//check whether two strings are isomorphic
//T.C=O(N)
//S.C=O(1)
// ch1 is s1 letters
// ch2 is s2 letters
import java.util.HashMap;
public class isomorphicString {

    public static boolean isomorphic(String s1,String s2){
      if(s1.length()!=s2.length()){
        return false;
      }
      HashMap<Character,Character>hash=new HashMap<>(); 
      for(int i=0;i<s1.length();i++){
          char ch1=s1.charAt(i);
          char ch2=s2.charAt(i);
         
          if(!hash.containsKey(ch1)){
             if(!hash.containsValue(ch2)){
                hash.put(ch1,ch2);
             }
             else{
                return false;
             }
          }
          else{
            // if hash.containskey(ch1)  means if present then it should be equal to replacement word (ch2)
            char ch=hash.get(ch1);
            if(ch!=ch2){
                return false;
            }   
          }
      }
      return true;
    }
    public static void main(String args[]){
        String s1="badc";
        String s2="kikp";
        // agr 2nd k ke jagah pe koi aur dursa leeter hota eg m,n ...to isomorphic hota
        boolean ans=isomorphic(s1, s2);
        System.out.println("is two words isomorphic "+ans);
    }
    
}
