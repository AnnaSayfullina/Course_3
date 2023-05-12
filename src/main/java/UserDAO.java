import java.util.List;

public interface UserDAO {
    User createUser (User user);
    User getUserById(int id);
    List<User> getAllUsers();
    void updateUserById(User user);
    void deleteUserById(User user);
}
