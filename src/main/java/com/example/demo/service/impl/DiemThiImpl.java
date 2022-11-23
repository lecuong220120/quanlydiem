package com.example.demo.service.impl;

import com.example.demo.entity.DiemThi;
import com.example.demo.repository.DiemthiRepository;
import com.example.demo.service.DiemThiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DiemThiImpl implements DiemThiService {
    @Autowired
    DiemthiRepository diemthiRepository;
    @Override
    public DiemThi save(DiemThi diemThi) {
        return diemthiRepository.save(diemThi);
    }

    @Override
    public List<DiemThi> findAll() {
        return diemthiRepository.findAll();
    }

    @Override
    public void delete(DiemThi diemThi) {
        diemthiRepository.delete(diemThi);
    }

    @Override
    public DiemThi update(DiemThi diemThi) {
        return diemthiRepository.save(diemThi);
    }
}
