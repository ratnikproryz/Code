import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    Scanner scanner = new Scanner(System.in);
    public Person(){

    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void input(){
        System.out.println("Nhap ten: ");
        name = scanner.nextLine();
        System.out.println("Tuoi: ");
        age = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public String toString() {
        return  "Ten='" + name + "\', Tuoi=" + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
