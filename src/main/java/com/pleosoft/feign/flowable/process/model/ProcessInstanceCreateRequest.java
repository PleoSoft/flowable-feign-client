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

public class ProcessInstanceCreateRequest {
	@JsonProperty("processDefinitionId")
	private String processDefinitionId = null;

	@JsonProperty("processDefinitionKey")
	private String processDefinitionKey = null;

	@JsonProperty("message")
	private String message = null;

	@JsonProperty("businessKey")
	private String businessKey = null;

	@JsonProperty("variables")
	@Valid
	private List<RestVariable> variables = null;

	@JsonProperty("transientVariables")
	@Valid
	private List<RestVariable> transientVariables = null;

	@JsonProperty("tenantId")
	private String tenantId = null;

	@JsonProperty("returnVariables")
	private Boolean returnVariables = null;

	public ProcessInstanceCreateRequest processDefinitionId(String processDefinitionId) {
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

	public ProcessInstanceCreateRequest processDefinitionKey(String processDefinitionKey) {
		this.processDefinitionKey = processDefinitionKey;
		return this;
	}

	/**
	 * Get processDefinitionKey
	 * 
	 * @return processDefinitionKey
	 **/

	public String getProcessDefinitionKey() {
		return processDefinitionKey;
	}

	public void setProcessDefinitionKey(String processDefinitionKey) {
		this.processDefinitionKey = processDefinitionKey;
	}

	public ProcessInstanceCreateRequest message(String message) {
		this.message = message;
		return this;
	}

	/**
	 * Get message
	 * 
	 * @return message
	 **/

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ProcessInstanceCreateRequest businessKey(String businessKey) {
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

	public ProcessInstanceCreateRequest variables(List<RestVariable> variables) {
		this.variables = variables;
		return this;
	}

	public ProcessInstanceCreateRequest addVariablesItem(RestVariable variablesItem) {
		if (this.variables == null) {
			this.variables = new ArrayList<RestVariable>();
		}
		this.variables.add(variablesItem);
		return this;
	}

	/**
	 * Get variables
	 * 
	 * @return variables
	 **/

	@Valid

	public List<RestVariable> getVariables() {
		return variables;
	}

	public void setVariables(List<RestVariable> variables) {
		this.variables = variables;
	}

	public ProcessInstanceCreateRequest transientVariables(List<RestVariable> transientVariables) {
		this.transientVariables = transientVariables;
		return this;
	}

	public ProcessInstanceCreateRequest addTransientVariablesItem(RestVariable transientVariablesItem) {
		if (this.transientVariables == null) {
			this.transientVariables = new ArrayList<RestVariable>();
		}
		this.transientVariables.add(transientVariablesItem);
		return this;
	}

	/**
	 * Get transientVariables
	 * 
	 * @return transientVariables
	 **/

	@Valid

	public List<RestVariable> getTransientVariables() {
		return transientVariables;
	}

	public void setTransientVariables(List<RestVariable> transientVariables) {
		this.transientVariables = transientVariables;
	}

	public ProcessInstanceCreateRequest tenantId(String tenantId) {
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

	public ProcessInstanceCreateRequest returnVariables(Boolean returnVariables) {
		this.returnVariables = returnVariables;
		return this;
	}

	/**
	 * Get returnVariables
	 * 
	 * @return returnVariables
	 **/

	public Boolean isReturnVariables() {
		return returnVariables;
	}

	public void setReturnVariables(Boolean returnVariables) {
		this.returnVariables = returnVariables;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ProcessInstanceCreateRequest processInstanceCreateRequest = (ProcessInstanceCreateRequest) o;
		return Objects.equals(this.processDefinitionId, processInstanceCreateRequest.processDefinitionId)
				&& Objects.equals(this.processDefinitionKey, processInstanceCreateRequest.processDefinitionKey)
				&& Objects.equals(this.message, processInstanceCreateRequest.message)
				&& Objects.equals(this.businessKey, processInstanceCreateRequest.businessKey)
				&& Objects.equals(this.variables, processInstanceCreateRequest.variables)
				&& Objects.equals(this.transientVariables, processInstanceCreateRequest.transientVariables)
				&& Objects.equals(this.tenantId, processInstanceCreateRequest.tenantId)
				&& Objects.equals(this.returnVariables, processInstanceCreateRequest.returnVariables);
	}

	@Override
	public int hashCode() {
		return Objects.hash(processDefinitionId, processDefinitionKey, message, businessKey, variables,
				transientVariables, tenantId, returnVariables);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProcessInstanceCreateRequest {\n");

		sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
		sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
		sb.append("    message: ").append(toIndentedString(message)).append("\n");
		sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
		sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
		sb.append("    transientVariables: ").append(toIndentedString(transientVariables)).append("\n");
		sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
		sb.append("    returnVariables: ").append(toIndentedString(returnVariables)).append("\n");
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
