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
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.pleosoft.feign.flowable.app.model.AppDeploymentResponse;

public interface AppDeploymentsApi {

	/**
	 * Delete an app deployment
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param deploymentId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the App deployment was found and
	 *         has been deleted. Response-body is intentionally empty."),<br/>
	 *         code = 404, message = "Indicates the requested app deployment was
	 *         not found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/app-repository/deployments/{deploymentId}", produces = "application/json", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteAppDeployment(@PathVariable("deploymentId") String deploymentId);

	/**
	 * Get an app deployment
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param deploymentId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the app deployment was found and
	 *         returned.", response = AppDeploymentResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested app deployment was
	 *         not found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/app-repository/deployments/{deploymentId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<AppDeploymentResponse> getAppDeployment(@PathVariable("deploymentId") String deploymentId);

	/**
	 * Get an app deployment resource content
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
	 *         code = 200, message = "Indicates both app deployment and resource
	 *         have been found and the resource data has been returned.",
	 *         response = byte[].class, responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested app deployment was
	 *         not found or there is no resource with the given id present in
	 *         the app deployment. The status-description contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/app-repository/deployments/{deploymentId}/resourcedata/{resourceName}", method = RequestMethod.GET)
	ResponseEntity<List<byte[]>> getAppDeploymentResource(@PathVariable("deploymentId") String deploymentId,
			@PathVariable("resourceName") String resourceName);

	/**
	 * Create a new app deployment
	 *
	 * <p>
	 * The request body should contain data of type multipart/form-data. There
	 * should be exactly one file in the request, any additional files will be
	 * ignored. The deployment name is the name of the file-field passed in.
	 * Make sure the file-name ends with .app, .zip or .bar.
	 * </p>
	 *
	 *
	 * @param tenantId
	 *            ("")
	 * @param file
	 *            (value = "")
	 * @return value = { <br/>
	 *         code = 200, message = "successful operation", response =
	 *         AppDeploymentResponse.class),<br/>
	 *         code = 201, message = "Indicates the app deployment was
	 *         created."),<br/>
	 *         code = 400, message = "Indicates there was no content present in
	 *         the request body or the content mime-type is not supported for
	 *         app deployment. The status-description contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/app-repository/deployments", produces = "application/json", consumes = "multipart/form-data", method = RequestMethod.POST)
	ResponseEntity<AppDeploymentResponse> uploadDeployment(
			@RequestParam(value = "tenantId", required = false) String tenantId,
			@RequestPart("file") MultipartFile file);

}
