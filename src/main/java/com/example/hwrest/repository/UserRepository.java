package com.example.hwrest.repository;

import com.example.hwrest.model.Authorities;
import com.example.hwrest.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Repository
public class UserRepository {
    public List<User> users;

    public UserRepository() {
        this.users = new CopyOnWriteArrayList<>();
        users.add(new User("admin", "1111", List.of(Authorities.WRITE, Authorities.READ, Authorities.DELETE)));
        users.add(new User("quest", "2222", List.of(Authorities.READ)));
    }

    public List<Authorities> getUserAuthorities(String name, String password) {
        for (User user : users) {
            if (user.getName().equals(name) && user.getPassword().equals(password)) {
                return user.getAuthorities();
            }
        }
            return null;
    }
}
