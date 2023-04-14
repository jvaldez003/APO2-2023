import java.util.Scanner;
public class Animal {
	double weight, height;
	double speed;
	Animal() {
	weight = 50;
	height = 4;
	speed = 2; //miles per hour
	}
	Animal(double w, double h, double s ) {
	weight = w;
	h = height;
	speed = s;
	}
	public double getTime(double miles) { //gets the number of hours to go these miles
	return miles/speed;
	}
	public double getWeight() {
	return weight;
	}
	public double getHeight() {
	return height;
	}
	public double getSpeed() {
	return speed;
	}
	
	public String getTiemeLeopardo(double miles) {
		this.speed=58;
		return "el tiempo es:" + miles/speed ;
	}
	public String getWeightLeopardo() {
		this.weight=31;
		return weight + "kg"   ;
		}
		public  String getHeightLeopardo() {
		this.height=70;
		return height + "cm";
		}
		public  String getSpeedLeopardo() {
			this.speed=58;
		return speed + "km/h";
		}
	
	public String getTiemeLeon(double miles) {
			this.speed=58;
			return "el tiempo es:" + miles/speed ;
		}
	public String getWeightLeon() {
			this.weight=180;
			return weight + "kg"   ;
			}
	public  String getHeightLeon() {
	this.height=1.2;
	return height + "m";
			}
	public  String getSpeedLeon() {
	this.speed=80;
	return speed + "km/h";
			}
	
	
	
}
