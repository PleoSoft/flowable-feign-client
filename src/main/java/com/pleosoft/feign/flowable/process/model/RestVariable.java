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

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class RestVariable {
	@JsonProperty("name")
	private String name = null;

	@JsonProperty("type")
	private String type = null;

	@JsonProperty("value")
	private Object value = null;

	@JsonProperty("valueUrl")
	private String valueUrl = null;

	@JsonProperty("scope")
	private String scope = null;

	public RestVariable name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get name
	 * 
	 * @return name
	 **/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RestVariable type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * When writing a variable and this value is omitted, the type will be
	 * deducted from the raw JSON-attribute request type and is limited to
	 * either string, double, integer and boolean. It’s advised to always
	 * include a type to make sure no wrong assumption about the type can be
	 * done.
	 * 
	 * @return type
	 **/

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public RestVariable value(Object value) {
		this.value = value;
		return this;
	}

	/**
	 * When writing a variable and value is omitted, null will be used as value.
	 * 
	 * @return value
	 **/

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public RestVariable valueUrl(String valueUrl) {
		this.valueUrl = valueUrl;
		return this;
	}

	/**
	 * When reading a variable of type binary or serializable, this attribute
	 * will point to the URL where the raw binary data can be fetched from.
	 * 
	 * @return valueUrl
	 **/

	public String getValueUrl() {
		return valueUrl;
	}

	public void setValueUrl(String valueUrl) {
		this.valueUrl = valueUrl;
	}

	public RestVariable scope(String scope) {
		this.scope = scope;
		return this;
	}

	/**
	 * If local, the variable is explicitly defined on the resource it’s
	 * requested from. When global, the variable is defined on the parent (or
	 * any parent in the parent-tree) of the resource it’s requested from. When
	 * writing a variable and the scope is omitted, global is assumed.
	 * 
	 * @return scope
	 **/

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RestVariable restVariable = (RestVariable) o;
		return Objects.equals(this.name, restVariable.name) && Objects.equals(this.type, restVariable.type)
				&& Objects.equals(this.value, restVariable.value)
				&& Objects.equals(this.valueUrl, restVariable.valueUrl)
				&& Objects.equals(this.scope, restVariable.scope);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, type, value, valueUrl, scope);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RestVariable {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
		sb.append("    valueUrl: ").append(toIndentedString(valueUrl)).append("\n");
		sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
