package ManageTimeForCompany;

import java.util.Scanner;

public class Validation {
    final static String ID_PATTERN = "^[H][E]\\d{6}";
    final static String PHONENUMBER_PATTERN = "";
    final static String EMAIL_PATTERN = "";
    static Scanner scanner = new Scanner(System.in);
    // function check integer value
    public static int checkInt(String message, int min, int max){
        System.out.println(message);
        while (true){
            String input = scanner.nextLine();
            if(input.isEmpty()){
                System.out.println("Enter not empty value!");
                System.out.println("Please enter value again:");
                continue;
            }
            try{
                int value = Integer.parseInt(input);
                if(value <= min || value >= max){
                    throw new NumberFormatException();
                }
                return value;
            }catch(NumberFormatException e){
                System.out.println("Please enter value from " + min + " to " + max);
            }
        }
    }

    // function to check double value
    public static double checkDouble(String message, double min, double max){
        System.out.println(message);
        while(true){
            String input = scanner.nextLine();
            if(input.isEmpty()){
                System.out.println("Enter not empty value!");
                System.out.println("Please enter value again:");
                continue;
            }
            try{
                double value = Double.parseDouble(input);
                if(value <= min || value >= max){
                    throw new NumberFormatException();
                }
                return value;
            }catch (NumberFormatException e){
                System.out.println("Please enter value from " + min + " to " + max);
            }
        }
    }

    // function to check empty value
    public static String checkEmpty(String message){
        System.out.println(message);
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Enter not empty value!");
                System.out.println("Please enter value again:");
                continue;
            } else {
                return input;
            }
        }
    }
    // function to check regex id
    public static String checkId(String message){
        System.out.println(message);
        return null;
    }

    // function to check regex numberPhone
    public static String checkNumberPhone(String message){
        System.out.println(message);
        return null;
    }
    // function to check regex email
    public static String checkEmail(String massage){
        System.out.println(massage);
        return null;
    }
}
