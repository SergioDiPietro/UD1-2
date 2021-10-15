import java.util.Scanner;
import com.dipizoo.animals.*;
import com.dipizoo.management.Zoo;

public class MainApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Number of spaces in the zoo: ");
        short spaces = scan.nextShort();

        Zoo dipizoo = new Zoo(spaces);

        System.out.print("Number of animals: ");
        short animals = scan.nextShort();

        if (dipizoo.fillZooRandomly(animals)) {
            System.out.println(dipizoo.getZooInfo());
            System.out.println("*** Adding a new animal (press Enter to add...)***");
            scan.nextLine();
            scan.nextLine();

            Tiger tiger1 = new Tiger();
            if (dipizoo.addAnimals(tiger1)) System.out.println(dipizoo.getZooInfo());
            else System.out.println("Sorry, there are not available empty spaces...");
        }
        else System.out.println(">>ERROR: The number of animals cannot be more than twice the number of spaces.");
        scan.close();
    }
}
