import java.util.ArrayList;
import java.util.Scanner;

public class Management {
    ArrayList<Student> studentsList;
    Scanner scanner = new Scanner(System.in);
    public Management(){
        studentsList= new ArrayList<>();
    }
    public void menu(){
        System.out.println("Quan ly thu chi sinh vien");
        System.out.println("1. Nhap thong tin thu chi sinh vien");
        System.out.println("2. In thong tin thu chi sinh vien");
        System.out.println("3. Thong ke thu chi cua sinh vien");
        System.out.println("4. Xem lai MENU");
        System.out.println("0. Thoat chuong trinh");
    }
    public void input(){
        System.out.println("Nhap so luong sinh vien");
        int numStudents= Integer.parseInt(scanner.nextLine());
        for (int i=0; i<numStudents; i++){
            Student student = new Student();
            student.input(); //nhap thong tin chi tieu cho sinh vien
            studentsList.add(student); //them sinh vien vao danh sach
        }
    }
    public void output(){
        int numStudents = studentsList.size();
        for(int i=0; i< numStudents; i++){
            System.out.println("Thong tin thu nhap sinh vien thu "+(i+1)+":");
            studentsList.get(i).output();
            System.out.println("-------------------------------------\n");
        }
    }

    public void xemThongKe(){
//        xem ket qua thu nhap - chi tieu
        int check=0;
        Student student= new Student();
        System.out.println("Nhap ID sinh vien: ");
        String id= scanner.nextLine();
        int numStudents = studentsList.size();
        for(int i=0; i< numStudents; i++){
            student = studentsList.get(i);
            if(student.getID().equals(id)){
                check=1;
                break;
            }
        }
        if(check==0){
            System.out.println("Khong tim thay sinh vien");
        }else {
            student.output();
            System.out.println("Thu Nhap - Chi tieu = "+ student.getBudget().ThongKe());
        }
    }
}
