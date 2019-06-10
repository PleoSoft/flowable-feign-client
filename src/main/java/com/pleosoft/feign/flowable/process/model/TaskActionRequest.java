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
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class TaskActionRequest {
	@JsonProperty("action")
	private String action = null;

	@JsonProperty("assignee")
	private String assignee = null;

	@JsonProperty("variables")
	@Valid
	private List<RestVariable> variables = null;

	@JsonProperty("transientVariables")
	@Valid
	private List<RestVariable> transientVariables = null;

	public TaskActionRequest action(String action) {
		this.action = action;
		return this;
	}

	/**
	 * Action to perform: Either complete, claim, delegate or resolve
	 * 
	 * @return action
	 **/
	@NotNull

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public TaskActionRequest assignee(String assignee) {
		this.assignee = assignee;
		return this;
	}

	/**
	 * If action is claim or delegate, you can use this parameter to set the
	 * assignee associated
	 * 
	 * @return assignee
	 **/

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public TaskActionRequest variables(List<RestVariable> variables) {
		this.variables = variables;
		return this;
	}

	public TaskActionRequest addVariablesItem(RestVariable variablesItem) {
		if (this.variables == null) {
			this.variables = new ArrayList<RestVariable>();
		}
		this.variables.add(variablesItem);
		return this;
	}

	/**
	 * If action is complete, you can use this parameter to set variables
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

	public TaskActionRequest transientVariables(List<RestVariable> transientVariables) {
		this.transientVariables = transientVariables;
		return this;
	}

	public TaskActionRequest addTransientVariablesItem(RestVariable transientVariablesItem) {
		if (this.transientVariables == null) {
			this.transientVariables = new ArrayList<RestVariable>();
		}
		this.transientVariables.add(transientVariablesItem);
		return this;
	}

	/**
	 * If action is complete, you can use this parameter to set transient
	 * variables
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TaskActionRequest taskActionRequest = (TaskActionRequest) o;
		return Objects.equals(this.action, taskActionRequest.action)
				&& Objects.equals(this.assignee, taskActionRequest.assignee)
				&& Objects.equals(this.variables, taskActionRequest.variables)
				&& Objects.equals(this.transientVariables, taskActionRequest.transientVariables);
	}

	@Override
	public int hashCode() {
		return Objects.hash(action, assignee, variables, transientVariables);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TaskActionRequest {\n");

		sb.append("    action: ").append(toIndentedString(action)).append("\n");
		sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
		sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
		sb.append("    transientVariables: ").append(toIndentedString(transientVariables)).append("\n");
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
