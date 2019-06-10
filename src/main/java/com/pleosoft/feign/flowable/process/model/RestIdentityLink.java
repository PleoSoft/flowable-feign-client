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

public class RestIdentityLink {
	@JsonProperty("url")
	private String url = null;

	@JsonProperty("user")
	private String user = null;

	@JsonProperty("group")
	private String group = null;

	@JsonProperty("type")
	private String type = null;

	public RestIdentityLink url(String url) {
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

	public RestIdentityLink user(String user) {
		this.user = user;
		return this;
	}

	/**
	 * Get user
	 * 
	 * @return user
	 **/

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public RestIdentityLink group(String group) {
		this.group = group;
		return this;
	}

	/**
	 * Get group
	 * 
	 * @return group
	 **/

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public RestIdentityLink type(String type) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RestIdentityLink restIdentityLink = (RestIdentityLink) o;
		return Objects.equals(this.url, restIdentityLink.url) && Objects.equals(this.user, restIdentityLink.user)
				&& Objects.equals(this.group, restIdentityLink.group)
				&& Objects.equals(this.type, restIdentityLink.type);
	}

	@Override
	public int hashCode() {
		return Objects.hash(url, user, group, type);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RestIdentityLink {\n");

		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    user: ").append(toIndentedString(user)).append("\n");
		sb.append("    group: ").append(toIndentedString(group)).append("\n");
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
