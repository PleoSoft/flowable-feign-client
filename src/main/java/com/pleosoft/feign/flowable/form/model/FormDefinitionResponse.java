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

public class FormDefinitionResponse {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("url")
	private String url = null;

	@JsonProperty("category")
	private String category = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("key")
	private String key = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("version")
	private Integer version = null;

	@JsonProperty("resourceName")
	private String resourceName = null;

	@JsonProperty("deploymentId")
	private String deploymentId = null;

	@JsonProperty("parentDeploymentId")
	private String parentDeploymentId = null;

	@JsonProperty("tenantId")
	private String tenantId = null;

	public FormDefinitionResponse id(String id) {
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

	public FormDefinitionResponse url(String url) {
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

	public FormDefinitionResponse category(String category) {
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

	public FormDefinitionResponse name(String name) {
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

	public FormDefinitionResponse key(String key) {
		this.key = key;
		return this;
	}

	/**
	 * Get key
	 * 
	 * @return key
	 **/

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public FormDefinitionResponse description(String description) {
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

	public FormDefinitionResponse version(Integer version) {
		this.version = version;
		return this;
	}

	/**
	 * Get version
	 * 
	 * @return version
	 **/

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public FormDefinitionResponse resourceName(String resourceName) {
		this.resourceName = resourceName;
		return this;
	}

	/**
	 * Get resourceName
	 * 
	 * @return resourceName
	 **/

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public FormDefinitionResponse deploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
		return this;
	}

	/**
	 * Get deploymentId
	 * 
	 * @return deploymentId
	 **/

	public String getDeploymentId() {
		return deploymentId;
	}

	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
	}

	public FormDefinitionResponse parentDeploymentId(String parentDeploymentId) {
		this.parentDeploymentId = parentDeploymentId;
		return this;
	}

	/**
	 * Get parentDeploymentId
	 * 
	 * @return parentDeploymentId
	 **/

	public String getParentDeploymentId() {
		return parentDeploymentId;
	}

	public void setParentDeploymentId(String parentDeploymentId) {
		this.parentDeploymentId = parentDeploymentId;
	}

	public FormDefinitionResponse tenantId(String tenantId) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FormDefinitionResponse formDefinitionResponse = (FormDefinitionResponse) o;
		return Objects.equals(this.id, formDefinitionResponse.id)
				&& Objects.equals(this.url, formDefinitionResponse.url)
				&& Objects.equals(this.category, formDefinitionResponse.category)
				&& Objects.equals(this.name, formDefinitionResponse.name)
				&& Objects.equals(this.key, formDefinitionResponse.key)
				&& Objects.equals(this.description, formDefinitionResponse.description)
				&& Objects.equals(this.version, formDefinitionResponse.version)
				&& Objects.equals(this.resourceName, formDefinitionResponse.resourceName)
				&& Objects.equals(this.deploymentId, formDefinitionResponse.deploymentId)
				&& Objects.equals(this.parentDeploymentId, formDefinitionResponse.parentDeploymentId)
				&& Objects.equals(this.tenantId, formDefinitionResponse.tenantId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, url, category, name, key, description, version, resourceName, deploymentId,
				parentDeploymentId, tenantId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FormDefinitionResponse {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    category: ").append(toIndentedString(category)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    key: ").append(toIndentedString(key)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
		sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
		sb.append("    parentDeploymentId: ").append(toIndentedString(parentDeploymentId)).append("\n");
		sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
