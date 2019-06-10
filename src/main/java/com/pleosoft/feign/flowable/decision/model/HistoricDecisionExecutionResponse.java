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

package com.pleosoft.feign.flowable.decision.model;

import java.util.Date;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class HistoricDecisionExecutionResponse {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("url")
	private String url = null;

	@JsonProperty("decisionDefinitionId")
	private String decisionDefinitionId = null;

	@JsonProperty("deploymentId")
	private String deploymentId = null;

	@JsonProperty("activityId")
	private String activityId = null;

	@JsonProperty("executionId")
	private String executionId = null;

	@JsonProperty("instanceId")
	private String instanceId = null;

	@JsonProperty("failed")
	private Boolean failed = null;

	@JsonProperty("startTime")
	private Date startTime = null;

	@JsonProperty("endTime")
	private Date endTime = null;

	@JsonProperty("tenantId")
	private String tenantId = null;

	public HistoricDecisionExecutionResponse id(String id) {
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

	public HistoricDecisionExecutionResponse url(String url) {
		this.url = url;
		return this;
	}

	/**
	 * Get url
	 * 
	 * @return url
	 **/

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public HistoricDecisionExecutionResponse decisionDefinitionId(String decisionDefinitionId) {
		this.decisionDefinitionId = decisionDefinitionId;
		return this;
	}

	/**
	 * Get decisionDefinitionId
	 * 
	 * @return decisionDefinitionId
	 **/

	public String getDecisionDefinitionId() {
		return decisionDefinitionId;
	}

	public void setDecisionDefinitionId(String decisionDefinitionId) {
		this.decisionDefinitionId = decisionDefinitionId;
	}

	public HistoricDecisionExecutionResponse deploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
		return this;
	}

	/**
	 * Get deploymentId
	 * 
	 * @return deploymentId
	 **/

	public String getDeploymentId() {
		return deploymentId;
	}

	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
	}

	public HistoricDecisionExecutionResponse activityId(String activityId) {
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

	public HistoricDecisionExecutionResponse executionId(String executionId) {
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

	public HistoricDecisionExecutionResponse instanceId(String instanceId) {
		this.instanceId = instanceId;
		return this;
	}

	/**
	 * Get instanceId
	 * 
	 * @return instanceId
	 **/

	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public HistoricDecisionExecutionResponse failed(Boolean failed) {
		this.failed = failed;
		return this;
	}

	/**
	 * Get failed
	 * 
	 * @return failed
	 **/

	public Boolean isFailed() {
		return failed;
	}

	public void setFailed(Boolean failed) {
		this.failed = failed;
	}

	public HistoricDecisionExecutionResponse startTime(Date startTime) {
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

	public HistoricDecisionExecutionResponse endTime(Date endTime) {
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

	public HistoricDecisionExecutionResponse tenantId(String tenantId) {
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
		HistoricDecisionExecutionResponse historicDecisionExecutionResponse = (HistoricDecisionExecutionResponse) o;
		return Objects.equals(this.id, historicDecisionExecutionResponse.id)
				&& Objects.equals(this.url, historicDecisionExecutionResponse.url)
				&& Objects.equals(this.decisionDefinitionId, historicDecisionExecutionResponse.decisionDefinitionId)
				&& Objects.equals(this.deploymentId, historicDecisionExecutionResponse.deploymentId)
				&& Objects.equals(this.activityId, historicDecisionExecutionResponse.activityId)
				&& Objects.equals(this.executionId, historicDecisionExecutionResponse.executionId)
				&& Objects.equals(this.instanceId, historicDecisionExecutionResponse.instanceId)
				&& Objects.equals(this.failed, historicDecisionExecutionResponse.failed)
				&& Objects.equals(this.startTime, historicDecisionExecutionResponse.startTime)
				&& Objects.equals(this.endTime, historicDecisionExecutionResponse.endTime)
				&& Objects.equals(this.tenantId, historicDecisionExecutionResponse.tenantId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, url, decisionDefinitionId, deploymentId, activityId, executionId, instanceId, failed,
				startTime, endTime, tenantId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class HistoricDecisionExecutionResponse {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    decisionDefinitionId: ").append(toIndentedString(decisionDefinitionId)).append("\n");
		sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
		sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
		sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
		sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
		sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
		sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
		sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
