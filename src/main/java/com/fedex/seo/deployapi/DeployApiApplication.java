package com.fedex.seo.deployapi;

import com.fedex.seo.deployapi.resource.DeploymentDetailResponse;
import com.fedex.seo.deployapi.service.DeploymentDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeployApiApplication {


	public static void main(String[] args) {

		SpringApplication.run(DeployApiApplication.class, args);

	}

}
