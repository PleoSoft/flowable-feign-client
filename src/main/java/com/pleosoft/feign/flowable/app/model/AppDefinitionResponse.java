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

package com.pleosoft.feign.flowable.app.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class AppDefinitionResponse {
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

	@JsonProperty("tenantId")
	private String tenantId = null;

	public AppDefinitionResponse id(String id) {
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

	public AppDefinitionResponse url(String url) {
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

	public AppDefinitionResponse category(String category) {
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

	public AppDefinitionResponse name(String name) {
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

	public AppDefinitionResponse key(String key) {
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

	public AppDefinitionResponse description(String description) {
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

	public AppDefinitionResponse version(Integer version) {
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

	public AppDefinitionResponse resourceName(String resourceName) {
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

	public AppDefinitionResponse deploymentId(String deploymentId) {
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

	public AppDefinitionResponse tenantId(String tenantId) {
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
		AppDefinitionResponse appDefinitionResponse = (AppDefinitionResponse) o;
		return Objects.equals(this.id, appDefinitionResponse.id) && Objects.equals(this.url, appDefinitionResponse.url)
				&& Objects.equals(this.category, appDefinitionResponse.category)
				&& Objects.equals(this.name, appDefinitionResponse.name)
				&& Objects.equals(this.key, appDefinitionResponse.key)
				&& Objects.equals(this.description, appDefinitionResponse.description)
				&& Objects.equals(this.version, appDefinitionResponse.version)
				&& Objects.equals(this.resourceName, appDefinitionResponse.resourceName)
				&& Objects.equals(this.deploymentId, appDefinitionResponse.deploymentId)
				&& Objects.equals(this.tenantId, appDefinitionResponse.tenantId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, url, category, name, key, description, version, resourceName, deploymentId, tenantId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppDefinitionResponse {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    category: ").append(toIndentedString(category)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    key: ").append(toIndentedString(key)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
		sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
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
