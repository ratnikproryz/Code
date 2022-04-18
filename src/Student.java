import java.util.ArrayList;
import java.util.Scanner;

public class Student extends  Person{
    private String ID;
    private Budget budget;
    Scanner scanner = new Scanner(System.in);

    public Student(){
        budget = new Budget();
    };
    public Student(String ID){
        this.ID = ID;
    }

    public void input(){
        System.out.println("Nhap ID: ");
        ID = scanner.nextLine();
        super.input(); //nhap thong tin person
        System.out.println("Nhap thong tin thu chi");
        budget.input();
    }

    @Override
    public String toString() {
       String output= "ID: "+ ID+", ";
       output+= super.toString(); // toString() in person
        return output;
    }
    public void output(){
        System.out.println(toString());
        budget.output(); // in thong tin thu nhap/ chi tieu cua sinh vien
    }

    public String getID() {
        return ID;
    }

    public Budget getBudget() {
        return budget;
    }
}
