import java.sql.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {
		Order order = new Order(250, new Date(0), OrderStatus.SHIPPED);
		System.out.println(order);	
		
		OrderStatus order2 = OrderStatus.PROCESSING;
		OrderStatus order3 = OrderStatus.valueOf("PENDING_PAYMENT");
		
		System.out.println(order2);	
		System.out.println(order3);
	}

}
