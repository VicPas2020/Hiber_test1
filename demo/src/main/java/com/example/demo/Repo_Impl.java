package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


public interface Repo_Impl extends JpaRepository<MachineImpl, Long> {

    MachineImpl findByVolume(String name);





}
