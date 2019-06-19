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

import com.pleosoft.feign.flowable.app.model.AppDeploymentResourceResponse;

public interface DeploymentApi {

	/**
	 * Get a deployment resource
	 *
	 * <p>
	 * Replace ** by ResourceId
	 * </p>
	 *
	 *
	 * @param deploymentId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates both deployment and resource
	 *         have been found and the resource has been returned.", response =
	 *         AppDeploymentResourceResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested deployment was not
	 *         found or there is no resource with the given id present in the
	 *         deployment. The status-description contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/app-repository/deployments/{deploymentId}/resources/**", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<AppDeploymentResourceResponse> getDeploymentResource(
			@PathVariable("deploymentId") String deploymentId);

	/**
	 * List resources in a deployment
	 *
	 * <p>
	 * The dataUrl property in the resulting JSON for a single resource contains
	 * the actual URL to use for retrieving the binary resource.
	 * </p>
	 *
	 *
	 * @param deploymentId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the deployment was found and the
	 *         resource list has been returned.", response =
	 *         AppDeploymentResourceResponse.class, responseContainer =
	 *         "List"),<br/>
	 *         code = 404, message = "Indicates the requested deployment was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/app-repository/deployments/{deploymentId}/resources", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<List<AppDeploymentResourceResponse>> listDeploymentResources(
			@PathVariable("deploymentId") String deploymentId);

}
