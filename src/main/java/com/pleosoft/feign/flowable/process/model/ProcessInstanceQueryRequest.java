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

public class ProcessInstanceQueryRequest {
	@JsonProperty("start")
	private Integer start = null;

	@JsonProperty("size")
	private Integer size = null;

	@JsonProperty("sort")
	private String sort = null;

	@JsonProperty("order")
	private String order = null;

	@JsonProperty("processInstanceId")
	private String processInstanceId = null;

	@JsonProperty("processBusinessKey")
	private String processBusinessKey = null;

	@JsonProperty("processDefinitionId")
	private String processDefinitionId = null;

	@JsonProperty("processDefinitionKey")
	private String processDefinitionKey = null;

	@JsonProperty("superProcessInstanceId")
	private String superProcessInstanceId = null;

	@JsonProperty("subProcessInstanceId")
	private String subProcessInstanceId = null;

	@JsonProperty("excludeSubprocesses")
	private Boolean excludeSubprocesses = null;

	@JsonProperty("involvedUser")
	private String involvedUser = null;

	@JsonProperty("suspended")
	private Boolean suspended = null;

	@JsonProperty("includeProcessVariables")
	private Boolean includeProcessVariables = null;

	@JsonProperty("variables")
	@Valid
	private List<QueryVariable> variables = null;

	@JsonProperty("tenantId")
	private String tenantId = null;

	@JsonProperty("tenantIdLike")
	private String tenantIdLike = null;

	@JsonProperty("withoutTenantId")
	private Boolean withoutTenantId = null;

	public ProcessInstanceQueryRequest start(Integer start) {
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

	public ProcessInstanceQueryRequest size(Integer size) {
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

	public ProcessInstanceQueryRequest sort(String sort) {
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

	public ProcessInstanceQueryRequest order(String order) {
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

	public ProcessInstanceQueryRequest processInstanceId(String processInstanceId) {
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

	public ProcessInstanceQueryRequest processBusinessKey(String processBusinessKey) {
		this.processBusinessKey = processBusinessKey;
		return this;
	}

	/**
	 * Get processBusinessKey
	 * 
	 * @return processBusinessKey
	 **/

	public String getProcessBusinessKey() {
		return processBusinessKey;
	}

	public void setProcessBusinessKey(String processBusinessKey) {
		this.processBusinessKey = processBusinessKey;
	}

	public ProcessInstanceQueryRequest processDefinitionId(String processDefinitionId) {
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

	public ProcessInstanceQueryRequest processDefinitionKey(String processDefinitionKey) {
		this.processDefinitionKey = processDefinitionKey;
		return this;
	}

	/**
	 * Get processDefinitionKey
	 * 
	 * @return processDefinitionKey
	 **/

	public String getProcessDefinitionKey() {
		return processDefinitionKey;
	}

	public void setProcessDefinitionKey(String processDefinitionKey) {
		this.processDefinitionKey = processDefinitionKey;
	}

	public ProcessInstanceQueryRequest superProcessInstanceId(String superProcessInstanceId) {
		this.superProcessInstanceId = superProcessInstanceId;
		return this;
	}

	/**
	 * Get superProcessInstanceId
	 * 
	 * @return superProcessInstanceId
	 **/

	public String getSuperProcessInstanceId() {
		return superProcessInstanceId;
	}

	public void setSuperProcessInstanceId(String superProcessInstanceId) {
		this.superProcessInstanceId = superProcessInstanceId;
	}

	public ProcessInstanceQueryRequest subProcessInstanceId(String subProcessInstanceId) {
		this.subProcessInstanceId = subProcessInstanceId;
		return this;
	}

	/**
	 * Get subProcessInstanceId
	 * 
	 * @return subProcessInstanceId
	 **/

	public String getSubProcessInstanceId() {
		return subProcessInstanceId;
	}

	public void setSubProcessInstanceId(String subProcessInstanceId) {
		this.subProcessInstanceId = subProcessInstanceId;
	}

	public ProcessInstanceQueryRequest excludeSubprocesses(Boolean excludeSubprocesses) {
		this.excludeSubprocesses = excludeSubprocesses;
		return this;
	}

	/**
	 * Get excludeSubprocesses
	 * 
	 * @return excludeSubprocesses
	 **/

	public Boolean isExcludeSubprocesses() {
		return excludeSubprocesses;
	}

	public void setExcludeSubprocesses(Boolean excludeSubprocesses) {
		this.excludeSubprocesses = excludeSubprocesses;
	}

	public ProcessInstanceQueryRequest involvedUser(String involvedUser) {
		this.involvedUser = involvedUser;
		return this;
	}

	/**
	 * Get involvedUser
	 * 
	 * @return involvedUser
	 **/

	public String getInvolvedUser() {
		return involvedUser;
	}

	public void setInvolvedUser(String involvedUser) {
		this.involvedUser = involvedUser;
	}

	public ProcessInstanceQueryRequest suspended(Boolean suspended) {
		this.suspended = suspended;
		return this;
	}

	/**
	 * Get suspended
	 * 
	 * @return suspended
	 **/

	public Boolean isSuspended() {
		return suspended;
	}

	public void setSuspended(Boolean suspended) {
		this.suspended = suspended;
	}

	public ProcessInstanceQueryRequest includeProcessVariables(Boolean includeProcessVariables) {
		this.includeProcessVariables = includeProcessVariables;
		return this;
	}

	/**
	 * Get includeProcessVariables
	 * 
	 * @return includeProcessVariables
	 **/

	public Boolean isIncludeProcessVariables() {
		return includeProcessVariables;
	}

	public void setIncludeProcessVariables(Boolean includeProcessVariables) {
		this.includeProcessVariables = includeProcessVariables;
	}

	public ProcessInstanceQueryRequest variables(List<QueryVariable> variables) {
		this.variables = variables;
		return this;
	}

	public ProcessInstanceQueryRequest addVariablesItem(QueryVariable variablesItem) {
		if (this.variables == null) {
			this.variables = new ArrayList<QueryVariable>();
		}
		this.variables.add(variablesItem);
		return this;
	}

	/**
	 * Get variables
	 * 
	 * @return variables
	 **/

	@Valid

	public List<QueryVariable> getVariables() {
		return variables;
	}

	public void setVariables(List<QueryVariable> variables) {
		this.variables = variables;
	}

	public ProcessInstanceQueryRequest tenantId(String tenantId) {
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

	public ProcessInstanceQueryRequest tenantIdLike(String tenantIdLike) {
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

	public ProcessInstanceQueryRequest withoutTenantId(Boolean withoutTenantId) {
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
		ProcessInstanceQueryRequest processInstanceQueryRequest = (ProcessInstanceQueryRequest) o;
		return Objects.equals(this.start, processInstanceQueryRequest.start)
				&& Objects.equals(this.size, processInstanceQueryRequest.size)
				&& Objects.equals(this.sort, processInstanceQueryRequest.sort)
				&& Objects.equals(this.order, processInstanceQueryRequest.order)
				&& Objects.equals(this.processInstanceId, processInstanceQueryRequest.processInstanceId)
				&& Objects.equals(this.processBusinessKey, processInstanceQueryRequest.processBusinessKey)
				&& Objects.equals(this.processDefinitionId, processInstanceQueryRequest.processDefinitionId)
				&& Objects.equals(this.processDefinitionKey, processInstanceQueryRequest.processDefinitionKey)
				&& Objects.equals(this.superProcessInstanceId, processInstanceQueryRequest.superProcessInstanceId)
				&& Objects.equals(this.subProcessInstanceId, processInstanceQueryRequest.subProcessInstanceId)
				&& Objects.equals(this.excludeSubprocesses, processInstanceQueryRequest.excludeSubprocesses)
				&& Objects.equals(this.involvedUser, processInstanceQueryRequest.involvedUser)
				&& Objects.equals(this.suspended, processInstanceQueryRequest.suspended)
				&& Objects.equals(this.includeProcessVariables, processInstanceQueryRequest.includeProcessVariables)
				&& Objects.equals(this.variables, processInstanceQueryRequest.variables)
				&& Objects.equals(this.tenantId, processInstanceQueryRequest.tenantId)
				&& Objects.equals(this.tenantIdLike, processInstanceQueryRequest.tenantIdLike)
				&& Objects.equals(this.withoutTenantId, processInstanceQueryRequest.withoutTenantId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(start, size, sort, order, processInstanceId, processBusinessKey, processDefinitionId,
				processDefinitionKey, superProcessInstanceId, subProcessInstanceId, excludeSubprocesses, involvedUser,
				suspended, includeProcessVariables, variables, tenantId, tenantIdLike, withoutTenantId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProcessInstanceQueryRequest {\n");

		sb.append("    start: ").append(toIndentedString(start)).append("\n");
		sb.append("    size: ").append(toIndentedString(size)).append("\n");
		sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
		sb.append("    order: ").append(toIndentedString(order)).append("\n");
		sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
		sb.append("    processBusinessKey: ").append(toIndentedString(processBusinessKey)).append("\n");
		sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
		sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
		sb.append("    superProcessInstanceId: ").append(toIndentedString(superProcessInstanceId)).append("\n");
		sb.append("    subProcessInstanceId: ").append(toIndentedString(subProcessInstanceId)).append("\n");
		sb.append("    excludeSubprocesses: ").append(toIndentedString(excludeSubprocesses)).append("\n");
		sb.append("    involvedUser: ").append(toIndentedString(involvedUser)).append("\n");
		sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
		sb.append("    includeProcessVariables: ").append(toIndentedString(includeProcessVariables)).append("\n");
		sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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
