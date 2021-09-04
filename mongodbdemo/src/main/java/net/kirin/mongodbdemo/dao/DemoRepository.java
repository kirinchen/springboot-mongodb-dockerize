package net.kirin.mongodbdemo.dao;

import net.kirin.mongodbdemo.model.Demo;
import org.springframework.data.mongodb.repository.MongoRepository;

// No need implementation, just one interface, and you have CRUD, thanks Spring Data
public interface DemoRepository extends MongoRepository<Demo, Long> {

    Demo findFirstByName(String name);

}