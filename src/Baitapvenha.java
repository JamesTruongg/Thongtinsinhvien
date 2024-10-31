import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Baitapvenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String Name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        int Age = sc.nextInt();sc.nextLine();
        System.out.print("Nhập năm sinh (yyyy-mm-dd): ");
        String birthInput = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDate = null;
        try {
            birthDate = dateFormat.parse(birthInput);
        } catch (ParseException e) {
            System.out.println("Định dạng năm sinh không hợp lệ, vui lòng nhập lại.");

        }
        sc.nextLine();
        System.out.print("Nhập chuyên ngành: ");
        String Major = sc.nextLine();
        System.out.print("Nhập quê quán: ");
        String Hometown = sc.nextLine();
        System.out.print("Nhập giới tính (Nam/Nữ): ");
        String Gender = sc.nextLine();


        System.out.println("\nThông tin đã nhập:");
        System.out.println("Tên: " + Name);
        System.out.println("Tuổi: " + Age);
        System.out.println("Năm sinh: " + dateFormat.format(birthDate));
        System.out.println("Chuyên ngành: " + Major);
        System.out.println("Quê quán: " + Hometown);
        System.out.println("Giới tính: " + Gender);
    }
}

