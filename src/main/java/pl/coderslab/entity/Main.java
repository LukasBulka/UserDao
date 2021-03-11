package pl.coderslab.entity;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        UserDao userDao = new UserDao();

        User user = new User();

        user.setEmail("email@domain.com");
        user.setUsername("username");
        user.setPassword("password");
        userDao.createUser(user);
        System.out.println(userDao.readUser(1));

        user.setEmail("newEmail@domain.com");
        user.setUsername("newUsername");
        user.setPassword("newPassword");
        userDao.updateUser(user);

        user.setEmail("anotherEmail@domain.com");
        user.setUsername("anotherUsername");
        user.setPassword("anotherPassword");
        userDao.createUser(user);
        System.out.println(Arrays.toString(userDao.findAllUsers()));

        userDao.deleteUser(1);
    }
}
