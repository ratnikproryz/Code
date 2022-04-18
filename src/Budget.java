import java.util.ArrayList;
import java.util.Scanner;

public class Budget {
    private ArrayList<Item> incomeList; //danh sach cac thu nhap cua thang
    private ArrayList<Item> spendingList; //danh sach cac chi tieu cua thang
    Scanner scanner = new Scanner(System.in);

    public Budget(){
        incomeList = new ArrayList<>();
        spendingList = new ArrayList<>();
    }
    public void input(){
        int n;
        System.out.println("----------------------------------------");
        System.out.print("Nhap so luong muc thu nhap: ");
        n = Integer.parseInt(scanner.nextLine());
        itemsInput(n, incomeList);

        System.out.println("----------------------------------------");
        System.out.println("Nhap cac ghi chu chi tieu");
        System.out.print("Nhap so luong muc chi tieu: ");
        n = Integer.parseInt(scanner.nextLine());
        itemsInput(n, spendingList);

    }

    public void output(){
        int lengthIncome =  incomeList.size();
        int lengthSpending = spendingList.size();
        System.out.println("Thong tin danh sach cac muc thu nhap:");
        itemsOutput(lengthIncome, incomeList);
        System.out.println("Tong thu nhap: "+ getTotal(incomeList));
        System.out.println("----------------------------------------");
//
        System.out.println("Thong tin danh sach cac muc chi tieu:");
        itemsOutput(lengthSpending, spendingList);
        System.out.println("Thong chi tieu: "+ getTotal(spendingList));
        System.out.println("----------------------------------------");
    }

    public void itemsInput(int n, ArrayList<Item> list){
        for(int i=0; i< n; i++){
            Item item = new Item();
            item.input();
            list.add(item);
        }
    }

    public void itemsOutput(int n, ArrayList<Item> list){
        for(int i=0; i< n; i++){
            Item item= list.get(i);
            item.output();
        }
    }

    public double getTotal(ArrayList<Item> list){
        int number = list.size();
        double total = 0;
        for(int i=0; i<number; i++){
            total+= list.get(i).getCost();
        }
        return total;
    }
    public double ThongKe(){
        return  getTotal(incomeList)- getTotal(spendingList);
    }

    public ArrayList<Item> getIncomeList() {
        return incomeList;
    }

    public ArrayList<Item> getSpendingList() {
        return spendingList;
    }

}
