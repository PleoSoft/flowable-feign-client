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

public class ExecutionQueryRequest {
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

	@JsonProperty("activityId")
	private String activityId = null;

	@JsonProperty("parentId")
	private String parentId = null;

	@JsonProperty("processInstanceId")
	private String processInstanceId = null;

	@JsonProperty("processBusinessKey")
	private String processBusinessKey = null;

	@JsonProperty("processDefinitionId")
	private String processDefinitionId = null;

	@JsonProperty("processDefinitionKey")
	private String processDefinitionKey = null;

	@JsonProperty("signalEventSubscriptionName")
	private String signalEventSubscriptionName = null;

	@JsonProperty("messageEventSubscriptionName")
	private String messageEventSubscriptionName = null;

	@JsonProperty("variables")
	@Valid
	private List<QueryVariable> variables = null;

	@JsonProperty("processInstanceVariables")
	@Valid
	private List<QueryVariable> processInstanceVariables = null;

	@JsonProperty("tenantId")
	private String tenantId = null;

	@JsonProperty("tenantIdLike")
	private String tenantIdLike = null;

	@JsonProperty("withoutTenantId")
	private Boolean withoutTenantId = null;

	public ExecutionQueryRequest start(Integer start) {
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

	public ExecutionQueryRequest size(Integer size) {
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

	public ExecutionQueryRequest sort(String sort) {
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

	public ExecutionQueryRequest order(String order) {
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

	public ExecutionQueryRequest id(String id) {
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

	public ExecutionQueryRequest activityId(String activityId) {
		this.activityId = activityId;
		return this;
	}

	/**
	 * Get activityId
	 * 
	 * @return activityId
	 **/

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public ExecutionQueryRequest parentId(String parentId) {
		this.parentId = parentId;
		return this;
	}

	/**
	 * Get parentId
	 * 
	 * @return parentId
	 **/

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public ExecutionQueryRequest processInstanceId(String processInstanceId) {
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

	public ExecutionQueryRequest processBusinessKey(String processBusinessKey) {
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

	public ExecutionQueryRequest processDefinitionId(String processDefinitionId) {
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

	public ExecutionQueryRequest processDefinitionKey(String processDefinitionKey) {
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

	public ExecutionQueryRequest signalEventSubscriptionName(String signalEventSubscriptionName) {
		this.signalEventSubscriptionName = signalEventSubscriptionName;
		return this;
	}

	/**
	 * Get signalEventSubscriptionName
	 * 
	 * @return signalEventSubscriptionName
	 **/

	public String getSignalEventSubscriptionName() {
		return signalEventSubscriptionName;
	}

	public void setSignalEventSubscriptionName(String signalEventSubscriptionName) {
		this.signalEventSubscriptionName = signalEventSubscriptionName;
	}

	public ExecutionQueryRequest messageEventSubscriptionName(String messageEventSubscriptionName) {
		this.messageEventSubscriptionName = messageEventSubscriptionName;
		return this;
	}

	/**
	 * Get messageEventSubscriptionName
	 * 
	 * @return messageEventSubscriptionName
	 **/

	public String getMessageEventSubscriptionName() {
		return messageEventSubscriptionName;
	}

	public void setMessageEventSubscriptionName(String messageEventSubscriptionName) {
		this.messageEventSubscriptionName = messageEventSubscriptionName;
	}

	public ExecutionQueryRequest variables(List<QueryVariable> variables) {
		this.variables = variables;
		return this;
	}

	public ExecutionQueryRequest addVariablesItem(QueryVariable variablesItem) {
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

	public ExecutionQueryRequest processInstanceVariables(List<QueryVariable> processInstanceVariables) {
		this.processInstanceVariables = processInstanceVariables;
		return this;
	}

	public ExecutionQueryRequest addProcessInstanceVariablesItem(QueryVariable processInstanceVariablesItem) {
		if (this.processInstanceVariables == null) {
			this.processInstanceVariables = new ArrayList<QueryVariable>();
		}
		this.processInstanceVariables.add(processInstanceVariablesItem);
		return this;
	}

	/**
	 * Get processInstanceVariables
	 * 
	 * @return processInstanceVariables
	 **/

	@Valid

	public List<QueryVariable> getProcessInstanceVariables() {
		return processInstanceVariables;
	}

	public void setProcessInstanceVariables(List<QueryVariable> processInstanceVariables) {
		this.processInstanceVariables = processInstanceVariables;
	}

	public ExecutionQueryRequest tenantId(String tenantId) {
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

	public ExecutionQueryRequest tenantIdLike(String tenantIdLike) {
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

	public ExecutionQueryRequest withoutTenantId(Boolean withoutTenantId) {
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
		ExecutionQueryRequest executionQueryRequest = (ExecutionQueryRequest) o;
		return Objects.equals(this.start, executionQueryRequest.start)
				&& Objects.equals(this.size, executionQueryRequest.size)
				&& Objects.equals(this.sort, executionQueryRequest.sort)
				&& Objects.equals(this.order, executionQueryRequest.order)
				&& Objects.equals(this.id, executionQueryRequest.id)
				&& Objects.equals(this.activityId, executionQueryRequest.activityId)
				&& Objects.equals(this.parentId, executionQueryRequest.parentId)
				&& Objects.equals(this.processInstanceId, executionQueryRequest.processInstanceId)
				&& Objects.equals(this.processBusinessKey, executionQueryRequest.processBusinessKey)
				&& Objects.equals(this.processDefinitionId, executionQueryRequest.processDefinitionId)
				&& Objects.equals(this.processDefinitionKey, executionQueryRequest.processDefinitionKey)
				&& Objects.equals(this.signalEventSubscriptionName, executionQueryRequest.signalEventSubscriptionName)
				&& Objects.equals(this.messageEventSubscriptionName, executionQueryRequest.messageEventSubscriptionName)
				&& Objects.equals(this.variables, executionQueryRequest.variables)
				&& Objects.equals(this.processInstanceVariables, executionQueryRequest.processInstanceVariables)
				&& Objects.equals(this.tenantId, executionQueryRequest.tenantId)
				&& Objects.equals(this.tenantIdLike, executionQueryRequest.tenantIdLike)
				&& Objects.equals(this.withoutTenantId, executionQueryRequest.withoutTenantId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(start, size, sort, order, id, activityId, parentId, processInstanceId, processBusinessKey,
				processDefinitionId, processDefinitionKey, signalEventSubscriptionName, messageEventSubscriptionName,
				variables, processInstanceVariables, tenantId, tenantIdLike, withoutTenantId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExecutionQueryRequest {\n");

		sb.append("    start: ").append(toIndentedString(start)).append("\n");
		sb.append("    size: ").append(toIndentedString(size)).append("\n");
		sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
		sb.append("    order: ").append(toIndentedString(order)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
		sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
		sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
		sb.append("    processBusinessKey: ").append(toIndentedString(processBusinessKey)).append("\n");
		sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
		sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
		sb.append("    signalEventSubscriptionName: ").append(toIndentedString(signalEventSubscriptionName))
				.append("\n");
		sb.append("    messageEventSubscriptionName: ").append(toIndentedString(messageEventSubscriptionName))
				.append("\n");
		sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
		sb.append("    processInstanceVariables: ").append(toIndentedString(processInstanceVariables)).append("\n");
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
