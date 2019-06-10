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

public class Lane {
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

	@JsonProperty("parentProcess")
	private Process parentProcess = null;

	@JsonProperty("flowReferences")
	@Valid
	private List<String> flowReferences = null;

	public Lane id(String id) {
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

	public Lane xmlRowNumber(Integer xmlRowNumber) {
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

	public Lane xmlColumnNumber(Integer xmlColumnNumber) {
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

	public Lane extensionElements(Map<String, List<ExtensionElement>> extensionElements) {
		this.extensionElements = extensionElements;
		return this;
	}

	public Lane putExtensionElementsItem(String key, List<ExtensionElement> extensionElementsItem) {
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

	public Lane attributes(Map<String, List<ExtensionAttribute>> attributes) {
		this.attributes = attributes;
		return this;
	}

	public Lane putAttributesItem(String key, List<ExtensionAttribute> attributesItem) {
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

	public Lane name(String name) {
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

	public Lane parentProcess(Process parentProcess) {
		this.parentProcess = parentProcess;
		return this;
	}

	/**
	 * Get parentProcess
	 * 
	 * @return parentProcess
	 **/

	@Valid

	public Process getParentProcess() {
		return parentProcess;
	}

	public void setParentProcess(Process parentProcess) {
		this.parentProcess = parentProcess;
	}

	public Lane flowReferences(List<String> flowReferences) {
		this.flowReferences = flowReferences;
		return this;
	}

	public Lane addFlowReferencesItem(String flowReferencesItem) {
		if (this.flowReferences == null) {
			this.flowReferences = new ArrayList<String>();
		}
		this.flowReferences.add(flowReferencesItem);
		return this;
	}

	/**
	 * Get flowReferences
	 * 
	 * @return flowReferences
	 **/

	public List<String> getFlowReferences() {
		return flowReferences;
	}

	public void setFlowReferences(List<String> flowReferences) {
		this.flowReferences = flowReferences;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Lane lane = (Lane) o;
		return Objects.equals(this.id, lane.id) && Objects.equals(this.xmlRowNumber, lane.xmlRowNumber)
				&& Objects.equals(this.xmlColumnNumber, lane.xmlColumnNumber)
				&& Objects.equals(this.extensionElements, lane.extensionElements)
				&& Objects.equals(this.attributes, lane.attributes) && Objects.equals(this.name, lane.name)
				&& Objects.equals(this.parentProcess, lane.parentProcess)
				&& Objects.equals(this.flowReferences, lane.flowReferences);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, xmlRowNumber, xmlColumnNumber, extensionElements, attributes, name, parentProcess,
				flowReferences);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Lane {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    xmlRowNumber: ").append(toIndentedString(xmlRowNumber)).append("\n");
		sb.append("    xmlColumnNumber: ").append(toIndentedString(xmlColumnNumber)).append("\n");
		sb.append("    extensionElements: ").append(toIndentedString(extensionElements)).append("\n");
		sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    parentProcess: ").append(toIndentedString(parentProcess)).append("\n");
		sb.append("    flowReferences: ").append(toIndentedString(flowReferences)).append("\n");
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
