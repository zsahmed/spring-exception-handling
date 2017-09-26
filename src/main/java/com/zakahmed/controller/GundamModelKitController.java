package com.zakahmed.controller;

import com.zakahmed.domain.GundamModelKit;
import com.zakahmed.service.GundamModelKitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zahmed on 9/23/17.
 */
@RestController
@Slf4j
@RequestMapping(Resource.API_URL)
public class Resource {
    public final static String API_URL = "/api/model-kit";

    @Autowired
    private GundamModelKitService gundamModelKitService;

    @RequestMapping(value="", method = RequestMethod.GET)
    public List<GundamModelKit> getModelKits() {
        log.info("getModelKits called");
        List modelKitList = gundamModelKitService.getModelKits();

        return  modelKitList;
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public boolean addGunplaKit() {
        GundamModelKit model = new GundamModelKit();
        model.setTitle("Zaku");
        model.setImageUrl("image");
        model.setLink("link");
        model.setPrice("10");
        model.setRelease_date("October");
        model.setSeries("Mobile Suit Gundam");

        gundamModelKitService.save(model);
        return true;
    }

}
