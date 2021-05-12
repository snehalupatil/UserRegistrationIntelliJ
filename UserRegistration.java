import java.util.regex.*;
import java.util.*;
import java.lang.*;

public class UserRegistration
{
    public static void checkMultipleEmails(){
        ArrayList<String> email=new ArrayList<String>();
        email.add("abc@yahoo.com");
        email.add("abc-100@yahoo.com");
        email.add("abc.100@yahoo.com");
        email.add("abc111@yahoo.com");
        email.add("abc.100@abc.com.au");
        email.add("abc+100@gmail.com");
        email.add("abc@gmail.com.com");
        email.add("abc@1.com");
        email.add("abc123@.com");
        email.add(".abc@abc.com");
        email.add("abc123@gmail.a");
        email.add("abc()*@yahoo.in");
        email.add("abc-");
        email.add("abc@gmail.com.au.bu");
        email.add("abc@yahoo.in.1a");
        email.add("abc@*%.com");
        email.add("abc@abc@gmail.com");
        email.add("abc..20002@gmail.com");
        Iterator it = email.iterator();
        while(it.hasNext()){
            String e = (String)it.next();
            boolean check_Emailid = Pattern.matches("^[a-zA-Z]{3}[a-zA-Z0-9\\-\\_\\+]*(\\.)?[a-zA-Z0-9]*(?<!\\.|\\+|\\_|\\-)\\@(?!\\.)[a-z0-9]*(\\.[a-z]{2,3})(\\.[a-z]{2,3})?$",e);
            if(check_Emailid == true)
                System.out.println("User Email ID is : " +e);
            else
                System.out.println("Email id is invalid Enter the valid Email ID ");
        }


    }


    public static void main(String[] args)
    {
        checkMultipleEmails();
    }
}