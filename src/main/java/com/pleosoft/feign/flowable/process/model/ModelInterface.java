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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class ModelInterface {
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

	@JsonProperty("implementationRef")
	private String implementationRef = null;

	@JsonProperty("operations")
	@Valid
	private List<Operation> operations = null;

	public ModelInterface id(String id) {
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

	public ModelInterface xmlRowNumber(Integer xmlRowNumber) {
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

	public ModelInterface xmlColumnNumber(Integer xmlColumnNumber) {
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

	public ModelInterface extensionElements(Map<String, List<ExtensionElement>> extensionElements) {
		this.extensionElements = extensionElements;
		return this;
	}

	public ModelInterface putExtensionElementsItem(String key, List<ExtensionElement> extensionElementsItem) {
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

	public ModelInterface attributes(Map<String, List<ExtensionAttribute>> attributes) {
		this.attributes = attributes;
		return this;
	}

	public ModelInterface putAttributesItem(String key, List<ExtensionAttribute> attributesItem) {
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

	public ModelInterface name(String name) {
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

	public ModelInterface implementationRef(String implementationRef) {
		this.implementationRef = implementationRef;
		return this;
	}

	/**
	 * Get implementationRef
	 * 
	 * @return implementationRef
	 **/

	public String getImplementationRef() {
		return implementationRef;
	}

	public void setImplementationRef(String implementationRef) {
		this.implementationRef = implementationRef;
	}

	public ModelInterface operations(List<Operation> operations) {
		this.operations = operations;
		return this;
	}

	public ModelInterface addOperationsItem(Operation operationsItem) {
		if (this.operations == null) {
			this.operations = new ArrayList<Operation>();
		}
		this.operations.add(operationsItem);
		return this;
	}

	/**
	 * Get operations
	 * 
	 * @return operations
	 **/

	@Valid

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ModelInterface _interface = (ModelInterface) o;
		return Objects.equals(this.id, _interface.id) && Objects.equals(this.xmlRowNumber, _interface.xmlRowNumber)
				&& Objects.equals(this.xmlColumnNumber, _interface.xmlColumnNumber)
				&& Objects.equals(this.extensionElements, _interface.extensionElements)
				&& Objects.equals(this.attributes, _interface.attributes) && Objects.equals(this.name, _interface.name)
				&& Objects.equals(this.implementationRef, _interface.implementationRef)
				&& Objects.equals(this.operations, _interface.operations);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, xmlRowNumber, xmlColumnNumber, extensionElements, attributes, name, implementationRef,
				operations);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ModelInterface {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    xmlRowNumber: ").append(toIndentedString(xmlRowNumber)).append("\n");
		sb.append("    xmlColumnNumber: ").append(toIndentedString(xmlColumnNumber)).append("\n");
		sb.append("    extensionElements: ").append(toIndentedString(extensionElements)).append("\n");
		sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    implementationRef: ").append(toIndentedString(implementationRef)).append("\n");
		sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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
