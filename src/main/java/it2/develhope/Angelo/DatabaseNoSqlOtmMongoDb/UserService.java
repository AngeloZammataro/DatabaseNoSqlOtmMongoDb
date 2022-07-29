package it2.develhope.Angelo.DatabaseNoSqlOtmMongoDb;

import it2.develhope.Angelo.DatabaseNoSqlOtmMongoDb.entities.User;
import java.util.Collection;

public interface UserService {
    public abstract void createUser(User user);
    public abstract void editUser(String id, User user);
    public abstract void deleteUser(String id);
    public abstract void getUsers(String id);
    public abstract Collection<User> getUsers();

}
