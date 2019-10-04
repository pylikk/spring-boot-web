package net.guides.springboot2.springboot2webappthymeleaf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.guides.springboot2.springboot2webappthymeleaf.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>
{

}
