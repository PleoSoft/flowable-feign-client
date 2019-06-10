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

package com.pleosoft.feign.flowable.decision.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class EngineRestVariable {
	@JsonProperty("name")
	private String name = null;

	@JsonProperty("type")
	private String type = null;

	@JsonProperty("value")
	private Object value = null;

	@JsonProperty("valueUrl")
	private String valueUrl = null;

	public EngineRestVariable name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the variable
	 * 
	 * @return name
	 **/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EngineRestVariable type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Type of the variable.
	 * 
	 * @return type
	 **/

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public EngineRestVariable value(Object value) {
		this.value = value;
		return this;
	}

	/**
	 * Value of the variable.
	 * 
	 * @return value
	 **/

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public EngineRestVariable valueUrl(String valueUrl) {
		this.valueUrl = valueUrl;
		return this;
	}

	/**
	 * Get valueUrl
	 * 
	 * @return valueUrl
	 **/

	public String getValueUrl() {
		return valueUrl;
	}

	public void setValueUrl(String valueUrl) {
		this.valueUrl = valueUrl;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		EngineRestVariable engineRestVariable = (EngineRestVariable) o;
		return Objects.equals(this.name, engineRestVariable.name) && Objects.equals(this.type, engineRestVariable.type)
				&& Objects.equals(this.value, engineRestVariable.value)
				&& Objects.equals(this.valueUrl, engineRestVariable.valueUrl);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, type, value, valueUrl);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EngineRestVariable {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
		sb.append("    valueUrl: ").append(toIndentedString(valueUrl)).append("\n");
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
