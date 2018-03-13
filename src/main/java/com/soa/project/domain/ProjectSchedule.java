package com.soa.project.domain;


import javax.persistence.*;

@Entity
@Table(name = "projectSchedule")
public class ProjectSchedule {
  private String guid;
  private String projectGuid;
  private String phaseName;
  private String phaseSn;
  private java.sql.Date planBeginDate;
  private java.sql.Date planFinishDate;
  private java.sql.Date realBeginDate;
  private java.sql.Date realFinishDate;
  private Long finishRate;

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

  public String getPhaseName() {
    return phaseName;
  }

  public void setPhaseName(String phaseName) {
    this.phaseName = phaseName;
  }

  public String getPhaseSn() {
    return phaseSn;
  }

  public void setPhaseSn(String phaseSn) {
    this.phaseSn = phaseSn;
  }

  public java.sql.Date getPlanBeginDate() {
    return planBeginDate;
  }

  public void setPlanBeginDate(java.sql.Date planBeginDate) {
    this.planBeginDate = planBeginDate;
  }

  public java.sql.Date getPlanFinishDate() {
    return planFinishDate;
  }

  public void setPlanFinishDate(java.sql.Date planFinishDate) {
    this.planFinishDate = planFinishDate;
  }

  public java.sql.Date getRealBeginDate() {
    return realBeginDate;
  }

  public void setRealBeginDate(java.sql.Date realBeginDate) {
    this.realBeginDate = realBeginDate;
  }

  public java.sql.Date getRealFinishDate() {
    return realFinishDate;
  }

  public void setRealFinishDate(java.sql.Date realFinishDate) {
    this.realFinishDate = realFinishDate;
  }

  public Long getFinishRate() {
    return finishRate;
  }

  public void setFinishRate(Long finishRate) {
    this.finishRate = finishRate;
  }
}
