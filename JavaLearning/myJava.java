import java.util.Scanner;
import javax.swing.JOptionPane;

public class myJava {
  static void binarySearch() {
    int[] x = {
      1,
      2,
      3,
      4,
      5,
      6,
      7,
      8,
      9,
      10,
      16,
      18,
      20,
      21
    };
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the key:");
    int key = scan.nextInt();
    int flag = 0;
    int low = 0;
    int high = x.length - 1;
    int mid = 0;
    while (low <= high) {
      mid = (low + high) / 2;
      if (key < x[mid]) {
        high = mid - 1;
      } else if (key > x[mid]) {
        low = mid + 1;
      } else if (key == x[mid]) {
        flag++;
        System.out.println("found at index:" + mid);
        break;
      }
    }
    if (flag == 0) {
      System.out.println("Not found");
    }
    scan.close();

  }

  static void math() {
    double x = 3.14;
    double y = 10;

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
    //binarySearch();
    //math();

  }

}