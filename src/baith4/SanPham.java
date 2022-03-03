package baith4;

import java.util.Scanner;

public class SanPham {
	private String tenSP;
	private double donGia;
	private double giamGia;
	// Hàm tạo 3 tham số
	public SanPham(String _tenSP, double _donGia, double _giamGia)
	{
		tenSP = _tenSP;
		donGia = _donGia;
		giamGia = _giamGia;
	}
	// Hàm tạo tham số
	public SanPham(String _tenSP, double _donGia)
	{
		tenSP = _tenSP;
		donGia = _donGia;
		giamGia = 0;
	}
	
	// 10% giá sản phẩm
	public double getThueNhapKhau () {
		return donGia*0.1;
	}
	// Nhập dữ liệu thuộc tính
	public void nhap() {
		Scanner bp = new Scanner(System.in);
		System.out.print(" Nhập tên sản phẩm: ");
		tenSP = bp.nextLine();
		System.out.print(" Nhập đơn giá sản phẩm: ");
		donGia= bp.nextDouble();
		System.out.print(" Nhập giảm giá sản phẩm: ");
		giamGia= bp.nextDouble();
	}
	//
	public void xuat() {
		System.out.print(" Tên sản phẩm: " + tenSP);
		System.out.print(" Giá sản phẩm: " + String.valueOf(donGia));
		System.out.print(" Giảm giá: " + String.valueOf(giamGia));
		System.out.print(" Thuế nhập khẩu: " + String.valueOf(getThueNhapKhau()));
	}
}
