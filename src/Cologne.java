import java.sql.SQLOutput;
import java.util.Scanner;

public class Cologne {
    public String name;
    public double price;

    Cologne() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter name: ");
        this.name = scnr.next();
        System.out.println("Enter price: ");
        this.price = scnr.nextDouble();
    }

}
