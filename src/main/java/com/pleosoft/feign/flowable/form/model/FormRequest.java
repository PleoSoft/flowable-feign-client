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

package com.pleosoft.feign.flowable.form.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class FormRequest {
	@JsonProperty("formInstanceId")
	private String formInstanceId = null;

	@JsonProperty("formDefinitionId")
	private String formDefinitionId = null;

	@JsonProperty("formDefinitionKey")
	private String formDefinitionKey = null;

	@JsonProperty("taskId")
	private String taskId = null;

	@JsonProperty("processInstanceId")
	private String processInstanceId = null;

	@JsonProperty("processDefinitionId")
	private String processDefinitionId = null;

	@JsonProperty("scopeId")
	private String scopeId = null;

	@JsonProperty("scopeType")
	private String scopeType = null;

	@JsonProperty("scopeDefinitionId")
	private String scopeDefinitionId = null;

	@JsonProperty("tenantId")
	private String tenantId = null;

	@JsonProperty("parentDeploymentId")
	private String parentDeploymentId = null;

	@JsonProperty("variables")
	@Valid
	private Map<String, Object> variables = null;

	public FormRequest formInstanceId(String formInstanceId) {
		this.formInstanceId = formInstanceId;
		return this;
	}

	/**
	 * Get formInstanceId
	 * 
	 * @return formInstanceId
	 **/

	public String getFormInstanceId() {
		return formInstanceId;
	}

	public void setFormInstanceId(String formInstanceId) {
		this.formInstanceId = formInstanceId;
	}

	public FormRequest formDefinitionId(String formDefinitionId) {
		this.formDefinitionId = formDefinitionId;
		return this;
	}

	/**
	 * Get formDefinitionId
	 * 
	 * @return formDefinitionId
	 **/

	public String getFormDefinitionId() {
		return formDefinitionId;
	}

	public void setFormDefinitionId(String formDefinitionId) {
		this.formDefinitionId = formDefinitionId;
	}

	public FormRequest formDefinitionKey(String formDefinitionKey) {
		this.formDefinitionKey = formDefinitionKey;
		return this;
	}

	/**
	 * Get formDefinitionKey
	 * 
	 * @return formDefinitionKey
	 **/

	public String getFormDefinitionKey() {
		return formDefinitionKey;
	}

	public void setFormDefinitionKey(String formDefinitionKey) {
		this.formDefinitionKey = formDefinitionKey;
	}

	public FormRequest taskId(String taskId) {
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

	public FormRequest processInstanceId(String processInstanceId) {
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

	public FormRequest processDefinitionId(String processDefinitionId) {
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

	public FormRequest scopeId(String scopeId) {
		this.scopeId = scopeId;
		return this;
	}

	/**
	 * Get scopeId
	 * 
	 * @return scopeId
	 **/

	public String getScopeId() {
		return scopeId;
	}

	public void setScopeId(String scopeId) {
		this.scopeId = scopeId;
	}

	public FormRequest scopeType(String scopeType) {
		this.scopeType = scopeType;
		return this;
	}

	/**
	 * Get scopeType
	 * 
	 * @return scopeType
	 **/

	public String getScopeType() {
		return scopeType;
	}

	public void setScopeType(String scopeType) {
		this.scopeType = scopeType;
	}

	public FormRequest scopeDefinitionId(String scopeDefinitionId) {
		this.scopeDefinitionId = scopeDefinitionId;
		return this;
	}

	/**
	 * Get scopeDefinitionId
	 * 
	 * @return scopeDefinitionId
	 **/

	public String getScopeDefinitionId() {
		return scopeDefinitionId;
	}

	public void setScopeDefinitionId(String scopeDefinitionId) {
		this.scopeDefinitionId = scopeDefinitionId;
	}

	public FormRequest tenantId(String tenantId) {
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

	public FormRequest parentDeploymentId(String parentDeploymentId) {
		this.parentDeploymentId = parentDeploymentId;
		return this;
	}

	/**
	 * Get parentDeploymentId
	 * 
	 * @return parentDeploymentId
	 **/

	public String getParentDeploymentId() {
		return parentDeploymentId;
	}

	public void setParentDeploymentId(String parentDeploymentId) {
		this.parentDeploymentId = parentDeploymentId;
	}

	public FormRequest variables(Map<String, Object> variables) {
		this.variables = variables;
		return this;
	}

	public FormRequest putVariablesItem(String key, Object variablesItem) {
		if (this.variables == null) {
			this.variables = new HashMap<String, Object>();
		}
		this.variables.put(key, variablesItem);
		return this;
	}

	/**
	 * Get variables
	 * 
	 * @return variables
	 **/

	public Map<String, Object> getVariables() {
		return variables;
	}

	public void setVariables(Map<String, Object> variables) {
		this.variables = variables;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FormRequest formRequest = (FormRequest) o;
		return Objects.equals(this.formInstanceId, formRequest.formInstanceId)
				&& Objects.equals(this.formDefinitionId, formRequest.formDefinitionId)
				&& Objects.equals(this.formDefinitionKey, formRequest.formDefinitionKey)
				&& Objects.equals(this.taskId, formRequest.taskId)
				&& Objects.equals(this.processInstanceId, formRequest.processInstanceId)
				&& Objects.equals(this.processDefinitionId, formRequest.processDefinitionId)
				&& Objects.equals(this.scopeId, formRequest.scopeId)
				&& Objects.equals(this.scopeType, formRequest.scopeType)
				&& Objects.equals(this.scopeDefinitionId, formRequest.scopeDefinitionId)
				&& Objects.equals(this.tenantId, formRequest.tenantId)
				&& Objects.equals(this.parentDeploymentId, formRequest.parentDeploymentId)
				&& Objects.equals(this.variables, formRequest.variables);
	}

	@Override
	public int hashCode() {
		return Objects.hash(formInstanceId, formDefinitionId, formDefinitionKey, taskId, processInstanceId,
				processDefinitionId, scopeId, scopeType, scopeDefinitionId, tenantId, parentDeploymentId, variables);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FormRequest {\n");

		sb.append("    formInstanceId: ").append(toIndentedString(formInstanceId)).append("\n");
		sb.append("    formDefinitionId: ").append(toIndentedString(formDefinitionId)).append("\n");
		sb.append("    formDefinitionKey: ").append(toIndentedString(formDefinitionKey)).append("\n");
		sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
		sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
		sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
		sb.append("    scopeId: ").append(toIndentedString(scopeId)).append("\n");
		sb.append("    scopeType: ").append(toIndentedString(scopeType)).append("\n");
		sb.append("    scopeDefinitionId: ").append(toIndentedString(scopeDefinitionId)).append("\n");
		sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
		sb.append("    parentDeploymentId: ").append(toIndentedString(parentDeploymentId)).append("\n");
		sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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
