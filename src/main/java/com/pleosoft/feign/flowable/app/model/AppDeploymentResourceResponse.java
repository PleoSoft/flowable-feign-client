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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

@Validated

public class AppDeploymentResourceResponse {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("url")
	private String url = null;

	@JsonProperty("contentUrl")
	private String contentUrl = null;

	@JsonProperty("mediaType")
	private String mediaType = null;

	/**
	 * Type of resource
	 */
	public enum TypeEnum {
		RESOURCE("resource"),

		APPDEFINITION("appDefinition");

		private String value;

		TypeEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static TypeEnum fromValue(String text) {
			for (TypeEnum b : TypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("type")
	private TypeEnum type = null;

	public AppDeploymentResourceResponse id(String id) {
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

	public AppDeploymentResourceResponse url(String url) {
		this.url = url;
		return this;
	}

	/**
	 * For a single resource contains the actual URL to use for retrieving the
	 * binary resource
	 * 
	 * @return url
	 **/

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public AppDeploymentResourceResponse contentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
		return this;
	}

	/**
	 * Get contentUrl
	 * 
	 * @return contentUrl
	 **/

	public String getContentUrl() {
		return contentUrl;
	}

	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}

	public AppDeploymentResourceResponse mediaType(String mediaType) {
		this.mediaType = mediaType;
		return this;
	}

	/**
	 * Contains the media-type the resource has. This is resolved using a
	 * (pluggable) MediaTypeResolver and contains, by default, a limited number
	 * of mime-type mappings.
	 * 
	 * @return mediaType
	 **/

	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	public AppDeploymentResourceResponse type(TypeEnum type) {
		this.type = type;
		return this;
	}

	/**
	 * Type of resource
	 * 
	 * @return type
	 **/

	public TypeEnum getType() {
		return type;
	}

	public void setType(TypeEnum type) {
		this.type = type;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AppDeploymentResourceResponse appDeploymentResourceResponse = (AppDeploymentResourceResponse) o;
		return Objects.equals(this.id, appDeploymentResourceResponse.id)
				&& Objects.equals(this.url, appDeploymentResourceResponse.url)
				&& Objects.equals(this.contentUrl, appDeploymentResourceResponse.contentUrl)
				&& Objects.equals(this.mediaType, appDeploymentResourceResponse.mediaType)
				&& Objects.equals(this.type, appDeploymentResourceResponse.type);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, url, contentUrl, mediaType, type);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppDeploymentResourceResponse {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    contentUrl: ").append(toIndentedString(contentUrl)).append("\n");
		sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
