import java.util.regex.*;
import java.util.*;
import java.lang.*;

public class UserRegistration
{
    private static String user;

    public static String inputUserValue()
    {
        Scanner input = new Scanner(System.in);
        user = input.nextLine();
        return user ;
    }


    //UC1: "Adding : Check user first name is valid or not "
    public static void checkfirstName()
    {
        String firstName;
        System.out.println("Enter first Name of user: ");
        firstName = inputUserValue();
        boolean check_FirstName = Pattern.matches("[A-Z]+[a-z]{3,}",firstName);
        if(check_FirstName == true)
            System.out.println("First name is : " +firstName);
        else
            System.out.println("First name is invalid Enter the valid first name ");
    }

    //UC2: "Adding : Check user last name is valid or not "
    public static void checklastName()
    {
        String lastName;
        System.out.println();
        System.out.println("Enter Last Name of user: ");
        lastName = inputUserValue();
        boolean check_LastName = Pattern.matches("[A-Z]+[a-z]{3,}",lastName);
        if(check_LastName == true)
            System.out.println("Last name is : " +lastName);
        else
            System.out.println("Last name is invalid Enter the valid last Name ");
    }

    //UC3 "Added: Check User Email ID is valid or not "
    public static void checkEmailId()
    {
        String emailid;
        System.out.println();
        System.out.println("Enter User Email Id : ");
        emailid = inputUserValue();
        boolean check_Emailid = Pattern.matches("[a-zA-z]{1,}[.]?[a-zA-z]{1,}?[@]+[a-zA-z]{1,}[.]+[a-z]{1,}[.]?[a-z]{1,}?",emailid);
        if(check_Emailid == true)
            System.out.println("User Email ID is : " +emailid);
        else
            System.out.println("Email id is invalid Enter the valid Email ID ");

    }

    //UC4 "Added: Check User Mobile No. is valid or not "
    public static void checkMobileNo()
    {
        String mobileNO;
        System.out.println();
        System.out.println("Enter User Mobile number : ");
        mobileNO = inputUserValue();
        boolean check_MobileNo = Pattern.matches("[0-9]{2}[\\s][789]{1}[0-9]{9}",mobileNO);
        if(check_MobileNo == true)
            System.out.println("User mobile NO is : " +mobileNO);
        else
            System.out.println("Mobile No is invalid Enter the valid Mobile no. ");

    }

    //"Added: Check password Rule 3 - Should have atleast 1 Numeric Number "
    public static void checkPassword()
    {
        String password;
        System.out.println();
        System.out.println("Enter User password : ");
        password = inputUserValue();
        boolean check_password = Pattern.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$",password);
        if(check_password == true)
            System.out.println("User password is : " +password);
        else
            System.out.println("password is invalid Enter the valid password ");

    }

    public static void checkMultipleEmails() {
        ArrayList<String> email = new ArrayList<String>();
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
        while (it.hasNext()) {
            String e = (String) it.next();
            boolean check_Emailid = Pattern.matches("^[a-zA-Z]{3}[a-zA-Z0-9\\-\\_\\+]*(\\.)?[a-zA-Z0-9]*(?<!\\.|\\+|\\_|\\-)\\@(?!\\.)[a-z0-9]*(\\.[a-z]{2,3})(\\.[a-z]{2,3})?$", e);
            if (check_Emailid == true)
                System.out.println("User Email ID is : " + e);
            else
                System.out.println("Email id is invalid. Enter the valid Email ID ");
        }
    }







        public static void main(String[] args)
    {
        //checkfirstName();
        //checklastName();
        //checkEmailId();
        //checkMobileNo();
        //checkPassword();
        checkMultipleEmails();
    }
}