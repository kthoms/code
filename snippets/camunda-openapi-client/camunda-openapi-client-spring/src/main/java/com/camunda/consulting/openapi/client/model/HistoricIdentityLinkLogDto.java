/*
 * Camunda Platform REST API
 * OpenApi Spec for Camunda Platform REST API.
 *
 * The version of the OpenAPI document: 7.16.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.camunda.consulting.openapi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * HistoricIdentityLinkLogDto
 */
@JsonPropertyOrder({
  HistoricIdentityLinkLogDto.JSON_PROPERTY_ID,
  HistoricIdentityLinkLogDto.JSON_PROPERTY_TIME,
  HistoricIdentityLinkLogDto.JSON_PROPERTY_TYPE,
  HistoricIdentityLinkLogDto.JSON_PROPERTY_USER_ID,
  HistoricIdentityLinkLogDto.JSON_PROPERTY_GROUP_ID,
  HistoricIdentityLinkLogDto.JSON_PROPERTY_TASK_ID,
  HistoricIdentityLinkLogDto.JSON_PROPERTY_PROCESS_DEFINITION_ID,
  HistoricIdentityLinkLogDto.JSON_PROPERTY_PROCESS_DEFINITION_KEY,
  HistoricIdentityLinkLogDto.JSON_PROPERTY_OPERATION_TYPE,
  HistoricIdentityLinkLogDto.JSON_PROPERTY_ASSIGNER_ID,
  HistoricIdentityLinkLogDto.JSON_PROPERTY_TENANT_ID,
  HistoricIdentityLinkLogDto.JSON_PROPERTY_REMOVAL_TIME,
  HistoricIdentityLinkLogDto.JSON_PROPERTY_ROOT_PROCESS_INSTANCE_ID
})
@JsonTypeName("HistoricIdentityLinkLogDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-19T11:53:20.948992+01:00[Europe/Berlin]")
public class HistoricIdentityLinkLogDto {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TIME = "time";
  private OffsetDateTime time;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  private String userId;

  public static final String JSON_PROPERTY_GROUP_ID = "groupId";
  private String groupId;

  public static final String JSON_PROPERTY_TASK_ID = "taskId";
  private String taskId;

  public static final String JSON_PROPERTY_PROCESS_DEFINITION_ID = "processDefinitionId";
  private String processDefinitionId;

  public static final String JSON_PROPERTY_PROCESS_DEFINITION_KEY = "processDefinitionKey";
  private String processDefinitionKey;

  public static final String JSON_PROPERTY_OPERATION_TYPE = "operationType";
  private String operationType;

  public static final String JSON_PROPERTY_ASSIGNER_ID = "assignerId";
  private String assignerId;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private String tenantId;

  public static final String JSON_PROPERTY_REMOVAL_TIME = "removalTime";
  private OffsetDateTime removalTime;

  public static final String JSON_PROPERTY_ROOT_PROCESS_INSTANCE_ID = "rootProcessInstanceId";
  private String rootProcessInstanceId;


  public HistoricIdentityLinkLogDto id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id of the Historic identity link entry.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the Historic identity link entry.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public HistoricIdentityLinkLogDto time(OffsetDateTime time) {
    
    this.time = time;
    return this;
  }

   /**
   * The time when the identity link is logged.  [Default format](https://docs.camunda.org/manual/7.16/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time when the identity link is logged.  [Default format](https://docs.camunda.org/manual/7.16/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTime() {
    return time;
  }


  public void setTime(OffsetDateTime time) {
    this.time = time;
  }


  public HistoricIdentityLinkLogDto type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of identity link (candidate/assignee/owner).
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of identity link (candidate/assignee/owner).")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public HistoricIdentityLinkLogDto userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The id of the user/assignee.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the user/assignee.")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public HistoricIdentityLinkLogDto groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * The id of the group.
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the group.")
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public HistoricIdentityLinkLogDto taskId(String taskId) {
    
    this.taskId = taskId;
    return this;
  }

   /**
   * The id of the task.
   * @return taskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the task.")
  @JsonProperty(JSON_PROPERTY_TASK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaskId() {
    return taskId;
  }


  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }


  public HistoricIdentityLinkLogDto processDefinitionId(String processDefinitionId) {
    
    this.processDefinitionId = processDefinitionId;
    return this;
  }

   /**
   * The id of the process definition.
   * @return processDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the process definition.")
  @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProcessDefinitionId() {
    return processDefinitionId;
  }


  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }


  public HistoricIdentityLinkLogDto processDefinitionKey(String processDefinitionKey) {
    
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

   /**
   * The key of the process definition.
   * @return processDefinitionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the process definition.")
  @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }


  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }


  public HistoricIdentityLinkLogDto operationType(String operationType) {
    
    this.operationType = operationType;
    return this;
  }

   /**
   * Type of operation (add/delete).
   * @return operationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of operation (add/delete).")
  @JsonProperty(JSON_PROPERTY_OPERATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOperationType() {
    return operationType;
  }


  public void setOperationType(String operationType) {
    this.operationType = operationType;
  }


  public HistoricIdentityLinkLogDto assignerId(String assignerId) {
    
    this.assignerId = assignerId;
    return this;
  }

   /**
   * The id of the assigner.
   * @return assignerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the assigner.")
  @JsonProperty(JSON_PROPERTY_ASSIGNER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAssignerId() {
    return assignerId;
  }


  public void setAssignerId(String assignerId) {
    this.assignerId = assignerId;
  }


  public HistoricIdentityLinkLogDto tenantId(String tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * The id of the tenant.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the tenant.")
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTenantId() {
    return tenantId;
  }


  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public HistoricIdentityLinkLogDto removalTime(OffsetDateTime removalTime) {
    
    this.removalTime = removalTime;
    return this;
  }

   /**
   * The time after which the identity link should be removed by the History Cleanup job.  [Default format](https://docs.camunda.org/manual/7.16/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
   * @return removalTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time after which the identity link should be removed by the History Cleanup job.  [Default format](https://docs.camunda.org/manual/7.16/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
  @JsonProperty(JSON_PROPERTY_REMOVAL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getRemovalTime() {
    return removalTime;
  }


  public void setRemovalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
  }


  public HistoricIdentityLinkLogDto rootProcessInstanceId(String rootProcessInstanceId) {
    
    this.rootProcessInstanceId = rootProcessInstanceId;
    return this;
  }

   /**
   * The process instance id of the root process instance that initiated the process containing this identity link.
   * @return rootProcessInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The process instance id of the root process instance that initiated the process containing this identity link.")
  @JsonProperty(JSON_PROPERTY_ROOT_PROCESS_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRootProcessInstanceId() {
    return rootProcessInstanceId;
  }


  public void setRootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricIdentityLinkLogDto historicIdentityLinkLogDto = (HistoricIdentityLinkLogDto) o;
    return Objects.equals(this.id, historicIdentityLinkLogDto.id) &&
        Objects.equals(this.time, historicIdentityLinkLogDto.time) &&
        Objects.equals(this.type, historicIdentityLinkLogDto.type) &&
        Objects.equals(this.userId, historicIdentityLinkLogDto.userId) &&
        Objects.equals(this.groupId, historicIdentityLinkLogDto.groupId) &&
        Objects.equals(this.taskId, historicIdentityLinkLogDto.taskId) &&
        Objects.equals(this.processDefinitionId, historicIdentityLinkLogDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, historicIdentityLinkLogDto.processDefinitionKey) &&
        Objects.equals(this.operationType, historicIdentityLinkLogDto.operationType) &&
        Objects.equals(this.assignerId, historicIdentityLinkLogDto.assignerId) &&
        Objects.equals(this.tenantId, historicIdentityLinkLogDto.tenantId) &&
        Objects.equals(this.removalTime, historicIdentityLinkLogDto.removalTime) &&
        Objects.equals(this.rootProcessInstanceId, historicIdentityLinkLogDto.rootProcessInstanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, time, type, userId, groupId, taskId, processDefinitionId, processDefinitionKey, operationType, assignerId, tenantId, removalTime, rootProcessInstanceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricIdentityLinkLogDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    assignerId: ").append(toIndentedString(assignerId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    removalTime: ").append(toIndentedString(removalTime)).append("\n");
    sb.append("    rootProcessInstanceId: ").append(toIndentedString(rootProcessInstanceId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
