import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "date_of_creating")
    private LocalDateTime dateOfCreating;

    @Column (name = "date_of_changing")
    private LocalDateTime dateOfChanging;

    @ManyToMany
    @JoinTable(name = "users_and_roles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName="user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName="role_id")
    )
    private List<Role> rolesList;

    public User() {
    }

    public User(int userId, String userName, String login, String password, LocalDateTime dateOfCreating, LocalDateTime dateOfChanging) {
        this.userId = userId;
        this.userName = userName;
        this.login = login;
        this.password = password;
        this.dateOfCreating = dateOfCreating;
        this.dateOfChanging = dateOfChanging;
    }

    public User(String userName, String login, String password, LocalDateTime dateOfCreating, LocalDateTime dateOfChanging) {
        this.userName = userName;
        this.login = login;
        this.password = password;
        this.dateOfCreating = dateOfCreating;
        this.dateOfChanging = dateOfChanging;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getDateOfCreating() {
        return dateOfCreating;
    }

    public void setDateOfCreating(LocalDateTime dateOfCreating) {
        this.dateOfCreating = dateOfCreating;
    }

    public LocalDateTime getDateOfChanging() {
        return dateOfChanging;
    }

    public void setDateOfChanging(LocalDateTime dateOfChanging) {
        this.dateOfChanging = dateOfChanging;
    }

    public List<Role> getRolesList() {
        return rolesList;
    }

    public void setRolesList(List<Role> rolesList) {
        this.rolesList = rolesList;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", dateOfCreating=" + dateOfCreating +
                ", dateOfChanging=" + dateOfChanging +
                '}';
    }
}
