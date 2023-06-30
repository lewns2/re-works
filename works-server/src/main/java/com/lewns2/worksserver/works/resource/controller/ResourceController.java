package com.lewns2.worksserver.works.resource.controller;


import com.lewns2.worksserver.works.resource.dto.ResourceResponse;
import com.lewns2.worksserver.works.resource.entity.Resource;
import com.lewns2.worksserver.works.resource.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/resource")
@RestController
public class ResourceController {

    private final ResourceService resourceService;

    public ResourceController(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    @GetMapping("/list")
    public ResponseEntity<ResourceResponse> findResourceList(
            @RequestParam String type,
            @RequestParam String ofb,
            @RequestParam String loc,
            @RequestParam String search
    ) {

        List<Resource> findResourceList = resourceService.findAllResource(type, ofb, loc, search);

        ResourceResponse res = ResourceResponse.success(findResourceList);

        return new ResponseEntity<>(res, HttpStatus.OK);
    }


}
