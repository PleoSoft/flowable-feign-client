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
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.pleosoft.feign.flowable.form.model.DataResponseFormDeployment;
import com.pleosoft.feign.flowable.form.model.FormDeployment;

public interface FormDeploymentsApi {

	/**
	 * Delete a form deployment
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param deploymentId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the form deployment was found
	 *         and has been deleted. Response-body is intentionally
	 *         empty."),<br/>
	 *         code = 404, message = "Indicates the requested form deployment
	 *         was not found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/form-repository/deployments/{deploymentId}", produces = "application/json", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteFormDeployment(@PathVariable("deploymentId") String deploymentId);

	/**
	 * Get a form deployment
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param deploymentId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the form deployment was found
	 *         and returned.", response = FormDeployment.class),<br/>
	 *         code = 404, message = "Indicates the requested form deployment
	 *         was not found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/form-repository/deployments/{deploymentId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<FormDeployment> getFormDeployment(@PathVariable("deploymentId") String deploymentId);

	/**
	 * Get a form deployment resource content
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
	 *         code = 200, message = "Indicates both form deployment and
	 *         resource have been found and the resource data has been
	 *         returned.", response = byte[].class, responseContainer =
	 *         "List"),<br/>
	 *         code = 404, message = "Indicates the requested form deployment
	 *         was not found or there is no resource with the given id present
	 *         in the form deployment. The status-description contains
	 *         additional information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/form-repository/deployments/{deploymentId}/resourcedata/{resourceName}", method = RequestMethod.GET)
	ResponseEntity<List<byte[]>> getFormDeploymentResource(@PathVariable("deploymentId") String deploymentId,
			@PathVariable("resourceName") String resourceName);

	/**
	 * List of Form Deployments
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param name
	 *            ("Only return form deployments with the given name.")
	 * @param nameLike
	 *            ("Only return form deployments with a name like the given
	 *            name.")
	 * @param category
	 *            ("Only return form deployments with the given category.")
	 * @param categoryNotEquals
	 *            ("Only return form deployments which don?t have the given
	 *            category.")
	 * @param tenantId
	 *            ("Only return form deployments with the given tenantId.")
	 * @param tenantIdLike
	 *            ("Only return form deployments with a tenantId like the given
	 *            value.")
	 * @param withoutTenantId
	 *            ("If true, only returns form deployments without a tenantId
	 *            set. If false, the withoutTenantId parameter is ignored.")
	 * @param sort
	 *            ("Property to sort on, to be used together with the order.",
	 *            allowableValues = "id, name, deployTime, tenantId")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the request was successful.",
	 *         response = DataResponseFormDeployment.class)<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/form-repository/deployments", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponseFormDeployment> listFormDeployments(
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "nameLike", required = false) String nameLike,
			@RequestParam(value = "category", required = false) String category,
			@RequestParam(value = "categoryNotEquals", required = false) String categoryNotEquals,
			@RequestParam(value = "tenantId", required = false) String tenantId,
			@RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,
			@RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId,
			@RequestParam(value = "sort", required = false) String sort);

	/**
	 * Create a new form deployment
	 *
	 * <p>
	 * The request body should contain data of type multipart/form-data. There
	 * should be exactly one file in the request, any additional files will be
	 * ignored. The deployment name is the name of the file-field passed in.
	 * Make sure the file-name ends with .form or .xml.
	 * </p>
	 *
	 *
	 * @param tenantId
	 *            ("")
	 * @param file
	 *            (value = "")
	 * @return value = { <br/>
	 *         code = 200, message = "successful operation", response =
	 *         FormDeployment.class),<br/>
	 *         code = 201, message = "Indicates the form deployment was
	 *         created."),<br/>
	 *         code = 400, message = "Indicates there was no content present in
	 *         the request body or the content mime-type is not supported for
	 *         form deployment. The status-description contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/form-repository/deployments", produces = "application/json", consumes = "multipart/form-data", method = RequestMethod.POST)
	ResponseEntity<FormDeployment> uploadDeployment(@RequestParam(value = "tenantId", required = false) String tenantId,
			@RequestPart("file") MultipartFile file);

}
