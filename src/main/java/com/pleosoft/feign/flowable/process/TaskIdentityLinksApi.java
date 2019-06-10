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

import com.pleosoft.feign.flowable.process.model.RestIdentityLink;

public interface TaskIdentityLinksApi {

	/**
	 * Create an identity link on a task
	 *
	 * <p>
	 * It's possible to add either a user or a group.
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "successful operation", response =
	 *         RestIdentityLink.class),<br/>
	 *         code = 201, message = "Indicates the task was found and the
	 *         identity link was created."),<br/>
	 *         code = 404, message = "Indicates the requested task was not found
	 *         or the task does nothave the requested identityLink. The status
	 *         contains additional information about this error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}/identitylinks", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<RestIdentityLink> createTaskInstanceIdentityLinks(@PathVariable("taskId") String taskId,
			@RequestBody RestIdentityLink body);

	/**
	 * Delete an identity link on a task
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @param family
	 *            ("",required=true)
	 * @param identityId
	 *            ("",required=true)
	 * @param type
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the task and identity link were
	 *         found and the link has been deleted. Response-body is
	 *         intentionally empty."),<br/>
	 *         code = 404, message = "Indicates the requested task was not found
	 *         or the task does nothave the requested identityLink. The status
	 *         contains additional information about this error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}/identitylinks/{family}/{identityId}/{type}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteTaskInstanceIdentityLinks(@PathVariable("taskId") String taskId,
			@PathVariable("family") String family, @PathVariable("identityId") String identityId,
			@PathVariable("type") String type);

	/**
	 * Get a single identity link on a task
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @param family
	 *            ("",required=true)
	 * @param identityId
	 *            ("",required=true)
	 * @param type
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the task and identity link was
	 *         found and returned.", response = RestIdentityLink.class),<br/>
	 *         code = 404, message = "Indicates the requested task was not found
	 *         or the task does nothave the requested identityLink. The status
	 *         contains additional information about this error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}/identitylinks/{family}/{identityId}/{type}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<RestIdentityLink> getTaskInstanceIdentityLinks(@PathVariable("taskId") String taskId,
			@PathVariable("family") String family, @PathVariable("identityId") String identityId,
			@PathVariable("type") String type);

	/**
	 * List identity links for a task for either groups or users
	 *
	 * <p>
	 * Returns only identity links targetting either users or groups. Response
	 * body and status-codes are exactly the same as when getting the full list
	 * of identity links for a task.
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @param family
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the task was found and the
	 *         requested identity links are returned.", response =
	 *         RestIdentityLink.class, responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested task was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}/identitylinks/{family}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<List<RestIdentityLink>> listIdentityLinksForFamily(@PathVariable("taskId") String taskId,
			@PathVariable("family") String family);

	/**
	 * List identity links for a task
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param taskId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the task was found and the
	 *         requested identity links are returned.", response =
	 *         RestIdentityLink.class, responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested task was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/tasks/{taskId}/identitylinks", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<List<RestIdentityLink>> listTasksInstanceIdentityLinks(@PathVariable("taskId") String taskId);

}
