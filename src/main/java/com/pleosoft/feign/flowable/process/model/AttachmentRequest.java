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

public class AttachmentRequest {
	@JsonProperty("name")
	private String name = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("type")
	private String type = null;

	@JsonProperty("externalUrl")
	private String externalUrl = null;

	public AttachmentRequest name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the attachment
	 * 
	 * @return name
	 **/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AttachmentRequest description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of the attachment
	 * 
	 * @return description
	 **/

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AttachmentRequest type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Type of the attachment
	 * 
	 * @return type
	 **/

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public AttachmentRequest externalUrl(String externalUrl) {
		this.externalUrl = externalUrl;
		return this;
	}

	/**
	 * External url pointing to the binary
	 * 
	 * @return externalUrl
	 **/

	public String getExternalUrl() {
		return externalUrl;
	}

	public void setExternalUrl(String externalUrl) {
		this.externalUrl = externalUrl;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AttachmentRequest attachmentRequest = (AttachmentRequest) o;
		return Objects.equals(this.name, attachmentRequest.name)
				&& Objects.equals(this.description, attachmentRequest.description)
				&& Objects.equals(this.type, attachmentRequest.type)
				&& Objects.equals(this.externalUrl, attachmentRequest.externalUrl);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, description, type, externalUrl);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AttachmentRequest {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
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
