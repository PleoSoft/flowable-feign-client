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

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class ExtensionElement {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("xmlRowNumber")
	private Integer xmlRowNumber = null;

	@JsonProperty("xmlColumnNumber")
	private Integer xmlColumnNumber = null;

	@JsonProperty("extensionElements")
	@Valid
	private Map<String, List<ExtensionElement>> extensionElements = null;

	@JsonProperty("attributes")
	@Valid
	private Map<String, List<ExtensionAttribute>> attributes = null;

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
	private Map<String, List<ExtensionElement>> childElements = null;

	public ExtensionElement id(String id) {
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

	public ExtensionElement xmlRowNumber(Integer xmlRowNumber) {
		this.xmlRowNumber = xmlRowNumber;
		return this;
	}

	/**
	 * Get xmlRowNumber
	 * 
	 * @return xmlRowNumber
	 **/

	public Integer getXmlRowNumber() {
		return xmlRowNumber;
	}

	public void setXmlRowNumber(Integer xmlRowNumber) {
		this.xmlRowNumber = xmlRowNumber;
	}

	public ExtensionElement xmlColumnNumber(Integer xmlColumnNumber) {
		this.xmlColumnNumber = xmlColumnNumber;
		return this;
	}

	/**
	 * Get xmlColumnNumber
	 * 
	 * @return xmlColumnNumber
	 **/

	public Integer getXmlColumnNumber() {
		return xmlColumnNumber;
	}

	public void setXmlColumnNumber(Integer xmlColumnNumber) {
		this.xmlColumnNumber = xmlColumnNumber;
	}

	public ExtensionElement extensionElements(Map<String, List<ExtensionElement>> extensionElements) {
		this.extensionElements = extensionElements;
		return this;
	}

	public ExtensionElement putExtensionElementsItem(String key, List<ExtensionElement> extensionElementsItem) {
		if (this.extensionElements == null) {
			this.extensionElements = new HashMap<String, List<ExtensionElement>>();
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

	public Map<String, List<ExtensionElement>> getExtensionElements() {
		return extensionElements;
	}

	public void setExtensionElements(Map<String, List<ExtensionElement>> extensionElements) {
		this.extensionElements = extensionElements;
	}

	public ExtensionElement attributes(Map<String, List<ExtensionAttribute>> attributes) {
		this.attributes = attributes;
		return this;
	}

	public ExtensionElement putAttributesItem(String key, List<ExtensionAttribute> attributesItem) {
		if (this.attributes == null) {
			this.attributes = new HashMap<String, List<ExtensionAttribute>>();
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

	public Map<String, List<ExtensionAttribute>> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, List<ExtensionAttribute>> attributes) {
		this.attributes = attributes;
	}

	public ExtensionElement name(String name) {
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

	public ExtensionElement namespacePrefix(String namespacePrefix) {
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

	public ExtensionElement namespace(String namespace) {
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

	public ExtensionElement elementText(String elementText) {
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

	public ExtensionElement childElements(Map<String, List<ExtensionElement>> childElements) {
		this.childElements = childElements;
		return this;
	}

	public ExtensionElement putChildElementsItem(String key, List<ExtensionElement> childElementsItem) {
		if (this.childElements == null) {
			this.childElements = new HashMap<String, List<ExtensionElement>>();
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

	public Map<String, List<ExtensionElement>> getChildElements() {
		return childElements;
	}

	public void setChildElements(Map<String, List<ExtensionElement>> childElements) {
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
		ExtensionElement extensionElement = (ExtensionElement) o;
		return Objects.equals(this.id, extensionElement.id)
				&& Objects.equals(this.xmlRowNumber, extensionElement.xmlRowNumber)
				&& Objects.equals(this.xmlColumnNumber, extensionElement.xmlColumnNumber)
				&& Objects.equals(this.extensionElements, extensionElement.extensionElements)
				&& Objects.equals(this.attributes, extensionElement.attributes)
				&& Objects.equals(this.name, extensionElement.name)
				&& Objects.equals(this.namespacePrefix, extensionElement.namespacePrefix)
				&& Objects.equals(this.namespace, extensionElement.namespace)
				&& Objects.equals(this.elementText, extensionElement.elementText)
				&& Objects.equals(this.childElements, extensionElement.childElements);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, xmlRowNumber, xmlColumnNumber, extensionElements, attributes, name, namespacePrefix,
				namespace, elementText, childElements);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExtensionElement {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    xmlRowNumber: ").append(toIndentedString(xmlRowNumber)).append("\n");
		sb.append("    xmlColumnNumber: ").append(toIndentedString(xmlColumnNumber)).append("\n");
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
