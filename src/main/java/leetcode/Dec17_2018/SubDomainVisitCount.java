package main.java.leetcode.Dec17_2018;

import main.java.leetcode.Dec16_2018.SelfDividingNumbers;

import java.util.*;

/*
A website domain like "discuss.leetcode.com" consists of various subdomains. At the top level, we have "com", at the next level, we have "leetcode.com", and at the lowest level, "discuss.leetcode.com". When we visit a domain like "discuss.leetcode.com", we will also visit the parent domains "leetcode.com" and "com" implicitly.

Now, call a "count-paired domain" to be a count (representing the number of visits this domain received), followed by a space, followed by the address. An example of a count-paired domain might be "9001 discuss.leetcode.com".

We are given a list cpdomains of count-paired domains. We would like a list of count-paired domains, (in the same format as the input, and in any order), that explicitly counts the number of visits to each subdomain.

Example 1:
Input:
["9001 discuss.leetcode.com"]
Output:
["9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"]
Explanation:
We only have one website domain: "discuss.leetcode.com". As discussed above, the subdomain "leetcode.com" and "com" will also be visited. So they will all be visited 9001 times.

Example 2:
Input:
["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]
Output:
["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"]
Explanation:
We will visit "google.mail.com" 900 times, "yahoo.com" 50 times, "intel.mail.com" once and "wiki.org" 5 times. For the subdomains, we will visit "mail.com" 900 + 1 = 901 times, "com" 900 + 50 + 1 = 951 times, and "org" 5 times.

Notes:

The length of cpdomains will not exceed 100.
The length of each domain name will not exceed 100.
Each address will have either 1 or 2 "." characters.
The input count in any count-paired domain will not exceed 10000.
The answer output can be returned in any order
 */
public class SubDomainVisitCount {

    public List<String> subdomainVisits(String[] cpdomains) {
        List res = new ArrayList();
        Map map = new HashMap<String, Integer>();

        for(String s: cpdomains){
            String[] domains = new String[3];
            String[] ss = s.split(" ");
            if(ss.length>1) {
                int count = Integer.parseInt(ss[0]);
                String temp = ss[1];
                int i =0 ;
                while(temp.lastIndexOf(".")>0){
                    domains[i]=ss[1].substring(temp.lastIndexOf(".")+1);
                    temp = temp.substring(0,temp.lastIndexOf("."));
                    i++;

                }
                domains[i] = ss[1];
                for( int j =0; j < domains.length; j++){
                    if(domains[j]!=null){
                        if (map.containsKey(domains[j])){
                            int count1 = (int) map.get(domains[j]);
                            map.put(domains[j], count1 + count);
                        }
                        else{
                            map.put(domains[j],  count);
                        }
                    }
                }


            }

        }

        Set<Map.Entry> set = map.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()){

            Map.Entry entry = (Map.Entry)itr.next();
            res.add(entry.getValue() + " " + entry.getKey());

        }
        return res;

    }

    public static void main(String[] args){

        SubDomainVisitCount sdvc = new SubDomainVisitCount();
        String [] a = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List l = sdvc.subdomainVisits(a);

        for( int i = 0; i <l.size(); i++){
            System.out.print(l.get(i) + " ");
        }
    }


}
