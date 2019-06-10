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
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class FormInstanceModelResponse {
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

	@JsonProperty("formInstanceId")
	private String formInstanceId = null;

	@JsonProperty("submittedBy")
	private String submittedBy = null;

	@JsonProperty("submittedDate")
	private Date submittedDate = null;

	@JsonProperty("selectedOutcome")
	private String selectedOutcome = null;

	@JsonProperty("taskId")
	private String taskId = null;

	@JsonProperty("processInstanceId")
	private String processInstanceId = null;

	@JsonProperty("processDefinitionId")
	private String processDefinitionId = null;

	@JsonProperty("tenantId")
	private String tenantId = null;

	@JsonProperty("url")
	private String url = null;

	public FormInstanceModelResponse id(String id) {
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

	public FormInstanceModelResponse name(String name) {
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

	public FormInstanceModelResponse description(String description) {
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

	public FormInstanceModelResponse key(String key) {
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

	public FormInstanceModelResponse version(Integer version) {
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

	public FormInstanceModelResponse fields(List<FormField> fields) {
		this.fields = fields;
		return this;
	}

	public FormInstanceModelResponse addFieldsItem(FormField fieldsItem) {
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

	public FormInstanceModelResponse outcomes(List<FormOutcome> outcomes) {
		this.outcomes = outcomes;
		return this;
	}

	public FormInstanceModelResponse addOutcomesItem(FormOutcome outcomesItem) {
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

	public FormInstanceModelResponse outcomeVariableName(String outcomeVariableName) {
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

	public FormInstanceModelResponse formInstanceId(String formInstanceId) {
		this.formInstanceId = formInstanceId;
		return this;
	}

	/**
	 * Get formInstanceId
	 * 
	 * @return formInstanceId
	 **/

	public String getFormInstanceId() {
		return formInstanceId;
	}

	public void setFormInstanceId(String formInstanceId) {
		this.formInstanceId = formInstanceId;
	}

	public FormInstanceModelResponse submittedBy(String submittedBy) {
		this.submittedBy = submittedBy;
		return this;
	}

	/**
	 * Get submittedBy
	 * 
	 * @return submittedBy
	 **/

	public String getSubmittedBy() {
		return submittedBy;
	}

	public void setSubmittedBy(String submittedBy) {
		this.submittedBy = submittedBy;
	}

	public FormInstanceModelResponse submittedDate(Date submittedDate) {
		this.submittedDate = submittedDate;
		return this;
	}

	/**
	 * Get submittedDate
	 * 
	 * @return submittedDate
	 **/

	@Valid

	public Date getSubmittedDate() {
		return submittedDate;
	}

	public void setSubmittedDate(Date submittedDate) {
		this.submittedDate = submittedDate;
	}

	public FormInstanceModelResponse selectedOutcome(String selectedOutcome) {
		this.selectedOutcome = selectedOutcome;
		return this;
	}

	/**
	 * Get selectedOutcome
	 * 
	 * @return selectedOutcome
	 **/

	public String getSelectedOutcome() {
		return selectedOutcome;
	}

	public void setSelectedOutcome(String selectedOutcome) {
		this.selectedOutcome = selectedOutcome;
	}

	public FormInstanceModelResponse taskId(String taskId) {
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

	public FormInstanceModelResponse processInstanceId(String processInstanceId) {
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

	public FormInstanceModelResponse processDefinitionId(String processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
		return this;
	}

	/**
	 * Get processDefinitionId
	 * 
	 * @return processDefinitionId
	 **/

	public String getProcessDefinitionId() {
		return processDefinitionId;
	}

	public void setProcessDefinitionId(String processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
	}

	public FormInstanceModelResponse tenantId(String tenantId) {
		this.tenantId = tenantId;
		return this;
	}

	/**
	 * Get tenantId
	 * 
	 * @return tenantId
	 **/

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public FormInstanceModelResponse url(String url) {
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
		FormInstanceModelResponse formInstanceModelResponse = (FormInstanceModelResponse) o;
		return Objects.equals(this.id, formInstanceModelResponse.id)
				&& Objects.equals(this.name, formInstanceModelResponse.name)
				&& Objects.equals(this.description, formInstanceModelResponse.description)
				&& Objects.equals(this.key, formInstanceModelResponse.key)
				&& Objects.equals(this.version, formInstanceModelResponse.version)
				&& Objects.equals(this.fields, formInstanceModelResponse.fields)
				&& Objects.equals(this.outcomes, formInstanceModelResponse.outcomes)
				&& Objects.equals(this.outcomeVariableName, formInstanceModelResponse.outcomeVariableName)
				&& Objects.equals(this.formInstanceId, formInstanceModelResponse.formInstanceId)
				&& Objects.equals(this.submittedBy, formInstanceModelResponse.submittedBy)
				&& Objects.equals(this.submittedDate, formInstanceModelResponse.submittedDate)
				&& Objects.equals(this.selectedOutcome, formInstanceModelResponse.selectedOutcome)
				&& Objects.equals(this.taskId, formInstanceModelResponse.taskId)
				&& Objects.equals(this.processInstanceId, formInstanceModelResponse.processInstanceId)
				&& Objects.equals(this.processDefinitionId, formInstanceModelResponse.processDefinitionId)
				&& Objects.equals(this.tenantId, formInstanceModelResponse.tenantId)
				&& Objects.equals(this.url, formInstanceModelResponse.url);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, description, key, version, fields, outcomes, outcomeVariableName, formInstanceId,
				submittedBy, submittedDate, selectedOutcome, taskId, processInstanceId, processDefinitionId, tenantId,
				url);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FormInstanceModelResponse {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    key: ").append(toIndentedString(key)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
		sb.append("    outcomes: ").append(toIndentedString(outcomes)).append("\n");
		sb.append("    outcomeVariableName: ").append(toIndentedString(outcomeVariableName)).append("\n");
		sb.append("    formInstanceId: ").append(toIndentedString(formInstanceId)).append("\n");
		sb.append("    submittedBy: ").append(toIndentedString(submittedBy)).append("\n");
		sb.append("    submittedDate: ").append(toIndentedString(submittedDate)).append("\n");
		sb.append("    selectedOutcome: ").append(toIndentedString(selectedOutcome)).append("\n");
		sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
		sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
		sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
		sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
