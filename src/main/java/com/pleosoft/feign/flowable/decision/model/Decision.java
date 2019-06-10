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

public class Decision {
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

	@JsonProperty("question")
	private String question = null;

	@JsonProperty("allowedAnswers")
	private String allowedAnswers = null;

	@JsonProperty("expression")
	private Expression expression = null;

	public Decision id(String id) {
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

	public Decision label(String label) {
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

	public Decision description(String description) {
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

	public Decision extensionElements(Map<String, List<DmnExtensionElement>> extensionElements) {
		this.extensionElements = extensionElements;
		return this;
	}

	public Decision putExtensionElementsItem(String key, List<DmnExtensionElement> extensionElementsItem) {
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

	public Decision attributes(Map<String, List<DmnExtensionAttribute>> attributes) {
		this.attributes = attributes;
		return this;
	}

	public Decision putAttributesItem(String key, List<DmnExtensionAttribute> attributesItem) {
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

	public Decision name(String name) {
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

	public Decision question(String question) {
		this.question = question;
		return this;
	}

	/**
	 * Get question
	 * 
	 * @return question
	 **/

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Decision allowedAnswers(String allowedAnswers) {
		this.allowedAnswers = allowedAnswers;
		return this;
	}

	/**
	 * Get allowedAnswers
	 * 
	 * @return allowedAnswers
	 **/

	public String getAllowedAnswers() {
		return allowedAnswers;
	}

	public void setAllowedAnswers(String allowedAnswers) {
		this.allowedAnswers = allowedAnswers;
	}

	public Decision expression(Expression expression) {
		this.expression = expression;
		return this;
	}

	/**
	 * Get expression
	 * 
	 * @return expression
	 **/

	@Valid

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Decision decision = (Decision) o;
		return Objects.equals(this.id, decision.id) && Objects.equals(this.label, decision.label)
				&& Objects.equals(this.description, decision.description)
				&& Objects.equals(this.extensionElements, decision.extensionElements)
				&& Objects.equals(this.attributes, decision.attributes) && Objects.equals(this.name, decision.name)
				&& Objects.equals(this.question, decision.question)
				&& Objects.equals(this.allowedAnswers, decision.allowedAnswers)
				&& Objects.equals(this.expression, decision.expression);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, label, description, extensionElements, attributes, name, question, allowedAnswers,
				expression);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Decision {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    label: ").append(toIndentedString(label)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    extensionElements: ").append(toIndentedString(extensionElements)).append("\n");
		sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    question: ").append(toIndentedString(question)).append("\n");
		sb.append("    allowedAnswers: ").append(toIndentedString(allowedAnswers)).append("\n");
		sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
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
