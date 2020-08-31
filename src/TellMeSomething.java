import java.util.Scanner;

public class TellMeSomething {
    public static void main(String[] args) {

        System.out.println("What is your first name?");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        System.out.println("Thank You! What is your last name?");
        String lastName = scanner.nextLine();
        System.out.println("Alrighty. And how old are you?");
        int age = scanner.nextInt();
        System.out.println("Excellent. And tell me, are you married? (type 'true' if you are, 'false' if you are not.)");
        boolean married = scanner.nextBoolean();
        System.out.println("Good. Last but not least: How tall are you (in meter of course. Nobody uses inch)?");
        double height = scanner.nextDouble();

        System.out.printf("You told me, that your Name is %s %s, you are %d years old, you are ", firstName, lastName, age);

        if (!married) {
            System.out.print("not ");
        }
        System.out.printf("married and you are %.2fm tall.", height); //ist %s für alle Platzhalter zu verwenden, oder gibe es für Zahlen zum Beispiel einen anderen Platzhalter? (z.B.: %n für number oder so?)
    }
}
