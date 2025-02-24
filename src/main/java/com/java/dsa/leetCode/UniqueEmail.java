package com.java.dsa.leetCode;

import java.util.HashSet;

public class UniqueEmail {

    public static void main(String[] args) {
        String[] emails ={"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
    }
    public static int numUniqueEmails(String[] emails) {
        HashSet<String> uniqueEmail=new HashSet<>();
        for(String email:emails)
        {
            boolean isValidEmail=validateEmail(email);
            if(isValidEmail){
                String domain=email.substring(email.indexOf('@'));
                String localName=email.substring(0,email.indexOf('@'));
                System.out.println("Domain:"+domain);
                System.out.println("localName:"+localName);
                if(localName.indexOf('+')>0)
                {
                    localName=localName.substring(0,email.indexOf("+"));
                    System.out.println("localName:"+localName);
                }
                if(localName.indexOf('.')>0)
                {
                    localName= localName.replaceAll("\\.","");
                    System.out.println("localName:"+localName);
                }
                String email1=localName.concat(domain);
                System.out.println("email1:"+email1);
                uniqueEmail.add(email1);
            }

        }
        return uniqueEmail.size();
    }

    static boolean validateEmail(String email)
    {
        return true;
    }
}
