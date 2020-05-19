package com.jwt.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AuthApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(AuthApplication.class);

	}

	/*@Bean
	CommandLineRunner initUser(UserDao userDao, BCryptPasswordEncoder passwordEncoder){
		return args -> {
			userDao.deleteAll();

			User user_test=new User();
			user_test.setName("nata");
			user_test.setLastName("zagraevskaya");
			user_test.setEmail("accord@accordbank.com.ua");
			user_test.setPassword( passwordEncoder.encode("123456"));
			user_test.setActive(1);
			userDao.save(user_test);

			//User user2 = new User("Devglan", "Devglan", "sasha", passwordEncoder.encode("123456"), 12345, 34);
			//userDao.save(user2);
		};
	}
*/
}


