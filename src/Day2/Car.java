package Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Car {

  public String brand;
  public String number;
  public int door;
  public int price;
  
	public Car(String brand, String number, int door, int price) {
	super();
	this.brand = brand;
	this.number = number;
	this.door = door;
	this.price = price;
	
}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", number=" + number + ", door=" + door + ", price=" + price + "]";
	}

  

}
