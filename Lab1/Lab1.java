import java.util.Scanner;

class Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your gender (m/f): ");
        char gender = sc.next().charAt(0);

        System.out.print("Enter your state: ");
        String state = sc.next();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if (gender == 'm') {
            System.out.println("Gender: MALE");
        } else if (gender == 'f') {
            System.out.println("Gender: FEMALE");
        }

        switch (state) {
            case "Tamil Nadu":
            case "Kerala":
            case "Karnataka":
            case "Andra Pradesh":
                System.out.println("The Student is from the southern states of India");
                break;
            default:
                System.out.println("The Student is from other states of India");
        }
    }
}

  

