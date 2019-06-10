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

public class ModelRequest {
	@JsonProperty("name")
	private String name = null;

	@JsonProperty("key")
	private String key = null;

	@JsonProperty("category")
	private String category = null;

	@JsonProperty("version")
	private Integer version = null;

	@JsonProperty("metaInfo")
	private String metaInfo = null;

	@JsonProperty("deploymentId")
	private String deploymentId = null;

	@JsonProperty("tenantId")
	private String tenantId = null;

	public ModelRequest name(String name) {
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

	public ModelRequest key(String key) {
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

	public ModelRequest category(String category) {
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

	public ModelRequest version(Integer version) {
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

	public ModelRequest metaInfo(String metaInfo) {
		this.metaInfo = metaInfo;
		return this;
	}

	/**
	 * Get metaInfo
	 * 
	 * @return metaInfo
	 **/

	public String getMetaInfo() {
		return metaInfo;
	}

	public void setMetaInfo(String metaInfo) {
		this.metaInfo = metaInfo;
	}

	public ModelRequest deploymentId(String deploymentId) {
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

	public ModelRequest tenantId(String tenantId) {
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
		ModelRequest modelRequest = (ModelRequest) o;
		return Objects.equals(this.name, modelRequest.name) && Objects.equals(this.key, modelRequest.key)
				&& Objects.equals(this.category, modelRequest.category)
				&& Objects.equals(this.version, modelRequest.version)
				&& Objects.equals(this.metaInfo, modelRequest.metaInfo)
				&& Objects.equals(this.deploymentId, modelRequest.deploymentId)
				&& Objects.equals(this.tenantId, modelRequest.tenantId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, key, category, version, metaInfo, deploymentId, tenantId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ModelRequest {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    key: ").append(toIndentedString(key)).append("\n");
		sb.append("    category: ").append(toIndentedString(category)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    metaInfo: ").append(toIndentedString(metaInfo)).append("\n");
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
