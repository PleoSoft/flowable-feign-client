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

public interface ProcessInstanceIdentityLinksApi {

	/**
	 * Add an involved user to a process instance
	 *
	 * <p>
	 * Note that the groupId in Response Body will always be null, as it?s only
	 * possible to involve users with a process-instance.
	 * </p>
	 *
	 *
	 * @param processInstanceId
	 *            ("",required=true)
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "successful operation", response =
	 *         RestIdentityLink.class),<br/>
	 *         code = 201, message = "Indicates the process instance was found
	 *         and the link is created."),<br/>
	 *         code = 400, message = "Indicates the requested body did not
	 *         contain a userId or a type."),<br/>
	 *         code = 404, message = "Indicates the requested process instance
	 *         was not found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/process-instances/{processInstanceId}/identitylinks", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<RestIdentityLink> createProcessInstanceIdentityLinks(
			@PathVariable("processInstanceId") String processInstanceId, @RequestBody RestIdentityLink body);

	/**
	 * Remove an involved user to from process instance
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processInstanceId
	 *            ("",required=true)
	 * @param identityId
	 *            ("",required=true)
	 * @param type
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the process instance was found
	 *         and the link has been deleted. Response body is left empty
	 *         intentionally."),<br/>
	 *         code = 404, message = "Indicates the requested process instance
	 *         was not found or the link to delete does not exist. The response
	 *         status contains additional information about the error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/process-instances/{processInstanceId}/identitylinks/users/{identityId}/{type}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteProcessInstanceIdentityLinks(@PathVariable("processInstanceId") String processInstanceId,
			@PathVariable("identityId") String identityId, @PathVariable("type") String type);

	/**
	 * Get a specific involved people from process instance
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param processInstanceId
	 *            ("",required=true)
	 * @param identityId
	 *            ("",required=true)
	 * @param type
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the process instance was found
	 *         and the specified link is retrieved.", response =
	 *         RestIdentityLink.class),<br/>
	 *         code = 404, message = "Indicates the requested process instance
	 *         was not found or the link to delete does not exist. The response
	 *         status contains additional information about the error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/process-instances/{processInstanceId}/identitylinks/users/{identityId}/{type}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<RestIdentityLink> getProcessInstanceIdentityLinks(
			@PathVariable("processInstanceId") String processInstanceId, @PathVariable("identityId") String identityId,
			@PathVariable("type") String type);

	/**
	 * Get involved people for process instance
	 *
	 * <p>
	 * Note that the groupId in Response Body will always be null, as it?s only
	 * possible to involve users with a process-instance.
	 * </p>
	 *
	 *
	 * @param processInstanceId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the process instance was found
	 *         and links are returned.", response = RestIdentityLink.class,
	 *         responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested process instance
	 *         was not found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/runtime/process-instances/{processInstanceId}/identitylinks", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<List<RestIdentityLink>> listProcessInstanceIdentityLinks(
			@PathVariable("processInstanceId") String processInstanceId);

}
