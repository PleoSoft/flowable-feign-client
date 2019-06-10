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

package com.pleosoft.feign.flowable.content.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class ContentItemRequest {
	@JsonProperty("name")
	private String name = null;

	@JsonProperty("mimeType")
	private String mimeType = null;

	@JsonProperty("taskId")
	private String taskId = null;

	@JsonProperty("processInstanceId")
	private String processInstanceId = null;

	@JsonProperty("contentStoreId")
	private String contentStoreId = null;

	@JsonProperty("contentStoreName")
	private String contentStoreName = null;

	@JsonProperty("field")
	private String field = null;

	@JsonProperty("tenantId")
	private String tenantId = null;

	@JsonProperty("createdBy")
	private String createdBy = null;

	@JsonProperty("lastModifiedBy")
	private String lastModifiedBy = null;

	public ContentItemRequest name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the content item
	 * 
	 * @return name
	 **/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ContentItemRequest mimeType(String mimeType) {
		this.mimeType = mimeType;
		return this;
	}

	/**
	 * Mime type of the content item, optional
	 * 
	 * @return mimeType
	 **/

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public ContentItemRequest taskId(String taskId) {
		this.taskId = taskId;
		return this;
	}

	/**
	 * Task identifier for the content item, optional
	 * 
	 * @return taskId
	 **/

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public ContentItemRequest processInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
		return this;
	}

	/**
	 * Process instance identifier for the content item, optional
	 * 
	 * @return processInstanceId
	 **/

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public ContentItemRequest contentStoreId(String contentStoreId) {
		this.contentStoreId = contentStoreId;
		return this;
	}

	/**
	 * The identifier of the content item in an external content store,
	 * optional.
	 * 
	 * @return contentStoreId
	 **/

	public String getContentStoreId() {
		return contentStoreId;
	}

	public void setContentStoreId(String contentStoreId) {
		this.contentStoreId = contentStoreId;
	}

	public ContentItemRequest contentStoreName(String contentStoreName) {
		this.contentStoreName = contentStoreName;
		return this;
	}

	/**
	 * The name of an external content store, optional
	 * 
	 * @return contentStoreName
	 **/

	public String getContentStoreName() {
		return contentStoreName;
	}

	public void setContentStoreName(String contentStoreName) {
		this.contentStoreName = contentStoreName;
	}

	public ContentItemRequest field(String field) {
		this.field = field;
		return this;
	}

	/**
	 * The form field for the content item, optional
	 * 
	 * @return field
	 **/

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public ContentItemRequest tenantId(String tenantId) {
		this.tenantId = tenantId;
		return this;
	}

	/**
	 * The tenant identifier of the content item, optional.
	 * 
	 * @return tenantId
	 **/

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public ContentItemRequest createdBy(String createdBy) {
		this.createdBy = createdBy;
		return this;
	}

	/**
	 * The user identifier that created the content item, optional
	 * 
	 * @return createdBy
	 **/

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public ContentItemRequest lastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
		return this;
	}

	/**
	 * The user identifier that last modified the content item, optional
	 * 
	 * @return lastModifiedBy
	 **/

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ContentItemRequest contentItemRequest = (ContentItemRequest) o;
		return Objects.equals(this.name, contentItemRequest.name)
				&& Objects.equals(this.mimeType, contentItemRequest.mimeType)
				&& Objects.equals(this.taskId, contentItemRequest.taskId)
				&& Objects.equals(this.processInstanceId, contentItemRequest.processInstanceId)
				&& Objects.equals(this.contentStoreId, contentItemRequest.contentStoreId)
				&& Objects.equals(this.contentStoreName, contentItemRequest.contentStoreName)
				&& Objects.equals(this.field, contentItemRequest.field)
				&& Objects.equals(this.tenantId, contentItemRequest.tenantId)
				&& Objects.equals(this.createdBy, contentItemRequest.createdBy)
				&& Objects.equals(this.lastModifiedBy, contentItemRequest.lastModifiedBy);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, mimeType, taskId, processInstanceId, contentStoreId, contentStoreName, field,
				tenantId, createdBy, lastModifiedBy);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ContentItemRequest {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
		sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
		sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
		sb.append("    contentStoreId: ").append(toIndentedString(contentStoreId)).append("\n");
		sb.append("    contentStoreName: ").append(toIndentedString(contentStoreName)).append("\n");
		sb.append("    field: ").append(toIndentedString(field)).append("\n");
		sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
		sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
		sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
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
