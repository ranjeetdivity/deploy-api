package com.fedex.seo.deployapi.repository;

import com.fedex.seo.deployapi.DeployApiApplication;
import com.fedex.seo.deployapi.model.DeploymentDetail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;
import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = DeployApiApplication.class)
public class DeploymentDetailRespositoryTest {

    @Autowired
    private DeploymentDetailRespository repository;

    @Test
    public void testfindAll(){
       List<DeploymentDetail> list =  repository.findAll();

        System.out.println(list);
    }

    @Test
    public void testSave(){
        DeploymentDetail deploymentDetail = new DeploymentDetail();
        deploymentDetail.setEaiNumber("3537814");
        deploymentDetail.setComponentName("cs-query-L4");
        deploymentDetail.setVersion("3.10.99");
        deploymentDetail.setEnvironment("L4");
        deploymentDetail.setBranch("feature-deployment-details-API");
        deploymentDetail.setDeployedBy("Ranjeet Divity");
        deploymentDetail.setDeploymentAt(LocalDateTime.parse("2023-11-26T06:12:10"));
        deploymentDetail.setType("BRANCH");
        deploymentDetail.setCount(2);
        deploymentDetail.setFrequency("Weekly");
        deploymentDetail.setCompilerVersion("17.0.9");
        deploymentDetail.setBuildTool("Gradle");
        deploymentDetail.setPcfSpace("development");
        deploymentDetail.setCreatedAt(LocalDateTime.now());
        deploymentDetail.setUpdatedAt(LocalDateTime.now());
        System.out.println(repository.save(deploymentDetail).toString());
    }
}
