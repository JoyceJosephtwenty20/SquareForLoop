import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class SquaresForLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int cunterStart = 1;
        int stopNumber = input.nextInt();
        System.out.println("Number\tSquare");
        System.out.println("------\t------");


        for (;cunterStart <= stopNumber; cunterStart = cunterStart + 1) {
            System.out.println((cunterStart + "\t \t" + cunterStart * cunterStart));
        }

    }
}
