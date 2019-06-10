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

public class Expression {
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

	@JsonProperty("typeRef")
	private String typeRef = null;

	public Expression id(String id) {
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

	public Expression label(String label) {
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

	public Expression description(String description) {
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

	public Expression extensionElements(Map<String, List<DmnExtensionElement>> extensionElements) {
		this.extensionElements = extensionElements;
		return this;
	}

	public Expression putExtensionElementsItem(String key, List<DmnExtensionElement> extensionElementsItem) {
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

	public Expression attributes(Map<String, List<DmnExtensionAttribute>> attributes) {
		this.attributes = attributes;
		return this;
	}

	public Expression putAttributesItem(String key, List<DmnExtensionAttribute> attributesItem) {
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

	public Expression typeRef(String typeRef) {
		this.typeRef = typeRef;
		return this;
	}

	/**
	 * Get typeRef
	 * 
	 * @return typeRef
	 **/

	public String getTypeRef() {
		return typeRef;
	}

	public void setTypeRef(String typeRef) {
		this.typeRef = typeRef;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Expression expression = (Expression) o;
		return Objects.equals(this.id, expression.id) && Objects.equals(this.label, expression.label)
				&& Objects.equals(this.description, expression.description)
				&& Objects.equals(this.extensionElements, expression.extensionElements)
				&& Objects.equals(this.attributes, expression.attributes)
				&& Objects.equals(this.typeRef, expression.typeRef);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, label, description, extensionElements, attributes, typeRef);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Expression {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    label: ").append(toIndentedString(label)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    extensionElements: ").append(toIndentedString(extensionElements)).append("\n");
		sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
		sb.append("    typeRef: ").append(toIndentedString(typeRef)).append("\n");
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
