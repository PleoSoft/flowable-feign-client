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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class FormModelResponse {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("key")
	private String key = null;

	@JsonProperty("version")
	private Integer version = null;

	@JsonProperty("fields")
	@Valid
	private List<FormField> fields = null;

	@JsonProperty("outcomes")
	@Valid
	private List<FormOutcome> outcomes = null;

	@JsonProperty("outcomeVariableName")
	private String outcomeVariableName = null;

	@JsonProperty("url")
	private String url = null;

	public FormModelResponse id(String id) {
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

	public FormModelResponse name(String name) {
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

	public FormModelResponse description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get description
	 * 
	 * @return description
	 **/

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public FormModelResponse key(String key) {
		this.key = key;
		return this;
	}

	/**
	 * Get key
	 * 
	 * @return key
	 **/

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public FormModelResponse version(Integer version) {
		this.version = version;
		return this;
	}

	/**
	 * Get version
	 * 
	 * @return version
	 **/

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public FormModelResponse fields(List<FormField> fields) {
		this.fields = fields;
		return this;
	}

	public FormModelResponse addFieldsItem(FormField fieldsItem) {
		if (this.fields == null) {
			this.fields = new ArrayList<FormField>();
		}
		this.fields.add(fieldsItem);
		return this;
	}

	/**
	 * Get fields
	 * 
	 * @return fields
	 **/

	@Valid

	public List<FormField> getFields() {
		return fields;
	}

	public void setFields(List<FormField> fields) {
		this.fields = fields;
	}

	public FormModelResponse outcomes(List<FormOutcome> outcomes) {
		this.outcomes = outcomes;
		return this;
	}

	public FormModelResponse addOutcomesItem(FormOutcome outcomesItem) {
		if (this.outcomes == null) {
			this.outcomes = new ArrayList<FormOutcome>();
		}
		this.outcomes.add(outcomesItem);
		return this;
	}

	/**
	 * Get outcomes
	 * 
	 * @return outcomes
	 **/

	@Valid

	public List<FormOutcome> getOutcomes() {
		return outcomes;
	}

	public void setOutcomes(List<FormOutcome> outcomes) {
		this.outcomes = outcomes;
	}

	public FormModelResponse outcomeVariableName(String outcomeVariableName) {
		this.outcomeVariableName = outcomeVariableName;
		return this;
	}

	/**
	 * Get outcomeVariableName
	 * 
	 * @return outcomeVariableName
	 **/

	public String getOutcomeVariableName() {
		return outcomeVariableName;
	}

	public void setOutcomeVariableName(String outcomeVariableName) {
		this.outcomeVariableName = outcomeVariableName;
	}

	public FormModelResponse url(String url) {
		this.url = url;
		return this;
	}

	/**
	 * Get url
	 * 
	 * @return url
	 **/

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FormModelResponse formModelResponse = (FormModelResponse) o;
		return Objects.equals(this.id, formModelResponse.id) && Objects.equals(this.name, formModelResponse.name)
				&& Objects.equals(this.description, formModelResponse.description)
				&& Objects.equals(this.key, formModelResponse.key)
				&& Objects.equals(this.version, formModelResponse.version)
				&& Objects.equals(this.fields, formModelResponse.fields)
				&& Objects.equals(this.outcomes, formModelResponse.outcomes)
				&& Objects.equals(this.outcomeVariableName, formModelResponse.outcomeVariableName)
				&& Objects.equals(this.url, formModelResponse.url);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, description, key, version, fields, outcomes, outcomeVariableName, url);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FormModelResponse {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    key: ").append(toIndentedString(key)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
		sb.append("    outcomes: ").append(toIndentedString(outcomes)).append("\n");
		sb.append("    outcomeVariableName: ").append(toIndentedString(outcomeVariableName)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
