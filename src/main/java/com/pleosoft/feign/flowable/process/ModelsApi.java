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

package com.pleosoft.feign.flowable.process;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.pleosoft.feign.flowable.process.model.DataResponseModelResponse;
import com.pleosoft.feign.flowable.process.model.ModelRequest;
import com.pleosoft.feign.flowable.process.model.ModelResponse;

public interface ModelsApi {

	/**
	 * Create a model
	 *
	 * <p>
	 * All request values are optional. For example, you can only include the
	 * name attribute in the request body JSON-object, only setting the name of
	 * the model, leaving all other fields null.
	 * </p>
	 *
	 *
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "successful operation", response =
	 *         ModelResponse.class),<br/>
	 *         code = 201, message = "Indicates the model was created.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/repository/models", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<ModelResponse> createModel(@RequestBody ModelRequest body);

	/**
	 * Delete a model
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param modelId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the model was found and has been
	 *         deleted. Response-body is intentionally empty."),<br/>
	 *         code = 404, message = "Indicates the requested model was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/repository/models/{modelId}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteModel(@PathVariable("modelId") String modelId);

	/**
	 * Get the extra editor source for a model
	 *
	 * <p>
	 * Response body contains the model?s raw editor source. The response?s
	 * content-type is set to application/octet-stream, regardless of the
	 * content of the source.
	 * </p>
	 *
	 *
	 * @param modelId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the model was found and source
	 *         is returned.", response = byte[].class, responseContainer =
	 *         "List"),<br/>
	 *         code = 404, message = "Indicates the requested model was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/repository/models/{modelId}/source-extra", method = RequestMethod.GET)
	ResponseEntity<List<byte[]>> getExtraEditorSource(@PathVariable("modelId") String modelId);

	/**
	 * Get a model
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param modelId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the model was found and
	 *         returned.", response = ModelResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested model was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/repository/models/{modelId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<ModelResponse> getModel(@PathVariable("modelId") String modelId);

	/**
	 * Get the editor source for a model
	 *
	 * <p>
	 * Response body contains the model?s raw editor source. The response?s
	 * content-type is set to application/octet-stream, regardless of the
	 * content of the source.
	 * </p>
	 *
	 *
	 * @param modelId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the model was found and source
	 *         is returned.", response = byte[].class, responseContainer =
	 *         "List"),<br/>
	 *         code = 404, message = "Indicates the requested model was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/repository/models/{modelId}/source", method = RequestMethod.GET)
	ResponseEntity<List<byte[]>> getModelBytes(@PathVariable("modelId") String modelId);

	/**
	 * List models
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param id
	 *            ("Only return models with the given version.")
	 * @param category
	 *            ("Only return models with the given category.")
	 * @param categoryLike
	 *            ("Only return models with a category like the given name.")
	 * @param categoryNotEquals
	 *            ("Only return models which don?t have the given category.")
	 * @param name
	 *            ("Only return models with the given name.")
	 * @param nameLike
	 *            ("Only return models with a name like the given name.")
	 * @param key
	 *            ("Only return models with the given key.")
	 * @param deploymentId
	 *            ("Only return models with the given category.")
	 * @param version
	 *            ("Only return models with the given version.")
	 * @param latestVersion
	 *            ("If true, only return models which are the latest version.
	 *            Best used in combination with key. If false is passed in as
	 *            value, this is ignored and all versions are returned.")
	 * @param deployed
	 *            ("If true, only deployed models are returned. If false, only
	 *            undeployed models are returned (deploymentId is null).")
	 * @param tenantId
	 *            ("Only return models with the given tenantId.")
	 * @param tenantIdLike
	 *            ("Only return models with a tenantId like the given value.")
	 * @param withoutTenantId
	 *            ("If true, only returns models without a tenantId set. If
	 *            false, the withoutTenantId parameter is ignored.")
	 * @param sort
	 *            ("Property to sort on, to be used together with the order.",
	 *            allowableValues = "id, category, createTime, key,
	 *            lastUpdateTime, name, version, tenantId")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         models are returned", response =
	 *         DataResponseModelResponse.class),<br/>
	 *         code = 400, message = "Indicates a parameter was passed in the
	 *         wrong format. The status-message contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/repository/models", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponseModelResponse> listModels(@RequestParam(value = "id", required = false) String id,
			@RequestParam(value = "category", required = false) String category,
			@RequestParam(value = "categoryLike", required = false) String categoryLike,
			@RequestParam(value = "categoryNotEquals", required = false) String categoryNotEquals,
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "nameLike", required = false) String nameLike,
			@RequestParam(value = "key", required = false) String key,
			@RequestParam(value = "deploymentId", required = false) String deploymentId,
			@RequestParam(value = "version", required = false) Integer version,
			@RequestParam(value = "latestVersion", required = false) Boolean latestVersion,
			@RequestParam(value = "deployed", required = false) Boolean deployed,
			@RequestParam(value = "tenantId", required = false) String tenantId,
			@RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,
			@RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId,
			@RequestParam(value = "sort", required = false) String sort);

	/**
	 * Set the extra editor source for a model
	 *
	 * <p>
	 * Response body contains the model?s raw editor source. The response?s
	 * content-type is set to application/octet-stream, regardless of the
	 * content of the source.
	 * </p>
	 *
	 *
	 * @param modelId
	 *            ("",required=true)
	 * @param file
	 *            (value = "", required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the model was found and the
	 *         extra source has been updated."),<br/>
	 *         code = 404, message = "Indicates the requested model was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/repository/models/{modelId}/source-extra", consumes = "multipart/form-data", method = RequestMethod.PUT)
	ResponseEntity<Void> setExtraEditorSource(@PathVariable("modelId") String modelId,
			@RequestPart("file") MultipartFile file);

	/**
	 * Set the editor source for a model
	 *
	 * <p>
	 * Response body contains the model?s raw editor source. The response?s
	 * content-type is set to application/octet-stream, regardless of the
	 * content of the source.
	 * </p>
	 *
	 *
	 * @param modelId
	 *            ("",required=true)
	 * @param file
	 *            (value = "", required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the model was found and the
	 *         source has been updated."),<br/>
	 *         code = 404, message = "Indicates the requested model was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/repository/models/{modelId}/source", consumes = "multipart/form-data", method = RequestMethod.PUT)
	ResponseEntity<Void> setModelSource(@PathVariable("modelId") String modelId,
			@RequestPart("file") MultipartFile file);

	/**
	 * Update a model
	 *
	 * <p>
	 * All request values are optional. For example, you can only include the
	 * name attribute in the request body JSON-object, only updating the name of
	 * the model, leaving all other fields unaffected. When an attribute is
	 * explicitly included and is set to null, the model-value will be updated
	 * to null.
	 * </p>
	 *
	 *
	 * @param modelId
	 *            ("",required=true)
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the model was found and
	 *         updated.", response = ModelResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested model was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/repository/models/{modelId}", produces = "application/json", method = RequestMethod.PUT)
	ResponseEntity<ModelResponse> updateModel(@PathVariable("modelId") String modelId, @RequestBody ModelRequest body);

}
