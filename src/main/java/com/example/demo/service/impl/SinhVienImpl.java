package com.example.demo.service.impl;

import com.example.demo.entity.SinhVien;
import com.example.demo.repository.SinhVienRepository;
import com.example.demo.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinhVienImpl implements SinhVienService {
    @Autowired
    SinhVienRepository sinhVienRepository;

    @Override
    public SinhVien save(SinhVien sinhVien) {
        return sinhVienRepository.save(sinhVien);
    }

    @Override
    public List<SinhVien> findAll() {
        return sinhVienRepository.findAll();
    }

    @Override
    public void delete(SinhVien sinhVien) {
        sinhVienRepository.delete(sinhVien);
    }

    @Override
    public SinhVien update(SinhVien sinhVien) {
        return sinhVienRepository.save(sinhVien);
    }
}
