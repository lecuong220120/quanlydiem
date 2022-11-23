package com.example.demo.repository;

import com.example.demo.entity.DiemThi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiemthiRepository extends JpaRepository<DiemThi, Long> {
}
