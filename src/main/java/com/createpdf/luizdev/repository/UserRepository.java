package com.createpdf.luizdev.repository;

import com.createpdf.luizdev.model.User;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
