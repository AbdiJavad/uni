package com.javad.uni.service;

import com.javad.uni.model.User;
import java.util.List;


public interface UserService {

    User save(User user);
    User update(Long id, User user);
    void delete(Long is);
    List<User> users ();

}
