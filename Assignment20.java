package assignment20;
import java.util.Random;
import java.util.Scanner;
public class Assignment20 {
    public static void main(String[] args) {
        Random obj = new Random();
        Scanner keyboard = new Scanner(System.in);
        int elemCount, i, randomNo, searchNumber, location = -1;
        System.out.print("How many Elements? ");
        elemCount = keyboard.nextInt();
        int[] array = new int[elemCount];
        System.out.println("Random numbers are:");
        for (i = 0; i < elemCount; i++) {
            randomNo = obj.nextInt(999);
            array[i] = randomNo;
            System.out.println((i + 1) + ": " + (randomNo));
        }
        System.out.println("Which number to Search? ");
        searchNumber = keyboard.nextInt();
        for (i = 0; i < elemCount; i++) {
            if (searchNumber == array[i]) {
                location = i + 1;
            }
        }
        if (location == -1) {
            System.out.println("Element not Found");
        } else {
            System.out.println("Element found at index: " + location);
        }
        System.out.println("End of this assignment");
    }

}
