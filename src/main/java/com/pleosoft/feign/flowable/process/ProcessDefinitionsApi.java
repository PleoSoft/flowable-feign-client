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

import com.pleosoft.feign.flowable.form.model.FormModelResponse;
import com.pleosoft.feign.flowable.process.model.BpmnModel;
import com.pleosoft.feign.flowable.process.model.DataResponseProcessDefinitionResponse;
import com.pleosoft.feign.flowable.process.model.DecisionTableResponse;
import com.pleosoft.feign.flowable.process.model.FormDefinition;
import com.pleosoft.feign.flowable.process.model.ProcessDefinitionActionRequest;
import com.pleosoft.feign.flowable.process.model.ProcessDefinitionResponse;
import com.pleosoft.feign.flowable.process.model.RestIdentityLink;

public interface ProcessDefinitionsApi {

	/**
	 * Add a candidate starter to a process definition
	 *
	 * <p>
	 * It's possible to add either a user or a group.
	 * </p>
	 *
	 *
	 * @param processDefinitionId
	 *            ("",required=true)
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "successful operation", response =
	 *         RestIdentityLink.class),<br/>
	 *         code = 201, message = "Indicates the process definition was found
	 *         and the identity link was created."),<br/>
	 *         code = 400, message = "Indicates the body does not contain the
	 *         correct information."),<br/>
	 *         code = 404, message = "Indicates the requested process definition
	 *         was not found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/repository/process-definitions/{processDefinitionId}/identitylinks", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<RestIdentityLink> createIdentityLink(@PathVariable("processDefinitionId") String processDefinitionId,
			@RequestBody RestIdentityLink body);

	/**
	 * Delete a candidate starter from a process definition
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processDefinitionId
	 *            ("",required=true)
	 * @param family
	 *            ("",required=true)
	 * @param identityId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the process definition was found
	 *         and the identity link was removed. The response body is
	 *         intentionally empty."),<br/>
	 *         code = 404, message = "Indicates the requested process definition
	 *         was not found or the process definition does not have an
	 *         identity-link that matches the url.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/repository/process-definitions/{processDefinitionId}/identitylinks/{family}/{identityId}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteIdentityLink(@PathVariable("processDefinitionId") String processDefinitionId,
			@PathVariable("family") String family, @PathVariable("identityId") String identityId);

	/**
	 * Execute actions for a process definition
	 *
	 * <p>
	 * Execute actions for a process definition (Update category, Suspend or
	 * Activate)
	 * </p>
	 *
	 *
	 * @param processDefinitionId
	 *            ("",required=true)
	 * @param body
	 *            (value = "" ,required=true )
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates action has been executed for the
	 *         specified process. (category altered, activate or suspend)",
	 *         response = ProcessDefinitionResponse.class),<br/>
	 *         code = 400, message = "Indicates no category was defined in the
	 *         request body."),<br/>
	 *         code = 404, message = "Indicates the requested process definition
	 *         was not found."),<br/>
	 *         code = 409, message = "Indicates the requested process definition
	 *         is already suspended or active.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/repository/process-definitions/{processDefinitionId}", produces = "application/json", method = RequestMethod.PUT)
	ResponseEntity<ProcessDefinitionResponse> executeProcessDefinitionAction(
			@PathVariable("processDefinitionId") String processDefinitionId,
			@RequestBody ProcessDefinitionActionRequest body);

	/**
	 * Get a process definition BPMN model
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processDefinitionId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the process definition was found
	 *         and the model is returned. The response contains the full process
	 *         definition model.", response = BpmnModel.class),<br/>
	 *         code = 404, message = "Indicates the requested process definition
	 *         was not found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/repository/process-definitions/{processDefinitionId}/model", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<BpmnModel> getBpmnModelResource(@PathVariable("processDefinitionId") String processDefinitionId);

	/**
	 * Get a candidate starter from a process definition
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processDefinitionId
	 *            ("",required=true)
	 * @param family
	 *            ("",required=true)
	 * @param identityId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the process definition was found
	 *         and the identity link was returned.", response =
	 *         RestIdentityLink.class),<br/>
	 *         code = 404, message = "Indicates the requested process definition
	 *         was not found or the process definition does not have an
	 *         identity-link that matches the url.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/repository/process-definitions/{processDefinitionId}/identitylinks/{family}/{identityId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<RestIdentityLink> getIdentityLink(@PathVariable("processDefinitionId") String processDefinitionId,
			@PathVariable("family") String family, @PathVariable("identityId") String identityId);

	/**
	 * Get a process definition image
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processDefinitionId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         process-definitions are returned", response = byte[].class,
	 *         responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested process definition
	 *         was not found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/repository/process-definitions/{processDefinitionId}/image", method = RequestMethod.GET)
	ResponseEntity<List<byte[]>> getModelResource(@PathVariable("processDefinitionId") String processDefinitionId);

	/**
	 * Get a process definition
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processDefinitionId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         process-definitions are returned", response =
	 *         ProcessDefinitionResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested process definition
	 *         was not found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/repository/process-definitions/{processDefinitionId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<ProcessDefinitionResponse> getProcessDefinition(
			@PathVariable("processDefinitionId") String processDefinitionId);

	/**
	 * Get a process definition resource content
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processDefinitionId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates both process definition and
	 *         resource have been found and the resource data has been
	 *         returned.", response = byte[].class, responseContainer =
	 *         "List"),<br/>
	 *         code = 404, message = "Indicates the requested process definition
	 *         was not found or there is no resource with the given id present
	 *         in the process definition. The status-description contains
	 *         additional information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/repository/process-definitions/{processDefinitionId}/resourcedata", method = RequestMethod.GET)
	ResponseEntity<List<byte[]>> getProcessDefinitionResource(
			@PathVariable("processDefinitionId") String processDefinitionId);

	/**
	 * List decision tables for a process-definition
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processDefinitionId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the process definition was found
	 *         and the decision tables are returned.", response =
	 *         DecisionTableResponse.class, responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested process definition
	 *         was not found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/repository/process-definitions/{processDefinitionId}/decision-tables", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<List<DecisionTableResponse>> listProcessDefinitionDecisionTables(
			@PathVariable("processDefinitionId") String processDefinitionId);

	/**
	 * List form definitions for a process-definition
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processDefinitionId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the process definition was found
	 *         and the form definitions are returned.", response =
	 *         FormDefinition.class, responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested process definition
	 *         was not found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/repository/process-definitions/{processDefinitionId}/form-definitions", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<List<FormDefinition>> listProcessDefinitionFormDefinitions(
			@PathVariable("processDefinitionId") String processDefinitionId);

	/**
	 * List candidate starters for a process-definition
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processDefinitionId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the process definition was found
	 *         and the requested identity links are returned.", response =
	 *         RestIdentityLink.class, responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested process definition
	 *         was not found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/repository/process-definitions/{processDefinitionId}/identitylinks", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<List<RestIdentityLink>> listProcessDefinitionIdentityLinks(
			@PathVariable("processDefinitionId") String processDefinitionId);

	/**
	 * List of process definitions
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param version
	 *            ("Only return process definitions with the given version.")
	 * @param name
	 *            ("Only return process definitions with the given name.")
	 * @param nameLike
	 *            ("Only return process definitions with a name like the given
	 *            name.")
	 * @param key
	 *            ("Only return process definitions with the given key.")
	 * @param keyLike
	 *            ("Only return process definitions with a name like the given
	 *            key.")
	 * @param resourceName
	 *            ("Only return process definitions with the given resource
	 *            name.")
	 * @param resourceNameLike
	 *            ("Only return process definitions with a name like the given
	 *            resource name.")
	 * @param category
	 *            ("Only return process definitions with the given category.")
	 * @param categoryLike
	 *            ("Only return process definitions with a category like the
	 *            given name.")
	 * @param categoryNotEquals
	 *            ("Only return process definitions which don?t have the given
	 *            category.")
	 * @param deploymentId
	 *            ("Only return process definitions with the given category.")
	 * @param startableByUser
	 *            ("Only return process definitions which are part of a
	 *            deployment with the given id.")
	 * @param latest
	 *            ("Only return the latest process definition versions. Can only
	 *            be used together with key and keyLike parameters, using any
	 *            other parameter will result in a 400-response.")
	 * @param suspended
	 *            ("If true, only returns process definitions which are
	 *            suspended. If false, only active process definitions (which
	 *            are not suspended) are returned.")
	 * @param sort
	 *            ("Property to sort on, to be used together with the order.",
	 *            allowableValues = "name, id, key, category, deploymentId,
	 *            version")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         process-definitions are returned", response =
	 *         DataResponseProcessDefinitionResponse.class),<br/>
	 *         code = 400, message = "Indicates a parameter was passed in the
	 *         wrong format or that latest is used with other parameters other
	 *         than key and keyLike. The status-message contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/repository/process-definitions", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponseProcessDefinitionResponse> listProcessDefinitions(
			@RequestParam(value = "version", required = false) Integer version,
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "nameLike", required = false) String nameLike,
			@RequestParam(value = "key", required = false) String key,
			@RequestParam(value = "keyLike", required = false) String keyLike,
			@RequestParam(value = "resourceName", required = false) String resourceName,
			@RequestParam(value = "resourceNameLike", required = false) String resourceNameLike,
			@RequestParam(value = "category", required = false) String category,
			@RequestParam(value = "categoryLike", required = false) String categoryLike,
			@RequestParam(value = "categoryNotEquals", required = false) String categoryNotEquals,
			@RequestParam(value = "deploymentId", required = false) String deploymentId,
			@RequestParam(value = "startableByUser", required = false) String startableByUser,
			@RequestParam(value = "latest", required = false) Boolean latest,
			@RequestParam(value = "suspended", required = false) Boolean suspended,
			@RequestParam(value = "sort", required = false) String sort);

}
