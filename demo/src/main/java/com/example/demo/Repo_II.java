package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


public interface Repo_II extends JpaRepository<Machine_II, Long> {

    Machine_II findByFire(String name);



}
