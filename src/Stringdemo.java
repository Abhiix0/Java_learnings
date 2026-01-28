import java.sql.SQLOutput;

public class Stringdemo {
    public static void main(String[] args){
        String name = "one piece";
        int length = name.length();
        System.out.println(length);
        char letter = name.charAt(0);
        System.out.println(letter);
        int index = name.indexOf(" ");
        System.out.println(index);
        int lastIndex = name.lastIndexOf("e");
        System.out.println(lastIndex);

        String upper = name.toUpperCase();
        System.out.println(upper);
        String lower = name.toLowerCase();
        System.out.println(lower);

        String trim = name.trim();
        System.out.println(trim);
        String replace = name.replace("o", "O");
        System.out.println(replace);
        //we have .isEmpty() to check whether the string is empty or not. it will output a boolean value
        //we can use .contains() to check in the string
        // we have .equals() to check if two strings are same
        //well this .equals() aren't case sensitive so we can use .equalsIgnoreCase() to avoid case sensitive

        //.substring()= A method used to extract a portion of a string
        //syntax = .substring(start, end)

        String email = "ASG1234@gmail.com";
        String username = email.substring(0,6);
        System.out.println(username);
        String domain = email.substring(8);
        //String domain = email.substring(email.indexOf("@"));
        System.out.println("Domain:" + domain);

    }
}