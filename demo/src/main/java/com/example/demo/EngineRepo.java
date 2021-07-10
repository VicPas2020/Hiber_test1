package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EngineRepo extends JpaRepository<Engine, Long> {
}
