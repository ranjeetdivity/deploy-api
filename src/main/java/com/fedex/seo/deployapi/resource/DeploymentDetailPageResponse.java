package com.fedex.seo.deployapi.resource;

import com.fedex.seo.deployapi.model.DeploymentDetail;

import java.util.List;

public class DeploymentDetailPageResponse extends PageableResponse {
    private List<DeploymentDetailResponse> content;

    public List<DeploymentDetailResponse> getContent() {
        return content;
    }

    public void setContent(List<DeploymentDetailResponse> content) {
        this.content = content;
    }
}
