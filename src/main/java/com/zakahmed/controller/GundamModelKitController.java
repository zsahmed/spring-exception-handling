package com.zakahmed.controller;

import com.zakahmed.domain.GundamModelKit;
import com.zakahmed.service.GundamModelKitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by zahmed on 9/23/17.
 */
@RestController
@Slf4j
@RequestMapping(GundamModelKitController.API_URL)
public class GundamModelKitController {
    public final static String API_URL = "/api/model-kit";

    @Autowired
    private GundamModelKitService gundamModelKitService;

    @RequestMapping(value="", method = RequestMethod.GET)
    public List<GundamModelKit> getModelKits() {
        log.info("getModelKits called");
        List modelKitList = gundamModelKitService.getModelKits();

        return  modelKitList;
    }

    @RequestMapping(value="/{modelKitId}", method = RequestMethod.GET)
    public GundamModelKit getModelById(@PathVariable("modelKitId") final int modelKitId) {
        return gundamModelKitService.getModelById(modelKitId);
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public boolean addGunplaKit(@RequestBody GundamModelKit modelKit) {
        gundamModelKitService.save(modelKit);
        return true;
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public ResponseEntity updateGunplaKit(@RequestBody GundamModelKit gundamModelKit) throws Exception {
        gundamModelKitService.updateModelKit(gundamModelKit);
        return ResponseEntity.ok(null);
    }

    @RequestMapping(value="/{modelKitId}", method = RequestMethod.DELETE)
    public ResponseEntity deleteModelById(@PathVariable("modelKitId") final int modelKitId) {
        gundamModelKitService.deleteModelKit(modelKitId);
        return ResponseEntity.ok(null);
    }

}
