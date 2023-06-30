package com.lewns2.worksserver.works.resource.service;


import com.lewns2.worksserver.works.resource.entity.Resource;

import java.util.List;

public interface ResourceService {

    List<Resource> findAllResource(String type, String ofb, String loc, String search);
}
