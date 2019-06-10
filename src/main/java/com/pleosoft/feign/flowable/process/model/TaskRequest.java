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

import java.util.Date;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class TaskRequest {
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

	@JsonProperty("dueDate")
	private Date dueDate = null;

	@JsonProperty("priority")
	private Integer priority = null;

	@JsonProperty("parentTaskId")
	private String parentTaskId = null;

	@JsonProperty("category")
	private String category = null;

	@JsonProperty("tenantId")
	private String tenantId = null;

	@JsonProperty("formKey")
	private String formKey = null;

	@JsonProperty("ownerSet")
	private Boolean ownerSet = null;

	@JsonProperty("assigneeSet")
	private Boolean assigneeSet = null;

	@JsonProperty("delegationStateSet")
	private Boolean delegationStateSet = null;

	@JsonProperty("nameSet")
	private Boolean nameSet = null;

	@JsonProperty("descriptionSet")
	private Boolean descriptionSet = null;

	@JsonProperty("duedateSet")
	private Boolean duedateSet = null;

	@JsonProperty("prioritySet")
	private Boolean prioritySet = null;

	@JsonProperty("parentTaskIdSet")
	private Boolean parentTaskIdSet = null;

	@JsonProperty("categorySet")
	private Boolean categorySet = null;

	@JsonProperty("tenantIdSet")
	private Boolean tenantIdSet = null;

	@JsonProperty("formKeySet")
	private Boolean formKeySet = null;

	public TaskRequest owner(String owner) {
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

	public TaskRequest assignee(String assignee) {
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

	public TaskRequest delegationState(String delegationState) {
		this.delegationState = delegationState;
		return this;
	}

	/**
	 * Get delegationState
	 * 
	 * @return delegationState
	 **/

	public String getDelegationState() {
		return delegationState;
	}

	public void setDelegationState(String delegationState) {
		this.delegationState = delegationState;
	}

	public TaskRequest name(String name) {
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

	public TaskRequest description(String description) {
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

	public TaskRequest dueDate(Date dueDate) {
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

	public TaskRequest priority(Integer priority) {
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

	public TaskRequest parentTaskId(String parentTaskId) {
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

	public TaskRequest category(String category) {
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

	public TaskRequest tenantId(String tenantId) {
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

	public TaskRequest formKey(String formKey) {
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

	public TaskRequest ownerSet(Boolean ownerSet) {
		this.ownerSet = ownerSet;
		return this;
	}

	/**
	 * Get ownerSet
	 * 
	 * @return ownerSet
	 **/

	public Boolean isOwnerSet() {
		return ownerSet;
	}

	public void setOwnerSet(Boolean ownerSet) {
		this.ownerSet = ownerSet;
	}

	public TaskRequest assigneeSet(Boolean assigneeSet) {
		this.assigneeSet = assigneeSet;
		return this;
	}

	/**
	 * Get assigneeSet
	 * 
	 * @return assigneeSet
	 **/

	public Boolean isAssigneeSet() {
		return assigneeSet;
	}

	public void setAssigneeSet(Boolean assigneeSet) {
		this.assigneeSet = assigneeSet;
	}

	public TaskRequest delegationStateSet(Boolean delegationStateSet) {
		this.delegationStateSet = delegationStateSet;
		return this;
	}

	/**
	 * Get delegationStateSet
	 * 
	 * @return delegationStateSet
	 **/

	public Boolean isDelegationStateSet() {
		return delegationStateSet;
	}

	public void setDelegationStateSet(Boolean delegationStateSet) {
		this.delegationStateSet = delegationStateSet;
	}

	public TaskRequest nameSet(Boolean nameSet) {
		this.nameSet = nameSet;
		return this;
	}

	/**
	 * Get nameSet
	 * 
	 * @return nameSet
	 **/

	public Boolean isNameSet() {
		return nameSet;
	}

	public void setNameSet(Boolean nameSet) {
		this.nameSet = nameSet;
	}

	public TaskRequest descriptionSet(Boolean descriptionSet) {
		this.descriptionSet = descriptionSet;
		return this;
	}

	/**
	 * Get descriptionSet
	 * 
	 * @return descriptionSet
	 **/

	public Boolean isDescriptionSet() {
		return descriptionSet;
	}

	public void setDescriptionSet(Boolean descriptionSet) {
		this.descriptionSet = descriptionSet;
	}

	public TaskRequest duedateSet(Boolean duedateSet) {
		this.duedateSet = duedateSet;
		return this;
	}

	/**
	 * Get duedateSet
	 * 
	 * @return duedateSet
	 **/

	public Boolean isDuedateSet() {
		return duedateSet;
	}

	public void setDuedateSet(Boolean duedateSet) {
		this.duedateSet = duedateSet;
	}

	public TaskRequest prioritySet(Boolean prioritySet) {
		this.prioritySet = prioritySet;
		return this;
	}

	/**
	 * Get prioritySet
	 * 
	 * @return prioritySet
	 **/

	public Boolean isPrioritySet() {
		return prioritySet;
	}

	public void setPrioritySet(Boolean prioritySet) {
		this.prioritySet = prioritySet;
	}

	public TaskRequest parentTaskIdSet(Boolean parentTaskIdSet) {
		this.parentTaskIdSet = parentTaskIdSet;
		return this;
	}

	/**
	 * Get parentTaskIdSet
	 * 
	 * @return parentTaskIdSet
	 **/

	public Boolean isParentTaskIdSet() {
		return parentTaskIdSet;
	}

	public void setParentTaskIdSet(Boolean parentTaskIdSet) {
		this.parentTaskIdSet = parentTaskIdSet;
	}

	public TaskRequest categorySet(Boolean categorySet) {
		this.categorySet = categorySet;
		return this;
	}

	/**
	 * Get categorySet
	 * 
	 * @return categorySet
	 **/

	public Boolean isCategorySet() {
		return categorySet;
	}

	public void setCategorySet(Boolean categorySet) {
		this.categorySet = categorySet;
	}

	public TaskRequest tenantIdSet(Boolean tenantIdSet) {
		this.tenantIdSet = tenantIdSet;
		return this;
	}

	/**
	 * Get tenantIdSet
	 * 
	 * @return tenantIdSet
	 **/

	public Boolean isTenantIdSet() {
		return tenantIdSet;
	}

	public void setTenantIdSet(Boolean tenantIdSet) {
		this.tenantIdSet = tenantIdSet;
	}

	public TaskRequest formKeySet(Boolean formKeySet) {
		this.formKeySet = formKeySet;
		return this;
	}

	/**
	 * Get formKeySet
	 * 
	 * @return formKeySet
	 **/

	public Boolean isFormKeySet() {
		return formKeySet;
	}

	public void setFormKeySet(Boolean formKeySet) {
		this.formKeySet = formKeySet;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TaskRequest taskRequest = (TaskRequest) o;
		return Objects.equals(this.owner, taskRequest.owner) && Objects.equals(this.assignee, taskRequest.assignee)
				&& Objects.equals(this.delegationState, taskRequest.delegationState)
				&& Objects.equals(this.name, taskRequest.name)
				&& Objects.equals(this.description, taskRequest.description)
				&& Objects.equals(this.dueDate, taskRequest.dueDate)
				&& Objects.equals(this.priority, taskRequest.priority)
				&& Objects.equals(this.parentTaskId, taskRequest.parentTaskId)
				&& Objects.equals(this.category, taskRequest.category)
				&& Objects.equals(this.tenantId, taskRequest.tenantId)
				&& Objects.equals(this.formKey, taskRequest.formKey)
				&& Objects.equals(this.ownerSet, taskRequest.ownerSet)
				&& Objects.equals(this.assigneeSet, taskRequest.assigneeSet)
				&& Objects.equals(this.delegationStateSet, taskRequest.delegationStateSet)
				&& Objects.equals(this.nameSet, taskRequest.nameSet)
				&& Objects.equals(this.descriptionSet, taskRequest.descriptionSet)
				&& Objects.equals(this.duedateSet, taskRequest.duedateSet)
				&& Objects.equals(this.prioritySet, taskRequest.prioritySet)
				&& Objects.equals(this.parentTaskIdSet, taskRequest.parentTaskIdSet)
				&& Objects.equals(this.categorySet, taskRequest.categorySet)
				&& Objects.equals(this.tenantIdSet, taskRequest.tenantIdSet)
				&& Objects.equals(this.formKeySet, taskRequest.formKeySet);
	}

	@Override
	public int hashCode() {
		return Objects.hash(owner, assignee, delegationState, name, description, dueDate, priority, parentTaskId,
				category, tenantId, formKey, ownerSet, assigneeSet, delegationStateSet, nameSet, descriptionSet,
				duedateSet, prioritySet, parentTaskIdSet, categorySet, tenantIdSet, formKeySet);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TaskRequest {\n");

		sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
		sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
		sb.append("    delegationState: ").append(toIndentedString(delegationState)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
		sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
		sb.append("    parentTaskId: ").append(toIndentedString(parentTaskId)).append("\n");
		sb.append("    category: ").append(toIndentedString(category)).append("\n");
		sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
		sb.append("    formKey: ").append(toIndentedString(formKey)).append("\n");
		sb.append("    ownerSet: ").append(toIndentedString(ownerSet)).append("\n");
		sb.append("    assigneeSet: ").append(toIndentedString(assigneeSet)).append("\n");
		sb.append("    delegationStateSet: ").append(toIndentedString(delegationStateSet)).append("\n");
		sb.append("    nameSet: ").append(toIndentedString(nameSet)).append("\n");
		sb.append("    descriptionSet: ").append(toIndentedString(descriptionSet)).append("\n");
		sb.append("    duedateSet: ").append(toIndentedString(duedateSet)).append("\n");
		sb.append("    prioritySet: ").append(toIndentedString(prioritySet)).append("\n");
		sb.append("    parentTaskIdSet: ").append(toIndentedString(parentTaskIdSet)).append("\n");
		sb.append("    categorySet: ").append(toIndentedString(categorySet)).append("\n");
		sb.append("    tenantIdSet: ").append(toIndentedString(tenantIdSet)).append("\n");
		sb.append("    formKeySet: ").append(toIndentedString(formKeySet)).append("\n");
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
