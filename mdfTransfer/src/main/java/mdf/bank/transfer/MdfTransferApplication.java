package mdf.bank.transfer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MdfTransferApplication {

	public static void main(String[] args) {
		SpringApplication.run(MdfTransferApplication.class, args);
	}
}
