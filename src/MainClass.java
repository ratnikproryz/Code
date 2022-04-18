import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        Management management = new Management();
        management.menu();
        while (true){
            System.out.println("Hay lua chon chuc nang!");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 0:
                    System.out.println("Good Bye!!!");
                    System.exit(0);
                    break;
                case 1:
                    management.input();
                    break;
                case 2:
                    management.output();
                    break;
                case 3:
                    management.xemThongKe();
                    break;
                case 4:
                    management.menu();
                    break;
                default:
                    management.menu();
            }
        }

    }
}
