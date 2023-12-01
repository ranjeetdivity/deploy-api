package com.fedex.seo.deployapi.service;

import com.fedex.seo.deployapi.model.DeploymentDetail;
import com.fedex.seo.deployapi.resource.DeploymentDetailPageResponse;
import com.fedex.seo.deployapi.resource.DeploymentDetailRequest;
import com.fedex.seo.deployapi.resource.DeploymentDetailResponse;
import org.springframework.stereotype.Service;

@Service
public interface DeploymentDetailService {

    public DeploymentDetail createOrUpdateDeploymentDetail(DeploymentDetailRequest payload);

    public DeploymentDetailPageResponse getDeploymentDetail(int pageNo, int pageSize, String sortBy, String sortDir);

}
