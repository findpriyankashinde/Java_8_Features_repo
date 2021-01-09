package Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Car> list = new ArrayList<Car>();
		  list.add(new Car("Volvo","100",4,1000));
		  list.add(new Car("Ford","200",5,5000));
		  list.add(new Car("Maruti","300",2,4000));
		  
		  Comparator<Car> c1 = new Comparator<Car>()
		  {
		  public int compare(Car car1,Car car2)
		  {
			  return car1.brand.compareTo(car2.brand);
		  }
		  };
		  
		  Comparator<Car> c2 = (car1,car2)->car1.number.compareTo(car2.number);
		  
		  System.out.println("Before Sorting" + list);
		  Collections.sort(list,c1);
		//  Collections.sort(list,Collections.reverseOrder());
		//  Collections.reverseOrder(list,c1);
		  System.out.println("After Sorting" +list);
		  
		  System.out.println("Before Sorting" +list);
		  Collections.sort(list,c2);
		  System.out.println("After Sorting" +list);
		  
		  Comparator<Car> c3 = (car1,car2)->car1.price-car2.price;
		  System.out.println(c3);
		  
		  System.out.println("Before Sorting" +list);
		  Collections.sort(list,c3);
		  System.out.println("After Sorting" +list);
	}

}
