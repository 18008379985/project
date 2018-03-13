package com.soa.project.domain;

import javax.persistence.*;

/**
 *  @author liyanhua
 *  createDate:2018-03-10
 */

@Entity
@Table(name = "project")
public class Project {
  private String guid;
  private String projectName;
  private String projectCode;
  private java.sql.Date startDate;
  private String typeCode;
  private String customerName;
  private String customerCode;
  private Double contractAmount;
  private String pmName;
  private String pmCode;

  @Id
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public String getProjectCode() {
    return projectCode;
  }

  public void setProjectCode(String projectCode) {
    this.projectCode = projectCode;
  }

  public java.sql.Date getStartDate() {
    return startDate;
  }

  public void setStartDate(java.sql.Date startDate) {
    this.startDate = startDate;
  }

  public String getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getCustomerCode() {
    return customerCode;
  }

  public void setCustomerCode(String customerCode) {
    this.customerCode = customerCode;
  }

  public Double getContractAmount() {
    return contractAmount;
  }

  public void setContractAmount(Double contractAmount) {
    this.contractAmount = contractAmount;
  }

  public String getPmName() {
    return pmName;
  }

  public void setPmName(String pmName) {
    this.pmName = pmName;
  }

  public String getPmCode() {
    return pmCode;
  }

  public void setPmCode(String pmCode) {
    this.pmCode = pmCode;
  }
}
