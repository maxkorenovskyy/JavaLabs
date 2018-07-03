
public class Park {
	private String name;
	private String location;
	private String type;
	private double square;
	private String dateOfFoundation;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public double getSquare() {
		return square;
	}
	public void setSquare(double square) {
		this.square = square;
	}
	
	public String getDate() {
		return dateOfFoundation;
	}
	public void setDate(String dateOfFoundation) {
		this.dateOfFoundation = dateOfFoundation;
	}
	
	static double sumSquare=0;
	public Park() {
		this.name = "Стрийський парк";
		this.location="м.Львів, Франківський район";
		this.type = "Громадський парк";
		this.square = 52.1381;
		this.dateOfFoundation="1876 р";
		sumSquare+=square;
	};
	public Park(String name,String location,String type,double square) {
		this.name = name;
		this.location = location;
		this.type = type;
		this.square = square;
		this.dateOfFoundation="1855 р";
		
		sumSquare+=square;
	};
	public Park(String name,String location,String type,double square, String dateOfFoundation) {
		this.name = name;
		this.location = location;
		this.type = type;
		this.square = square;
		this.dateOfFoundation=dateOfFoundation;
		
		sumSquare+=square;
	};
	public static void PrintStaticSum() {
		System.out.println("Сумарна площа парків: " + sumSquare +" га\n");
	}
	public static void PrintSum() {
		System.out.println("Сумарна площа парків: " + sumSquare +" га\n");
	}
	public void resetValues(String name,String location,String type,double square, String dateOfFoundation) {
		this.name = name;
		this.location = location;
		this.type = type;
		this.square = square;
		this.dateOfFoundation=dateOfFoundation;
		}
	public String toString() {
		return "Назва парку: " + name  +"\n"+"Місцезнаходження: " + location +"\n"+"Тип: " + type +"\n"+"Площа: " + square+" га" +"\n"+"Дата заснування: " + dateOfFoundation +"\n";	
	}
	public static void main(String[] args) { 
		Park stryskyy= new Park();
		System.out.println(Stryskyy.toString());
		Park franka= new Park("Парк ім. Івана Франка","м.Львів, Галицький район","Громадський парк",10.5140);
		System.out.println(Franka.toString());
		Park zamok= new Park("Парк Високий замок","м.Львів, Личаківський район","Громадський парк",36.2,"1835 р");
		System.out.println(Zamok.toString());
		Park.PrintStaticSum();
		Park.PrintSum();
	}

}
