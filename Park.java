
public class Park {
	String name;
	String location;
	String type;
	double square;
	static double sum_square=0;
	public Park() {
	};
	public Park(String a,String b,String c,double d) {
		name = a;
		location = b;
		type = c;
		square = d;
	};
	public Park(String a,String b,String c,double d, double e) {
		name = a;
		location = b;
		type = c;
		square = d;
		sum_square=e;
	};
	public static void PrintStaticSum() {
		System.out.println("Сумарна площа парків: " + sum_square +" га\n");
	}
	public static void PrintSum() {
		System.out.println("Сумарна площа парків: " + sum_square +" га\n");
	}
	public void ResetValues(String a,String b,String c,double d, double e) {
		name = a;
		location = b;
		type = c;
		square = d;
		sum_square=e;
	};
	public void tostring() {
		System.out.println("Назва парку: " + name);
		System.out.println("Місцезнаходження: " + location);
		System.out.println("Тип: " + type);
		System.out.println("Площа: " + square+" га\n");
		
	}
	public static void main(String[] args) { 
		Park Stryskyy= new Park();
		Stryskyy.name = "Стрийський парк";
		Stryskyy.location="м.Львів, Франківський район";
		Stryskyy.type = "Громадський парк";
		Stryskyy.square = 52.1381 ;
		Stryskyy.tostring();
		Park Franka= new Park("Парк ім. Івана Франка","м.Львів, Галицький район","Громадський парк",10.5140);
		Franka.tostring();
		Park Zamok= new Park("Парк Високий замок","м.Львів, Личаківський район","Громадський парк",36.2, 98.8521);
		Zamok.tostring();
		Park.PrintStaticSum();
		Park.PrintSum();
	}

}
