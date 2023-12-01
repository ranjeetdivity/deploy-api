package com.fedex.seo.deployapi.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.StringJoiner;

@Entity
public class DeploymentDetail {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "createDateTime")
    private LocalDateTime createdAt;

    @Column(name = "updateDateTime")
    private LocalDateTime updatedAt;

    @Column(name="eaiNumber")
    private String eaiNumber;

    @Column(name = "componentName")
    private String componentName;

    @Column(name = "appVersion")
    private String version;

    @Column(name = "env")
    private String environment;

    @Column(name = "codeBranch")
    private String branch;

    @Column(name ="deployedBy")
    private String deployedBy;

    @Column(name = "deploymentTime")
    private LocalDateTime deploymentAt;

    @Column(name = "deploymentType")
    private String type;

    @Column(name = "deploymentCount")
    private Integer count;

    @Column(name = "deploymentFrequency")
    private String frequency;

    @Column(name = "javaVersion")
    private String compilerVersion;

    @Column(name = "buildTool")
    private String buildTool;

    @Column(name = "pcfSpace")
    private String pcfSpace;

    public DeploymentDetail() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
    public String getEaiNumber() {
        return eaiNumber;
    }

    public void setEaiNumber(String eaiNumber) {
        this.eaiNumber = eaiNumber;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getDeployedBy() {
        return deployedBy;
    }

    public void setDeployedBy(String deployedBy) {
        this.deployedBy = deployedBy;
    }

    public LocalDateTime getDeploymentAt() {
        return deploymentAt;
    }

    public void setDeploymentAt(LocalDateTime deploymentAt) {
        this.deploymentAt = deploymentAt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getCompilerVersion() {
        return compilerVersion;
    }

    public void setCompilerVersion(String compilerVersion) {
        this.compilerVersion = compilerVersion;
    }

    public String getBuildTool() {
        return buildTool;
    }

    public void setBuildTool(String buildTool) {
        this.buildTool = buildTool;
    }

    public String getPcfSpace() {
        return pcfSpace;
    }

    public void setPcfSpace(String pcfSpace) {
        this.pcfSpace = pcfSpace;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DeploymentDetail.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("createdAt=" + createdAt)
                .add("updatedAt=" + updatedAt)
                .add("eaiNumber='" + eaiNumber + "'")
                .add("componentName='" + componentName + "'")
                .add("version='" + version + "'")
                .add("environment='" + environment + "'")
                .add("branch='" + branch + "'")
                .add("deployedBy='" + deployedBy + "'")
                .add("deploymentAt=" + deploymentAt)
                .add("type='" + type + "'")
                .add("count=" + count)
                .add("frequency='" + frequency + "'")
                .add("compilerVersion='" + compilerVersion + "'")
                .add("buildTool='" + buildTool + "'")
                .add("pcfSpace='" + pcfSpace + "'")
                .toString();
    }
}
