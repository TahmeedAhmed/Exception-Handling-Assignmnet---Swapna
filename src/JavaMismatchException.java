import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaMismatchException {
    public static void main(String[] args) {
        int a = inputInt();
        System.out.println(a + " !");
    }

    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        try {
            return scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("This is not a number! Returning default value -1");
        }
        return -1;
    }
}
