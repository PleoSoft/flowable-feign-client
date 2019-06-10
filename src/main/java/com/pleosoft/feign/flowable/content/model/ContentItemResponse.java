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

import java.util.Date;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class ContentItemResponse {
	@JsonProperty("id")
	private String id = null;

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

	@JsonProperty("contentAvailable")
	private Boolean contentAvailable = null;

	@JsonProperty("tenantId")
	private String tenantId = null;

	@JsonProperty("created")
	private Date created = null;

	@JsonProperty("createdBy")
	private String createdBy = null;

	@JsonProperty("lastModified")
	private Date lastModified = null;

	@JsonProperty("lastModifiedBy")
	private String lastModifiedBy = null;

	@JsonProperty("url")
	private String url = null;

	public ContentItemResponse id(String id) {
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

	public ContentItemResponse name(String name) {
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

	public ContentItemResponse mimeType(String mimeType) {
		this.mimeType = mimeType;
		return this;
	}

	/**
	 * Get mimeType
	 * 
	 * @return mimeType
	 **/

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public ContentItemResponse taskId(String taskId) {
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

	public ContentItemResponse processInstanceId(String processInstanceId) {
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

	public ContentItemResponse contentStoreId(String contentStoreId) {
		this.contentStoreId = contentStoreId;
		return this;
	}

	/**
	 * Get contentStoreId
	 * 
	 * @return contentStoreId
	 **/

	public String getContentStoreId() {
		return contentStoreId;
	}

	public void setContentStoreId(String contentStoreId) {
		this.contentStoreId = contentStoreId;
	}

	public ContentItemResponse contentStoreName(String contentStoreName) {
		this.contentStoreName = contentStoreName;
		return this;
	}

	/**
	 * Get contentStoreName
	 * 
	 * @return contentStoreName
	 **/

	public String getContentStoreName() {
		return contentStoreName;
	}

	public void setContentStoreName(String contentStoreName) {
		this.contentStoreName = contentStoreName;
	}

	public ContentItemResponse contentAvailable(Boolean contentAvailable) {
		this.contentAvailable = contentAvailable;
		return this;
	}

	/**
	 * Get contentAvailable
	 * 
	 * @return contentAvailable
	 **/

	public Boolean isContentAvailable() {
		return contentAvailable;
	}

	public void setContentAvailable(Boolean contentAvailable) {
		this.contentAvailable = contentAvailable;
	}

	public ContentItemResponse tenantId(String tenantId) {
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

	public ContentItemResponse created(Date created) {
		this.created = created;
		return this;
	}

	/**
	 * Get created
	 * 
	 * @return created
	 **/

	@Valid

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public ContentItemResponse createdBy(String createdBy) {
		this.createdBy = createdBy;
		return this;
	}

	/**
	 * Get createdBy
	 * 
	 * @return createdBy
	 **/

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public ContentItemResponse lastModified(Date lastModified) {
		this.lastModified = lastModified;
		return this;
	}

	/**
	 * Get lastModified
	 * 
	 * @return lastModified
	 **/

	@Valid

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public ContentItemResponse lastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
		return this;
	}

	/**
	 * Get lastModifiedBy
	 * 
	 * @return lastModifiedBy
	 **/

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public ContentItemResponse url(String url) {
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
		ContentItemResponse contentItemResponse = (ContentItemResponse) o;
		return Objects.equals(this.id, contentItemResponse.id) && Objects.equals(this.name, contentItemResponse.name)
				&& Objects.equals(this.mimeType, contentItemResponse.mimeType)
				&& Objects.equals(this.taskId, contentItemResponse.taskId)
				&& Objects.equals(this.processInstanceId, contentItemResponse.processInstanceId)
				&& Objects.equals(this.contentStoreId, contentItemResponse.contentStoreId)
				&& Objects.equals(this.contentStoreName, contentItemResponse.contentStoreName)
				&& Objects.equals(this.contentAvailable, contentItemResponse.contentAvailable)
				&& Objects.equals(this.tenantId, contentItemResponse.tenantId)
				&& Objects.equals(this.created, contentItemResponse.created)
				&& Objects.equals(this.createdBy, contentItemResponse.createdBy)
				&& Objects.equals(this.lastModified, contentItemResponse.lastModified)
				&& Objects.equals(this.lastModifiedBy, contentItemResponse.lastModifiedBy)
				&& Objects.equals(this.url, contentItemResponse.url);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, mimeType, taskId, processInstanceId, contentStoreId, contentStoreName,
				contentAvailable, tenantId, created, createdBy, lastModified, lastModifiedBy, url);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ContentItemResponse {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
		sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
		sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
		sb.append("    contentStoreId: ").append(toIndentedString(contentStoreId)).append("\n");
		sb.append("    contentStoreName: ").append(toIndentedString(contentStoreName)).append("\n");
		sb.append("    contentAvailable: ").append(toIndentedString(contentAvailable)).append("\n");
		sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
		sb.append("    created: ").append(toIndentedString(created)).append("\n");
		sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
		sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
		sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
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
