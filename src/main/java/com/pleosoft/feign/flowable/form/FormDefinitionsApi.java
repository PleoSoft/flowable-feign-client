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

package com.pleosoft.feign.flowable.form;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pleosoft.feign.flowable.form.model.DataResponseFormDefinitionResponse;
import com.pleosoft.feign.flowable.form.model.FormDefinitionResponse;
import com.pleosoft.feign.flowable.form.model.FormModel;

public interface FormDefinitionsApi {

	/**
	 * Get a form definition
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param formDefinitionId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the form definition was found
	 *         returned.", response = FormDefinitionResponse.class),<br/>
	 *         code = 404, message = "Indicates the form definition was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/form-repository/form-definitions/{formDefinitionId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<FormDefinitionResponse> getForm(@PathVariable("formDefinitionId") String formDefinitionId);

	/**
	 * Get a form definition resource content
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param formDefinitionId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates both form definition and
	 *         resource have been found and the resource data has been
	 *         returned.", response = byte[].class, responseContainer =
	 *         "List"),<br/>
	 *         code = 404, message = "Indicates the requested form definition
	 *         was not found or there is no resource with the given id present
	 *         in the process definition. The status-description contains
	 *         additional information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/form-repository/form-definitions/{formDefinitionId}/resourcedata", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<List<byte[]>> getFormDefinitionContent(@PathVariable("formDefinitionId") String formDefinitionId);

	/**
	 * Get a form definition Form model
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param formDefinitionId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the form definition Form model
	 *         was found returned.", response = FormModel.class),<br/>
	 *         code = 404, message = "Indicates the form definition Form model
	 *         was not found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/form-repository/form-definitions/{formDefinitionId}/model", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<FormModel> getFormDefinitionFormModel(@PathVariable("formDefinitionId") String formDefinitionId);

	/**
	 * List of form definitions
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param category
	 *            ("Only return form definitions with the given category.")
	 * @param categoryLike
	 *            ("Only return form definitions with a category like the given
	 *            value.")
	 * @param categoryNotEquals
	 *            ("Only return form definitions not with the given category.")
	 * @param key
	 *            ("Only return form definitions with the given key.")
	 * @param keyLike
	 *            ("Only return form definitions with a key like the given
	 *            value.")
	 * @param name
	 *            ("Only return form definitions with the given name.")
	 * @param nameLike
	 *            ("Only return form definitions with a name like the given
	 *            value.")
	 * @param resourceName
	 *            ("Only return form definitions with the given resource name.")
	 * @param resourceNameLike
	 *            ("Only return form definitions a resource name like the given
	 *            value.")
	 * @param version
	 *            ("Only return form definitions with the given version.")
	 * @param versionGreaterThan
	 *            ("Only return form definitions with a version greater than the
	 *            given value.")
	 * @param versionGreaterThanOrEquals
	 *            ("Only return form definitions with a version greater than or
	 *            equal to the given value.")
	 * @param versionLowerThan
	 *            ("Only return form definitions with a version lower than the
	 *            given value.")
	 * @param versionLowerThanOrEquals
	 *            ("Only return form definitions with a version lower than or
	 *            equal to the given value.")
	 * @param deploymentId
	 *            ("Only return form definitions with the given deployment id.")
	 * @param tenantId
	 *            ("Only return form definitions with the given tenant id.")
	 * @param tenantIdLike
	 *            ("Only return form definitions with a tenant id like the given
	 *            value.")
	 * @param withoutTenantId
	 *            ("Only return form definitions without a tenant id.")
	 * @param latest
	 *            ("If true; only the latest versions will be returned.")
	 * @param sort
	 *            ("Property to sort on, to be used together with the order.",
	 *            allowableValues = "key, category, id, version, name,
	 *            deploymentId, tenantId")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         form definitions are returned", response =
	 *         DataResponseFormDefinitionResponse.class),<br/>
	 *         code = 400, message = "Indicates a parameter was passed in the
	 *         wrong format . The status-message contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/form-repository/form-definitions", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponseFormDefinitionResponse> listFormDefinitions(
			@RequestParam(value = "category", required = false) String category,
			@RequestParam(value = "categoryLike", required = false) String categoryLike,
			@RequestParam(value = "categoryNotEquals", required = false) String categoryNotEquals,
			@RequestParam(value = "key", required = false) String key,
			@RequestParam(value = "keyLike", required = false) String keyLike,
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "nameLike", required = false) String nameLike,
			@RequestParam(value = "resourceName", required = false) String resourceName,
			@RequestParam(value = "resourceNameLike", required = false) String resourceNameLike,
			@RequestParam(value = "version", required = false) String version,
			@RequestParam(value = "versionGreaterThan", required = false) String versionGreaterThan,
			@RequestParam(value = "versionGreaterThanOrEquals", required = false) String versionGreaterThanOrEquals,
			@RequestParam(value = "versionLowerThan", required = false) String versionLowerThan,
			@RequestParam(value = "versionLowerThanOrEquals", required = false) String versionLowerThanOrEquals,
			@RequestParam(value = "deploymentId", required = false) String deploymentId,
			@RequestParam(value = "tenantId", required = false) String tenantId,
			@RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,
			@RequestParam(value = "withoutTenantId", required = false) String withoutTenantId,
			@RequestParam(value = "latest", required = false) Boolean latest,
			@RequestParam(value = "sort", required = false) String sort);

}
