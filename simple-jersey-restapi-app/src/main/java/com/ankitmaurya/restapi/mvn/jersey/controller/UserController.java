/**
 * 
 */
package com.ankitmaurya.restapi.mvn.jersey.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ankitmaurya.restapi.mvn.jersey.model.UserModel;

/**
 * @author Ankit Maurya
 *
 */

//Path(url) to reach this class
@Path("/user")
public class UserController {
	
	//Creating an empty list of users, which will be filled in static block at last in this class
	private static List<UserModel> userList = new ArrayList<UserModel>();

	@GET                                     //HTTP GET method to get a resource from server, this get method calls getUsers() method here
	@Path("/getUsers")                       //Path(url) to this resource(method), should be appended with a "/" after path to class e.g. /user/getUsers
	@Produces(MediaType.APPLICATION_JSON)    // Type of media which will be sent back to client
	public List<UserModel> getUsers() {
		return userList;                     //returns list of users to client in JSON format
	}

	@POST                                    //HTTP POST method to send or post data using form from client to server, this POST method calls addUser() method here
	@Path("/addUser")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)    // Type of media which will be accepted from client
	public List<UserModel> addUser(UserModel userModel) {
		userList.add(userModel);
		return userList;
	}

	//Populating dummy data 
	static {

		UserModel user1 = new UserModel();

		user1.setFirstName("Ankit");
		user1.setLastName("Maurya");
		user1.setEmailID("ankitmaurya70@gmail.com");
		user1.setMobile(9532970069l);

		userList.add(user1);

		UserModel user2 = new UserModel();
		user2.setFirstName("Amit");
		user2.setLastName("Singh");
		user2.setEmailID("ambition4amit@gmail.com");
		user2.setMobile(9532970070l);

		userList.add(user2);

		UserModel user3 = new UserModel();
		user3.setFirstName("Dhirendra");
		user3.setLastName("Pratap");
		user3.setEmailID("iamdhirendra@gmail.com");
		user3.setMobile(9532970071l);

		userList.add(user3);
	}
}
