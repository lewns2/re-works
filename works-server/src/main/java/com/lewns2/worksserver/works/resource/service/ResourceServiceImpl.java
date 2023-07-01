package com.lewns2.worksserver.works.resource.service;

import com.lewns2.worksserver.works.resource.entity.Resource;
import com.lewns2.worksserver.works.resource.repository.ResourceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional(readOnly = true)
public class ResourceServiceImpl implements ResourceService{

    private final ResourceRepository resourceRepository;

    public ResourceServiceImpl(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

    @Override
    public List<Resource> findAllResource(String type, String ofb, String loc, String search) {
        log.info("Request Param: Type = {} / Ofb = {} / Loc = {} / Keyword = {}", type, ofb, loc, search);
        List<Resource> findList =  resourceRepository.findAllResource(type, ofb, loc, search);

        return findList;
    }
}
