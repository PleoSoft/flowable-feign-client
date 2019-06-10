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

package com.pleosoft.feign.flowable.form.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "fieldType", visible = true)
@JsonSubTypes({ @JsonSubTypes.Type(value = FormContainer.class, name = "FormContainer"),
		@JsonSubTypes.Type(value = ExpressionFormField.class, name = "ExpressionFormField"),
		@JsonSubTypes.Type(value = OptionFormField.class, name = "OptionFormField"), })

public class FormField {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("type")
	private String type = null;

	@JsonProperty("value")
	private Object value = null;

	@JsonProperty("required")
	private Boolean required = null;

	@JsonProperty("readOnly")
	private Boolean readOnly = null;

	@JsonProperty("overrideId")
	private Boolean overrideId = null;

	@JsonProperty("placeholder")
	private String placeholder = null;

	@JsonProperty("params")
	@Valid
	private Map<String, Object> params = null;

	@JsonProperty("layout")
	private LayoutDefinition layout = null;

	public FormField id(String id) {
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

	public FormField name(String name) {
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

	public FormField type(String type) {
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

	public FormField value(Object value) {
		this.value = value;
		return this;
	}

	/**
	 * Get value
	 * 
	 * @return value
	 **/

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public FormField required(Boolean required) {
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

	public FormField readOnly(Boolean readOnly) {
		this.readOnly = readOnly;
		return this;
	}

	/**
	 * Get readOnly
	 * 
	 * @return readOnly
	 **/

	public Boolean isReadOnly() {
		return readOnly;
	}

	public void setReadOnly(Boolean readOnly) {
		this.readOnly = readOnly;
	}

	public FormField overrideId(Boolean overrideId) {
		this.overrideId = overrideId;
		return this;
	}

	/**
	 * Get overrideId
	 * 
	 * @return overrideId
	 **/

	public Boolean isOverrideId() {
		return overrideId;
	}

	public void setOverrideId(Boolean overrideId) {
		this.overrideId = overrideId;
	}

	public FormField placeholder(String placeholder) {
		this.placeholder = placeholder;
		return this;
	}

	/**
	 * Get placeholder
	 * 
	 * @return placeholder
	 **/

	public String getPlaceholder() {
		return placeholder;
	}

	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}

	public FormField params(Map<String, Object> params) {
		this.params = params;
		return this;
	}

	public FormField putParamsItem(String key, Object paramsItem) {
		if (this.params == null) {
			this.params = new HashMap<String, Object>();
		}
		this.params.put(key, paramsItem);
		return this;
	}

	/**
	 * Get params
	 * 
	 * @return params
	 **/

	public Map<String, Object> getParams() {
		return params;
	}

	public void setParams(Map<String, Object> params) {
		this.params = params;
	}

	public FormField layout(LayoutDefinition layout) {
		this.layout = layout;
		return this;
	}

	/**
	 * Get layout
	 * 
	 * @return layout
	 **/

	@Valid

	public LayoutDefinition getLayout() {
		return layout;
	}

	public void setLayout(LayoutDefinition layout) {
		this.layout = layout;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FormField formField = (FormField) o;
		return Objects.equals(this.id, formField.id) && Objects.equals(this.name, formField.name)
				&& Objects.equals(this.type, formField.type) && Objects.equals(this.value, formField.value)
				&& Objects.equals(this.required, formField.required)
				&& Objects.equals(this.readOnly, formField.readOnly)
				&& Objects.equals(this.overrideId, formField.overrideId)
				&& Objects.equals(this.placeholder, formField.placeholder)
				&& Objects.equals(this.params, formField.params) && Objects.equals(this.layout, formField.layout);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, type, value, required, readOnly, overrideId, placeholder, params, layout);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FormField {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
		sb.append("    required: ").append(toIndentedString(required)).append("\n");
		sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
		sb.append("    overrideId: ").append(toIndentedString(overrideId)).append("\n");
		sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
		sb.append("    params: ").append(toIndentedString(params)).append("\n");
		sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
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
