package baith4;

public class HangHoa {
		private String tenHH;
		private double donGia;
		private double giamGia;
		/**
		 * 
		 */
		public HangHoa() {
			super();
		}
		/**
		 * @param tenHH
		 * @param donGia
		 * @param giamGia
		 */
		public HangHoa(String tenHH, double donGia, double giamGia) {
			super();
			this.tenHH = tenHH;
			this.donGia = donGia;
			this.giamGia = giamGia;
		}
		/**
		 * @param tenHH
		 * @param donGia
		 */
		public HangHoa(String tenHH, double donGia) {
			super();
			this.tenHH = tenHH;
			this.donGia = donGia;
			this.giamGia = 0;
		}
		public String getTenHH() {
			return tenHH;
		}
		public void setTenHH(String tenHH) {
			this.tenHH = tenHH;
		}
		
		
		public double getDonGia() {
			return donGia;
		}
		public void setDonGia(double donGia) {
			this.donGia = donGia;
		}
		
		
		public double getGiamGia() {
			return giamGia;
		}
		public void setGiamGia(double giamGia) {
			this.giamGia = giamGia;
		}
		
		
		//Xây dựng các hàm tạo
		// Khởi tạo các giá trị ban đầu
		// Được gọi khi ta khai báo một đối tượng của lớp này
		//public HangHoa() {
//		}
//		public HangHoa(String tenHH,double donGia,double giamGia) {
//			this.tenHH = tenHH;
//			this.donGia = donGia;
//			this.giamGia = giamGia;
//		}
//		public HangHoa(String tenHH,double donGia) {
//			this.tenHH = tenHH;
//			this.donGia = donGia;
//			this.giamGia = 0;
//		}
		// Xây dựng các setter ( các phương thức gán dữ liệu cho thuộc tính)
//		void setTenHH(String tenHH) {
//			this.tenHH = tenHH;
//		}
//		void setdonGia(double donGia) {
//			this.donGia = donGia;
//		}
//		void setgiamGia(double giamGia) {
//			this.giamGia = giamGia;
//		}
		
		// Xây dựng các getter
//		String getTenHH(){
//			return this.tenHH;
//		}
//		double getdonGia() {
//			return this.donGia;
//		}
//		double getgiamGia() {
//			return this.giamGia;
//		}

}
