package com.example.demo.service.impl;

import com.example.demo.entity.MonHoc;
import com.example.demo.repository.MonHocRepository;
import com.example.demo.service.MonHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MonHocImpl implements MonHocService {
    @Autowired
    MonHocRepository monHocRepository;
    @Override
    public MonHoc save(MonHoc monHoc) {
        return monHocRepository.save(monHoc);
    }

    @Override
    public List<MonHoc> findAll() {
        return monHocRepository.findAll();
    }

    @Override
    public void delete(MonHoc monHoc) {
    monHocRepository.delete(monHoc);
    }

    @Override
    public MonHoc update(MonHoc monHoc) {
        return monHocRepository.save(monHoc);
    }
}
