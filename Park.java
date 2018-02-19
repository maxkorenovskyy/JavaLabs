
public class Park {
	private String name;
	private String location;
	private String type;
	private double square;
	private String date_of_foundation;
	
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
		return date_of_foundation;
	}
	public void setDate(String date_of_foundation) {
		this.date_of_foundation = date_of_foundation;
	}
	
	static double sum_square=0;
	public Park() {
		this.name = "Стрийський парк";
		this.location="м.Львів, Франківський район";
		this.type = "Громадський парк";
		this.square = 52.1381;
		this.date_of_foundation="1876 р";
		sum_square+=square;
	};
	public Park(String name,String location,String type,double square) {
		this.name = name;
		this.location = location;
		this.type = type;
		this.square = square;
		this.date_of_foundation="1855 р";
		
		sum_square+=square;
	};
	public Park(String name,String location,String type,double square, String date_of_foundation) {
		this.name = name;
		this.location = location;
		this.type = type;
		this.square = square;
		this.date_of_foundation=date_of_foundation;
		
		sum_square+=square;
	};
	public static void PrintStaticSum() {
		System.out.println("Сумарна площа парків: " + sum_square +" га\n");
	}
	public static void PrintSum() {
		System.out.println("Сумарна площа парків: " + sum_square +" га\n");
	}
	public void resetValues(String name,String location,String type,double square, String date_of_foundation) {
		this.name = name;
		this.location = location;
		this.type = type;
		this.square = square;
		this.date_of_foundation=date_of_foundation;
		}
	public String toString() {
		return "Назва парку: " + name  +"\n"+"Місцезнаходження: " + location +"\n"+"Тип: " + type +"\n"+"Площа: " + square+" га" +"\n"+"Дата заснування: " + date_of_foundation +"\n";	
	}
	public static void main(String[] args) { 
		Park Stryskyy= new Park();
		System.out.println(Stryskyy.toString());
		Park Franka= new Park("Парк ім. Івана Франка","м.Львів, Галицький район","Громадський парк",10.5140);
		System.out.println(Franka.toString());
		Park Zamok= new Park("Парк Високий замок","м.Львів, Личаківський район","Громадський парк",36.2,"1835 р");
		System.out.println(Zamok.toString());
		Park.PrintStaticSum();
		Park.PrintSum();
	}

}
