package net.kirin.mongodbdemo;

import net.kirin.mongodbdemo.dao.DemoRepository;
import net.kirin.mongodbdemo.model.Demo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"net.kirin"})
@SpringBootApplication
public class MongodbdemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(MongodbdemoApplication.class, args);
	}

	@Bean
	CommandLineRunner init(DemoRepository domainRepository) {

		return args -> {
			Demo n = new Demo();
			n.setId(System.currentTimeMillis());
			n.setName("kirin");
			Map v = new HashMap();
			v.put("dd",123);
			n.setVar(v);
			domainRepository.save(n);

			Demo obj2 = domainRepository.findFirstByName("kirin");
			System.out.println(obj2);
		};

	}

}
