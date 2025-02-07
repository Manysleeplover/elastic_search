package ru.romanov.Elastic.stack.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@EnableElasticsearchRepositories
@SpringBootApplication
public class ElasticStackDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticStackDemoApplication.class, args);
	}

}
