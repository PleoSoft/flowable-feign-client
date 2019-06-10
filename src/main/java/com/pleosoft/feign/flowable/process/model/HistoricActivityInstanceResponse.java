/**
 * Copyright 2019 Pleo Soft d.o.o. (pleosoft.com)

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pleosoft.feign.flowable.process.model;

import java.util.Date;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class HistoricActivityInstanceResponse {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("activityId")
	private String activityId = null;

	@JsonProperty("activityName")
	private String activityName = null;

	@JsonProperty("activityType")
	private String activityType = null;

	@JsonProperty("processDefinitionId")
	private String processDefinitionId = null;

	@JsonProperty("processDefinitionUrl")
	private String processDefinitionUrl = null;

	@JsonProperty("processInstanceId")
	private String processInstanceId = null;

	@JsonProperty("processInstanceUrl")
	private String processInstanceUrl = null;

	@JsonProperty("executionId")
	private String executionId = null;

	@JsonProperty("taskId")
	private String taskId = null;

	@JsonProperty("calledProcessInstanceId")
	private String calledProcessInstanceId = null;

	@JsonProperty("assignee")
	private String assignee = null;

	@JsonProperty("startTime")
	private Date startTime = null;

	@JsonProperty("endTime")
	private Date endTime = null;

	@JsonProperty("durationInMillis")
	private Long durationInMillis = null;

	@JsonProperty("tenantId")
	private String tenantId = null;

	public HistoricActivityInstanceResponse id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 **/

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public HistoricActivityInstanceResponse activityId(String activityId) {
		this.activityId = activityId;
		return this;
	}

	/**
	 * Get activityId
	 * 
	 * @return activityId
	 **/

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public HistoricActivityInstanceResponse activityName(String activityName) {
		this.activityName = activityName;
		return this;
	}

	/**
	 * Get activityName
	 * 
	 * @return activityName
	 **/

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public HistoricActivityInstanceResponse activityType(String activityType) {
		this.activityType = activityType;
		return this;
	}

	/**
	 * Get activityType
	 * 
	 * @return activityType
	 **/

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public HistoricActivityInstanceResponse processDefinitionId(String processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
		return this;
	}

	/**
	 * Get processDefinitionId
	 * 
	 * @return processDefinitionId
	 **/

	public String getProcessDefinitionId() {
		return processDefinitionId;
	}

	public void setProcessDefinitionId(String processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
	}

	public HistoricActivityInstanceResponse processDefinitionUrl(String processDefinitionUrl) {
		this.processDefinitionUrl = processDefinitionUrl;
		return this;
	}

	/**
	 * Get processDefinitionUrl
	 * 
	 * @return processDefinitionUrl
	 **/

	public String getProcessDefinitionUrl() {
		return processDefinitionUrl;
	}

	public void setProcessDefinitionUrl(String processDefinitionUrl) {
		this.processDefinitionUrl = processDefinitionUrl;
	}

	public HistoricActivityInstanceResponse processInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
		return this;
	}

	/**
	 * Get processInstanceId
	 * 
	 * @return processInstanceId
	 **/

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public HistoricActivityInstanceResponse processInstanceUrl(String processInstanceUrl) {
		this.processInstanceUrl = processInstanceUrl;
		return this;
	}

	/**
	 * Get processInstanceUrl
	 * 
	 * @return processInstanceUrl
	 **/

	public String getProcessInstanceUrl() {
		return processInstanceUrl;
	}

	public void setProcessInstanceUrl(String processInstanceUrl) {
		this.processInstanceUrl = processInstanceUrl;
	}

	public HistoricActivityInstanceResponse executionId(String executionId) {
		this.executionId = executionId;
		return this;
	}

	/**
	 * Get executionId
	 * 
	 * @return executionId
	 **/

	public String getExecutionId() {
		return executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}

	public HistoricActivityInstanceResponse taskId(String taskId) {
		this.taskId = taskId;
		return this;
	}

	/**
	 * Get taskId
	 * 
	 * @return taskId
	 **/

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public HistoricActivityInstanceResponse calledProcessInstanceId(String calledProcessInstanceId) {
		this.calledProcessInstanceId = calledProcessInstanceId;
		return this;
	}

	/**
	 * Get calledProcessInstanceId
	 * 
	 * @return calledProcessInstanceId
	 **/

	public String getCalledProcessInstanceId() {
		return calledProcessInstanceId;
	}

	public void setCalledProcessInstanceId(String calledProcessInstanceId) {
		this.calledProcessInstanceId = calledProcessInstanceId;
	}

	public HistoricActivityInstanceResponse assignee(String assignee) {
		this.assignee = assignee;
		return this;
	}

	/**
	 * Get assignee
	 * 
	 * @return assignee
	 **/

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public HistoricActivityInstanceResponse startTime(Date startTime) {
		this.startTime = startTime;
		return this;
	}

	/**
	 * Get startTime
	 * 
	 * @return startTime
	 **/

	@Valid

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public HistoricActivityInstanceResponse endTime(Date endTime) {
		this.endTime = endTime;
		return this;
	}

	/**
	 * Get endTime
	 * 
	 * @return endTime
	 **/

	@Valid

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public HistoricActivityInstanceResponse durationInMillis(Long durationInMillis) {
		this.durationInMillis = durationInMillis;
		return this;
	}

	/**
	 * Get durationInMillis
	 * 
	 * @return durationInMillis
	 **/

	public Long getDurationInMillis() {
		return durationInMillis;
	}

	public void setDurationInMillis(Long durationInMillis) {
		this.durationInMillis = durationInMillis;
	}

	public HistoricActivityInstanceResponse tenantId(String tenantId) {
		this.tenantId = tenantId;
		return this;
	}

	/**
	 * Get tenantId
	 * 
	 * @return tenantId
	 **/

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		HistoricActivityInstanceResponse historicActivityInstanceResponse = (HistoricActivityInstanceResponse) o;
		return Objects.equals(this.id, historicActivityInstanceResponse.id)
				&& Objects.equals(this.activityId, historicActivityInstanceResponse.activityId)
				&& Objects.equals(this.activityName, historicActivityInstanceResponse.activityName)
				&& Objects.equals(this.activityType, historicActivityInstanceResponse.activityType)
				&& Objects.equals(this.processDefinitionId, historicActivityInstanceResponse.processDefinitionId)
				&& Objects.equals(this.processDefinitionUrl, historicActivityInstanceResponse.processDefinitionUrl)
				&& Objects.equals(this.processInstanceId, historicActivityInstanceResponse.processInstanceId)
				&& Objects.equals(this.processInstanceUrl, historicActivityInstanceResponse.processInstanceUrl)
				&& Objects.equals(this.executionId, historicActivityInstanceResponse.executionId)
				&& Objects.equals(this.taskId, historicActivityInstanceResponse.taskId)
				&& Objects.equals(this.calledProcessInstanceId,
						historicActivityInstanceResponse.calledProcessInstanceId)
				&& Objects.equals(this.assignee, historicActivityInstanceResponse.assignee)
				&& Objects.equals(this.startTime, historicActivityInstanceResponse.startTime)
				&& Objects.equals(this.endTime, historicActivityInstanceResponse.endTime)
				&& Objects.equals(this.durationInMillis, historicActivityInstanceResponse.durationInMillis)
				&& Objects.equals(this.tenantId, historicActivityInstanceResponse.tenantId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, activityId, activityName, activityType, processDefinitionId, processDefinitionUrl,
				processInstanceId, processInstanceUrl, executionId, taskId, calledProcessInstanceId, assignee,
				startTime, endTime, durationInMillis, tenantId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class HistoricActivityInstanceResponse {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
		sb.append("    activityName: ").append(toIndentedString(activityName)).append("\n");
		sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
		sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
		sb.append("    processDefinitionUrl: ").append(toIndentedString(processDefinitionUrl)).append("\n");
		sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
		sb.append("    processInstanceUrl: ").append(toIndentedString(processInstanceUrl)).append("\n");
		sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
		sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
		sb.append("    calledProcessInstanceId: ").append(toIndentedString(calledProcessInstanceId)).append("\n");
		sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
		sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
		sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
		sb.append("    durationInMillis: ").append(toIndentedString(durationInMillis)).append("\n");
		sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
