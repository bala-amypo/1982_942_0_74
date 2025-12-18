
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.StuEnt;

public interface Studentrepository extends JpaRepository<Studententity, Long> {
    
    
}