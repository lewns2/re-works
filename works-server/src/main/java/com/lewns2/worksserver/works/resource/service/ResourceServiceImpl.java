package com.lewns2.worksserver.works.resource.service;

import com.lewns2.worksserver.works.resource.entity.Resource;
import com.lewns2.worksserver.works.resource.repository.ResourceRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ResourceServiceImpl implements ResourceService{

    private final ResourceRepository resourceRepository;

    public ResourceServiceImpl(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

    @Override
    public List<Resource> findAllResource(String type, String ofb, String loc, String search) {
        List<Resource> findList =  resourceRepository.findAllResource(type, ofb, loc, search);

        return findList;
    }
}
