package com.gestordoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

//@EnableJpaRepositories("com.gestordoc.repository")
//@EntityScan("com.gestordoc.persistence")
@SpringBootApplication
public class GestordocApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestordocApplication.class, args);


	}
}
