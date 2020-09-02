import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scan.next();
        System.out.println("Hello " + name + ". It's nice to meet you.");
        System.out.println("What is your favorite color, " + name + "? ");
        String color = scan.next();
        System.out.println("Cool, I like " + color + " as well!");
        System.out.println("What is your favorite number? ");
        int num = Integer.parseInt(scan.next());
        System.out.println("Oh " + num + " is my favorite number too!");
        System.out.println("What is your favorite movie, " + name + "? ");
        String movie = scan.next();
        System.out.println("Wow! I love " + movie + " too!");
        System.out.println("What is your favorite sport to watch? ");
        String sport = scan.next();
        System.out.println("I like watching " + sport + " too!");
        scan.close();
    }
}
