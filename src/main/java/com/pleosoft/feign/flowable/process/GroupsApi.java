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

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pleosoft.feign.flowable.process.model.DataResponseGroupResponse;
import com.pleosoft.feign.flowable.process.model.GroupRequest;
import com.pleosoft.feign.flowable.process.model.GroupResponse;
import com.pleosoft.feign.flowable.process.model.MembershipRequest;
import com.pleosoft.feign.flowable.process.model.MembershipResponse;

public interface GroupsApi {

	/**
	 * Create a group
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "successful operation", response =
	 *         GroupResponse.class),<br/>
	 *         code = 201, message = "Indicates the group was created."),<br/>
	 *         code = 400, message = "Indicates the id of the group was
	 *         missing.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/identity/groups", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<GroupResponse> createGroup(@RequestBody GroupRequest body);

	/**
	 * Add a member to a group
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param groupId
	 *            ("",required=true)
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "successful operation", response =
	 *         MembershipResponse.class),<br/>
	 *         code = 201, message = "Indicates the group was found and the
	 *         member has been added."),<br/>
	 *         code = 400, message = "Indicates the userId was not included in
	 *         the request body."),<br/>
	 *         code = 404, message = "Indicates the requested group was not
	 *         found."),<br/>
	 *         code = 409, message = "Indicates the requested user is already a
	 *         member of the group.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/identity/groups/{groupId}/members", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<MembershipResponse> createMembership(@PathVariable("groupId") String groupId,
			@RequestBody MembershipRequest body);

	/**
	 * Delete a group
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param groupId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the group was found and has been
	 *         deleted. Response-body is intentionally empty."),<br/>
	 *         code = 404, message = "Indicates the requested group does not
	 *         exist.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/identity/groups/{groupId}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteGroup(@PathVariable("groupId") String groupId);

	/**
	 * Delete a member from a group
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param groupId
	 *            ("",required=true)
	 * @param userId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the group was found and the
	 *         member has been deleted. The response body is left empty
	 *         intentionally."),<br/>
	 *         code = 404, message = "Indicates the requested group was not
	 *         found or that the user is not a member of the group. The status
	 *         description contains additional information about the
	 *         error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/identity/groups/{groupId}/members/{userId}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteMembership(@PathVariable("groupId") String groupId,
			@PathVariable("userId") String userId);

	/**
	 * Get a single group
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param groupId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the group exists and is
	 *         returned.", response = GroupResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested group does not
	 *         exist.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/identity/groups/{groupId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<GroupResponse> getGroup(@PathVariable("groupId") String groupId);

	/**
	 * List groups
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param id
	 *            ("Only return group with the given id")
	 * @param name
	 *            ("Only return groups with the given name")
	 * @param type
	 *            ("Only return groups with the given type")
	 * @param nameLike
	 *            ("Only return groups with a name like the given value. Use %
	 *            as wildcard-character.")
	 * @param member
	 *            ("Only return groups which have a member with the given
	 *            username.")
	 * @param potentialStarter
	 *            ("Only return groups which members are potential starters for
	 *            a process-definition with the given id.")
	 * @param sort
	 *            ("Property to sort on, to be used together with the order.",
	 *            allowableValues = "id, name, type")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the requested groups were
	 *         returned.", response = DataResponseGroupResponse.class)<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/identity/groups", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponseGroupResponse> listGroups(@RequestParam(value = "id", required = false) String id,
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "type", required = false) String type,
			@RequestParam(value = "nameLike", required = false) String nameLike,
			@RequestParam(value = "member", required = false) String member,
			@RequestParam(value = "potentialStarter", required = false) String potentialStarter,
			@RequestParam(value = "sort", required = false) String sort);

	/**
	 * Update a group
	 *
	 * <p>
	 * All request values are optional. For example, you can only include the
	 * name attribute in the request body JSON-object, only updating the name of
	 * the group, leaving all other fields unaffected. When an attribute is
	 * explicitly included and is set to null, the group-value will be updated
	 * to null.
	 * </p>
	 *
	 *
	 * @param groupId
	 *            ("",required=true)
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the group was updated.",
	 *         response = GroupResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested group was not
	 *         found."),<br/>
	 *         code = 409, message = "Indicates the requested group was updated
	 *         simultaneously.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/identity/groups/{groupId}", produces = "application/json", method = RequestMethod.PUT)
	ResponseEntity<GroupResponse> updateGroup(@PathVariable("groupId") String groupId, @RequestBody GroupRequest body);

}
