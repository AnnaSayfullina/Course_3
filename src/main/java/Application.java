import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("привет");
        UserDAO userDAO = new UserDAOImpl();
        RoleDAO roleDAO = new RoleDAOImpl();

        /**
         * Добавлять нового пользователя с ролями в БД;
         */
        User user1 = new User("Oleg", "Oleg", "Oleg", List.of(new Role(1), new Role(2)));
        userDAO.createUser(user1);


//        userDAO.deleteUserById(userDAO.getUserById(4));
        List<User> userList = userDAO.getAllUsers();
        System.out.println(userList);

//        List<Role> roles = roleDAO.getAllRoles();
//        System.out.println(roles);

    }
//    public static User enterInformationWithScanner(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите имя:");
//        String name = scanner.nextLine();
//        System.out.println("Введите логин");
//        String login = scanner.nextLine();
//        System.out.println("Введите пароль");
//        String password = scanner.nextLine();
//        User user = new User(name, login, password);
//        return user;
//    }
//    public static List<Role> enterInformationRoles(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите имя:");
//    }
}
