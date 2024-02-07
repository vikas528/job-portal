package com.blueyonder.team2.JobPortalHireNow.repository;

import com.blueyonder.team2.JobPortalHireNow.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryExtend {
//    @Query("SELECT u FROM User u WHERE u.username = ?")
    public User findByUsername(String username);
}
