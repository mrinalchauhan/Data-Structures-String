// brute force approach
//Time Complexity: O(N*N), where N is the length of the string and another N because we compare two string.
//Auxiliary Space: O(N) , Because we are creating substring
 public class checkOneStringsAreRotationOfOther{
       public static boolean rotate(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(0)){
                if(s1.substring(i,s1.length()).equals(s2.substring(0,i))){
                    if(s1.substring(0, i-1).equals(s2.substring(i, s2.length()-1))){
                           return true;
                    }
                }
            }
        }
        return false;
       }
    public static void main(String args[]){
    String s1="ABCD";
    String s2="CDAB";
    boolean ans=rotate(s1, s2);
    System.out.println("Is one string is rotation of other: "+ans);
   } 
 }

// check if in two strings ...one string is the rotation of other
//optimal approach
//T.C=O(N)  The concatenation operation takes O(n) time, where n is the length of the strings.
//S.C=O(N)    due to the concatenated string
/* 
public class checkOneStringsAreRotationOfOther {
    public static boolean rotation(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        String s3=s1+s1;  
         if(s3.indexOf(s2)==-1){
            return false;
         }
         return true;
    }
   public static void main(String args[]){
    String s1="ABCD";
    String s2="CDAB";
    boolean ans=rotation(s1, s2);
    System.out.println("Is one string is rotation of other: "+ans);
   } 
}
*/