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

public class ValuedDataObject {
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

	@JsonProperty("documentation")
	private String documentation = null;

	@JsonProperty("executionListeners")
	@Valid
	private List<FlowableListener> executionListeners = null;

	@JsonProperty("itemSubjectRef")
	private ItemDefinition itemSubjectRef = null;

	@JsonProperty("value")
	private Object value = null;

	@JsonProperty("type")
	private String type = null;

	public ValuedDataObject id(String id) {
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

	public ValuedDataObject xmlRowNumber(Integer xmlRowNumber) {
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

	public ValuedDataObject xmlColumnNumber(Integer xmlColumnNumber) {
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

	public ValuedDataObject extensionElements(Map<String, List<ExtensionElement>> extensionElements) {
		this.extensionElements = extensionElements;
		return this;
	}

	public ValuedDataObject putExtensionElementsItem(String key, List<ExtensionElement> extensionElementsItem) {
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

	public ValuedDataObject attributes(Map<String, List<ExtensionAttribute>> attributes) {
		this.attributes = attributes;
		return this;
	}

	public ValuedDataObject putAttributesItem(String key, List<ExtensionAttribute> attributesItem) {
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

	public ValuedDataObject name(String name) {
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

	public ValuedDataObject documentation(String documentation) {
		this.documentation = documentation;
		return this;
	}

	/**
	 * Get documentation
	 * 
	 * @return documentation
	 **/

	public String getDocumentation() {
		return documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}

	public ValuedDataObject executionListeners(List<FlowableListener> executionListeners) {
		this.executionListeners = executionListeners;
		return this;
	}

	public ValuedDataObject addExecutionListenersItem(FlowableListener executionListenersItem) {
		if (this.executionListeners == null) {
			this.executionListeners = new ArrayList<FlowableListener>();
		}
		this.executionListeners.add(executionListenersItem);
		return this;
	}

	/**
	 * Get executionListeners
	 * 
	 * @return executionListeners
	 **/

	@Valid

	public List<FlowableListener> getExecutionListeners() {
		return executionListeners;
	}

	public void setExecutionListeners(List<FlowableListener> executionListeners) {
		this.executionListeners = executionListeners;
	}

	public ValuedDataObject itemSubjectRef(ItemDefinition itemSubjectRef) {
		this.itemSubjectRef = itemSubjectRef;
		return this;
	}

	/**
	 * Get itemSubjectRef
	 * 
	 * @return itemSubjectRef
	 **/

	@Valid

	public ItemDefinition getItemSubjectRef() {
		return itemSubjectRef;
	}

	public void setItemSubjectRef(ItemDefinition itemSubjectRef) {
		this.itemSubjectRef = itemSubjectRef;
	}

	public ValuedDataObject value(Object value) {
		this.value = value;
		return this;
	}

	/**
	 * Get value
	 * 
	 * @return value
	 **/

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public ValuedDataObject type(String type) {
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
		ValuedDataObject valuedDataObject = (ValuedDataObject) o;
		return Objects.equals(this.id, valuedDataObject.id)
				&& Objects.equals(this.xmlRowNumber, valuedDataObject.xmlRowNumber)
				&& Objects.equals(this.xmlColumnNumber, valuedDataObject.xmlColumnNumber)
				&& Objects.equals(this.extensionElements, valuedDataObject.extensionElements)
				&& Objects.equals(this.attributes, valuedDataObject.attributes)
				&& Objects.equals(this.name, valuedDataObject.name)
				&& Objects.equals(this.documentation, valuedDataObject.documentation)
				&& Objects.equals(this.executionListeners, valuedDataObject.executionListeners)
				&& Objects.equals(this.itemSubjectRef, valuedDataObject.itemSubjectRef)
				&& Objects.equals(this.value, valuedDataObject.value)
				&& Objects.equals(this.type, valuedDataObject.type);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, xmlRowNumber, xmlColumnNumber, extensionElements, attributes, name, documentation,
				executionListeners, itemSubjectRef, value, type);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ValuedDataObject {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    xmlRowNumber: ").append(toIndentedString(xmlRowNumber)).append("\n");
		sb.append("    xmlColumnNumber: ").append(toIndentedString(xmlColumnNumber)).append("\n");
		sb.append("    extensionElements: ").append(toIndentedString(extensionElements)).append("\n");
		sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
		sb.append("    executionListeners: ").append(toIndentedString(executionListeners)).append("\n");
		sb.append("    itemSubjectRef: ").append(toIndentedString(itemSubjectRef)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
