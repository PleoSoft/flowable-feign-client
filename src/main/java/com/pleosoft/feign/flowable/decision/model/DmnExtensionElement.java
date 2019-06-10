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

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class DmnExtensionElement {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("label")
	private String label = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("extensionElements")
	@Valid
	private Map<String, List<DmnExtensionElement>> extensionElements = null;

	@JsonProperty("attributes")
	@Valid
	private Map<String, List<DmnExtensionAttribute>> attributes = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("namespacePrefix")
	private String namespacePrefix = null;

	@JsonProperty("namespace")
	private String namespace = null;

	@JsonProperty("elementText")
	private String elementText = null;

	@JsonProperty("childElements")
	@Valid
	private Map<String, List<DmnExtensionElement>> childElements = null;

	public DmnExtensionElement id(String id) {
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

	public DmnExtensionElement label(String label) {
		this.label = label;
		return this;
	}

	/**
	 * Get label
	 * 
	 * @return label
	 **/

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public DmnExtensionElement description(String description) {
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

	public DmnExtensionElement extensionElements(Map<String, List<DmnExtensionElement>> extensionElements) {
		this.extensionElements = extensionElements;
		return this;
	}

	public DmnExtensionElement putExtensionElementsItem(String key, List<DmnExtensionElement> extensionElementsItem) {
		if (this.extensionElements == null) {
			this.extensionElements = new HashMap<String, List<DmnExtensionElement>>();
		}
		this.extensionElements.put(key, extensionElementsItem);
		return this;
	}

	/**
	 * Get extensionElements
	 * 
	 * @return extensionElements
	 **/

	@Valid

	public Map<String, List<DmnExtensionElement>> getExtensionElements() {
		return extensionElements;
	}

	public void setExtensionElements(Map<String, List<DmnExtensionElement>> extensionElements) {
		this.extensionElements = extensionElements;
	}

	public DmnExtensionElement attributes(Map<String, List<DmnExtensionAttribute>> attributes) {
		this.attributes = attributes;
		return this;
	}

	public DmnExtensionElement putAttributesItem(String key, List<DmnExtensionAttribute> attributesItem) {
		if (this.attributes == null) {
			this.attributes = new HashMap<String, List<DmnExtensionAttribute>>();
		}
		this.attributes.put(key, attributesItem);
		return this;
	}

	/**
	 * Get attributes
	 * 
	 * @return attributes
	 **/

	@Valid

	public Map<String, List<DmnExtensionAttribute>> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, List<DmnExtensionAttribute>> attributes) {
		this.attributes = attributes;
	}

	public DmnExtensionElement name(String name) {
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

	public DmnExtensionElement namespacePrefix(String namespacePrefix) {
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

	public DmnExtensionElement namespace(String namespace) {
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

	public DmnExtensionElement elementText(String elementText) {
		this.elementText = elementText;
		return this;
	}

	/**
	 * Get elementText
	 * 
	 * @return elementText
	 **/

	public String getElementText() {
		return elementText;
	}

	public void setElementText(String elementText) {
		this.elementText = elementText;
	}

	public DmnExtensionElement childElements(Map<String, List<DmnExtensionElement>> childElements) {
		this.childElements = childElements;
		return this;
	}

	public DmnExtensionElement putChildElementsItem(String key, List<DmnExtensionElement> childElementsItem) {
		if (this.childElements == null) {
			this.childElements = new HashMap<String, List<DmnExtensionElement>>();
		}
		this.childElements.put(key, childElementsItem);
		return this;
	}

	/**
	 * Get childElements
	 * 
	 * @return childElements
	 **/

	@Valid

	public Map<String, List<DmnExtensionElement>> getChildElements() {
		return childElements;
	}

	public void setChildElements(Map<String, List<DmnExtensionElement>> childElements) {
		this.childElements = childElements;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DmnExtensionElement dmnExtensionElement = (DmnExtensionElement) o;
		return Objects.equals(this.id, dmnExtensionElement.id) && Objects.equals(this.label, dmnExtensionElement.label)
				&& Objects.equals(this.description, dmnExtensionElement.description)
				&& Objects.equals(this.extensionElements, dmnExtensionElement.extensionElements)
				&& Objects.equals(this.attributes, dmnExtensionElement.attributes)
				&& Objects.equals(this.name, dmnExtensionElement.name)
				&& Objects.equals(this.namespacePrefix, dmnExtensionElement.namespacePrefix)
				&& Objects.equals(this.namespace, dmnExtensionElement.namespace)
				&& Objects.equals(this.elementText, dmnExtensionElement.elementText)
				&& Objects.equals(this.childElements, dmnExtensionElement.childElements);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, label, description, extensionElements, attributes, name, namespacePrefix, namespace,
				elementText, childElements);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DmnExtensionElement {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    label: ").append(toIndentedString(label)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    extensionElements: ").append(toIndentedString(extensionElements)).append("\n");
		sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    namespacePrefix: ").append(toIndentedString(namespacePrefix)).append("\n");
		sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
		sb.append("    elementText: ").append(toIndentedString(elementText)).append("\n");
		sb.append("    childElements: ").append(toIndentedString(childElements)).append("\n");
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
