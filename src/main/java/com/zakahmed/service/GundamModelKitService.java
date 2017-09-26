package com.zakahmed.service;

import com.zakahmed.dao.GundamModelKitRepository;
import com.zakahmed.domain.GundamModelKit;
import com.zakahmed.exceptions.GundamModelKitNotFoundException;
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

    //return all items from gunpla_db
    public List<GundamModelKit> getModelKits() {
        log.info("GundamModelKitService called");
        return gundamModelKitRepository.findAll();
    }

    /* If a model exists, return model
       else throw exception for client to consume
     */
    public GundamModelKit getModelById(int id) {
        GundamModelKit kit = gundamModelKitRepository.findOne((long) id);
        if(kit == null) {
            throw new GundamModelKitNotFoundException(id);
        }

        return kit;
    }

    //saves new model item to db
    public boolean save(GundamModelKit model) {
        gundamModelKitRepository.save(model);

        return true;
    }
}
