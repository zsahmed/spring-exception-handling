package com.zakahmed.service;

import com.zakahmed.dao.GundamModelKitRepository;
import com.zakahmed.domain.GundamModelKit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zahmed on 9/25/17.
 */
@Slf4j
@Service
public class GundamModelKitService {

    @Autowired
    private GundamModelKitRepository gundamModelKitRepository;

    public List<GundamModelKit> getModelKits() {
        log.info("GundamModelKitService called");
        return gundamModelKitRepository.findAll();
    }

    public boolean save(GundamModelKit model) {
        gundamModelKitRepository.save(model);

        return true;
    }
}
