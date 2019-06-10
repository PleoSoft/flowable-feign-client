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

public class ExecutionActionRequest {
	@JsonProperty("action")
	private String action = null;

	@JsonProperty("signalName")
	private String signalName = null;

	@JsonProperty("messageName")
	private String messageName = null;

	@JsonProperty("variables")
	@Valid
	private List<RestVariable> variables = null;

	@JsonProperty("transientVariables")
	@Valid
	private List<RestVariable> transientVariables = null;

	public ExecutionActionRequest action(String action) {
		this.action = action;
		return this;
	}

	/**
	 * Action to perform: Either signal, trigger, signalEventReceived or
	 * messageEventReceived
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

	public ExecutionActionRequest signalName(String signalName) {
		this.signalName = signalName;
		return this;
	}

	/**
	 * Name of the signal
	 * 
	 * @return signalName
	 **/

	public String getSignalName() {
		return signalName;
	}

	public void setSignalName(String signalName) {
		this.signalName = signalName;
	}

	public ExecutionActionRequest messageName(String messageName) {
		this.messageName = messageName;
		return this;
	}

	/**
	 * Message of the signal
	 * 
	 * @return messageName
	 **/

	public String getMessageName() {
		return messageName;
	}

	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}

	public ExecutionActionRequest variables(List<RestVariable> variables) {
		this.variables = variables;
		return this;
	}

	public ExecutionActionRequest addVariablesItem(RestVariable variablesItem) {
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

	public ExecutionActionRequest transientVariables(List<RestVariable> transientVariables) {
		this.transientVariables = transientVariables;
		return this;
	}

	public ExecutionActionRequest addTransientVariablesItem(RestVariable transientVariablesItem) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ExecutionActionRequest executionActionRequest = (ExecutionActionRequest) o;
		return Objects.equals(this.action, executionActionRequest.action)
				&& Objects.equals(this.signalName, executionActionRequest.signalName)
				&& Objects.equals(this.messageName, executionActionRequest.messageName)
				&& Objects.equals(this.variables, executionActionRequest.variables)
				&& Objects.equals(this.transientVariables, executionActionRequest.transientVariables);
	}

	@Override
	public int hashCode() {
		return Objects.hash(action, signalName, messageName, variables, transientVariables);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExecutionActionRequest {\n");

		sb.append("    action: ").append(toIndentedString(action)).append("\n");
		sb.append("    signalName: ").append(toIndentedString(signalName)).append("\n");
		sb.append("    messageName: ").append(toIndentedString(messageName)).append("\n");
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
