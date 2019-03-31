package JDBC_Assignment;

import java.sql.SQLException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public Wassgn2 empl() {
		return new Wassgn2();
	}
	
	@Bean
	
	public Wassgn2dao empdb() throws ClassNotFoundException, SQLException {
		return new Wassgn2dao();
	}
	
	@Bean
public Wassgn2Op opr() {
	return new Wassgn2Op();
}
}
