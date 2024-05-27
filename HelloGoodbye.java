import java.util.Scanner;

public class HelloGoodbye {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter your first name: ");
        String firstname = scanner.nextLine();
        System.out.println("Enter Second  name: ");
        String lastname = scanner.nextLine();
        System.out.println("Hello " + firstname + " and " + lastname );
        System.out.println("GoodBye " + lastname+ " and  " + firstname);   
    }
}
