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

public class DmnExtensionAttribute {
	@JsonProperty("name")
	private String name = null;

	@JsonProperty("value")
	private String value = null;

	@JsonProperty("namespacePrefix")
	private String namespacePrefix = null;

	@JsonProperty("namespace")
	private String namespace = null;

	public DmnExtensionAttribute name(String name) {
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

	public DmnExtensionAttribute value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * Get value
	 * 
	 * @return value
	 **/

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public DmnExtensionAttribute namespacePrefix(String namespacePrefix) {
		this.namespacePrefix = namespacePrefix;
		return this;
	}

	/**
	 * Get namespacePrefix
	 * 
	 * @return namespacePrefix
	 **/

	public String getNamespacePrefix() {
		return namespacePrefix;
	}

	public void setNamespacePrefix(String namespacePrefix) {
		this.namespacePrefix = namespacePrefix;
	}

	public DmnExtensionAttribute namespace(String namespace) {
		this.namespace = namespace;
		return this;
	}

	/**
	 * Get namespace
	 * 
	 * @return namespace
	 **/

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DmnExtensionAttribute dmnExtensionAttribute = (DmnExtensionAttribute) o;
		return Objects.equals(this.name, dmnExtensionAttribute.name)
				&& Objects.equals(this.value, dmnExtensionAttribute.value)
				&& Objects.equals(this.namespacePrefix, dmnExtensionAttribute.namespacePrefix)
				&& Objects.equals(this.namespace, dmnExtensionAttribute.namespace);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, value, namespacePrefix, namespace);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DmnExtensionAttribute {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
		sb.append("    namespacePrefix: ").append(toIndentedString(namespacePrefix)).append("\n");
		sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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
