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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class ContentItemQueryRequest {
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

	@JsonProperty("ids")
	@Valid
	private List<String> ids = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("nameLike")
	private String nameLike = null;

	@JsonProperty("mimeType")
	private String mimeType = null;

	@JsonProperty("mimeTypeLike")
	private String mimeTypeLike = null;

	@JsonProperty("taskId")
	private String taskId = null;

	@JsonProperty("taskIdLike")
	private String taskIdLike = null;

	@JsonProperty("processInstanceId")
	private String processInstanceId = null;

	@JsonProperty("processInstanceIdLike")
	private String processInstanceIdLike = null;

	@JsonProperty("contentStoreId")
	private String contentStoreId = null;

	@JsonProperty("contentStoreIdLike")
	private String contentStoreIdLike = null;

	@JsonProperty("contentStoreName")
	private String contentStoreName = null;

	@JsonProperty("contentStoreNameLike")
	private String contentStoreNameLike = null;

	@JsonProperty("contentSize")
	private Long contentSize = null;

	@JsonProperty("minimumContentSize")
	private Long minimumContentSize = null;

	@JsonProperty("maximumContentSize")
	private Long maximumContentSize = null;

	@JsonProperty("contentAvailable")
	private Boolean contentAvailable = null;

	@JsonProperty("field")
	private String field = null;

	@JsonProperty("fieldLike")
	private String fieldLike = null;

	@JsonProperty("createdOn")
	private Date createdOn = null;

	@JsonProperty("createdBefore")
	private Date createdBefore = null;

	@JsonProperty("createdAfter")
	private Date createdAfter = null;

	@JsonProperty("createdBy")
	private String createdBy = null;

	@JsonProperty("createdByLike")
	private String createdByLike = null;

	@JsonProperty("lastModifiedOn")
	private Date lastModifiedOn = null;

	@JsonProperty("lastModifiedBefore")
	private Date lastModifiedBefore = null;

	@JsonProperty("lastModifiedAfter")
	private Date lastModifiedAfter = null;

	@JsonProperty("lastModifiedBy")
	private String lastModifiedBy = null;

	@JsonProperty("lastModifiedByLike")
	private String lastModifiedByLike = null;

	@JsonProperty("tenantId")
	private String tenantId = null;

	@JsonProperty("tenantIdLike")
	private String tenantIdLike = null;

	@JsonProperty("withoutTenantId")
	private Boolean withoutTenantId = null;

	public ContentItemQueryRequest start(Integer start) {
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

	public ContentItemQueryRequest size(Integer size) {
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

	public ContentItemQueryRequest sort(String sort) {
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

	public ContentItemQueryRequest order(String order) {
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

	public ContentItemQueryRequest id(String id) {
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

	public ContentItemQueryRequest ids(List<String> ids) {
		this.ids = ids;
		return this;
	}

	public ContentItemQueryRequest addIdsItem(String idsItem) {
		if (this.ids == null) {
			this.ids = new ArrayList<String>();
		}
		this.ids.add(idsItem);
		return this;
	}

	/**
	 * Get ids
	 * 
	 * @return ids
	 **/

	public List<String> getIds() {
		return ids;
	}

	public void setIds(List<String> ids) {
		this.ids = ids;
	}

	public ContentItemQueryRequest name(String name) {
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

	public ContentItemQueryRequest nameLike(String nameLike) {
		this.nameLike = nameLike;
		return this;
	}

	/**
	 * Get nameLike
	 * 
	 * @return nameLike
	 **/

	public String getNameLike() {
		return nameLike;
	}

	public void setNameLike(String nameLike) {
		this.nameLike = nameLike;
	}

	public ContentItemQueryRequest mimeType(String mimeType) {
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

	public ContentItemQueryRequest mimeTypeLike(String mimeTypeLike) {
		this.mimeTypeLike = mimeTypeLike;
		return this;
	}

	/**
	 * Get mimeTypeLike
	 * 
	 * @return mimeTypeLike
	 **/

	public String getMimeTypeLike() {
		return mimeTypeLike;
	}

	public void setMimeTypeLike(String mimeTypeLike) {
		this.mimeTypeLike = mimeTypeLike;
	}

	public ContentItemQueryRequest taskId(String taskId) {
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

	public ContentItemQueryRequest taskIdLike(String taskIdLike) {
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

	public ContentItemQueryRequest processInstanceId(String processInstanceId) {
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

	public ContentItemQueryRequest processInstanceIdLike(String processInstanceIdLike) {
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

	public ContentItemQueryRequest contentStoreId(String contentStoreId) {
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

	public ContentItemQueryRequest contentStoreIdLike(String contentStoreIdLike) {
		this.contentStoreIdLike = contentStoreIdLike;
		return this;
	}

	/**
	 * Get contentStoreIdLike
	 * 
	 * @return contentStoreIdLike
	 **/

	public String getContentStoreIdLike() {
		return contentStoreIdLike;
	}

	public void setContentStoreIdLike(String contentStoreIdLike) {
		this.contentStoreIdLike = contentStoreIdLike;
	}

	public ContentItemQueryRequest contentStoreName(String contentStoreName) {
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

	public ContentItemQueryRequest contentStoreNameLike(String contentStoreNameLike) {
		this.contentStoreNameLike = contentStoreNameLike;
		return this;
	}

	/**
	 * Get contentStoreNameLike
	 * 
	 * @return contentStoreNameLike
	 **/

	public String getContentStoreNameLike() {
		return contentStoreNameLike;
	}

	public void setContentStoreNameLike(String contentStoreNameLike) {
		this.contentStoreNameLike = contentStoreNameLike;
	}

	public ContentItemQueryRequest contentSize(Long contentSize) {
		this.contentSize = contentSize;
		return this;
	}

	/**
	 * Get contentSize
	 * 
	 * @return contentSize
	 **/

	public Long getContentSize() {
		return contentSize;
	}

	public void setContentSize(Long contentSize) {
		this.contentSize = contentSize;
	}

	public ContentItemQueryRequest minimumContentSize(Long minimumContentSize) {
		this.minimumContentSize = minimumContentSize;
		return this;
	}

	/**
	 * Get minimumContentSize
	 * 
	 * @return minimumContentSize
	 **/

	public Long getMinimumContentSize() {
		return minimumContentSize;
	}

	public void setMinimumContentSize(Long minimumContentSize) {
		this.minimumContentSize = minimumContentSize;
	}

	public ContentItemQueryRequest maximumContentSize(Long maximumContentSize) {
		this.maximumContentSize = maximumContentSize;
		return this;
	}

	/**
	 * Get maximumContentSize
	 * 
	 * @return maximumContentSize
	 **/

	public Long getMaximumContentSize() {
		return maximumContentSize;
	}

	public void setMaximumContentSize(Long maximumContentSize) {
		this.maximumContentSize = maximumContentSize;
	}

	public ContentItemQueryRequest contentAvailable(Boolean contentAvailable) {
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

	public ContentItemQueryRequest field(String field) {
		this.field = field;
		return this;
	}

	/**
	 * Get field
	 * 
	 * @return field
	 **/

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public ContentItemQueryRequest fieldLike(String fieldLike) {
		this.fieldLike = fieldLike;
		return this;
	}

	/**
	 * Get fieldLike
	 * 
	 * @return fieldLike
	 **/

	public String getFieldLike() {
		return fieldLike;
	}

	public void setFieldLike(String fieldLike) {
		this.fieldLike = fieldLike;
	}

	public ContentItemQueryRequest createdOn(Date createdOn) {
		this.createdOn = createdOn;
		return this;
	}

	/**
	 * Get createdOn
	 * 
	 * @return createdOn
	 **/

	@Valid

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public ContentItemQueryRequest createdBefore(Date createdBefore) {
		this.createdBefore = createdBefore;
		return this;
	}

	/**
	 * Get createdBefore
	 * 
	 * @return createdBefore
	 **/

	@Valid

	public Date getCreatedBefore() {
		return createdBefore;
	}

	public void setCreatedBefore(Date createdBefore) {
		this.createdBefore = createdBefore;
	}

	public ContentItemQueryRequest createdAfter(Date createdAfter) {
		this.createdAfter = createdAfter;
		return this;
	}

	/**
	 * Get createdAfter
	 * 
	 * @return createdAfter
	 **/

	@Valid

	public Date getCreatedAfter() {
		return createdAfter;
	}

	public void setCreatedAfter(Date createdAfter) {
		this.createdAfter = createdAfter;
	}

	public ContentItemQueryRequest createdBy(String createdBy) {
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

	public ContentItemQueryRequest createdByLike(String createdByLike) {
		this.createdByLike = createdByLike;
		return this;
	}

	/**
	 * Get createdByLike
	 * 
	 * @return createdByLike
	 **/

	public String getCreatedByLike() {
		return createdByLike;
	}

	public void setCreatedByLike(String createdByLike) {
		this.createdByLike = createdByLike;
	}

	public ContentItemQueryRequest lastModifiedOn(Date lastModifiedOn) {
		this.lastModifiedOn = lastModifiedOn;
		return this;
	}

	/**
	 * Get lastModifiedOn
	 * 
	 * @return lastModifiedOn
	 **/

	@Valid

	public Date getLastModifiedOn() {
		return lastModifiedOn;
	}

	public void setLastModifiedOn(Date lastModifiedOn) {
		this.lastModifiedOn = lastModifiedOn;
	}

	public ContentItemQueryRequest lastModifiedBefore(Date lastModifiedBefore) {
		this.lastModifiedBefore = lastModifiedBefore;
		return this;
	}

	/**
	 * Get lastModifiedBefore
	 * 
	 * @return lastModifiedBefore
	 **/

	@Valid

	public Date getLastModifiedBefore() {
		return lastModifiedBefore;
	}

	public void setLastModifiedBefore(Date lastModifiedBefore) {
		this.lastModifiedBefore = lastModifiedBefore;
	}

	public ContentItemQueryRequest lastModifiedAfter(Date lastModifiedAfter) {
		this.lastModifiedAfter = lastModifiedAfter;
		return this;
	}

	/**
	 * Get lastModifiedAfter
	 * 
	 * @return lastModifiedAfter
	 **/

	@Valid

	public Date getLastModifiedAfter() {
		return lastModifiedAfter;
	}

	public void setLastModifiedAfter(Date lastModifiedAfter) {
		this.lastModifiedAfter = lastModifiedAfter;
	}

	public ContentItemQueryRequest lastModifiedBy(String lastModifiedBy) {
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

	public ContentItemQueryRequest lastModifiedByLike(String lastModifiedByLike) {
		this.lastModifiedByLike = lastModifiedByLike;
		return this;
	}

	/**
	 * Get lastModifiedByLike
	 * 
	 * @return lastModifiedByLike
	 **/

	public String getLastModifiedByLike() {
		return lastModifiedByLike;
	}

	public void setLastModifiedByLike(String lastModifiedByLike) {
		this.lastModifiedByLike = lastModifiedByLike;
	}

	public ContentItemQueryRequest tenantId(String tenantId) {
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

	public ContentItemQueryRequest tenantIdLike(String tenantIdLike) {
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

	public ContentItemQueryRequest withoutTenantId(Boolean withoutTenantId) {
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
		ContentItemQueryRequest contentItemQueryRequest = (ContentItemQueryRequest) o;
		return Objects.equals(this.start, contentItemQueryRequest.start)
				&& Objects.equals(this.size, contentItemQueryRequest.size)
				&& Objects.equals(this.sort, contentItemQueryRequest.sort)
				&& Objects.equals(this.order, contentItemQueryRequest.order)
				&& Objects.equals(this.id, contentItemQueryRequest.id)
				&& Objects.equals(this.ids, contentItemQueryRequest.ids)
				&& Objects.equals(this.name, contentItemQueryRequest.name)
				&& Objects.equals(this.nameLike, contentItemQueryRequest.nameLike)
				&& Objects.equals(this.mimeType, contentItemQueryRequest.mimeType)
				&& Objects.equals(this.mimeTypeLike, contentItemQueryRequest.mimeTypeLike)
				&& Objects.equals(this.taskId, contentItemQueryRequest.taskId)
				&& Objects.equals(this.taskIdLike, contentItemQueryRequest.taskIdLike)
				&& Objects.equals(this.processInstanceId, contentItemQueryRequest.processInstanceId)
				&& Objects.equals(this.processInstanceIdLike, contentItemQueryRequest.processInstanceIdLike)
				&& Objects.equals(this.contentStoreId, contentItemQueryRequest.contentStoreId)
				&& Objects.equals(this.contentStoreIdLike, contentItemQueryRequest.contentStoreIdLike)
				&& Objects.equals(this.contentStoreName, contentItemQueryRequest.contentStoreName)
				&& Objects.equals(this.contentStoreNameLike, contentItemQueryRequest.contentStoreNameLike)
				&& Objects.equals(this.contentSize, contentItemQueryRequest.contentSize)
				&& Objects.equals(this.minimumContentSize, contentItemQueryRequest.minimumContentSize)
				&& Objects.equals(this.maximumContentSize, contentItemQueryRequest.maximumContentSize)
				&& Objects.equals(this.contentAvailable, contentItemQueryRequest.contentAvailable)
				&& Objects.equals(this.field, contentItemQueryRequest.field)
				&& Objects.equals(this.fieldLike, contentItemQueryRequest.fieldLike)
				&& Objects.equals(this.createdOn, contentItemQueryRequest.createdOn)
				&& Objects.equals(this.createdBefore, contentItemQueryRequest.createdBefore)
				&& Objects.equals(this.createdAfter, contentItemQueryRequest.createdAfter)
				&& Objects.equals(this.createdBy, contentItemQueryRequest.createdBy)
				&& Objects.equals(this.createdByLike, contentItemQueryRequest.createdByLike)
				&& Objects.equals(this.lastModifiedOn, contentItemQueryRequest.lastModifiedOn)
				&& Objects.equals(this.lastModifiedBefore, contentItemQueryRequest.lastModifiedBefore)
				&& Objects.equals(this.lastModifiedAfter, contentItemQueryRequest.lastModifiedAfter)
				&& Objects.equals(this.lastModifiedBy, contentItemQueryRequest.lastModifiedBy)
				&& Objects.equals(this.lastModifiedByLike, contentItemQueryRequest.lastModifiedByLike)
				&& Objects.equals(this.tenantId, contentItemQueryRequest.tenantId)
				&& Objects.equals(this.tenantIdLike, contentItemQueryRequest.tenantIdLike)
				&& Objects.equals(this.withoutTenantId, contentItemQueryRequest.withoutTenantId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(start, size, sort, order, id, ids, name, nameLike, mimeType, mimeTypeLike, taskId,
				taskIdLike, processInstanceId, processInstanceIdLike, contentStoreId, contentStoreIdLike,
				contentStoreName, contentStoreNameLike, contentSize, minimumContentSize, maximumContentSize,
				contentAvailable, field, fieldLike, createdOn, createdBefore, createdAfter, createdBy, createdByLike,
				lastModifiedOn, lastModifiedBefore, lastModifiedAfter, lastModifiedBy, lastModifiedByLike, tenantId,
				tenantIdLike, withoutTenantId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ContentItemQueryRequest {\n");

		sb.append("    start: ").append(toIndentedString(start)).append("\n");
		sb.append("    size: ").append(toIndentedString(size)).append("\n");
		sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
		sb.append("    order: ").append(toIndentedString(order)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    nameLike: ").append(toIndentedString(nameLike)).append("\n");
		sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
		sb.append("    mimeTypeLike: ").append(toIndentedString(mimeTypeLike)).append("\n");
		sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
		sb.append("    taskIdLike: ").append(toIndentedString(taskIdLike)).append("\n");
		sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
		sb.append("    processInstanceIdLike: ").append(toIndentedString(processInstanceIdLike)).append("\n");
		sb.append("    contentStoreId: ").append(toIndentedString(contentStoreId)).append("\n");
		sb.append("    contentStoreIdLike: ").append(toIndentedString(contentStoreIdLike)).append("\n");
		sb.append("    contentStoreName: ").append(toIndentedString(contentStoreName)).append("\n");
		sb.append("    contentStoreNameLike: ").append(toIndentedString(contentStoreNameLike)).append("\n");
		sb.append("    contentSize: ").append(toIndentedString(contentSize)).append("\n");
		sb.append("    minimumContentSize: ").append(toIndentedString(minimumContentSize)).append("\n");
		sb.append("    maximumContentSize: ").append(toIndentedString(maximumContentSize)).append("\n");
		sb.append("    contentAvailable: ").append(toIndentedString(contentAvailable)).append("\n");
		sb.append("    field: ").append(toIndentedString(field)).append("\n");
		sb.append("    fieldLike: ").append(toIndentedString(fieldLike)).append("\n");
		sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("    createdBefore: ").append(toIndentedString(createdBefore)).append("\n");
		sb.append("    createdAfter: ").append(toIndentedString(createdAfter)).append("\n");
		sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
		sb.append("    createdByLike: ").append(toIndentedString(createdByLike)).append("\n");
		sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
		sb.append("    lastModifiedBefore: ").append(toIndentedString(lastModifiedBefore)).append("\n");
		sb.append("    lastModifiedAfter: ").append(toIndentedString(lastModifiedAfter)).append("\n");
		sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
		sb.append("    lastModifiedByLike: ").append(toIndentedString(lastModifiedByLike)).append("\n");
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
