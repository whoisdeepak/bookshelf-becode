package com.bookshelf.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookshelf.ecommerce.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
