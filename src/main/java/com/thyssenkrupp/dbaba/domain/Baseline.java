package com.thyssenkrupp.dbaba.domain;

import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Baseline {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String type;
  private String version;
  private String moduleId;
  private String createdBy;
  private LocalDateTime createdOn;
  private String modifiedBy;
  private LocalDateTime modifiedOn;

  public Baseline(String name, String type, String version, String moduleId,
      String createdBy, LocalDateTime createdOn, String modifiedBy,
      LocalDateTime modifiedOn) {
    this.name = name;
    this.type = type;
    this.version = version;
    this.moduleId = moduleId;
    this.createdBy = createdBy;
    this.createdOn = createdOn;
    this.modifiedBy = modifiedBy;
    this.modifiedOn = modifiedOn;
  }

  public Baseline() {
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getModuleId() {
    return moduleId;
  }

  public void setModuleId(String moduleId) {
    this.moduleId = moduleId;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public LocalDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(LocalDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public LocalDateTime getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(LocalDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  @Override
  public String toString() {
    return "Baseline{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", type='" + type + '\'' +
        ", version='" + version + '\'' +
        ", moduleId='" + moduleId + '\'' +
        ", createdBy='" + createdBy + '\'' +
        ", createdOn=" + createdOn +
        ", modifiedBy='" + modifiedBy + '\'' +
        ", modifiedOn=" + modifiedOn +
        '}';
  }
}
