package com.addressmgmt.addressmgmt.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@Configuration
@EnableReactiveMongoRepositories("com.addressmgmt.addressmgmt.repository")
public class MongoConfig{

}
