package wonder_waffle.services;

import lombok.AllArgsConstructor;
import wonder_waffle.dao.UserDao;
import wonder_waffle.models.Auto;
import wonder_waffle.models.User;

import java.util.List;

@AllArgsConstructor
public class UserService {

    private UserDao usersDao;

    public User findUser(int id) {
        return usersDao.findById(id);
    }

    public void saveUser(User user) {
        usersDao.save(user);
    }

    public void deleteUser(User user) {
        usersDao.delete(user);
    }

    public void updateUser(User user) {
        usersDao.update(user);
    }

    public List<User> findAllUsers() {
        return usersDao.findAll();
    }

    public Auto findAutoById(int id) {
        return usersDao.findAutoById(id);
    }

    public void deleteById(int id){
        usersDao.deleteById(id);
    }
}
