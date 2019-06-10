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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class DmnDefinition {
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

	@JsonProperty("expressionLanguage")
	private String expressionLanguage = null;

	@JsonProperty("typeLanguage")
	private String typeLanguage = null;

	@JsonProperty("namespace")
	private String namespace = null;

	@JsonProperty("itemDefinitions")
	@Valid
	private List<ItemDefinition> itemDefinitions = null;

	@JsonProperty("decisions")
	@Valid
	private List<Decision> decisions = null;

	public DmnDefinition id(String id) {
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

	public DmnDefinition label(String label) {
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

	public DmnDefinition description(String description) {
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

	public DmnDefinition extensionElements(Map<String, List<DmnExtensionElement>> extensionElements) {
		this.extensionElements = extensionElements;
		return this;
	}

	public DmnDefinition putExtensionElementsItem(String key, List<DmnExtensionElement> extensionElementsItem) {
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

	public DmnDefinition attributes(Map<String, List<DmnExtensionAttribute>> attributes) {
		this.attributes = attributes;
		return this;
	}

	public DmnDefinition putAttributesItem(String key, List<DmnExtensionAttribute> attributesItem) {
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

	public DmnDefinition name(String name) {
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

	public DmnDefinition expressionLanguage(String expressionLanguage) {
		this.expressionLanguage = expressionLanguage;
		return this;
	}

	/**
	 * Get expressionLanguage
	 * 
	 * @return expressionLanguage
	 **/

	public String getExpressionLanguage() {
		return expressionLanguage;
	}

	public void setExpressionLanguage(String expressionLanguage) {
		this.expressionLanguage = expressionLanguage;
	}

	public DmnDefinition typeLanguage(String typeLanguage) {
		this.typeLanguage = typeLanguage;
		return this;
	}

	/**
	 * Get typeLanguage
	 * 
	 * @return typeLanguage
	 **/

	public String getTypeLanguage() {
		return typeLanguage;
	}

	public void setTypeLanguage(String typeLanguage) {
		this.typeLanguage = typeLanguage;
	}

	public DmnDefinition namespace(String namespace) {
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

	public DmnDefinition itemDefinitions(List<ItemDefinition> itemDefinitions) {
		this.itemDefinitions = itemDefinitions;
		return this;
	}

	public DmnDefinition addItemDefinitionsItem(ItemDefinition itemDefinitionsItem) {
		if (this.itemDefinitions == null) {
			this.itemDefinitions = new ArrayList<ItemDefinition>();
		}
		this.itemDefinitions.add(itemDefinitionsItem);
		return this;
	}

	/**
	 * Get itemDefinitions
	 * 
	 * @return itemDefinitions
	 **/

	@Valid

	public List<ItemDefinition> getItemDefinitions() {
		return itemDefinitions;
	}

	public void setItemDefinitions(List<ItemDefinition> itemDefinitions) {
		this.itemDefinitions = itemDefinitions;
	}

	public DmnDefinition decisions(List<Decision> decisions) {
		this.decisions = decisions;
		return this;
	}

	public DmnDefinition addDecisionsItem(Decision decisionsItem) {
		if (this.decisions == null) {
			this.decisions = new ArrayList<Decision>();
		}
		this.decisions.add(decisionsItem);
		return this;
	}

	/**
	 * Get decisions
	 * 
	 * @return decisions
	 **/

	@Valid

	public List<Decision> getDecisions() {
		return decisions;
	}

	public void setDecisions(List<Decision> decisions) {
		this.decisions = decisions;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DmnDefinition dmnDefinition = (DmnDefinition) o;
		return Objects.equals(this.id, dmnDefinition.id) && Objects.equals(this.label, dmnDefinition.label)
				&& Objects.equals(this.description, dmnDefinition.description)
				&& Objects.equals(this.extensionElements, dmnDefinition.extensionElements)
				&& Objects.equals(this.attributes, dmnDefinition.attributes)
				&& Objects.equals(this.name, dmnDefinition.name)
				&& Objects.equals(this.expressionLanguage, dmnDefinition.expressionLanguage)
				&& Objects.equals(this.typeLanguage, dmnDefinition.typeLanguage)
				&& Objects.equals(this.namespace, dmnDefinition.namespace)
				&& Objects.equals(this.itemDefinitions, dmnDefinition.itemDefinitions)
				&& Objects.equals(this.decisions, dmnDefinition.decisions);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, label, description, extensionElements, attributes, name, expressionLanguage,
				typeLanguage, namespace, itemDefinitions, decisions);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DmnDefinition {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    label: ").append(toIndentedString(label)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    extensionElements: ").append(toIndentedString(extensionElements)).append("\n");
		sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    expressionLanguage: ").append(toIndentedString(expressionLanguage)).append("\n");
		sb.append("    typeLanguage: ").append(toIndentedString(typeLanguage)).append("\n");
		sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
		sb.append("    itemDefinitions: ").append(toIndentedString(itemDefinitions)).append("\n");
		sb.append("    decisions: ").append(toIndentedString(decisions)).append("\n");
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
