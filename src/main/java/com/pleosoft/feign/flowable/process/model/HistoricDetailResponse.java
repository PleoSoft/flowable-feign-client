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

public class HistoricDetailResponse {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("processInstanceId")
	private String processInstanceId = null;

	@JsonProperty("processInstanceUrl")
	private String processInstanceUrl = null;

	@JsonProperty("executionId")
	private String executionId = null;

	@JsonProperty("activityInstanceId")
	private String activityInstanceId = null;

	@JsonProperty("taskId")
	private String taskId = null;

	@JsonProperty("taskUrl")
	private String taskUrl = null;

	@JsonProperty("time")
	private Date time = null;

	@JsonProperty("detailType")
	private String detailType = null;

	@JsonProperty("revision")
	private Integer revision = null;

	@JsonProperty("variable")
	private RestVariable variable = null;

	@JsonProperty("propertyId")
	private String propertyId = null;

	@JsonProperty("propertyValue")
	private String propertyValue = null;

	public HistoricDetailResponse id(String id) {
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

	public HistoricDetailResponse processInstanceId(String processInstanceId) {
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

	public HistoricDetailResponse processInstanceUrl(String processInstanceUrl) {
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

	public HistoricDetailResponse executionId(String executionId) {
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

	public HistoricDetailResponse activityInstanceId(String activityInstanceId) {
		this.activityInstanceId = activityInstanceId;
		return this;
	}

	/**
	 * Get activityInstanceId
	 * 
	 * @return activityInstanceId
	 **/

	public String getActivityInstanceId() {
		return activityInstanceId;
	}

	public void setActivityInstanceId(String activityInstanceId) {
		this.activityInstanceId = activityInstanceId;
	}

	public HistoricDetailResponse taskId(String taskId) {
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

	public HistoricDetailResponse taskUrl(String taskUrl) {
		this.taskUrl = taskUrl;
		return this;
	}

	/**
	 * Get taskUrl
	 * 
	 * @return taskUrl
	 **/

	public String getTaskUrl() {
		return taskUrl;
	}

	public void setTaskUrl(String taskUrl) {
		this.taskUrl = taskUrl;
	}

	public HistoricDetailResponse time(Date time) {
		this.time = time;
		return this;
	}

	/**
	 * Get time
	 * 
	 * @return time
	 **/

	@Valid

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public HistoricDetailResponse detailType(String detailType) {
		this.detailType = detailType;
		return this;
	}

	/**
	 * Get detailType
	 * 
	 * @return detailType
	 **/

	public String getDetailType() {
		return detailType;
	}

	public void setDetailType(String detailType) {
		this.detailType = detailType;
	}

	public HistoricDetailResponse revision(Integer revision) {
		this.revision = revision;
		return this;
	}

	/**
	 * Get revision
	 * 
	 * @return revision
	 **/

	public Integer getRevision() {
		return revision;
	}

	public void setRevision(Integer revision) {
		this.revision = revision;
	}

	public HistoricDetailResponse variable(RestVariable variable) {
		this.variable = variable;
		return this;
	}

	/**
	 * Get variable
	 * 
	 * @return variable
	 **/

	@Valid

	public RestVariable getVariable() {
		return variable;
	}

	public void setVariable(RestVariable variable) {
		this.variable = variable;
	}

	public HistoricDetailResponse propertyId(String propertyId) {
		this.propertyId = propertyId;
		return this;
	}

	/**
	 * Get propertyId
	 * 
	 * @return propertyId
	 **/

	public String getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}

	public HistoricDetailResponse propertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
		return this;
	}

	/**
	 * Get propertyValue
	 * 
	 * @return propertyValue
	 **/

	public String getPropertyValue() {
		return propertyValue;
	}

	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		HistoricDetailResponse historicDetailResponse = (HistoricDetailResponse) o;
		return Objects.equals(this.id, historicDetailResponse.id)
				&& Objects.equals(this.processInstanceId, historicDetailResponse.processInstanceId)
				&& Objects.equals(this.processInstanceUrl, historicDetailResponse.processInstanceUrl)
				&& Objects.equals(this.executionId, historicDetailResponse.executionId)
				&& Objects.equals(this.activityInstanceId, historicDetailResponse.activityInstanceId)
				&& Objects.equals(this.taskId, historicDetailResponse.taskId)
				&& Objects.equals(this.taskUrl, historicDetailResponse.taskUrl)
				&& Objects.equals(this.time, historicDetailResponse.time)
				&& Objects.equals(this.detailType, historicDetailResponse.detailType)
				&& Objects.equals(this.revision, historicDetailResponse.revision)
				&& Objects.equals(this.variable, historicDetailResponse.variable)
				&& Objects.equals(this.propertyId, historicDetailResponse.propertyId)
				&& Objects.equals(this.propertyValue, historicDetailResponse.propertyValue);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, processInstanceId, processInstanceUrl, executionId, activityInstanceId, taskId, taskUrl,
				time, detailType, revision, variable, propertyId, propertyValue);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class HistoricDetailResponse {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
		sb.append("    processInstanceUrl: ").append(toIndentedString(processInstanceUrl)).append("\n");
		sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
		sb.append("    activityInstanceId: ").append(toIndentedString(activityInstanceId)).append("\n");
		sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
		sb.append("    taskUrl: ").append(toIndentedString(taskUrl)).append("\n");
		sb.append("    time: ").append(toIndentedString(time)).append("\n");
		sb.append("    detailType: ").append(toIndentedString(detailType)).append("\n");
		sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
		sb.append("    variable: ").append(toIndentedString(variable)).append("\n");
		sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
		sb.append("    propertyValue: ").append(toIndentedString(propertyValue)).append("\n");
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
