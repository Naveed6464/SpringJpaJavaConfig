/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naveed.spring.demo.domain.repositories;

import com.naveed.spring.demo.domain.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Naveedur Rahman
 * @email naveed6464@gmail.com
 * @version 1.0
 * @since Jan 16, 2020
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findByFirstName(String firstName);
}
