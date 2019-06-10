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

public class EventSubscriptionResponse {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("url")
	private String url = null;

	@JsonProperty("eventType")
	private String eventType = null;

	@JsonProperty("eventName")
	private String eventName = null;

	@JsonProperty("activityId")
	private String activityId = null;

	@JsonProperty("executionId")
	private String executionId = null;

	@JsonProperty("executionUrl")
	private String executionUrl = null;

	@JsonProperty("processInstanceId")
	private String processInstanceId = null;

	@JsonProperty("processInstanceUrl")
	private String processInstanceUrl = null;

	@JsonProperty("processDefinitionId")
	private String processDefinitionId = null;

	@JsonProperty("processDefinitionUrl")
	private String processDefinitionUrl = null;

	@JsonProperty("created")
	private Date created = null;

	@JsonProperty("configuration")
	private String _configuration = null;

	@JsonProperty("tenantId")
	private String tenantId = null;

	public EventSubscriptionResponse id(String id) {
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

	public EventSubscriptionResponse url(String url) {
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

	public EventSubscriptionResponse eventType(String eventType) {
		this.eventType = eventType;
		return this;
	}

	/**
	 * Get eventType
	 * 
	 * @return eventType
	 **/

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public EventSubscriptionResponse eventName(String eventName) {
		this.eventName = eventName;
		return this;
	}

	/**
	 * Get eventName
	 * 
	 * @return eventName
	 **/

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public EventSubscriptionResponse activityId(String activityId) {
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

	public EventSubscriptionResponse executionId(String executionId) {
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

	public EventSubscriptionResponse executionUrl(String executionUrl) {
		this.executionUrl = executionUrl;
		return this;
	}

	/**
	 * Get executionUrl
	 * 
	 * @return executionUrl
	 **/

	public String getExecutionUrl() {
		return executionUrl;
	}

	public void setExecutionUrl(String executionUrl) {
		this.executionUrl = executionUrl;
	}

	public EventSubscriptionResponse processInstanceId(String processInstanceId) {
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

	public EventSubscriptionResponse processInstanceUrl(String processInstanceUrl) {
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

	public EventSubscriptionResponse processDefinitionId(String processDefinitionId) {
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

	public EventSubscriptionResponse processDefinitionUrl(String processDefinitionUrl) {
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

	public EventSubscriptionResponse created(Date created) {
		this.created = created;
		return this;
	}

	/**
	 * Get created
	 * 
	 * @return created
	 **/

	@Valid

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public EventSubscriptionResponse _configuration(String _configuration) {
		this._configuration = _configuration;
		return this;
	}

	/**
	 * Get _configuration
	 * 
	 * @return _configuration
	 **/

	public String getConfiguration() {
		return _configuration;
	}

	public void setConfiguration(String _configuration) {
		this._configuration = _configuration;
	}

	public EventSubscriptionResponse tenantId(String tenantId) {
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
		EventSubscriptionResponse eventSubscriptionResponse = (EventSubscriptionResponse) o;
		return Objects.equals(this.id, eventSubscriptionResponse.id)
				&& Objects.equals(this.url, eventSubscriptionResponse.url)
				&& Objects.equals(this.eventType, eventSubscriptionResponse.eventType)
				&& Objects.equals(this.eventName, eventSubscriptionResponse.eventName)
				&& Objects.equals(this.activityId, eventSubscriptionResponse.activityId)
				&& Objects.equals(this.executionId, eventSubscriptionResponse.executionId)
				&& Objects.equals(this.executionUrl, eventSubscriptionResponse.executionUrl)
				&& Objects.equals(this.processInstanceId, eventSubscriptionResponse.processInstanceId)
				&& Objects.equals(this.processInstanceUrl, eventSubscriptionResponse.processInstanceUrl)
				&& Objects.equals(this.processDefinitionId, eventSubscriptionResponse.processDefinitionId)
				&& Objects.equals(this.processDefinitionUrl, eventSubscriptionResponse.processDefinitionUrl)
				&& Objects.equals(this.created, eventSubscriptionResponse.created)
				&& Objects.equals(this._configuration, eventSubscriptionResponse._configuration)
				&& Objects.equals(this.tenantId, eventSubscriptionResponse.tenantId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, url, eventType, eventName, activityId, executionId, executionUrl, processInstanceId,
				processInstanceUrl, processDefinitionId, processDefinitionUrl, created, _configuration, tenantId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EventSubscriptionResponse {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
		sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
		sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
		sb.append("    executionUrl: ").append(toIndentedString(executionUrl)).append("\n");
		sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
		sb.append("    processInstanceUrl: ").append(toIndentedString(processInstanceUrl)).append("\n");
		sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
		sb.append("    processDefinitionUrl: ").append(toIndentedString(processDefinitionUrl)).append("\n");
		sb.append("    created: ").append(toIndentedString(created)).append("\n");
		sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
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
