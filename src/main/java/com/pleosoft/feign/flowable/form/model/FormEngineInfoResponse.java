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

public class FormEngineInfoResponse {
	@JsonProperty("name")
	private String name = null;

	@JsonProperty("resourceUrl")
	private String resourceUrl = null;

	@JsonProperty("exception")
	private String exception = null;

	@JsonProperty("version")
	private String version = null;

	public FormEngineInfoResponse name(String name) {
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

	public FormEngineInfoResponse resourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
		return this;
	}

	/**
	 * Get resourceUrl
	 * 
	 * @return resourceUrl
	 **/

	public String getResourceUrl() {
		return resourceUrl;
	}

	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

	public FormEngineInfoResponse exception(String exception) {
		this.exception = exception;
		return this;
	}

	/**
	 * Get exception
	 * 
	 * @return exception
	 **/

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public FormEngineInfoResponse version(String version) {
		this.version = version;
		return this;
	}

	/**
	 * Get version
	 * 
	 * @return version
	 **/

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FormEngineInfoResponse formEngineInfoResponse = (FormEngineInfoResponse) o;
		return Objects.equals(this.name, formEngineInfoResponse.name)
				&& Objects.equals(this.resourceUrl, formEngineInfoResponse.resourceUrl)
				&& Objects.equals(this.exception, formEngineInfoResponse.exception)
				&& Objects.equals(this.version, formEngineInfoResponse.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, resourceUrl, exception, version);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FormEngineInfoResponse {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    resourceUrl: ").append(toIndentedString(resourceUrl)).append("\n");
		sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
