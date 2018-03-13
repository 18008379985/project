package com.soa.project.domain;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProjectResource {
  private String guid;
  private String projectGuid;
  private String resourceName;
  private String resourceCode;
  private String roleName;
  private String roleCode;

  @Id
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public String getProjectGuid() {
    return projectGuid;
  }

  public void setProjectGuid(String projectGuid) {
    this.projectGuid = projectGuid;
  }

  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  public String getResourceCode() {
    return resourceCode;
  }

  public void setResourceCode(String resourceCode) {
    this.resourceCode = resourceCode;
  }

  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public String getRoleCode() {
    return roleCode;
  }

  public void setRoleCode(String roleCode) {
    this.roleCode = roleCode;
  }
}
