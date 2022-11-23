package com.example.demo.service.impl;

import com.example.demo.entity.Lop;
import com.example.demo.repository.LopRepository;
import com.example.demo.service.LopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LopImpl implements LopService {
    @Autowired
    LopRepository lopRepository;
    @Override
    public Lop save(Lop lop) {
        return  lopRepository.save(lop);
    }

    @Override
    public List<Lop> findAll() {
        return lopRepository.findAll();
    }

    @Override
    public void delete(Lop lop) {
        lopRepository.delete(lop);
    }

    @Override
    public Lop update(Lop lop) {
        return lopRepository.save(lop);
    }
}
