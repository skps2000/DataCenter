package com.data.center;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableAutoConfiguration(exclude = { DataSourceTransactionManagerAutoConfiguration.class, DataSourceAutoConfiguration.class })
//@ComponentScan(basePackages = "com.data.center")
@SpringBootApplication
public class DataCenterApplication { 
	
	Logger log = LogManager.getLogger(DataCenterApplication.class);
	

	public static void main(String[] args) {
		SpringApplication.run(DataCenterApplication.class, args);
	}

}
