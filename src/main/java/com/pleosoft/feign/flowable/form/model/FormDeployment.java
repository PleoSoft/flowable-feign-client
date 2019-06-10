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

import java.util.Date;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class FormDeployment {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("deploymentTime")
	private Date deploymentTime = null;

	@JsonProperty("category")
	private String category = null;

	@JsonProperty("url")
	private String url = null;

	@JsonProperty("parentDeploymentId")
	private String parentDeploymentId = null;

	@JsonProperty("tenantId")
	private String tenantId = null;

	public FormDeployment id(String id) {
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

	public FormDeployment name(String name) {
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

	public FormDeployment deploymentTime(Date deploymentTime) {
		this.deploymentTime = deploymentTime;
		return this;
	}

	/**
	 * Get deploymentTime
	 * 
	 * @return deploymentTime
	 **/

	@Valid

	public Date getDeploymentTime() {
		return deploymentTime;
	}

	public void setDeploymentTime(Date deploymentTime) {
		this.deploymentTime = deploymentTime;
	}

	public FormDeployment category(String category) {
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

	public FormDeployment url(String url) {
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

	public FormDeployment parentDeploymentId(String parentDeploymentId) {
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

	public FormDeployment tenantId(String tenantId) {
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
		FormDeployment formDeployment = (FormDeployment) o;
		return Objects.equals(this.id, formDeployment.id) && Objects.equals(this.name, formDeployment.name)
				&& Objects.equals(this.deploymentTime, formDeployment.deploymentTime)
				&& Objects.equals(this.category, formDeployment.category)
				&& Objects.equals(this.url, formDeployment.url)
				&& Objects.equals(this.parentDeploymentId, formDeployment.parentDeploymentId)
				&& Objects.equals(this.tenantId, formDeployment.tenantId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, deploymentTime, category, url, parentDeploymentId, tenantId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FormDeployment {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    deploymentTime: ").append(toIndentedString(deploymentTime)).append("\n");
		sb.append("    category: ").append(toIndentedString(category)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
