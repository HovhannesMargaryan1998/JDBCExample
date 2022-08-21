package jdbcexample;


import jdbcexample.manager.UserManager;
import jdbcexample.model.User;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserManager userManager = new UserManager();
        try {
            User user = new User("poxos", "poxosyan", "poxos@mail.com", "poxos");
            userManager.addUser(user);
            System.out.println(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        List<User> allUsers = new LinkedList<>();

        for (User allUser : allUsers) {
            System.out.println(allUser);
        }


        try {
            userManager.deleteUserById(4);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
