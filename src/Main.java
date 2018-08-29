import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// import scanner to get user input

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your temperature between 92.0 and 104.0: ");

        float temperature = scanner.nextFloat();

        // System.out.println(temperature);


        while (temperature < 92.0 | temperature > 104.0) {
            System.out.println("That is an invalid entry.");
            System.out.println("Please enter your temperature between 92.0 and 104.0:");
            temperature = scanner.nextFloat();
        }
            if (temperature <= 97.5) {
                System.out.println("Your temperature is low!");
        }
            else if (temperature > 97.5 && temperature <= 99.5) {
                System.out.println("Your temperature is normal!");
        }

            else if (temperature > 99.5 && temperature <= 104.0){
                System.out.println("Your temperature is high!");
        }

    }
}
