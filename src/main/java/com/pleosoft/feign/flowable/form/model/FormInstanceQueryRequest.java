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

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class FormInstanceQueryRequest {
	@JsonProperty("start")
	private Integer start = null;

	@JsonProperty("size")
	private Integer size = null;

	@JsonProperty("sort")
	private String sort = null;

	@JsonProperty("order")
	private String order = null;

	@JsonProperty("id")
	private String id = null;

	@JsonProperty("formDefinitionId")
	private String formDefinitionId = null;

	@JsonProperty("formDefinitionIdLike")
	private String formDefinitionIdLike = null;

	@JsonProperty("taskId")
	private String taskId = null;

	@JsonProperty("taskIdLike")
	private String taskIdLike = null;

	@JsonProperty("processInstanceId")
	private String processInstanceId = null;

	@JsonProperty("processInstanceIdLike")
	private String processInstanceIdLike = null;

	@JsonProperty("processDefinitionId")
	private String processDefinitionId = null;

	@JsonProperty("processDefinitionIdLike")
	private String processDefinitionIdLike = null;

	@JsonProperty("submittedBy")
	private String submittedBy = null;

	@JsonProperty("submittedByLike")
	private String submittedByLike = null;

	@JsonProperty("tenantId")
	private String tenantId = null;

	@JsonProperty("tenantIdLike")
	private String tenantIdLike = null;

	@JsonProperty("withoutTenantId")
	private Boolean withoutTenantId = null;

	public FormInstanceQueryRequest start(Integer start) {
		this.start = start;
		return this;
	}

	/**
	 * Get start
	 * 
	 * @return start
	 **/

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public FormInstanceQueryRequest size(Integer size) {
		this.size = size;
		return this;
	}

	/**
	 * Get size
	 * 
	 * @return size
	 **/

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public FormInstanceQueryRequest sort(String sort) {
		this.sort = sort;
		return this;
	}

	/**
	 * Get sort
	 * 
	 * @return sort
	 **/

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public FormInstanceQueryRequest order(String order) {
		this.order = order;
		return this;
	}

	/**
	 * Get order
	 * 
	 * @return order
	 **/

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public FormInstanceQueryRequest id(String id) {
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

	public FormInstanceQueryRequest formDefinitionId(String formDefinitionId) {
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

	public FormInstanceQueryRequest formDefinitionIdLike(String formDefinitionIdLike) {
		this.formDefinitionIdLike = formDefinitionIdLike;
		return this;
	}

	/**
	 * Get formDefinitionIdLike
	 * 
	 * @return formDefinitionIdLike
	 **/

	public String getFormDefinitionIdLike() {
		return formDefinitionIdLike;
	}

	public void setFormDefinitionIdLike(String formDefinitionIdLike) {
		this.formDefinitionIdLike = formDefinitionIdLike;
	}

	public FormInstanceQueryRequest taskId(String taskId) {
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

	public FormInstanceQueryRequest taskIdLike(String taskIdLike) {
		this.taskIdLike = taskIdLike;
		return this;
	}

	/**
	 * Get taskIdLike
	 * 
	 * @return taskIdLike
	 **/

	public String getTaskIdLike() {
		return taskIdLike;
	}

	public void setTaskIdLike(String taskIdLike) {
		this.taskIdLike = taskIdLike;
	}

	public FormInstanceQueryRequest processInstanceId(String processInstanceId) {
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

	public FormInstanceQueryRequest processInstanceIdLike(String processInstanceIdLike) {
		this.processInstanceIdLike = processInstanceIdLike;
		return this;
	}

	/**
	 * Get processInstanceIdLike
	 * 
	 * @return processInstanceIdLike
	 **/

	public String getProcessInstanceIdLike() {
		return processInstanceIdLike;
	}

	public void setProcessInstanceIdLike(String processInstanceIdLike) {
		this.processInstanceIdLike = processInstanceIdLike;
	}

	public FormInstanceQueryRequest processDefinitionId(String processDefinitionId) {
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

	public FormInstanceQueryRequest processDefinitionIdLike(String processDefinitionIdLike) {
		this.processDefinitionIdLike = processDefinitionIdLike;
		return this;
	}

	/**
	 * Get processDefinitionIdLike
	 * 
	 * @return processDefinitionIdLike
	 **/

	public String getProcessDefinitionIdLike() {
		return processDefinitionIdLike;
	}

	public void setProcessDefinitionIdLike(String processDefinitionIdLike) {
		this.processDefinitionIdLike = processDefinitionIdLike;
	}

	public FormInstanceQueryRequest submittedBy(String submittedBy) {
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

	public FormInstanceQueryRequest submittedByLike(String submittedByLike) {
		this.submittedByLike = submittedByLike;
		return this;
	}

	/**
	 * Get submittedByLike
	 * 
	 * @return submittedByLike
	 **/

	public String getSubmittedByLike() {
		return submittedByLike;
	}

	public void setSubmittedByLike(String submittedByLike) {
		this.submittedByLike = submittedByLike;
	}

	public FormInstanceQueryRequest tenantId(String tenantId) {
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

	public FormInstanceQueryRequest tenantIdLike(String tenantIdLike) {
		this.tenantIdLike = tenantIdLike;
		return this;
	}

	/**
	 * Get tenantIdLike
	 * 
	 * @return tenantIdLike
	 **/

	public String getTenantIdLike() {
		return tenantIdLike;
	}

	public void setTenantIdLike(String tenantIdLike) {
		this.tenantIdLike = tenantIdLike;
	}

	public FormInstanceQueryRequest withoutTenantId(Boolean withoutTenantId) {
		this.withoutTenantId = withoutTenantId;
		return this;
	}

	/**
	 * Get withoutTenantId
	 * 
	 * @return withoutTenantId
	 **/

	public Boolean isWithoutTenantId() {
		return withoutTenantId;
	}

	public void setWithoutTenantId(Boolean withoutTenantId) {
		this.withoutTenantId = withoutTenantId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FormInstanceQueryRequest formInstanceQueryRequest = (FormInstanceQueryRequest) o;
		return Objects.equals(this.start, formInstanceQueryRequest.start)
				&& Objects.equals(this.size, formInstanceQueryRequest.size)
				&& Objects.equals(this.sort, formInstanceQueryRequest.sort)
				&& Objects.equals(this.order, formInstanceQueryRequest.order)
				&& Objects.equals(this.id, formInstanceQueryRequest.id)
				&& Objects.equals(this.formDefinitionId, formInstanceQueryRequest.formDefinitionId)
				&& Objects.equals(this.formDefinitionIdLike, formInstanceQueryRequest.formDefinitionIdLike)
				&& Objects.equals(this.taskId, formInstanceQueryRequest.taskId)
				&& Objects.equals(this.taskIdLike, formInstanceQueryRequest.taskIdLike)
				&& Objects.equals(this.processInstanceId, formInstanceQueryRequest.processInstanceId)
				&& Objects.equals(this.processInstanceIdLike, formInstanceQueryRequest.processInstanceIdLike)
				&& Objects.equals(this.processDefinitionId, formInstanceQueryRequest.processDefinitionId)
				&& Objects.equals(this.processDefinitionIdLike, formInstanceQueryRequest.processDefinitionIdLike)
				&& Objects.equals(this.submittedBy, formInstanceQueryRequest.submittedBy)
				&& Objects.equals(this.submittedByLike, formInstanceQueryRequest.submittedByLike)
				&& Objects.equals(this.tenantId, formInstanceQueryRequest.tenantId)
				&& Objects.equals(this.tenantIdLike, formInstanceQueryRequest.tenantIdLike)
				&& Objects.equals(this.withoutTenantId, formInstanceQueryRequest.withoutTenantId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(start, size, sort, order, id, formDefinitionId, formDefinitionIdLike, taskId, taskIdLike,
				processInstanceId, processInstanceIdLike, processDefinitionId, processDefinitionIdLike, submittedBy,
				submittedByLike, tenantId, tenantIdLike, withoutTenantId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FormInstanceQueryRequest {\n");

		sb.append("    start: ").append(toIndentedString(start)).append("\n");
		sb.append("    size: ").append(toIndentedString(size)).append("\n");
		sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
		sb.append("    order: ").append(toIndentedString(order)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    formDefinitionId: ").append(toIndentedString(formDefinitionId)).append("\n");
		sb.append("    formDefinitionIdLike: ").append(toIndentedString(formDefinitionIdLike)).append("\n");
		sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
		sb.append("    taskIdLike: ").append(toIndentedString(taskIdLike)).append("\n");
		sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
		sb.append("    processInstanceIdLike: ").append(toIndentedString(processInstanceIdLike)).append("\n");
		sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
		sb.append("    processDefinitionIdLike: ").append(toIndentedString(processDefinitionIdLike)).append("\n");
		sb.append("    submittedBy: ").append(toIndentedString(submittedBy)).append("\n");
		sb.append("    submittedByLike: ").append(toIndentedString(submittedByLike)).append("\n");
		sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
		sb.append("    tenantIdLike: ").append(toIndentedString(tenantIdLike)).append("\n");
		sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
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
