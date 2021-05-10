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
            System.out.println("First name is  " +firstName);
        else
            System.out.println("First name is invalid Enter the valid first name ");
    }

    //UC2: "Adding : Check user last name is valid or not "
    public static void checklastName()
    {
        String lastName;
        System.out.println();
        System.out.println("Enter Last Name of user ");
        lastName = inputUserValue();
        boolean check_LastName = Pattern.matches("[A-Z]+[a-z]{3,}",lastName);
        if(check_LastName == true)
            System.out.println("Last name is : " +lastName);
        else
            System.out.println("Last name is invalid Enter the valid first name ");
    }



    public static void main(String[] args)
    {
        checkfirstName();
        checklastName();
    }
}