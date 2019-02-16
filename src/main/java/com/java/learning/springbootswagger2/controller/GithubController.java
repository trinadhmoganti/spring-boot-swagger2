package com.java.learning.springbootswagger2.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.learning.springbootswagger2.model.GithubUser;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/github")
@Api(tags = "Github Controller", value = "Implements Github APIs")
public class GithubController {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String github() {
		return "Welcome to Github controller..!";
	}

	@RequestMapping(value = "/user/{username}/{optionalField}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Get details of a github user", notes = "This returns details of a github user based on username", response = GithubUser.class)
	public ResponseEntity<GithubUser> getUserDetails(@PathVariable String username,
			@ApiParam(required = false) @PathVariable("optionalField") String optionalField) {
		System.out.println(username);
		System.out.println(optionalField);
		return ResponseEntity.ok().body(new GithubUser());
	}

}
