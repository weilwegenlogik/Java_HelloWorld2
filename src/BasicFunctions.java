import java.util.Objects;
import java.util.Scanner;
import static java.lang.Thread.*;

class BasicFunctions {
    public static String Selection;
    public static String CustomText;

    public static void main(String[] args) throws InterruptedException {
        WelcomeMessage();
        GetInput();
        CheckInput();
        PrintText();
    }

    public static void WelcomeMessage() {
        // ADD NEW OPTIONS HERE
        String WelcomeMessage;
        String Option1;
        String Option0;
        Option1 = "(1) Print your own text input.";
        Option0 = "(0) Exit the program.";
        WelcomeMessage = "Welcome to this program for basic functions. Please enter the number corresponding to the function you want to execute.\n" + Option1 + "\n" + Option0;

        System.out.println(WelcomeMessage);
    }

    public static void PrintText() {
        if (Objects.equals(CustomText, "")) {
            CustomText = "ERROR #B01: No text input received";
        }

        System.out.println(CustomText);
    }

    public static void GetInput() {
        Scanner scanner_FunctionSelection = new Scanner(System.in);
        Selection = scanner_FunctionSelection.nextLine();

    }

    public static void CheckInput() throws InterruptedException {
        // ADD NEW OPTIONS HERE
        if (Selection != "1" || Selection != "0") {
            System.out.println("ERROR #C01: Invalid input");
            WelcomeMessage();
            GetInput();
        } else if (Objects.equals(Selection, "1")) {
            System.out.println("Starting program (1)...");
            GetInput();
            CustomText = Selection;
            PrintText();
            sleep(5000);
            WelcomeMessage();
        } else if (Objects.equals(Selection, "0")) {
            System.exit(0);
        }

    }
}
