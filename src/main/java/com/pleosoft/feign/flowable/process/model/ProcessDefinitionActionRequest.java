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
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class ProcessDefinitionActionRequest {
	@JsonProperty("action")
	private String action = null;

	@JsonProperty("includeProcessInstances")
	private Boolean includeProcessInstances = null;

	@JsonProperty("date")
	private Date date = null;

	@JsonProperty("category")
	private String category = null;

	public ProcessDefinitionActionRequest action(String action) {
		this.action = action;
		return this;
	}

	/**
	 * Action to perform: Either activate or suspend
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

	public ProcessDefinitionActionRequest includeProcessInstances(Boolean includeProcessInstances) {
		this.includeProcessInstances = includeProcessInstances;
		return this;
	}

	/**
	 * Whether or not to suspend/activate running process-instances for this
	 * process-definition. If omitted, the process-instances are left in the
	 * state they are
	 * 
	 * @return includeProcessInstances
	 **/

	public Boolean isIncludeProcessInstances() {
		return includeProcessInstances;
	}

	public void setIncludeProcessInstances(Boolean includeProcessInstances) {
		this.includeProcessInstances = includeProcessInstances;
	}

	public ProcessDefinitionActionRequest date(Date date) {
		this.date = date;
		return this;
	}

	/**
	 * Date (ISO-8601) when the suspension/activation should be executed. If
	 * omitted, the suspend/activation is effective immediately.
	 * 
	 * @return date
	 **/

	@Valid

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ProcessDefinitionActionRequest category(String category) {
		this.category = category;
		return this;
	}

	/**
	 * Get category
	 * 
	 * @return category
	 **/

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ProcessDefinitionActionRequest processDefinitionActionRequest = (ProcessDefinitionActionRequest) o;
		return Objects.equals(this.action, processDefinitionActionRequest.action)
				&& Objects.equals(this.includeProcessInstances, processDefinitionActionRequest.includeProcessInstances)
				&& Objects.equals(this.date, processDefinitionActionRequest.date)
				&& Objects.equals(this.category, processDefinitionActionRequest.category);
	}

	@Override
	public int hashCode() {
		return Objects.hash(action, includeProcessInstances, date, category);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProcessDefinitionActionRequest {\n");

		sb.append("    action: ").append(toIndentedString(action)).append("\n");
		sb.append("    includeProcessInstances: ").append(toIndentedString(includeProcessInstances)).append("\n");
		sb.append("    date: ").append(toIndentedString(date)).append("\n");
		sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
