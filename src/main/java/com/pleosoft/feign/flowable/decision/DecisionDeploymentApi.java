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

package com.pleosoft.feign.flowable.decision;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.pleosoft.feign.flowable.decision.model.DataResponseDmnDeploymentResponse;
import com.pleosoft.feign.flowable.decision.model.DmnDeploymentResponse;

public interface DecisionDeploymentApi {

	/**
	 * Delete a decision table deployment
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param deploymentId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the deployment was found and has
	 *         been deleted. Response-body is intentionally empty."),<br/>
	 *         code = 404, message = "Indicates the requested deployment was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/dmn-repository/deployments/{deploymentId}", produces = "application/json", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteDecisionTableDeployment(@PathVariable("deploymentId") String deploymentId);

	/**
	 * Get a decision table deployment
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param deploymentId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the deployment was found and
	 *         returned.", response = DmnDeploymentResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested deployment was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/dmn-repository/deployments/{deploymentId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DmnDeploymentResponse> getDecisionTableDeployment(@PathVariable("deploymentId") String deploymentId);

	/**
	 * Get a decision table deployment resource content
	 *
	 * <p>
	 * The response body will contain the binary resource-content for the
	 * requested resource. The response content-type will be the same as the
	 * type returned in the resources mimeType property. Also, a
	 * content-disposition header is set, allowing browsers to download the file
	 * instead of displaying it.
	 * </p>
	 *
	 *
	 * @param deploymentId
	 *            ("",required=true)
	 * @param resourceName
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates both deployment and resource
	 *         have been found and the resource data has been returned.",
	 *         response = byte[].class, responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested deployment was not
	 *         found or there is no resource with the given id present in the
	 *         deployment. The status-description contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/dmn-repository/deployments/{deploymentId}/resourcedata/{resourceName}", method = RequestMethod.GET)
	ResponseEntity<List<byte[]>> getDecisionTableDeploymentResource(@PathVariable("deploymentId") String deploymentId,
			@PathVariable("resourceName") String resourceName);

	/**
	 * List of decision table deployments
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param name
	 *            ("Only return decision table deployments with the given
	 *            name.")
	 * @param nameLike
	 *            ("Only return decision table deployments with a name like the
	 *            given name.")
	 * @param category
	 *            ("Only return decision table deployments with the given
	 *            category.")
	 * @param categoryNotEquals
	 *            ("Only return decision table deployments which don?t have the
	 *            given category.")
	 * @param tenantId
	 *            ("Only return decision table deployments with the given
	 *            tenantId.")
	 * @param tenantIdLike
	 *            ("Only return decision table deployments with a tenantId like
	 *            the given value.")
	 * @param withoutTenantId
	 *            ("If true, only returns decision table deployments without a
	 *            tenantId set. If false, the withoutTenantId parameter is
	 *            ignored.")
	 * @param sort
	 *            ("Property to sort on, to be used together with the order.",
	 *            allowableValues = "id, name, deployTime, tenantId")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the request was successful.",
	 *         response = DataResponseDmnDeploymentResponse.class)<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/dmn-repository/deployments", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponseDmnDeploymentResponse> listDecisionTableDeployments(
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "nameLike", required = false) String nameLike,
			@RequestParam(value = "category", required = false) String category,
			@RequestParam(value = "categoryNotEquals", required = false) String categoryNotEquals,
			@RequestParam(value = "tenantId", required = false) String tenantId,
			@RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,
			@RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId,
			@RequestParam(value = "sort", required = false) String sort);

	/**
	 * Create a new decision table deployment
	 *
	 * <p>
	 * The request body should contain data of type multipart/form-data. There
	 * should be exactly one file in the request, any additional files will be
	 * ignored. The deployment name is the name of the file-field passed in. If
	 * multiple resources need to be deployed in a single deployment, compress
	 * the resources in a zip and make sure the file-name ends with .bar or
	 * .zip. An additional parameter (form-field) can be passed in the request
	 * body with name tenantId. The value of this field will be used as the id
	 * of the tenant this deployment is done in.
	 * </p>
	 *
	 *
	 * @param tenantId
	 *            ("")
	 * @param file
	 *            (value = "")
	 * @return value = { <br/>
	 *         code = 200, message = "successful operation", response =
	 *         DmnDeploymentResponse.class),<br/>
	 *         code = 201, message = "Indicates the deployment was
	 *         created."),<br/>
	 *         code = 400, message = "Indicates there was no content present in
	 *         the request body or the content mime-type is not supported for
	 *         deployment. The status-description contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/dmn-repository/deployments", produces = "application/json", consumes = "multipart/form-data", method = RequestMethod.POST)
	ResponseEntity<DmnDeploymentResponse> uploadDecisionTableDeployment(
			@RequestParam(value = "tenantId", required = false) String tenantId,
			@RequestPart("file") MultipartFile file);

}
