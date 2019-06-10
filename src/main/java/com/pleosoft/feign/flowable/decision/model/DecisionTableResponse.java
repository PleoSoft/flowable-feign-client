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

package com.pleosoft.feign.flowable.decision.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class DecisionTableResponse {
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

	public DecisionTableResponse id(String id) {
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

	public DecisionTableResponse url(String url) {
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

	public DecisionTableResponse category(String category) {
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

	public DecisionTableResponse name(String name) {
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

	public DecisionTableResponse key(String key) {
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

	public DecisionTableResponse description(String description) {
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

	public DecisionTableResponse version(Integer version) {
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

	public DecisionTableResponse resourceName(String resourceName) {
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

	public DecisionTableResponse deploymentId(String deploymentId) {
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

	public DecisionTableResponse parentDeploymentId(String parentDeploymentId) {
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

	public DecisionTableResponse tenantId(String tenantId) {
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
		DecisionTableResponse decisionTableResponse = (DecisionTableResponse) o;
		return Objects.equals(this.id, decisionTableResponse.id) && Objects.equals(this.url, decisionTableResponse.url)
				&& Objects.equals(this.category, decisionTableResponse.category)
				&& Objects.equals(this.name, decisionTableResponse.name)
				&& Objects.equals(this.key, decisionTableResponse.key)
				&& Objects.equals(this.description, decisionTableResponse.description)
				&& Objects.equals(this.version, decisionTableResponse.version)
				&& Objects.equals(this.resourceName, decisionTableResponse.resourceName)
				&& Objects.equals(this.deploymentId, decisionTableResponse.deploymentId)
				&& Objects.equals(this.parentDeploymentId, decisionTableResponse.parentDeploymentId)
				&& Objects.equals(this.tenantId, decisionTableResponse.tenantId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, url, category, name, key, description, version, resourceName, deploymentId,
				parentDeploymentId, tenantId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DecisionTableResponse {\n");

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
