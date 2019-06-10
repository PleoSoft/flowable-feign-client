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

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class HistoricVariableInstanceResponse {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("processInstanceId")
	private String processInstanceId = null;

	@JsonProperty("processInstanceUrl")
	private String processInstanceUrl = null;

	@JsonProperty("taskId")
	private String taskId = null;

	@JsonProperty("variable")
	private RestVariable variable = null;

	public HistoricVariableInstanceResponse id(String id) {
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

	public HistoricVariableInstanceResponse processInstanceId(String processInstanceId) {
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

	public HistoricVariableInstanceResponse processInstanceUrl(String processInstanceUrl) {
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

	public HistoricVariableInstanceResponse taskId(String taskId) {
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

	public HistoricVariableInstanceResponse variable(RestVariable variable) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		HistoricVariableInstanceResponse historicVariableInstanceResponse = (HistoricVariableInstanceResponse) o;
		return Objects.equals(this.id, historicVariableInstanceResponse.id)
				&& Objects.equals(this.processInstanceId, historicVariableInstanceResponse.processInstanceId)
				&& Objects.equals(this.processInstanceUrl, historicVariableInstanceResponse.processInstanceUrl)
				&& Objects.equals(this.taskId, historicVariableInstanceResponse.taskId)
				&& Objects.equals(this.variable, historicVariableInstanceResponse.variable);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, processInstanceId, processInstanceUrl, taskId, variable);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class HistoricVariableInstanceResponse {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
		sb.append("    processInstanceUrl: ").append(toIndentedString(processInstanceUrl)).append("\n");
		sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
		sb.append("    variable: ").append(toIndentedString(variable)).append("\n");
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
