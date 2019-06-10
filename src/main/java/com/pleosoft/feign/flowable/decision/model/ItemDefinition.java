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

public class ItemDefinition {
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

	@JsonProperty("typeDefinition")
	private String typeDefinition = null;

	public ItemDefinition id(String id) {
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

	public ItemDefinition label(String label) {
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

	public ItemDefinition description(String description) {
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

	public ItemDefinition extensionElements(Map<String, List<DmnExtensionElement>> extensionElements) {
		this.extensionElements = extensionElements;
		return this;
	}

	public ItemDefinition putExtensionElementsItem(String key, List<DmnExtensionElement> extensionElementsItem) {
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

	public ItemDefinition attributes(Map<String, List<DmnExtensionAttribute>> attributes) {
		this.attributes = attributes;
		return this;
	}

	public ItemDefinition putAttributesItem(String key, List<DmnExtensionAttribute> attributesItem) {
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

	public ItemDefinition name(String name) {
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

	public ItemDefinition typeDefinition(String typeDefinition) {
		this.typeDefinition = typeDefinition;
		return this;
	}

	/**
	 * Get typeDefinition
	 * 
	 * @return typeDefinition
	 **/

	public String getTypeDefinition() {
		return typeDefinition;
	}

	public void setTypeDefinition(String typeDefinition) {
		this.typeDefinition = typeDefinition;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ItemDefinition itemDefinition = (ItemDefinition) o;
		return Objects.equals(this.id, itemDefinition.id) && Objects.equals(this.label, itemDefinition.label)
				&& Objects.equals(this.description, itemDefinition.description)
				&& Objects.equals(this.extensionElements, itemDefinition.extensionElements)
				&& Objects.equals(this.attributes, itemDefinition.attributes)
				&& Objects.equals(this.name, itemDefinition.name)
				&& Objects.equals(this.typeDefinition, itemDefinition.typeDefinition);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, label, description, extensionElements, attributes, name, typeDefinition);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ItemDefinition {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    label: ").append(toIndentedString(label)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    extensionElements: ").append(toIndentedString(extensionElements)).append("\n");
		sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    typeDefinition: ").append(toIndentedString(typeDefinition)).append("\n");
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
