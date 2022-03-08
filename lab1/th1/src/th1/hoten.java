package th1;

import java.util.Scanner;

public class hoten {
	public static void main (String [] args ) {
		// Nhập từ bàn phím
		Scanner sc= new Scanner (System.in );
		// Nhập họ tên
		System.out.print(" Họ tên: ");
		String hoten = sc.nextLine();
		//Nhập điểm
		System.out.print("Điểm");
		Double diem = sc.nextDouble();
		System.out.print("=====================");
		System.out.printf("%s: %.1f điểm", hoten, diem);
	}

}
