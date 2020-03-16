import java.util.Scanner;

public class InvalidEmailException extends Exception {

    public InvalidEmailException(String message) {
        super(message);
    }

}

class Test{
    public static void main(String[] args) throws InvalidEmailException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter email: ");
        try {
            String address = scanner.nextLine();
            validateAddress(address);
            System.out.println("Email address is valid !");
        }catch (InvalidEmailException e){
            System.out.println(e.getMessage());
        }
    }

    public static boolean validateAddress(String address) throws InvalidEmailException{
        if (!address.contains("@")  || !address.contains(".") ){
            throw new InvalidEmailException("Missing '@' or '.'");
        }
        return true;
    }

}
