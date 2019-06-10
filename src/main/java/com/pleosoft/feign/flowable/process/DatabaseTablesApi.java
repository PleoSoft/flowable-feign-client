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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pleosoft.feign.flowable.process.model.DataResponse;
import com.pleosoft.feign.flowable.process.model.TableMetaData;
import com.pleosoft.feign.flowable.process.model.TableResponse;

public interface DatabaseTablesApi {

	/**
	 * Get a single table
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param tableName
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the table exists and the table
	 *         count is returned.", response = TableResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested table does not
	 *         exist.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/management/tables/{tableName}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<TableResponse> getTable(@PathVariable("tableName") String tableName);

	/**
	 * Get row data for a single table
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param tableName
	 *            ("",required=true)
	 * @param start
	 *            ("Index of the first row to fetch. Defaults to 0.")
	 * @param size
	 *            ("Number of rows to fetch, starting from start. Defaults to
	 *            10.")
	 * @param orderAscendingColumn
	 *            ("Name of the column to sort the resulting rows on,
	 *            ascending.")
	 * @param orderDescendingColumn
	 *            ("Name of the column to sort the resulting rows on,
	 *            descending.")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the table exists and the table
	 *         row data is returned", response = DataResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested table does not
	 *         exist.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/management/tables/{tableName}/data", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponse> getTableData(@PathVariable("tableName") String tableName,
			@RequestParam(value = "start", required = false) Integer start,
			@RequestParam(value = "size", required = false) Integer size,
			@RequestParam(value = "orderAscendingColumn", required = false) String orderAscendingColumn,
			@RequestParam(value = "orderDescendingColumn", required = false) String orderDescendingColumn);

	/**
	 * Get column info for a single table
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param tableName
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the table exists and the table
	 *         column info is returned.", response = TableMetaData.class),<br/>
	 *         code = 404, message = "Indicates the requested table does not
	 *         exist.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/management/tables/{tableName}/columns", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<TableMetaData> getTableMetaData(@PathVariable("tableName") String tableName);

	/**
	 * List tables
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the request was successful.",
	 *         response = TableResponse.class, responseContainer = "List")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/management/tables", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<List<TableResponse>> listTables();

}
