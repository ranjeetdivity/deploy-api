package com.fedex.seo.deployapi.controller;

import com.fedex.seo.deployapi.model.DeploymentDetail;
import com.fedex.seo.deployapi.resource.DeploymentDetailPageResponse;
import com.fedex.seo.deployapi.resource.DeploymentDetailRequest;
import com.fedex.seo.deployapi.service.DeploymentDetailService;
import com.fedex.seo.deployapi.util.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/seo/v1")
public class DeploymentApiController {

    @Autowired
    DeploymentDetailService service;



    @GetMapping("/allDeploymentDetails")
    public ResponseEntity<DeploymentDetailPageResponse> getAllDeploymentDetails(
            @RequestParam(value = "pageNo", defaultValue = AppConstants.DEFAULT_PAGE_NUMBER, required = false) int pageNo,
            @RequestParam(value = "pageSize", defaultValue = AppConstants.DEFAULT_PAGE_SIZE, required = false) int pageSize,
            @RequestParam(value = "sortBy", defaultValue = AppConstants.DEFAULT_SORT_BY, required = false) String sortBy,
            @RequestParam(value = "sortDir", defaultValue = AppConstants.DEFAULT_SORT_DIRECTION, required = false)  String sortDir) {

        return ResponseEntity.ok(service.getDeploymentDetail(pageNo, pageSize, sortBy, sortDir));
    }

    @PostMapping("/insertDeploymentDetail")
    public ResponseEntity<DeploymentDetail> createdDeploymentDetail(@RequestBody DeploymentDetailRequest payload){
        return ResponseEntity.ok(service.createOrUpdateDeploymentDetail(payload));
    }
}
