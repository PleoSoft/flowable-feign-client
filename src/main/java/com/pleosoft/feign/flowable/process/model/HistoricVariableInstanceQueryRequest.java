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

public class HistoricVariableInstanceQueryRequest {
	@JsonProperty("excludeTaskVariables")
	private Boolean excludeTaskVariables = null;

	@JsonProperty("taskId")
	private String taskId = null;

	@JsonProperty("executionId")
	private String executionId = null;

	@JsonProperty("processInstanceId")
	private String processInstanceId = null;

	@JsonProperty("variableName")
	private String variableName = null;

	@JsonProperty("variableNameLike")
	private String variableNameLike = null;

	@JsonProperty("variables")
	@Valid
	private List<QueryVariable> variables = null;

	public HistoricVariableInstanceQueryRequest excludeTaskVariables(Boolean excludeTaskVariables) {
		this.excludeTaskVariables = excludeTaskVariables;
		return this;
	}

	/**
	 * Get excludeTaskVariables
	 * 
	 * @return excludeTaskVariables
	 **/

	public Boolean isExcludeTaskVariables() {
		return excludeTaskVariables;
	}

	public void setExcludeTaskVariables(Boolean excludeTaskVariables) {
		this.excludeTaskVariables = excludeTaskVariables;
	}

	public HistoricVariableInstanceQueryRequest taskId(String taskId) {
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

	public HistoricVariableInstanceQueryRequest executionId(String executionId) {
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

	public HistoricVariableInstanceQueryRequest processInstanceId(String processInstanceId) {
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

	public HistoricVariableInstanceQueryRequest variableName(String variableName) {
		this.variableName = variableName;
		return this;
	}

	/**
	 * Get variableName
	 * 
	 * @return variableName
	 **/

	public String getVariableName() {
		return variableName;
	}

	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}

	public HistoricVariableInstanceQueryRequest variableNameLike(String variableNameLike) {
		this.variableNameLike = variableNameLike;
		return this;
	}

	/**
	 * Get variableNameLike
	 * 
	 * @return variableNameLike
	 **/

	public String getVariableNameLike() {
		return variableNameLike;
	}

	public void setVariableNameLike(String variableNameLike) {
		this.variableNameLike = variableNameLike;
	}

	public HistoricVariableInstanceQueryRequest variables(List<QueryVariable> variables) {
		this.variables = variables;
		return this;
	}

	public HistoricVariableInstanceQueryRequest addVariablesItem(QueryVariable variablesItem) {
		if (this.variables == null) {
			this.variables = new ArrayList<QueryVariable>();
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

	public List<QueryVariable> getVariables() {
		return variables;
	}

	public void setVariables(List<QueryVariable> variables) {
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
		HistoricVariableInstanceQueryRequest historicVariableInstanceQueryRequest = (HistoricVariableInstanceQueryRequest) o;
		return Objects.equals(this.excludeTaskVariables, historicVariableInstanceQueryRequest.excludeTaskVariables)
				&& Objects.equals(this.taskId, historicVariableInstanceQueryRequest.taskId)
				&& Objects.equals(this.executionId, historicVariableInstanceQueryRequest.executionId)
				&& Objects.equals(this.processInstanceId, historicVariableInstanceQueryRequest.processInstanceId)
				&& Objects.equals(this.variableName, historicVariableInstanceQueryRequest.variableName)
				&& Objects.equals(this.variableNameLike, historicVariableInstanceQueryRequest.variableNameLike)
				&& Objects.equals(this.variables, historicVariableInstanceQueryRequest.variables);
	}

	@Override
	public int hashCode() {
		return Objects.hash(excludeTaskVariables, taskId, executionId, processInstanceId, variableName,
				variableNameLike, variables);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class HistoricVariableInstanceQueryRequest {\n");

		sb.append("    excludeTaskVariables: ").append(toIndentedString(excludeTaskVariables)).append("\n");
		sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
		sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
		sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
		sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
		sb.append("    variableNameLike: ").append(toIndentedString(variableNameLike)).append("\n");
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
