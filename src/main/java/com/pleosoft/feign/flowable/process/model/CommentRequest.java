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

public class CommentRequest {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("url")
	private String url = null;

	@JsonProperty("author")
	private String author = null;

	@JsonProperty("message")
	private String message = null;

	@JsonProperty("type")
	private String type = null;

	@JsonProperty("saveProcessInstanceId")
	private Boolean saveProcessInstanceId = null;

	public CommentRequest id(String id) {
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

	public CommentRequest url(String url) {
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

	public CommentRequest author(String author) {
		this.author = author;
		return this;
	}

	/**
	 * Get author
	 * 
	 * @return author
	 **/

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public CommentRequest message(String message) {
		this.message = message;
		return this;
	}

	/**
	 * Get message
	 * 
	 * @return message
	 **/

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public CommentRequest type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public CommentRequest saveProcessInstanceId(Boolean saveProcessInstanceId) {
		this.saveProcessInstanceId = saveProcessInstanceId;
		return this;
	}

	/**
	 * Get saveProcessInstanceId
	 * 
	 * @return saveProcessInstanceId
	 **/

	public Boolean isSaveProcessInstanceId() {
		return saveProcessInstanceId;
	}

	public void setSaveProcessInstanceId(Boolean saveProcessInstanceId) {
		this.saveProcessInstanceId = saveProcessInstanceId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CommentRequest commentRequest = (CommentRequest) o;
		return Objects.equals(this.id, commentRequest.id) && Objects.equals(this.url, commentRequest.url)
				&& Objects.equals(this.author, commentRequest.author)
				&& Objects.equals(this.message, commentRequest.message)
				&& Objects.equals(this.type, commentRequest.type)
				&& Objects.equals(this.saveProcessInstanceId, commentRequest.saveProcessInstanceId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, url, author, message, type, saveProcessInstanceId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CommentRequest {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    author: ").append(toIndentedString(author)).append("\n");
		sb.append("    message: ").append(toIndentedString(message)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    saveProcessInstanceId: ").append(toIndentedString(saveProcessInstanceId)).append("\n");
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
