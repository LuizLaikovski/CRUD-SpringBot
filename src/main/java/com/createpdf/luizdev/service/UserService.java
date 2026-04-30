package com.createpdf.luizdev.service;

import com.createpdf.luizdev.model.User;
import com.createpdf.luizdev.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    public List<User> createMultipleUsers(List<User> users) {
        return userRepository.saveAll(users);
    }

    public User getUserId(Long id) {
        return userRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Usuario não encontrado"));
    }

    public User modifyUser(Long id, User newUser) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario não encontrado"));

        if (newUser.getName() != null) {
            user.setName(newUser.getName());
        }

        if (newUser.getEmail() != null) {
            user.setEmail(newUser.getEmail());
        }

        if (newUser.getBirth() != null) {
            user.setBirth(newUser.getBirth());
        }

        if (newUser.getHeight() != 0) {
            user.setHeight(newUser.getHeight());
        }

        return userRepository.save(user);
    }
}