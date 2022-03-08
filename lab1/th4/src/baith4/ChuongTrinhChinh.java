package baith4;

import java.util.Scanner;

public class ChuongTrinhChinh {

	public static void main(String[] args) {
		// Tạo cứng 2 hàng hóa
		HangHoa hh1 = new HangHoa("Bút Bi",2200);
		HangHoa hh2 = new HangHoa("Bút Mực",10000,0.1);
		
		// Nhập từ bàn phím
		// HangHoa hh1 = new HangHoa();
		// HangHoa hh2 = new HangHoa();
		
		// Nhập dữ liệu cho các thuộc tính
		// Scanner bp = new Scanner(System.in);
		// System.out.println("--------------------------------------------");
		// System.out.println("SP1: Tên: ");
		// hh1.setTenHH(bp.nextLine());
		
		// System.out.println("SP1: Giá: ");
		// hh1.setDonGia(bp.nextDouble());
		
		// System.out.println("SP1: Giảm giá: ");
		// hh1.setGiamGia(bp.nextDouble());
		
		// System.out.println("--------------------------------------------");
		// System.out.println("SP2: Tên: ");
		// hh2.setTenHH(bp.nextLine());
		
		// System.out.println("SP2: Giá: ");
		// hh2.setDonGia(bp.nextDouble());
		
		// System.out.println("SP2: Giảm giá: ");
		// hh2.setGiamGia(bp.nextDouble());
		
		// Xuất thông tin
		System.out.println("==========================================");
		System.out.println(" Tên sản phẩm 1: " + hh1.getTenHH());
		System.out.println(" Giá sản phẩm 1: " + hh1.getDonGia());
		System.out.println(" Giảm giá: " + hh1.getGiamGia());
		System.out.println(" Thuế nhập khẩu: " + hh1.getDonGia()*0.1);
		System.out.println("==========================================");
		System.out.println(" Tên sản phẩm 2: " + hh2.getTenHH());
		System.out.println(" Giá sản phẩm 2: " + hh2.getDonGia());
		System.out.println(" Giảm giá: " + hh2.getGiamGia());
		System.out.println(" Thuế nhập khẩu: " + hh2.getDonGia()*0.1);
		System.out.println("==========================================");
		
		
		// Khai báo, tạo mới 2 đối tượng
		// SanPham sp1 = new SanPham() ;
		// SanPham sp2 = new SanPham() ;
		// SanPham sp1 = new SanPham("Màn hình",2000000,0.1);
		// SanPham sp2 = new SanPham("Bàn phím", 300000);
		// Nhập dữ liệu
		// sp1.nhap();
		// sp2.nhap();
		// Xuất dữ liệu
		// sp1.xuat();
		// sp2.xuat();

	}

}
