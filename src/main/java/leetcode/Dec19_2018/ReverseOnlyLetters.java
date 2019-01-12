package main.java.leetcode.Dec19_2018;
/*
Given a string S, return the "reversed" string where all characters that
are not a letter stay in the same place, and all letters reverse their positions.



Example 1:

Input: "ab-cd"
Output: "dc-ba"
Example 2:

Input: "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:

Input: "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
 */
public class ReverseOnlyLetters {
    public String reverseOnlyLetters1(String S) {
        char[] cArray = S.toCharArray();
        int i = 0;
        int j = S.length()-1;
        for (char c : S.toCharArray()) {
            if (isLetter(c)) {
                char temp = cArray[j];

                while (!isLetter(temp)) {
                        j--;
                        temp = cArray[j];
                    }
                    cArray[j] = cArray[i];
                    cArray[i]=temp;

                    j--;

            }
            i++;
            if(i>=j)
                break;
        }
        StringBuilder sb = new StringBuilder();
        for(char c : cArray)
            sb.append(c);

        return sb.toString();

    }
    private boolean isLetter( char c){
        if((c > 96 && c < 123) || (c > 64 && c < 91))
            return true;
        return false;
    }

    public String reverseOnlyLetters(String S) {

        StringBuilder sb = new StringBuilder(S.replaceAll("[^A-Za-z]",""));
        StringBuilder sb1 = new StringBuilder();
        for(char c : S.toCharArray()){
            if((c>96 && c <123) || (c>64 && c<91)){
                sb1.append(sb.charAt(sb.length()-1));
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb1.append(c);
            }
        }
        return sb1.toString();
    }
    public static void main(String[] args){
        ReverseOnlyLetters rl= new ReverseOnlyLetters();
        System.out.println(rl.reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(rl.reverseOnlyLetters1("a-bC-dEf-ghIj"));


        System.out.println(rl.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
        System.out.println(rl.reverseOnlyLetters1("Test1ng-Leet=code-Q!"));
    }

}
