package com.srjons.awssdkv2;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

@SpringBootApplication
public class AwsSdkV2SamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwsSdkV2SamplesApplication.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(DynamoDbClient dynamoDbClient) {
        return args -> dynamoDbClient.listTables().tableNames().forEach(System.out::println);
    }
}
