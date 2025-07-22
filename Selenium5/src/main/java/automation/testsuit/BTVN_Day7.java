package automation.testsuit;

import java.util.Scanner;

import org.testng.annotations.Test;

public class BTVN_Day7 {
	@Test
	public void Nhanvien() {
		String[] danhSachTenNhanVien = nhapMangNhanVien();
		System.out.println("\nCác tên nhân viên đã nhập:");
		for (String ten : danhSachTenNhanVien) {
			System.out.println(ten);
		}
	}
	public static String[] nhapMangNhanVien() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Nhập độ dài mảng nhân viên: ");
		int n = sc.nextInt(); // Đọc độ dài mảng
		// Tạo một mảng String để lưu trữ các chuỗi
		String[] mangNhanVien = new String[n];
		// Đọc bỏ ký tự xuống dòng còn sót lại sau nextInt()
		sc.nextLine();
		System.out.println("Nhập các giá trị của mảng (chuỗi): ");
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập giá trị thứ " + (i + 1) + ": ");
			mangNhanVien[i] = sc.nextLine(); // Đọc toàn bộ dòng dưới dạng chuỗi
		}
		// Trả về toàn bộ mảng chuỗi
		return mangNhanVien;
	}

}
