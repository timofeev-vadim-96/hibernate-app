package wonder_waffle.dao;

import org.hibernate.Session;
import wonder_waffle.models.Auto;
import wonder_waffle.models.User;
import wonder_waffle.utils.HibernateSessionFactoryUtil;

import java.util.List;

public interface UserDao {
    void save(User user);
    void update(User user);
    void delete(User user);

    User findById(int id);
    public Auto findAutoById(int id);

    public List<User> findAll();
    public void deleteById(int id);
}
