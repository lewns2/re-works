package com.lewns2.worksserver.works.resource.dto;

import com.lewns2.worksserver.base.base_response.BaseResponse;
import com.lewns2.worksserver.works.resource.entity.Resource;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class ResourceResponse extends BaseResponse{

    private List<Resource> resourceList;

    private ResourceResponse(String status, String message, List<Resource> resourceList) {
        super(status, message);
        this.resourceList = resourceList;
    }

    public static ResourceResponse success(List<Resource> resourceList) {
        return new ResourceResponse("00", "OK", resourceList);
    }
}
