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

public class FlowableListener {
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

	@JsonProperty("event")
	private String event = null;

	@JsonProperty("implementationType")
	private String implementationType = null;

	@JsonProperty("implementation")
	private String implementation = null;

	@JsonProperty("fieldExtensions")
	@Valid
	private List<FieldExtension> fieldExtensions = null;

	@JsonProperty("onTransaction")
	private String onTransaction = null;

	@JsonProperty("customPropertiesResolverImplementationType")
	private String customPropertiesResolverImplementationType = null;

	@JsonProperty("customPropertiesResolverImplementation")
	private String customPropertiesResolverImplementation = null;

	public FlowableListener id(String id) {
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

	public FlowableListener xmlRowNumber(Integer xmlRowNumber) {
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

	public FlowableListener xmlColumnNumber(Integer xmlColumnNumber) {
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

	public FlowableListener extensionElements(Map<String, List<ExtensionElement>> extensionElements) {
		this.extensionElements = extensionElements;
		return this;
	}

	public FlowableListener putExtensionElementsItem(String key, List<ExtensionElement> extensionElementsItem) {
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

	public FlowableListener attributes(Map<String, List<ExtensionAttribute>> attributes) {
		this.attributes = attributes;
		return this;
	}

	public FlowableListener putAttributesItem(String key, List<ExtensionAttribute> attributesItem) {
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

	public FlowableListener event(String event) {
		this.event = event;
		return this;
	}

	/**
	 * Get event
	 * 
	 * @return event
	 **/

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public FlowableListener implementationType(String implementationType) {
		this.implementationType = implementationType;
		return this;
	}

	/**
	 * Get implementationType
	 * 
	 * @return implementationType
	 **/

	public String getImplementationType() {
		return implementationType;
	}

	public void setImplementationType(String implementationType) {
		this.implementationType = implementationType;
	}

	public FlowableListener implementation(String implementation) {
		this.implementation = implementation;
		return this;
	}

	/**
	 * Get implementation
	 * 
	 * @return implementation
	 **/

	public String getImplementation() {
		return implementation;
	}

	public void setImplementation(String implementation) {
		this.implementation = implementation;
	}

	public FlowableListener fieldExtensions(List<FieldExtension> fieldExtensions) {
		this.fieldExtensions = fieldExtensions;
		return this;
	}

	public FlowableListener addFieldExtensionsItem(FieldExtension fieldExtensionsItem) {
		if (this.fieldExtensions == null) {
			this.fieldExtensions = new ArrayList<FieldExtension>();
		}
		this.fieldExtensions.add(fieldExtensionsItem);
		return this;
	}

	/**
	 * Get fieldExtensions
	 * 
	 * @return fieldExtensions
	 **/

	@Valid

	public List<FieldExtension> getFieldExtensions() {
		return fieldExtensions;
	}

	public void setFieldExtensions(List<FieldExtension> fieldExtensions) {
		this.fieldExtensions = fieldExtensions;
	}

	public FlowableListener onTransaction(String onTransaction) {
		this.onTransaction = onTransaction;
		return this;
	}

	/**
	 * Get onTransaction
	 * 
	 * @return onTransaction
	 **/

	public String getOnTransaction() {
		return onTransaction;
	}

	public void setOnTransaction(String onTransaction) {
		this.onTransaction = onTransaction;
	}

	public FlowableListener customPropertiesResolverImplementationType(
			String customPropertiesResolverImplementationType) {
		this.customPropertiesResolverImplementationType = customPropertiesResolverImplementationType;
		return this;
	}

	/**
	 * Get customPropertiesResolverImplementationType
	 * 
	 * @return customPropertiesResolverImplementationType
	 **/

	public String getCustomPropertiesResolverImplementationType() {
		return customPropertiesResolverImplementationType;
	}

	public void setCustomPropertiesResolverImplementationType(String customPropertiesResolverImplementationType) {
		this.customPropertiesResolverImplementationType = customPropertiesResolverImplementationType;
	}

	public FlowableListener customPropertiesResolverImplementation(String customPropertiesResolverImplementation) {
		this.customPropertiesResolverImplementation = customPropertiesResolverImplementation;
		return this;
	}

	/**
	 * Get customPropertiesResolverImplementation
	 * 
	 * @return customPropertiesResolverImplementation
	 **/

	public String getCustomPropertiesResolverImplementation() {
		return customPropertiesResolverImplementation;
	}

	public void setCustomPropertiesResolverImplementation(String customPropertiesResolverImplementation) {
		this.customPropertiesResolverImplementation = customPropertiesResolverImplementation;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FlowableListener flowableListener = (FlowableListener) o;
		return Objects.equals(this.id, flowableListener.id)
				&& Objects.equals(this.xmlRowNumber, flowableListener.xmlRowNumber)
				&& Objects.equals(this.xmlColumnNumber, flowableListener.xmlColumnNumber)
				&& Objects.equals(this.extensionElements, flowableListener.extensionElements)
				&& Objects.equals(this.attributes, flowableListener.attributes)
				&& Objects.equals(this.event, flowableListener.event)
				&& Objects.equals(this.implementationType, flowableListener.implementationType)
				&& Objects.equals(this.implementation, flowableListener.implementation)
				&& Objects.equals(this.fieldExtensions, flowableListener.fieldExtensions)
				&& Objects.equals(this.onTransaction, flowableListener.onTransaction)
				&& Objects.equals(this.customPropertiesResolverImplementationType,
						flowableListener.customPropertiesResolverImplementationType)
				&& Objects.equals(this.customPropertiesResolverImplementation,
						flowableListener.customPropertiesResolverImplementation);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, xmlRowNumber, xmlColumnNumber, extensionElements, attributes, event, implementationType,
				implementation, fieldExtensions, onTransaction, customPropertiesResolverImplementationType,
				customPropertiesResolverImplementation);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FlowableListener {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    xmlRowNumber: ").append(toIndentedString(xmlRowNumber)).append("\n");
		sb.append("    xmlColumnNumber: ").append(toIndentedString(xmlColumnNumber)).append("\n");
		sb.append("    extensionElements: ").append(toIndentedString(extensionElements)).append("\n");
		sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
		sb.append("    event: ").append(toIndentedString(event)).append("\n");
		sb.append("    implementationType: ").append(toIndentedString(implementationType)).append("\n");
		sb.append("    implementation: ").append(toIndentedString(implementation)).append("\n");
		sb.append("    fieldExtensions: ").append(toIndentedString(fieldExtensions)).append("\n");
		sb.append("    onTransaction: ").append(toIndentedString(onTransaction)).append("\n");
		sb.append("    customPropertiesResolverImplementationType: ")
				.append(toIndentedString(customPropertiesResolverImplementationType)).append("\n");
		sb.append("    customPropertiesResolverImplementation: ")
				.append(toIndentedString(customPropertiesResolverImplementation)).append("\n");
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
