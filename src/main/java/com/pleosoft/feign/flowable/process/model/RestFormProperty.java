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

public class RestFormProperty {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("type")
	private String type = null;

	@JsonProperty("value")
	private String value = null;

	@JsonProperty("readable")
	private Boolean readable = null;

	@JsonProperty("writable")
	private Boolean writable = null;

	@JsonProperty("required")
	private Boolean required = null;

	@JsonProperty("datePattern")
	private String datePattern = null;

	@JsonProperty("enumValues")
	@Valid
	private List<RestEnumFormProperty> enumValues = null;

	public RestFormProperty id(String id) {
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

	public RestFormProperty name(String name) {
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

	public RestFormProperty type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public RestFormProperty value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * Get value
	 * 
	 * @return value
	 **/

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public RestFormProperty readable(Boolean readable) {
		this.readable = readable;
		return this;
	}

	/**
	 * Get readable
	 * 
	 * @return readable
	 **/

	public Boolean isReadable() {
		return readable;
	}

	public void setReadable(Boolean readable) {
		this.readable = readable;
	}

	public RestFormProperty writable(Boolean writable) {
		this.writable = writable;
		return this;
	}

	/**
	 * Get writable
	 * 
	 * @return writable
	 **/

	public Boolean isWritable() {
		return writable;
	}

	public void setWritable(Boolean writable) {
		this.writable = writable;
	}

	public RestFormProperty required(Boolean required) {
		this.required = required;
		return this;
	}

	/**
	 * Get required
	 * 
	 * @return required
	 **/

	public Boolean isRequired() {
		return required;
	}

	public void setRequired(Boolean required) {
		this.required = required;
	}

	public RestFormProperty datePattern(String datePattern) {
		this.datePattern = datePattern;
		return this;
	}

	/**
	 * Get datePattern
	 * 
	 * @return datePattern
	 **/

	public String getDatePattern() {
		return datePattern;
	}

	public void setDatePattern(String datePattern) {
		this.datePattern = datePattern;
	}

	public RestFormProperty enumValues(List<RestEnumFormProperty> enumValues) {
		this.enumValues = enumValues;
		return this;
	}

	public RestFormProperty addEnumValuesItem(RestEnumFormProperty enumValuesItem) {
		if (this.enumValues == null) {
			this.enumValues = new ArrayList<RestEnumFormProperty>();
		}
		this.enumValues.add(enumValuesItem);
		return this;
	}

	/**
	 * Get enumValues
	 * 
	 * @return enumValues
	 **/

	@Valid

	public List<RestEnumFormProperty> getEnumValues() {
		return enumValues;
	}

	public void setEnumValues(List<RestEnumFormProperty> enumValues) {
		this.enumValues = enumValues;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RestFormProperty restFormProperty = (RestFormProperty) o;
		return Objects.equals(this.id, restFormProperty.id) && Objects.equals(this.name, restFormProperty.name)
				&& Objects.equals(this.type, restFormProperty.type)
				&& Objects.equals(this.value, restFormProperty.value)
				&& Objects.equals(this.readable, restFormProperty.readable)
				&& Objects.equals(this.writable, restFormProperty.writable)
				&& Objects.equals(this.required, restFormProperty.required)
				&& Objects.equals(this.datePattern, restFormProperty.datePattern)
				&& Objects.equals(this.enumValues, restFormProperty.enumValues);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, type, value, readable, writable, required, datePattern, enumValues);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RestFormProperty {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
		sb.append("    readable: ").append(toIndentedString(readable)).append("\n");
		sb.append("    writable: ").append(toIndentedString(writable)).append("\n");
		sb.append("    required: ").append(toIndentedString(required)).append("\n");
		sb.append("    datePattern: ").append(toIndentedString(datePattern)).append("\n");
		sb.append("    enumValues: ").append(toIndentedString(enumValues)).append("\n");
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
