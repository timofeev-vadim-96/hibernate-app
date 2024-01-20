package wonder_waffle;

import wonder_waffle.dao.UserDaoImpl;
import wonder_waffle.models.Auto;
import wonder_waffle.models.User;
import wonder_waffle.services.UserService;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService(new UserDaoImpl());
        User user = userService.findUser(3);
//        userService.saveUser(user);
//
//        Auto auto1 = new Auto("ferrari", "red");
//        user.addAuto(auto1);
//
//        Auto auto2 = new Auto("mazda", "white");
//        user.addAuto(auto2);
//
//        Auto auto3 = new Auto("bmw", "black");
//        user.addAuto(auto3);
//
//        userService.updateUser(user);
        user.setName("Sasha");
        userService.updateUser(user);
    }
}