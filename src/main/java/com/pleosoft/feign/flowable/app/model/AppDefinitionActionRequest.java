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

package com.pleosoft.feign.flowable.app.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class AppDefinitionActionRequest {
	@JsonProperty("action")
	private String action = null;

	@JsonProperty("category")
	private String category = null;

	public AppDefinitionActionRequest action(String action) {
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

	public AppDefinitionActionRequest category(String category) {
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
		AppDefinitionActionRequest appDefinitionActionRequest = (AppDefinitionActionRequest) o;
		return Objects.equals(this.action, appDefinitionActionRequest.action)
				&& Objects.equals(this.category, appDefinitionActionRequest.category);
	}

	@Override
	public int hashCode() {
		return Objects.hash(action, category);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppDefinitionActionRequest {\n");

		sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
