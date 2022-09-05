import com.pjp13579.parking.parking.Entities.Park;

import org.springframework.data.geo.Point;

public class Main {
	
	public static void main(String[] args) {
		Park park = new Park((long) 12, "car park", "Cityland","Old  grumpy woman", new Point(12, 1000), null);
	
		System.out.println(park.toString());
		
	}
}

