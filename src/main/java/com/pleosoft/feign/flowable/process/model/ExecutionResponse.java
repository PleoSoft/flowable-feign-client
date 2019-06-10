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

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class ExecutionResponse {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("url")
	private String url = null;

	@JsonProperty("parentId")
	private String parentId = null;

	@JsonProperty("parentUrl")
	private String parentUrl = null;

	@JsonProperty("superExecutionId")
	private String superExecutionId = null;

	@JsonProperty("superExecutionUrl")
	private String superExecutionUrl = null;

	@JsonProperty("processInstanceId")
	private String processInstanceId = null;

	@JsonProperty("processInstanceUrl")
	private String processInstanceUrl = null;

	@JsonProperty("suspended")
	private Boolean suspended = null;

	@JsonProperty("activityId")
	private String activityId = null;

	@JsonProperty("tenantId")
	private String tenantId = null;

	public ExecutionResponse id(String id) {
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

	public ExecutionResponse url(String url) {
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

	public ExecutionResponse parentId(String parentId) {
		this.parentId = parentId;
		return this;
	}

	/**
	 * Get parentId
	 * 
	 * @return parentId
	 **/

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public ExecutionResponse parentUrl(String parentUrl) {
		this.parentUrl = parentUrl;
		return this;
	}

	/**
	 * Get parentUrl
	 * 
	 * @return parentUrl
	 **/

	public String getParentUrl() {
		return parentUrl;
	}

	public void setParentUrl(String parentUrl) {
		this.parentUrl = parentUrl;
	}

	public ExecutionResponse superExecutionId(String superExecutionId) {
		this.superExecutionId = superExecutionId;
		return this;
	}

	/**
	 * Get superExecutionId
	 * 
	 * @return superExecutionId
	 **/

	public String getSuperExecutionId() {
		return superExecutionId;
	}

	public void setSuperExecutionId(String superExecutionId) {
		this.superExecutionId = superExecutionId;
	}

	public ExecutionResponse superExecutionUrl(String superExecutionUrl) {
		this.superExecutionUrl = superExecutionUrl;
		return this;
	}

	/**
	 * Get superExecutionUrl
	 * 
	 * @return superExecutionUrl
	 **/

	public String getSuperExecutionUrl() {
		return superExecutionUrl;
	}

	public void setSuperExecutionUrl(String superExecutionUrl) {
		this.superExecutionUrl = superExecutionUrl;
	}

	public ExecutionResponse processInstanceId(String processInstanceId) {
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

	public ExecutionResponse processInstanceUrl(String processInstanceUrl) {
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

	public ExecutionResponse suspended(Boolean suspended) {
		this.suspended = suspended;
		return this;
	}

	/**
	 * Get suspended
	 * 
	 * @return suspended
	 **/

	public Boolean isSuspended() {
		return suspended;
	}

	public void setSuspended(Boolean suspended) {
		this.suspended = suspended;
	}

	public ExecutionResponse activityId(String activityId) {
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

	public ExecutionResponse tenantId(String tenantId) {
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
		ExecutionResponse executionResponse = (ExecutionResponse) o;
		return Objects.equals(this.id, executionResponse.id) && Objects.equals(this.url, executionResponse.url)
				&& Objects.equals(this.parentId, executionResponse.parentId)
				&& Objects.equals(this.parentUrl, executionResponse.parentUrl)
				&& Objects.equals(this.superExecutionId, executionResponse.superExecutionId)
				&& Objects.equals(this.superExecutionUrl, executionResponse.superExecutionUrl)
				&& Objects.equals(this.processInstanceId, executionResponse.processInstanceId)
				&& Objects.equals(this.processInstanceUrl, executionResponse.processInstanceUrl)
				&& Objects.equals(this.suspended, executionResponse.suspended)
				&& Objects.equals(this.activityId, executionResponse.activityId)
				&& Objects.equals(this.tenantId, executionResponse.tenantId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, url, parentId, parentUrl, superExecutionId, superExecutionUrl, processInstanceId,
				processInstanceUrl, suspended, activityId, tenantId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExecutionResponse {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
		sb.append("    parentUrl: ").append(toIndentedString(parentUrl)).append("\n");
		sb.append("    superExecutionId: ").append(toIndentedString(superExecutionId)).append("\n");
		sb.append("    superExecutionUrl: ").append(toIndentedString(superExecutionUrl)).append("\n");
		sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
		sb.append("    processInstanceUrl: ").append(toIndentedString(processInstanceUrl)).append("\n");
		sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
		sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
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
