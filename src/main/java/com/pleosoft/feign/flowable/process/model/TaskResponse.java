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
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class TaskResponse {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("url")
	private String url = null;

	@JsonProperty("owner")
	private String owner = null;

	@JsonProperty("assignee")
	private String assignee = null;

	@JsonProperty("delegationState")
	private String delegationState = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("createTime")
	private Date createTime = null;

	@JsonProperty("dueDate")
	private Date dueDate = null;

	@JsonProperty("priority")
	private Integer priority = null;

	@JsonProperty("suspended")
	private Boolean suspended = null;

	@JsonProperty("taskDefinitionKey")
	private String taskDefinitionKey = null;

	@JsonProperty("tenantId")
	private String tenantId = null;

	@JsonProperty("category")
	private String category = null;

	@JsonProperty("formKey")
	private String formKey = null;

	@JsonProperty("parentTaskId")
	private String parentTaskId = null;

	@JsonProperty("parentTaskUrl")
	private String parentTaskUrl = null;

	@JsonProperty("executionId")
	private String executionId = null;

	@JsonProperty("executionUrl")
	private String executionUrl = null;

	@JsonProperty("processInstanceId")
	private String processInstanceId = null;

	@JsonProperty("processInstanceUrl")
	private String processInstanceUrl = null;

	@JsonProperty("processDefinitionId")
	private String processDefinitionId = null;

	@JsonProperty("processDefinitionUrl")
	private String processDefinitionUrl = null;

	@JsonProperty("variables")
	@Valid
	private List<RestVariable> variables = null;

	public TaskResponse id(String id) {
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

	public TaskResponse url(String url) {
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

	public TaskResponse owner(String owner) {
		this.owner = owner;
		return this;
	}

	/**
	 * Get owner
	 * 
	 * @return owner
	 **/

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public TaskResponse assignee(String assignee) {
		this.assignee = assignee;
		return this;
	}

	/**
	 * Get assignee
	 * 
	 * @return assignee
	 **/

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public TaskResponse delegationState(String delegationState) {
		this.delegationState = delegationState;
		return this;
	}

	/**
	 * Delegation-state of the task, can be null, \"pending\" or \"resolved\".
	 * 
	 * @return delegationState
	 **/

	public String getDelegationState() {
		return delegationState;
	}

	public void setDelegationState(String delegationState) {
		this.delegationState = delegationState;
	}

	public TaskResponse name(String name) {
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

	public TaskResponse description(String description) {
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

	public TaskResponse createTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	/**
	 * Get createTime
	 * 
	 * @return createTime
	 **/

	@Valid

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public TaskResponse dueDate(Date dueDate) {
		this.dueDate = dueDate;
		return this;
	}

	/**
	 * Get dueDate
	 * 
	 * @return dueDate
	 **/

	@Valid

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public TaskResponse priority(Integer priority) {
		this.priority = priority;
		return this;
	}

	/**
	 * Get priority
	 * 
	 * @return priority
	 **/

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public TaskResponse suspended(Boolean suspended) {
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

	public TaskResponse taskDefinitionKey(String taskDefinitionKey) {
		this.taskDefinitionKey = taskDefinitionKey;
		return this;
	}

	/**
	 * Get taskDefinitionKey
	 * 
	 * @return taskDefinitionKey
	 **/

	public String getTaskDefinitionKey() {
		return taskDefinitionKey;
	}

	public void setTaskDefinitionKey(String taskDefinitionKey) {
		this.taskDefinitionKey = taskDefinitionKey;
	}

	public TaskResponse tenantId(String tenantId) {
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

	public TaskResponse category(String category) {
		this.category = category;
		return this;
	}

	/**
	 * Get category
	 * 
	 * @return category
	 **/

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public TaskResponse formKey(String formKey) {
		this.formKey = formKey;
		return this;
	}

	/**
	 * Get formKey
	 * 
	 * @return formKey
	 **/

	public String getFormKey() {
		return formKey;
	}

	public void setFormKey(String formKey) {
		this.formKey = formKey;
	}

	public TaskResponse parentTaskId(String parentTaskId) {
		this.parentTaskId = parentTaskId;
		return this;
	}

	/**
	 * Get parentTaskId
	 * 
	 * @return parentTaskId
	 **/

	public String getParentTaskId() {
		return parentTaskId;
	}

	public void setParentTaskId(String parentTaskId) {
		this.parentTaskId = parentTaskId;
	}

	public TaskResponse parentTaskUrl(String parentTaskUrl) {
		this.parentTaskUrl = parentTaskUrl;
		return this;
	}

	/**
	 * Get parentTaskUrl
	 * 
	 * @return parentTaskUrl
	 **/

	public String getParentTaskUrl() {
		return parentTaskUrl;
	}

	public void setParentTaskUrl(String parentTaskUrl) {
		this.parentTaskUrl = parentTaskUrl;
	}

	public TaskResponse executionId(String executionId) {
		this.executionId = executionId;
		return this;
	}

	/**
	 * Get executionId
	 * 
	 * @return executionId
	 **/

	public String getExecutionId() {
		return executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}

	public TaskResponse executionUrl(String executionUrl) {
		this.executionUrl = executionUrl;
		return this;
	}

	/**
	 * Get executionUrl
	 * 
	 * @return executionUrl
	 **/

	public String getExecutionUrl() {
		return executionUrl;
	}

	public void setExecutionUrl(String executionUrl) {
		this.executionUrl = executionUrl;
	}

	public TaskResponse processInstanceId(String processInstanceId) {
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

	public TaskResponse processInstanceUrl(String processInstanceUrl) {
		this.processInstanceUrl = processInstanceUrl;
		return this;
	}

	/**
	 * Get processInstanceUrl
	 * 
	 * @return processInstanceUrl
	 **/

	public String getProcessInstanceUrl() {
		return processInstanceUrl;
	}

	public void setProcessInstanceUrl(String processInstanceUrl) {
		this.processInstanceUrl = processInstanceUrl;
	}

	public TaskResponse processDefinitionId(String processDefinitionId) {
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

	public TaskResponse processDefinitionUrl(String processDefinitionUrl) {
		this.processDefinitionUrl = processDefinitionUrl;
		return this;
	}

	/**
	 * Get processDefinitionUrl
	 * 
	 * @return processDefinitionUrl
	 **/

	public String getProcessDefinitionUrl() {
		return processDefinitionUrl;
	}

	public void setProcessDefinitionUrl(String processDefinitionUrl) {
		this.processDefinitionUrl = processDefinitionUrl;
	}

	public TaskResponse variables(List<RestVariable> variables) {
		this.variables = variables;
		return this;
	}

	public TaskResponse addVariablesItem(RestVariable variablesItem) {
		if (this.variables == null) {
			this.variables = new ArrayList<RestVariable>();
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

	public List<RestVariable> getVariables() {
		return variables;
	}

	public void setVariables(List<RestVariable> variables) {
		this.variables = variables;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TaskResponse taskResponse = (TaskResponse) o;
		return Objects.equals(this.id, taskResponse.id) && Objects.equals(this.url, taskResponse.url)
				&& Objects.equals(this.owner, taskResponse.owner)
				&& Objects.equals(this.assignee, taskResponse.assignee)
				&& Objects.equals(this.delegationState, taskResponse.delegationState)
				&& Objects.equals(this.name, taskResponse.name)
				&& Objects.equals(this.description, taskResponse.description)
				&& Objects.equals(this.createTime, taskResponse.createTime)
				&& Objects.equals(this.dueDate, taskResponse.dueDate)
				&& Objects.equals(this.priority, taskResponse.priority)
				&& Objects.equals(this.suspended, taskResponse.suspended)
				&& Objects.equals(this.taskDefinitionKey, taskResponse.taskDefinitionKey)
				&& Objects.equals(this.tenantId, taskResponse.tenantId)
				&& Objects.equals(this.category, taskResponse.category)
				&& Objects.equals(this.formKey, taskResponse.formKey)
				&& Objects.equals(this.parentTaskId, taskResponse.parentTaskId)
				&& Objects.equals(this.parentTaskUrl, taskResponse.parentTaskUrl)
				&& Objects.equals(this.executionId, taskResponse.executionId)
				&& Objects.equals(this.executionUrl, taskResponse.executionUrl)
				&& Objects.equals(this.processInstanceId, taskResponse.processInstanceId)
				&& Objects.equals(this.processInstanceUrl, taskResponse.processInstanceUrl)
				&& Objects.equals(this.processDefinitionId, taskResponse.processDefinitionId)
				&& Objects.equals(this.processDefinitionUrl, taskResponse.processDefinitionUrl)
				&& Objects.equals(this.variables, taskResponse.variables);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, url, owner, assignee, delegationState, name, description, createTime, dueDate, priority,
				suspended, taskDefinitionKey, tenantId, category, formKey, parentTaskId, parentTaskUrl, executionId,
				executionUrl, processInstanceId, processInstanceUrl, processDefinitionId, processDefinitionUrl,
				variables);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TaskResponse {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
		sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
		sb.append("    delegationState: ").append(toIndentedString(delegationState)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
		sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
		sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
		sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
		sb.append("    taskDefinitionKey: ").append(toIndentedString(taskDefinitionKey)).append("\n");
		sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
		sb.append("    category: ").append(toIndentedString(category)).append("\n");
		sb.append("    formKey: ").append(toIndentedString(formKey)).append("\n");
		sb.append("    parentTaskId: ").append(toIndentedString(parentTaskId)).append("\n");
		sb.append("    parentTaskUrl: ").append(toIndentedString(parentTaskUrl)).append("\n");
		sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
		sb.append("    executionUrl: ").append(toIndentedString(executionUrl)).append("\n");
		sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
		sb.append("    processInstanceUrl: ").append(toIndentedString(processInstanceUrl)).append("\n");
		sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
		sb.append("    processDefinitionUrl: ").append(toIndentedString(processDefinitionUrl)).append("\n");
		sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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
