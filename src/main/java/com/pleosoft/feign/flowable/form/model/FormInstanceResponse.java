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

import java.util.Date;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class FormInstanceResponse {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("formDefinitionId")
	private String formDefinitionId = null;

	@JsonProperty("taskId")
	private String taskId = null;

	@JsonProperty("processInstanceId")
	private String processInstanceId = null;

	@JsonProperty("processDefinitionId")
	private String processDefinitionId = null;

	@JsonProperty("submittedDate")
	private Date submittedDate = null;

	@JsonProperty("submittedBy")
	private String submittedBy = null;

	@JsonProperty("formValuesId")
	private String formValuesId = null;

	@JsonProperty("tenantId")
	private String tenantId = null;

	@JsonProperty("url")
	private String url = null;

	public FormInstanceResponse id(String id) {
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

	public FormInstanceResponse formDefinitionId(String formDefinitionId) {
		this.formDefinitionId = formDefinitionId;
		return this;
	}

	/**
	 * Get formDefinitionId
	 * 
	 * @return formDefinitionId
	 **/

	public String getFormDefinitionId() {
		return formDefinitionId;
	}

	public void setFormDefinitionId(String formDefinitionId) {
		this.formDefinitionId = formDefinitionId;
	}

	public FormInstanceResponse taskId(String taskId) {
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

	public FormInstanceResponse processInstanceId(String processInstanceId) {
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

	public FormInstanceResponse processDefinitionId(String processDefinitionId) {
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

	public FormInstanceResponse submittedDate(Date submittedDate) {
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

	public FormInstanceResponse submittedBy(String submittedBy) {
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

	public FormInstanceResponse formValuesId(String formValuesId) {
		this.formValuesId = formValuesId;
		return this;
	}

	/**
	 * Get formValuesId
	 * 
	 * @return formValuesId
	 **/

	public String getFormValuesId() {
		return formValuesId;
	}

	public void setFormValuesId(String formValuesId) {
		this.formValuesId = formValuesId;
	}

	public FormInstanceResponse tenantId(String tenantId) {
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

	public FormInstanceResponse url(String url) {
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
		FormInstanceResponse formInstanceResponse = (FormInstanceResponse) o;
		return Objects.equals(this.id, formInstanceResponse.id)
				&& Objects.equals(this.formDefinitionId, formInstanceResponse.formDefinitionId)
				&& Objects.equals(this.taskId, formInstanceResponse.taskId)
				&& Objects.equals(this.processInstanceId, formInstanceResponse.processInstanceId)
				&& Objects.equals(this.processDefinitionId, formInstanceResponse.processDefinitionId)
				&& Objects.equals(this.submittedDate, formInstanceResponse.submittedDate)
				&& Objects.equals(this.submittedBy, formInstanceResponse.submittedBy)
				&& Objects.equals(this.formValuesId, formInstanceResponse.formValuesId)
				&& Objects.equals(this.tenantId, formInstanceResponse.tenantId)
				&& Objects.equals(this.url, formInstanceResponse.url);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, formDefinitionId, taskId, processInstanceId, processDefinitionId, submittedDate,
				submittedBy, formValuesId, tenantId, url);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FormInstanceResponse {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    formDefinitionId: ").append(toIndentedString(formDefinitionId)).append("\n");
		sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
		sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
		sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
		sb.append("    submittedDate: ").append(toIndentedString(submittedDate)).append("\n");
		sb.append("    submittedBy: ").append(toIndentedString(submittedBy)).append("\n");
		sb.append("    formValuesId: ").append(toIndentedString(formValuesId)).append("\n");
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
