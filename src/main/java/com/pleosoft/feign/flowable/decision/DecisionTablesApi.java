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

import com.pleosoft.feign.flowable.decision.model.DataResponseDecisionTableResponse;
import com.pleosoft.feign.flowable.decision.model.DecisionTableResponse;
import com.pleosoft.feign.flowable.decision.model.DmnDefinition;

public interface DecisionTablesApi {

	/**
	 * Get a decision table
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param decisionTableId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         decision table is returned", response =
	 *         DecisionTableResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested decision table was
	 *         not found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/dmn-repository/decision-tables/{decisionTableId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DecisionTableResponse> getDecisionTable(@PathVariable("decisionTableId") String decisionTableId);

	/**
	 * Get a decision table DMN (definition) model
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param decisionTableId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the decision table was found and
	 *         the model is returned.", response = DmnDefinition.class),<br/>
	 *         code = 404, message = "Indicates the requested decision table was
	 *         not found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/dmn-repository/decision-tables/{decisionTableId}/model", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DmnDefinition> getDecisionTableModel(@PathVariable("decisionTableId") String decisionTableId);

	/**
	 * Get a decision table resource content
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param decisionTableId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates both decision table and resource
	 *         have been found and the resource data has been returned.",
	 *         response = byte[].class, responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested decision table was
	 *         not found or there is no resource with the given id present in
	 *         the decision table. The status-description contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/dmn-repository/decision-tables/{decisionTableId}/resourcedata", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<List<byte[]>> getDecisionTableResource(@PathVariable("decisionTableId") String decisionTableId);

	/**
	 * List of decision tables
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param category
	 *            ("Only return decision tables with the given category.")
	 * @param categoryLike
	 *            ("Only return decision tables with a category like the given
	 *            name.")
	 * @param categoryNotEquals
	 *            ("Only return decision tables which don?t have the given
	 *            category.")
	 * @param key
	 *            ("Only return decision tables with the given key.")
	 * @param keyLike
	 *            ("Only return decision tables with a name like the given
	 *            key.")
	 * @param name
	 *            ("Only return decision tables with the given name.")
	 * @param nameLike
	 *            ("Only return decision tables with a name like the given
	 *            name.")
	 * @param resourceName
	 *            ("Only return decision tables with the given resource name.")
	 * @param resourceNameLike
	 *            ("Only return decision tables with a name like the given
	 *            resource name.")
	 * @param version
	 *            ("Only return decision tables with the given version.")
	 * @param latest
	 *            ("Only return the latest decision tables versions. Can only be
	 *            used together with key and keyLike parameters, using any other
	 *            parameter will result in a 400-response.")
	 * @param deploymentId
	 *            ("Only return decision tables with the given category.")
	 * @param tenantId
	 *            ("Only return decision tables with the given tenant ID.")
	 * @param sort
	 *            ("Property to sort on, to be used together with the order.",
	 *            allowableValues = "name, id, key, category, deploymentId,
	 *            version")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates request was successful and the
	 *         process-definitions are returned", response =
	 *         DataResponseDecisionTableResponse.class),<br/>
	 *         code = 400, message = "Indicates a parameter was passed in the
	 *         wrong format or that latest is used with other parameters other
	 *         than key and keyLike. The status-message contains additional
	 *         information.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/dmn-repository/decision-tables", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponseDecisionTableResponse> listDecisionTables(
			@RequestParam(value = "category", required = false) String category,
			@RequestParam(value = "categoryLike", required = false) String categoryLike,
			@RequestParam(value = "categoryNotEquals", required = false) String categoryNotEquals,
			@RequestParam(value = "key", required = false) String key,
			@RequestParam(value = "keyLike", required = false) String keyLike,
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "nameLike", required = false) String nameLike,
			@RequestParam(value = "resourceName", required = false) String resourceName,
			@RequestParam(value = "resourceNameLike", required = false) String resourceNameLike,
			@RequestParam(value = "version", required = false) Integer version,
			@RequestParam(value = "latest", required = false) Boolean latest,
			@RequestParam(value = "deploymentId", required = false) String deploymentId,
			@RequestParam(value = "tenantId", required = false) String tenantId,
			@RequestParam(value = "sort", required = false) String sort);

}
