package melia.ordertracking.ordertrackingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "melia.ordertracking.ordertracking.controller")
public class OrderTrackingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderTrackingServiceApplication.class, args);
	}

}
