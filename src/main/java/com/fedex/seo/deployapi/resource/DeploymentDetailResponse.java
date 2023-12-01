package com.fedex.seo.deployapi.resource;



public class DeploymentDetailResponse {
    private String id;
    private String eaiNumber;
    private String componentName;
    private String appVersion;
    private String environment;
    private String codeBranch;
    private String deployedBy;
    private String deploymentTime;
    private String deploymentType;
    private String deploymentCount;
    private String frequency;
    private String javaVersion;
    private String buildTool;
    private String pcfSpace;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getCodeBranch() {
        return codeBranch;
    }

    public void setCodeBranch(String codeBranch) {
        this.codeBranch = codeBranch;
    }

    public String getDeployedBy() {
        return deployedBy;
    }

    public void setDeployedBy(String deployedBy) {
        this.deployedBy = deployedBy;
    }

    public String getDeploymentTime() {
        return deploymentTime;
    }

    public void setDeploymentTime(String deploymentTime) {
        this.deploymentTime = deploymentTime;
    }

    public String getDeploymentType() {
        return deploymentType;
    }

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    public String getDeploymentCount() {
        return deploymentCount;
    }

    public void setDeploymentCount(String deploymentCount) {
        this.deploymentCount = deploymentCount;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public void setJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
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
}
