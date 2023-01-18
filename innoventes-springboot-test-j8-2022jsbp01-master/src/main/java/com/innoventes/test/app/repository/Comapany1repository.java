package com.innoventes.test.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innoventes.test.app.entity.Company1;

@Repository
public interface Comapany1repository extends JpaRepository<Company1, Integer> {

}
