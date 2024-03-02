import java.util.Scanner;

public class CatatanKuliahPart3 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = sc.nextLine();

    System.out.print("Enter your age: ");
    int age = sc.nextInt();

    sc.close();

    System.out.println("Hi! my name is " + name + ". I am " + age + " years old.");
  }
}

class Bill {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your bill: ");
    int bill = sc.nextInt();

    sc.close();

    int tip = bill * 15 / 100;

    System.out.println("Your tip: " + tip);
  }
}

class Pencil {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of the students: ");
    int students = sc.nextInt();

    System.out.print("Enter the number of pencils each of the student has: ");
    int pencilsEachStudent = sc.nextInt();

    sc.close();

    int totalPencil = students * pencilsEachStudent;

    System.out.println("Number of pencils in the classroom: " + totalPencil);
  }
}

class IfStatement {

  public static void main(String[] args) {
    int age = 30;

    if (age < 18) {
      System.out.println("Anda masih muda");
    } else {
      System.out.println("Anda boleh masuk");
    }
  }
}

class Car {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the car price: ");
    int price = sc.nextInt();

    if (price <= 12000) {
      System.out.print("Enough");
    }

    sc.close();
  }
}

class SwitchCase {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the day: ");
    String day = sc.nextLine();

    sc.close();

    switch (day) {
      case "Monday":
        System.out.println(1);
        break;
      case "Tuesday":
        System.out.println(2);
        break;
      case "Wednesday":
        System.out.println(3);
        break; 
      case "Thursday":
        System.out.println(4);
        break; 
      case "Friday":
        System.out.println(5);
        break; 
      case "Saturday":
        System.out.println(6);
        break; 
      case "Sunday":
        System.out.println(7);
        break; 
      default:
        break;
    }
  }
}

class Robot {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your robot color: ");
    String robotColor = sc.nextLine();

    sc.close();

    switch (robotColor) {
      case "Red":
      case "red":
        System.out.println(1);
        break;
      case "Green":
      case "green":
        System.out.println(2);  
        break;
      case "Black":
      case "black":
        System.out.println(3);
        break; 
      default:
        break;
    }
  }
}

class Emotion {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the emotion code: ");
    int emotionCode = sc.nextInt();

    sc.close();

    switch (emotionCode) {
      case 1:
        System.out.println("You are happy");
        break;
      case 2:
        System.out.println("You are sad");
        break;
      case 3:
        System.out.println("You are angry");
        break; 
      case 4:
        System.out.println("You are suprised");
        break; 
      default:
        System.out.println("Unknown emotion");
        break;
    }
  }
}

class AgeGroup {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your age: ");
    int age = sc.nextInt();

    sc.close();

    if (age >= 0 && age <= 11) {
      System.out.println("Child");
    } else if (age >= 12 && age <= 17) {
      System.out.println("Young");
    } else if (age >= 17 && age <= 64) {
      System.out.println("Adult");
    }
  }
}

class WhileLoop {
  public static void main(String[] args) {
    int x = 3;

    while (x > 0) {
      System.out.println("Hola! " + x);

      x--; // sama seperti x = x - 1
    };
  }
}

class DoWhile {

  public static void main(String[] args) {
    int x = 6;

    do {
      System.out.println("Hey! " + x);
    } while (x < 5);
  }
}