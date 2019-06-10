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

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class HistoricDetailQueryRequest {
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

	@JsonProperty("processInstanceId")
	private String processInstanceId = null;

	@JsonProperty("executionId")
	private String executionId = null;

	@JsonProperty("activityInstanceId")
	private String activityInstanceId = null;

	@JsonProperty("taskId")
	private String taskId = null;

	@JsonProperty("selectOnlyFormProperties")
	private Boolean selectOnlyFormProperties = null;

	@JsonProperty("selectOnlyVariableUpdates")
	private Boolean selectOnlyVariableUpdates = null;

	public HistoricDetailQueryRequest start(Integer start) {
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

	public HistoricDetailQueryRequest size(Integer size) {
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

	public HistoricDetailQueryRequest sort(String sort) {
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

	public HistoricDetailQueryRequest order(String order) {
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

	public HistoricDetailQueryRequest id(String id) {
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

	public HistoricDetailQueryRequest processInstanceId(String processInstanceId) {
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

	public HistoricDetailQueryRequest executionId(String executionId) {
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

	public HistoricDetailQueryRequest activityInstanceId(String activityInstanceId) {
		this.activityInstanceId = activityInstanceId;
		return this;
	}

	/**
	 * Get activityInstanceId
	 * 
	 * @return activityInstanceId
	 **/

	public String getActivityInstanceId() {
		return activityInstanceId;
	}

	public void setActivityInstanceId(String activityInstanceId) {
		this.activityInstanceId = activityInstanceId;
	}

	public HistoricDetailQueryRequest taskId(String taskId) {
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

	public HistoricDetailQueryRequest selectOnlyFormProperties(Boolean selectOnlyFormProperties) {
		this.selectOnlyFormProperties = selectOnlyFormProperties;
		return this;
	}

	/**
	 * Get selectOnlyFormProperties
	 * 
	 * @return selectOnlyFormProperties
	 **/

	public Boolean isSelectOnlyFormProperties() {
		return selectOnlyFormProperties;
	}

	public void setSelectOnlyFormProperties(Boolean selectOnlyFormProperties) {
		this.selectOnlyFormProperties = selectOnlyFormProperties;
	}

	public HistoricDetailQueryRequest selectOnlyVariableUpdates(Boolean selectOnlyVariableUpdates) {
		this.selectOnlyVariableUpdates = selectOnlyVariableUpdates;
		return this;
	}

	/**
	 * Get selectOnlyVariableUpdates
	 * 
	 * @return selectOnlyVariableUpdates
	 **/

	public Boolean isSelectOnlyVariableUpdates() {
		return selectOnlyVariableUpdates;
	}

	public void setSelectOnlyVariableUpdates(Boolean selectOnlyVariableUpdates) {
		this.selectOnlyVariableUpdates = selectOnlyVariableUpdates;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		HistoricDetailQueryRequest historicDetailQueryRequest = (HistoricDetailQueryRequest) o;
		return Objects.equals(this.start, historicDetailQueryRequest.start)
				&& Objects.equals(this.size, historicDetailQueryRequest.size)
				&& Objects.equals(this.sort, historicDetailQueryRequest.sort)
				&& Objects.equals(this.order, historicDetailQueryRequest.order)
				&& Objects.equals(this.id, historicDetailQueryRequest.id)
				&& Objects.equals(this.processInstanceId, historicDetailQueryRequest.processInstanceId)
				&& Objects.equals(this.executionId, historicDetailQueryRequest.executionId)
				&& Objects.equals(this.activityInstanceId, historicDetailQueryRequest.activityInstanceId)
				&& Objects.equals(this.taskId, historicDetailQueryRequest.taskId)
				&& Objects.equals(this.selectOnlyFormProperties, historicDetailQueryRequest.selectOnlyFormProperties)
				&& Objects.equals(this.selectOnlyVariableUpdates, historicDetailQueryRequest.selectOnlyVariableUpdates);
	}

	@Override
	public int hashCode() {
		return Objects.hash(start, size, sort, order, id, processInstanceId, executionId, activityInstanceId, taskId,
				selectOnlyFormProperties, selectOnlyVariableUpdates);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class HistoricDetailQueryRequest {\n");

		sb.append("    start: ").append(toIndentedString(start)).append("\n");
		sb.append("    size: ").append(toIndentedString(size)).append("\n");
		sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
		sb.append("    order: ").append(toIndentedString(order)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
		sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
		sb.append("    activityInstanceId: ").append(toIndentedString(activityInstanceId)).append("\n");
		sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
		sb.append("    selectOnlyFormProperties: ").append(toIndentedString(selectOnlyFormProperties)).append("\n");
		sb.append("    selectOnlyVariableUpdates: ").append(toIndentedString(selectOnlyVariableUpdates)).append("\n");
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
