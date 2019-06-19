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

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pleosoft.feign.flowable.app.model.DataResponseAppDeploymentResponse;

public interface FormDeploymentsApi {

	/**
	 * List of App Deployments
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param name
	 *            ("Only return app deployments with the given name.")
	 * @param nameLike
	 *            ("Only return app deployments with a name like the given
	 *            name.")
	 * @param category
	 *            ("Only return app deployments with the given category.")
	 * @param categoryNotEquals
	 *            ("Only return app deployments which do not have the given
	 *            category.")
	 * @param tenantId
	 *            ("Only return app deployments with the given tenantId.")
	 * @param tenantIdLike
	 *            ("Only return app deployments with a tenantId like the given
	 *            value.")
	 * @param withoutTenantId
	 *            ("If true, only returns app deployments without a tenantId
	 *            set. If false, the withoutTenantId parameter is ignored.")
	 * @param sort
	 *            ("Property to sort on, to be used together with the order.",
	 *            allowableValues = "id, name, deployTime, tenantId")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the request was successful.",
	 *         response = DataResponseAppDeploymentResponse.class)<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/app-repository/deployments", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponseAppDeploymentResponse> listAppDeployments(
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "nameLike", required = false) String nameLike,
			@RequestParam(value = "category", required = false) String category,
			@RequestParam(value = "categoryNotEquals", required = false) String categoryNotEquals,
			@RequestParam(value = "tenantId", required = false) String tenantId,
			@RequestParam(value = "tenantIdLike", required = false) String tenantIdLike,
			@RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId,
			@RequestParam(value = "sort", required = false) String sort);

}
