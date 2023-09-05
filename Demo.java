import java.util.Scanner;


public class Demo {
public static void main(String[] args) {
	Rectangle rt = new Rectangle();
	Scanner sc = new Scanner(System.in);
	//Nhập chiều dài lớn hơn 0
	do {
		System.out.println("Nhap chieu dai");
		rt.setCd(sc.nextInt());
		if(rt.getCd()<=0) {
			System.out.println("Nhap chieu dai >0");
		}
	} while (rt.getCd()<=0);
	//Nhập chiều rộng lớn hơn 0
	do {
		System.out.println("Nhap chieu rong");
		rt.setCr(sc.nextInt());
		if(rt.getCr()<=0) {
			System.out.println("Nhap chieu rong >0");
		}
	} while (rt.getCr()<=0);
	//Tính Diện tích và chu vi hình chữ nhật
	System.out.println("Chu vi va dien tich la "+rt.Chuvi()+" va "+rt.Dientich());
}
}
