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

import java.util.Date;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class CommentResponse {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("author")
	private String author = null;

	@JsonProperty("message")
	private String message = null;

	@JsonProperty("time")
	private Date time = null;

	@JsonProperty("taskId")
	private String taskId = null;

	@JsonProperty("taskUrl")
	private String taskUrl = null;

	@JsonProperty("processInstanceId")
	private String processInstanceId = null;

	@JsonProperty("processInstanceUrl")
	private String processInstanceUrl = null;

	public CommentResponse id(String id) {
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

	public CommentResponse author(String author) {
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

	public CommentResponse message(String message) {
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

	public CommentResponse time(Date time) {
		this.time = time;
		return this;
	}

	/**
	 * Get time
	 * 
	 * @return time
	 **/

	@Valid

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public CommentResponse taskId(String taskId) {
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

	public CommentResponse taskUrl(String taskUrl) {
		this.taskUrl = taskUrl;
		return this;
	}

	/**
	 * Get taskUrl
	 * 
	 * @return taskUrl
	 **/

	public String getTaskUrl() {
		return taskUrl;
	}

	public void setTaskUrl(String taskUrl) {
		this.taskUrl = taskUrl;
	}

	public CommentResponse processInstanceId(String processInstanceId) {
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

	public CommentResponse processInstanceUrl(String processInstanceUrl) {
		this.processInstanceUrl = processInstanceUrl;
		return this;
	}

	/**
	 * Get processInstanceUrl
	 * 
	 * @return processInstanceUrl
	 **/

	public String getProcessInstanceUrl() {
		return processInstanceUrl;
	}

	public void setProcessInstanceUrl(String processInstanceUrl) {
		this.processInstanceUrl = processInstanceUrl;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CommentResponse commentResponse = (CommentResponse) o;
		return Objects.equals(this.id, commentResponse.id) && Objects.equals(this.author, commentResponse.author)
				&& Objects.equals(this.message, commentResponse.message)
				&& Objects.equals(this.time, commentResponse.time)
				&& Objects.equals(this.taskId, commentResponse.taskId)
				&& Objects.equals(this.taskUrl, commentResponse.taskUrl)
				&& Objects.equals(this.processInstanceId, commentResponse.processInstanceId)
				&& Objects.equals(this.processInstanceUrl, commentResponse.processInstanceUrl);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, author, message, time, taskId, taskUrl, processInstanceId, processInstanceUrl);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CommentResponse {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    author: ").append(toIndentedString(author)).append("\n");
		sb.append("    message: ").append(toIndentedString(message)).append("\n");
		sb.append("    time: ").append(toIndentedString(time)).append("\n");
		sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
		sb.append("    taskUrl: ").append(toIndentedString(taskUrl)).append("\n");
		sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
		sb.append("    processInstanceUrl: ").append(toIndentedString(processInstanceUrl)).append("\n");
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
