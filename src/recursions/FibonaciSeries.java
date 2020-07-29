package recursions;
import java.util.*;
import java.util.regex.*;


// Write your code here. DO NOT use an access modifier in your class declaration.
class Parser {

    public String isBalanced(String str){
        int a[] =new int[2];
        int aCounter=0;
        int bCounter=0;
        for(int i = 0; i< str.length()-1; i++){
            if (str.charAt(i)=='{' || str.charAt(i)=='}'){
            	aCounter =  aCounter+1;
                    a[0] = aCounter;
            }else{
            	bCounter =  bCounter+1;
                a[1] = bCounter;
            }
        }

        String isBalanced = "false";
        if(a[0] %2==0 && a[1] %2==0){
                isBalanced = "true";
        }
        return isBalanced;
    }

}

class Solution {
	
	public static void main(String[] args) {
		Parser parser = new Parser();
 	System.out.println(parser.isBalanced("{}()"));
	}
}
