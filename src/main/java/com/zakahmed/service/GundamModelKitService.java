package com.zakahmed.service;

import com.zakahmed.dao.GundamModelKitRepository;
import com.zakahmed.domain.GundamModelKit;
import com.zakahmed.exceptions.GundamModelKitNotFoundException;
import javassist.tools.web.BadHttpRequest;
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
        log.info("id " + model.getId());
        gundamModelKitRepository.save(model);

        return true;
    }

    /* only allow model to be updated
       if user wishes to create a new db item they should use the "add" controller endpoint, not the update
     */
    public void updateModelKit(GundamModelKit model) throws Exception {
        if(model.getId() != 0) {
            save(model);
        } else {
            log.error("Attempting to update non-existent model.");
            throw new GundamModelKitNotFoundException((int) model.getId());
        }
    }

    //Delete kit by id
    public void deleteModelKit(int id) {
        gundamModelKitRepository.delete((long) id);
    }
}
