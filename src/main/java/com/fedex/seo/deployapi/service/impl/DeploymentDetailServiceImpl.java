package com.fedex.seo.deployapi.service.impl;

import com.fedex.seo.deployapi.model.DeploymentDetail;
import com.fedex.seo.deployapi.resource.DeploymentDetailPageResponse;
import com.fedex.seo.deployapi.resource.DeploymentDetailRequest;
import com.fedex.seo.deployapi.resource.DeploymentDetailResponse;
import com.fedex.seo.deployapi.repository.DeploymentDetailRespository;
import com.fedex.seo.deployapi.service.DeploymentDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class DeploymentDetailServiceImpl implements DeploymentDetailService {

    @Autowired
    DeploymentDetailRespository respository;

    @Override
    public DeploymentDetail createOrUpdateDeploymentDetail(DeploymentDetailRequest payload) {

        return respository.save(convertToDeploymentDetail(payload));
    }

    @Override
    public DeploymentDetailPageResponse getDeploymentDetail(int pageNo, int pageSize, String sortBy, String sortDir) {

        Sort sort = Sort.Direction.ASC.name().equalsIgnoreCase(sortDir) ? Sort.by(sortBy).ascending()
                : Sort.by(sortBy).descending();
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        Page<DeploymentDetail> deploymentDetailPage = respository.findAll(pageable);
        DeploymentDetailPageResponse response  = new DeploymentDetailPageResponse();
        response.setPageNo(deploymentDetailPage.getNumber());
        response.setContent(convertToDeploymentDetailResponse(deploymentDetailPage.getContent()));
        response.setPageSize(deploymentDetailPage.getSize());
        response.setTotalElements(deploymentDetailPage.getTotalElements());
        response.setTotalPages(deploymentDetailPage.getTotalPages());

        return response;
    }

    private DeploymentDetail convertToDeploymentDetail(DeploymentDetailRequest payload){
        DeploymentDetail deploymentDetail = new DeploymentDetail();
        deploymentDetail.setEaiNumber(payload.getEaiNumber());
        deploymentDetail.setComponentName(payload.getComponentName());
        deploymentDetail.setVersion(payload.getAppVersion());
        deploymentDetail.setEnvironment(payload.getEnvironment());
        deploymentDetail.setType(payload.getDeploymentType());
        deploymentDetail.setBranch(payload.getCodeBranch());
        deploymentDetail.setBranch(payload.getCodeBranch());
        deploymentDetail.setDeployedBy(payload.getDeployedBy());
        deploymentDetail.setDeploymentAt(LocalDateTime.parse(payload.getDeploymentTime()));
        deploymentDetail.setType(payload.getDeploymentType());
        deploymentDetail.setCount(Integer.parseInt(payload.getDeploymentCount()));
        deploymentDetail.setCompilerVersion(payload.getJavaVersion());
        deploymentDetail.setBuildTool(payload.getBuildTool());
        deploymentDetail.setPcfSpace(payload.getPcfSpace());
        deploymentDetail.setFrequency("Weekly");
        deploymentDetail.setCreatedAt(LocalDateTime.now());
        deploymentDetail.setUpdatedAt(LocalDateTime.now());
        return deploymentDetail;
    }


    private List<DeploymentDetailResponse> convertToDeploymentDetailResponse(List<DeploymentDetail> deploymentDetails){

        List<DeploymentDetailResponse> deploymentResponseList = new ArrayList<>();
        for(DeploymentDetail deploymentDetail : deploymentDetails) {
            DeploymentDetailResponse response = new DeploymentDetailResponse();
            response.setId(String.valueOf(deploymentDetail.getId()));
            response.setEaiNumber(deploymentDetail.getEaiNumber());
            response.setComponentName(deploymentDetail.getComponentName());
            response.setAppVersion(deploymentDetail.getVersion());
            response.setEnvironment(deploymentDetail.getEnvironment());
            response.setDeploymentType(deploymentDetail.getType());
            response.setCodeBranch(deploymentDetail.getBranch());
            response.setDeployedBy(deploymentDetail.getDeployedBy());
            response.setDeploymentTime(deploymentDetail.getDeploymentAt().toString());
            response.setDeploymentType(deploymentDetail.getType());
            response.setDeploymentCount(String.valueOf(deploymentDetail.getCount()));
            response.setJavaVersion(deploymentDetail.getVersion());
            response.setBuildTool(deploymentDetail.getBuildTool());
            response.setPcfSpace(deploymentDetail.getPcfSpace());
            response.setFrequency(deploymentDetail.getFrequency());

            deploymentResponseList.add(response);
        }
        return deploymentResponseList;
    }
}
