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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class SubmitFormRequest {
	@JsonProperty("action")
	private String action = null;

	@JsonProperty("processDefinitionId")
	private String processDefinitionId = null;

	@JsonProperty("taskId")
	private String taskId = null;

	@JsonProperty("businessKey")
	private String businessKey = null;

	@JsonProperty("properties")
	@Valid
	private List<RestFormProperty> properties = null;

	public SubmitFormRequest action(String action) {
		this.action = action;
		return this;
	}

	/**
	 * Get action
	 * 
	 * @return action
	 **/

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public SubmitFormRequest processDefinitionId(String processDefinitionId) {
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

	public SubmitFormRequest taskId(String taskId) {
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

	public SubmitFormRequest businessKey(String businessKey) {
		this.businessKey = businessKey;
		return this;
	}

	/**
	 * Get businessKey
	 * 
	 * @return businessKey
	 **/

	public String getBusinessKey() {
		return businessKey;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	public SubmitFormRequest properties(List<RestFormProperty> properties) {
		this.properties = properties;
		return this;
	}

	public SubmitFormRequest addPropertiesItem(RestFormProperty propertiesItem) {
		if (this.properties == null) {
			this.properties = new ArrayList<RestFormProperty>();
		}
		this.properties.add(propertiesItem);
		return this;
	}

	/**
	 * Get properties
	 * 
	 * @return properties
	 **/

	@Valid

	public List<RestFormProperty> getProperties() {
		return properties;
	}

	public void setProperties(List<RestFormProperty> properties) {
		this.properties = properties;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SubmitFormRequest submitFormRequest = (SubmitFormRequest) o;
		return Objects.equals(this.action, submitFormRequest.action)
				&& Objects.equals(this.processDefinitionId, submitFormRequest.processDefinitionId)
				&& Objects.equals(this.taskId, submitFormRequest.taskId)
				&& Objects.equals(this.businessKey, submitFormRequest.businessKey)
				&& Objects.equals(this.properties, submitFormRequest.properties);
	}

	@Override
	public int hashCode() {
		return Objects.hash(action, processDefinitionId, taskId, businessKey, properties);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubmitFormRequest {\n");

		sb.append("    action: ").append(toIndentedString(action)).append("\n");
		sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
		sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
		sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
		sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
