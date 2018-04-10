package com.soa.project.domain;

import javax.persistence.*;

/**
 *  @author liyanhua
 *  createDate:2018-04-04
 */

@Entity
@Table(name = "person")
public class Person {
  private String guid;
  private String personName;
  private String personCode;
  private String sex;
  private java.sql.Date jionDate;
  private Long salary;
  private String position;
  private java.sql.Date leaveDate;
  private String accounts;
  private String password;

  @Id
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public String getPersonName() {
    return personName;
  }

  public void setPersonName(String personName) {
    this.personName = personName;
  }

  public String getPersonCode() {
    return personCode;
  }

  public void setPersonCode(String personCode) {
    this.personCode = personCode;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public java.sql.Date getJionDate() {
    return jionDate;
  }

  public void setJionDate(java.sql.Date jionDate) {
    this.jionDate = jionDate;
  }

  public Long getSalary() {
    return salary;
  }

  public void setSalary(Long salary) {
    this.salary = salary;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public java.sql.Date getLeaveDate() {
    return leaveDate;
  }

  public void setLeaveDate(java.sql.Date leaveDate) {
    this.leaveDate = leaveDate;
  }

  public String getAccounts() {
    return accounts;
  }

  public void setAccounts(String accounts) {
    this.accounts = accounts;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
