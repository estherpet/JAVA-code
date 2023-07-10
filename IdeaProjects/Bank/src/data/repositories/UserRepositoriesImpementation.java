package data.repositories;

import data.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoriesImpementation implements UserRepositories{
    private int counter;
    List<User> users = new ArrayList<>();
    @Override
    public User save(User user) {
        users.add(user);
        user.setId(++ counter);
        return user;
    }

    @Override
    public User findById(int id)  {
        for (User user: users){
            if (user.getId() == id)
            return  user;
        }
        return null ;
    }

    @Override
    public List<User> findAll() {

        return users;
    }

    @Override
    public void delete(int id) {
        users.remove(id);

    }

    @Override
    public void deleteAll() {
users.clear();
    }

    @Override
    public long count() {
        return users.size();
    }

    @Override
    public User findByUsername(String username) {
        for (User user: users)
            if (username.equalsIgnoreCase(user.getUsername()))return user;
        return null;
    }
}
