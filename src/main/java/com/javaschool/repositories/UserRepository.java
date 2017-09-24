package com.javaschool.repositories;

import com.javaschool.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.name =:name and u.lastName =:lastName")
    User findUserByNameAndLastname(@Param("name") String name, @Param("lastName") String lastName);


}