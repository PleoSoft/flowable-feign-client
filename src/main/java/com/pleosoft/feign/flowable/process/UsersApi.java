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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.pleosoft.feign.flowable.process.model.DataResponseUserResponse;
import com.pleosoft.feign.flowable.process.model.UserInfoRequest;
import com.pleosoft.feign.flowable.process.model.UserInfoResponse;
import com.pleosoft.feign.flowable.process.model.UserRequest;
import com.pleosoft.feign.flowable.process.model.UserResponse;

public interface UsersApi {

	/**
	 * Create a user
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "successful operation", response =
	 *         UserResponse.class),<br/>
	 *         code = 201, message = "Indicates the user was created."),<br/>
	 *         code = 400, message = "Indicates the id of the user was
	 *         missing.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/identity/users", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<UserResponse> createUser(@RequestBody UserRequest body);

	/**
	 * Create a new user's info entry
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param userId
	 *            ("",required=true)
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "successful operation", response =
	 *         UserInfoResponse.class),<br/>
	 *         code = 201, message = "Indicates the user was found and the info
	 *         has been created."),<br/>
	 *         code = 400, message = "Indicates the key or value was missing
	 *         from the request body. Status description contains additional
	 *         information about the error."),<br/>
	 *         code = 404, message = "Indicates the requested user was not
	 *         found."),<br/>
	 *         code = 409, message = "Indicates there is already an info-entry
	 *         with the given key for the user, update the resource instance
	 *         (PUT).")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/identity/users/{userId}/info", produces = "application/json", method = RequestMethod.POST)
	ResponseEntity<UserInfoResponse> createUserInfo(@PathVariable("userId") String userId,
			@RequestBody UserInfoRequest body);

	/**
	 * Delete a user
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param userId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the user was found and has been
	 *         deleted. Response-body is intentionally empty."),<br/>
	 *         code = 404, message = "Indicates the requested user was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/identity/users/{userId}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteUser(@PathVariable("userId") String userId);

	/**
	 * Delete a user's info
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param userId
	 *            ("",required=true)
	 * @param key
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the user was found and the info
	 *         for the given key has been deleted. Response body is left empty
	 *         intentionally."),<br/>
	 *         code = 404, message = "Indicates the requested user was not found
	 *         or the user does nothave info for the given key. Status
	 *         description contains additional information about the
	 *         error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/identity/users/{userId}/info/{key}", method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteUserInfo(@PathVariable("userId") String userId, @PathVariable("key") String key);

	/**
	 * Get a single user
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param userId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the user exists and is
	 *         returned.", response = UserResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested user does not
	 *         exist.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/identity/users/{userId}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<UserResponse> getUser(@PathVariable("userId") String userId);

	/**
	 * Get a user's info
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param userId
	 *            ("",required=true)
	 * @param key
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the user was found and the user
	 *         has info for the given key.", response =
	 *         UserInfoResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested user was not found
	 *         or the user does nothave info for the given key. Status
	 *         description contains additional information about the
	 *         error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/identity/users/{userId}/info/{key}", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<UserInfoResponse> getUserInfo(@PathVariable("userId") String userId,
			@PathVariable("key") String key);

	/**
	 * Get a user's picture
	 *
	 * <p>
	 * The response body contains the raw picture data, representing the user's
	 * picture. The Content-type of the response corresponds to the mimeType
	 * that was set when creating the picture.
	 * </p>
	 *
	 *
	 * @param userId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the user was found and has a
	 *         picture, which is returned in the body.", response =
	 *         byte[].class, responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested user was not found
	 *         or the user does not have a profile picture. Status-description
	 *         contains additional information about the error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/identity/users/{userId}/picture", method = RequestMethod.GET)
	ResponseEntity<List<byte[]>> getUserPicture(@PathVariable("userId") String userId);

	/**
	 * List user's info
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param userId
	 *            ("",required=true)
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the user was found and list of
	 *         info (key and url) is returned.", response =
	 *         UserInfoResponse.class, responseContainer = "List"),<br/>
	 *         code = 404, message = "Indicates the requested user was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/identity/users/{userId}/info", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<List<UserInfoResponse>> listUserInfo(@PathVariable("userId") String userId);

	/**
	 * List users
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param id
	 *            ("Only return group with the given id")
	 * @param firstName
	 *            ("Only return users with the given firstname")
	 * @param lastName
	 *            ("Only return users with the given lastname")
	 * @param email
	 *            ("Only return users with the given email")
	 * @param firstNameLike
	 *            ("Only return users with a firstname like the given value. Use
	 *            % as wildcard-character.")
	 * @param lastNameLike
	 *            ("Only return users with a lastname like the given value. Use
	 *            % as wildcard-character.")
	 * @param emailLike
	 *            ("Only return users with an email like the given value. Use %
	 *            as wildcard-character.")
	 * @param memberOfGroup
	 *            ("Only return users which are a member of the given group.")
	 * @param potentialStarter
	 *            ("Only return users which members are potential starters for a
	 *            process-definition with the given id.")
	 * @param sort
	 *            ("Property to sort on, to be used together with the order.",
	 *            allowableValues = "id, firstName, lastname, email")
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the group exists and is
	 *         returned.", response = DataResponseUserResponse.class)<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/identity/users", produces = "application/json", method = RequestMethod.GET)
	ResponseEntity<DataResponseUserResponse> listUsers(@RequestParam(value = "id", required = false) String id,
			@RequestParam(value = "firstName", required = false) String firstName,
			@RequestParam(value = "lastName", required = false) String lastName,
			@RequestParam(value = "email", required = false) String email,
			@RequestParam(value = "firstNameLike", required = false) String firstNameLike,
			@RequestParam(value = "lastNameLike", required = false) String lastNameLike,
			@RequestParam(value = "emailLike", required = false) String emailLike,
			@RequestParam(value = "memberOfGroup", required = false) String memberOfGroup,
			@RequestParam(value = "potentialStarter", required = false) String potentialStarter,
			@RequestParam(value = "sort", required = false) String sort);

	/**
	 * Update a user
	 *
	 * <p>
	 * All request values are optional. For example, you can only include the
	 * firstName attribute in the request body JSON-object, only updating the
	 * firstName of the user, leaving all other fields unaffected. When an
	 * attribute is explicitly included and is set to null, the user-value will
	 * be updated to null. Example: {\"firstName\" : null} will clear the
	 * firstName of the user).
	 * </p>
	 *
	 *
	 * @param userId
	 *            ("",required=true)
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the user was updated.", response
	 *         = UserResponse.class),<br/>
	 *         code = 404, message = "Indicates the requested user was not
	 *         found."),<br/>
	 *         code = 409, message = "Indicates the requested user was updated
	 *         simultaneously.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/identity/users/{userId}", produces = "application/json", method = RequestMethod.PUT)
	ResponseEntity<UserResponse> updateUser(@PathVariable("userId") String userId, @RequestBody UserRequest body);

	/**
	 * Update a user's info
	 *
	 * <p>
	 * </p>
	 *
	 *
	 * @param userId
	 *            ("",required=true)
	 * @param key
	 *            ("",required=true)
	 * @param body
	 *            (value = "" )
	 * @return value = { <br/>
	 *         code = 200, message = "Indicates the user was found and the info
	 *         has been updated.", response = UserInfoResponse.class),<br/>
	 *         code = 400, message = "Indicates the value was missing from the
	 *         request body."),<br/>
	 *         code = 404, message = "Indicates the requested user was not found
	 *         or the user does nothave info for the given key. Status
	 *         description contains additional information about the
	 *         error.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/identity/users/{userId}/info/{key}", produces = "application/json", method = RequestMethod.PUT)
	ResponseEntity<UserInfoResponse> updateUserInfo(@PathVariable("userId") String userId,
			@PathVariable("key") String key, @RequestBody UserInfoRequest body);

	/**
	 * Updating a user's picture
	 *
	 * <p>
	 * The request should be of type multipart/form-data. There should be a
	 * single file-part included with the binary value of the picture. On top of
	 * that, the following additional form-fields can be present: mimeType:
	 * Optional mime-type for the uploaded picture. If omitted, the default of
	 * image/jpeg is used as a mime-type for the picture.
	 * </p>
	 *
	 *
	 * @param userId
	 *            ("",required=true)
	 * @param file
	 *            (value = "Picture to update", required=true)
	 * @return value = { <br/>
	 *         code = 204, message = "Indicates the user was found and the
	 *         picture has been updated. The response-body is left empty
	 *         intentionally."),<br/>
	 *         code = 404, message = "Indicates the requested user was not
	 *         found.")<br/>
	 *         }
	 *
	 */
	@RequestMapping(value = "/identity/users/{userId}/picture", consumes = "multipart/form-data", method = RequestMethod.PUT)
	ResponseEntity<Void> updateUserPicture(@PathVariable("userId") String userId,
			@RequestPart("file") MultipartFile file);

}
