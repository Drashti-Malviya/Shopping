package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
		
		System.out.println("hello");
	}

}


//Classes and interfaces:  For example, "Employee", "UnionEmployee", or "Remote". 
//Methods: Use lowercase verbs. For example, "public void enterData() {". 
//Variables: first letter, dollar sign, or underscore. Variables should not contain white space. For example, "int[] counter", "double fees", "firstName", "timeToFirstLoad", or "index". 
//Constants: Use all uppercase letters. For example, "univers = ALL". 
//Packages: Use lowercase names. 
//Modules: Use the "reverse domain name" convention, similar to package names. 
//Service names: Use mixed case, with the first letter of each internal word capitalized. 



//mvn spring-boot:run

//java -jar target/your-application-name.jar


//mysql -u root -p        Business@1207..
