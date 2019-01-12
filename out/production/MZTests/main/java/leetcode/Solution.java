class Solution {
    public static void main (String[] args){
        String[] emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"];

        Solution s = new Solution();
       System.out.println(s.numUniqueEmails(emails)) ;
    }

    public int numUniqueEmails(String[] emails) {
        String[] emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"];
        StringBuilder sb = new StringBuilder();
        Set set = new HashSet();
        for( int i = 0; i< emails.length; i++){
            String [] sArr = emails[i].split("@");
            String s1 = sArr[0].replace(".","");
            String s2 ="";
            if(s1.contains("+")){
                for(int x = 0; x < s1.length(); x++){

                    if( s1.charAt(x) == '+'){
                        s2 = s1.substring(0,x);
                        break;

                    }

                }

            }
            if(s2.length()>0){
                sb.append(s2);
            }
            else
                sb.append(s1);
            sb.append(sArr[1]);
            set.add(sb);
            sb = new StringBuilder();


        }
        return set.size();
    }
}