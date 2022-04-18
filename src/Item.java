import java.util.Scanner;

public class Item {
    private String title;
    private double cost;
    Scanner scanner = new Scanner(System.in);
    public Item(){};
    public Item(String title, double cost){
        this.title = title;
        this.cost = cost;
    }
    public void input(){
        System.out.println("Nhap ghi chu: ");
        title = scanner.nextLine();
        System.out.println("Nhap so tien: ");
        cost= Double.parseDouble(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "Ghi chu='" + title + "\', So tien=" + cost;
    }

    public  void output(){
        System.out.println(toString());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
