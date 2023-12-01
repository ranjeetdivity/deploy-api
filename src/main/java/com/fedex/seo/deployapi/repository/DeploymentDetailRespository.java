package com.fedex.seo.deployapi.repository;

import com.fedex.seo.deployapi.model.DeploymentDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface DeploymentDetailRespository extends JpaRepository <DeploymentDetail, Integer>  {


    List<DeploymentDetail> findAll();
}
