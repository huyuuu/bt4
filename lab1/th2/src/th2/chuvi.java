package th2;
import java.util.Scanner;
public class chuvi {
	public static void main(String[] args) {
        //khởi tạo một object hcn thuộc class HinhChuNhat để sử dụng các thuộc tính trong class này
		hinhchunhat hcn = new hinhchunhat();
        Scanner scanner = new Scanner(System.in);
        //yêu cầu người dùng nhập vào chiều dài và chiều rộng
        System.out.println("nhập vào chiều dài : ");
        hcn.setDai(scanner.nextDouble());
        System.out.println("nhập vào chiều rộng : ");
        hcn.setRong(scanner.nextDouble());
        //gọi hàm tính chu vi và diện tích ở class HinhChuNhat bằng cách sử dụng object vừa mới được tạo là hcn
        System.out.println("chu vi hình chữ nhật là : " + hcn.tinhChuVi());
        System.out.println("diện tích hình chữ nhật là : " + hcn.tinhDienTich());
        System.out.println("cạnh nhỏ nhất là : " + hcn.canhNhoNhat());
        System.out.println("----------------------end----------------------------");
        
    }
}
