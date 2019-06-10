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

package com.pleosoft.feign.flowable.form.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated

public class OptionFormField extends FormField {
	@JsonProperty("optionType")
	private String optionType = null;

	@JsonProperty("hasEmptyValue")
	private Boolean hasEmptyValue = null;

	@JsonProperty("options")
	@Valid
	private List<Option> options = null;

	public OptionFormField optionType(String optionType) {
		this.optionType = optionType;
		return this;
	}

	/**
	 * Get optionType
	 * 
	 * @return optionType
	 **/

	public String getOptionType() {
		return optionType;
	}

	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}

	public OptionFormField hasEmptyValue(Boolean hasEmptyValue) {
		this.hasEmptyValue = hasEmptyValue;
		return this;
	}

	/**
	 * Get hasEmptyValue
	 * 
	 * @return hasEmptyValue
	 **/

	public Boolean isHasEmptyValue() {
		return hasEmptyValue;
	}

	public void setHasEmptyValue(Boolean hasEmptyValue) {
		this.hasEmptyValue = hasEmptyValue;
	}

	public OptionFormField options(List<Option> options) {
		this.options = options;
		return this;
	}

	public OptionFormField addOptionsItem(Option optionsItem) {
		if (this.options == null) {
			this.options = new ArrayList<Option>();
		}
		this.options.add(optionsItem);
		return this;
	}

	/**
	 * Get options
	 * 
	 * @return options
	 **/

	@Valid

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OptionFormField optionFormField = (OptionFormField) o;
		return Objects.equals(this.optionType, optionFormField.optionType)
				&& Objects.equals(this.hasEmptyValue, optionFormField.hasEmptyValue)
				&& Objects.equals(this.options, optionFormField.options) && super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(optionType, hasEmptyValue, options, super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OptionFormField {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    optionType: ").append(toIndentedString(optionType)).append("\n");
		sb.append("    hasEmptyValue: ").append(toIndentedString(hasEmptyValue)).append("\n");
		sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
