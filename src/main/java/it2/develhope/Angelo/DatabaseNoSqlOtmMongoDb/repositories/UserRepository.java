package it2.develhope.Angelo.DatabaseNoSqlOtmMongoDb.repositories;

import it2.develhope.Angelo.DatabaseNoSqlOtmMongoDb.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
