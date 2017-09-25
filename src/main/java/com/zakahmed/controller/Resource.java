package com.zakahmed.controller;

import com.zakahmed.domain.GundamModelKit;
import lombok.extern.slf4j.Slf4j;
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

    @RequestMapping(value="", method = RequestMethod.GET)
    public List<GundamModelKit> getModelKits() {
        log.info("getModelKits called");
        List modelKitList = new ArrayList();
        modelKitList.add("Hello There");
        return  modelKitList;
    }

}
