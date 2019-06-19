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

package com.pleosoft.feign.flowable.app;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pleosoft.feign.flowable.app.model.AppDefinitionResponse;
import com.pleosoft.feign.flowable.app.model.DataResponseAppDefinitionResponse;

public interface AppDefinitionsApi {

	/**
	 * Get a app definition
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param appDefinitionId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the app definition was found
	 *         returned.", response = AppDefinitionResponse.class),<br/>
	 *         code = 404, message = "Indicates the app definition was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/app-repository/app-definitions/{appDefinitionId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<AppDefinitionResponse> getAppDefinition(@PathVariable("appDefinitionId") String appDefinitionId);

	/**
	 * Get an app definition resource content
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param appDefinitionId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates both app definition and resource
	 *         have been found and the resource data has been returned.",
	 *         response = byte[].class, responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested app definition was
	 *         not found or there is no resource with the given id present in
	 *         the app definition. The status-description contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/app-repository/app-definitions/{appDefinitionId}/resourcedata", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<List<byte[]>> getAppDefinitionContent(@PathVariable("appDefinitionId") String appDefinitionId);

	/**
	 * Get an App model
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param appDefinitionId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the app model was found
	 *         returned.", response = String.class),<br/>
	 *         code = 404, message = "Indicates the app model was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/app-repository/app-definitions/{appDefinitionId}/model", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<String> getAppModel(@PathVariable("appDefinitionId") String appDefinitionId);

	/**
	 * List of app definitions
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param category
	 *            ("Only return app definitions with the given category.")
	 * @param categoryLike
	 *            ("Only return app definitions with a category like the given
	 *            value.")
	 * @param categoryNotEquals
	 *            ("Only return app definitions not with the given category.")
	 * @param key
	 *            ("Only return app definitions with the given key.")
	 * @param keyLike
	 *            ("Only return app definitions with a key like the given
	 *            value.")
	 * @param name
	 *            ("Only return app definitions with the given name.")
	 * @param nameLike
	 *            ("Only return app definitions with a name like the given
	 *            value.")
	 * @param resourceName
	 *            ("Only return app definitions with the given resource name.")
	 * @param resourceNameLike
	 *            ("Only return app definitions a resource name like the given
	 *            value.")
	 * @param version
	 *            ("Only return app definitions with the given version.")
	 * @param versionGreaterThan
	 *            ("Only return app definitions with a version greater than the
	 *            given value.")
	 * @param versionGreaterThanOrEquals
	 *            ("Only return app definitions with a version greater than or
	 *            equal to the given value.")
	 * @param versionLowerThan
	 *            ("Only return app definitions with a version lower than the
	 *            given value.")
	 * @param versionLowerThanOrEquals
	 *            ("Only return app definitions with a version lower than or
	 *            equal to the given value.")
	 * @param deploymentId
	 *            ("Only return app definitions with the given deployment id.")
	 * @param tenantId
	 *            ("Only return app definitions with the given tenant id.")
	 * @param tenantIdLike
	 *            ("Only return app definitions with a tenant id like the given
	 *            value.")
	 * @param withoutTenantId
	 *            ("Only return app definitions without a tenant id.")
	 * @param latest
	 *            ("If true; only the latest versions will be returned.")
	 * @param sort
	 *            ("Property to sort on, to be used together with the order.",
	 *            allowableValues = "key, category, id, version, name,
	 *            deploymentId, tenantId")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         app definitions are returned", response =
	 *         DataResponseAppDefinitionResponse.class),<br/>
	 *         code = 400, message = "Indicates a parameter was passed in the
	 *         wrong format . The status-message contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/app-repository/app-definitions", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponseAppDefinitionResponse> listAppDefinitions(
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
