package Day2;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Employee3config {
@Bean
	public Employee2 employee() {
	
	return (new Employee2(1,"Raj",address()));
		
	}
	
public Address2 address() {
	
	return new Address2("Kolkata","India",70078);
}

public LocalDate ld() {
	return LocalDate.now();
}
}
