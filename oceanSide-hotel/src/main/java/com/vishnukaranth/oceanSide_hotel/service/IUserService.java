package com.vishnukaranth.oceanSide_hotel.service;

import com.vishnukaranth.oceanSide_hotel.model.User;

import java.util.List;

public interface IUserService {
    User registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}
