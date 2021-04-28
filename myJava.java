import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class myJava {
  static void ifstatement() {
    int age = 12;

    if (age>=18){
      System.out.println("You are an adult.");

    } 
    else {
      System.out.println("You're not an adult. ");

    }
  } 

  static void randomint() {
    Random random = new Random();
    // Generate a random integer
    int x = random.nextInt(6) + 1;
    // Generate a random double
    double y = random.nextDouble();
    // Generate a random boolean
    boolean z = random.nextBoolean();

    y += 2; // Change the value here to change the whole number val:)
    x += 1;
    // Printing everything
    System.out.println(z);
    System.out.println(x);
    System.out.println(y);
  }

  static void geometry() {
    double y;
    double x;
    double z;

    Scanner scanner2 = new Scanner(System.in);

    System.out.println("Enter X Value:");
    x = scanner2.nextDouble();

    System.out.println("Enter Y Value:");
    y = scanner2.nextDouble();

    z = Math.sqrt((x * x) + (y * y));
    System.out.println("The Hypotenous (or whatever it is), is" + " " + " " + z);

    scanner2.close();
  }

  static void math() {
    double x = 3.14;
    double y = -10;

    double val = Math.max(x, y);
    System.out.println(val);

  }
  static void gui() {
    String name = JOptionPane.showInputDialog("Enter your name");
    JOptionPane.showMessageDialog(null, "Hello" + " " + name);

    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
    JOptionPane.showMessageDialog(null, "Nice, your age is" + " " + age);

    double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
    JOptionPane.showMessageDialog(null, "Your height is" + " " + height);
  }

  static void input() {
    //making the scanner
    Scanner scanner = new Scanner(System.in);

    System.out.println("What's your favourite food?");
    String food = scanner.nextLine();
    System.out.println("What's your name?");
    String name = scanner.nextLine();
    System.out.println("How old are you?");
    int age = scanner.nextInt();

    System.out.println("You're" + " " + age + " " + "years old? Cool");
    System.out.println("Hello" + " " + name + "" + "!");
    System.out.println("Nice, I also like" + " " + food);

    System.out.println("Closing Scanner...");
    scanner.close();
    System.out.println("Scanner Closed.");

  }
  static void expressions() {
    /*
      expression = operands & operators
      operands = values, variables, numbers, quantity
      operators = + - * ÷ %
    */
    int aNumber = 112;
    int friends = 10312;
    double myVar = 3.2145;
    friends++;
    // or 
    friends = friends % 31;
    aNumber = aNumber % 6;
    myVar = (double) myVar / 4;
    System.out.println(friends);
    System.out.println(aNumber);
    System.out.println(myVar);
    //Java double is used to represent floating-point numbers.
    // It uses 64 bits to store a variable value and has a range greater than float type.

  }
  public static void main(String[] args) {
    //expressions();
    //input();
    //gui();
    //math();
    //geometry();
    //randomint();
    ifstatement();
  }

}