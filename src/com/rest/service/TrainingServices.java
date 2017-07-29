package com.rest.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import com.google.gson.Gson;

@Path("/services")
public class TrainingServices {

	
	@POST
	@Path("/validateLogin")
	@Produces(MediaType.APPLICATION_XML)
	public String validateLogin(@QueryParam("username") String inUsername, @QueryParam("password") String inPassword) {
		String value = "";
		try {
			System.out.println(inUsername+"======"+inPassword);
			if(inUsername.hashCode() == "admin".hashCode() && inPassword.hashCode() == "admin".hashCode() ){
				value = "true";
			}else{
				value ="false";
			}
		} catch (Exception Ex) {
			Ex.printStackTrace();
		}

		return value;
	}
	
	@POST
	@Path("/registration")
	@Produces(MediaType.APPLICATION_XML)
	public String registration(@QueryParam("username") String inUsername, @QueryParam("password") String inPassword,@QueryParam("email") String inEmail,@QueryParam("phone") String inPhone) {
		String value = "";
		try {
			System.out.println(inUsername+"======"+inPassword+"========"+inEmail+"==="+inPhone);
			
			
			if(inUsername.hashCode() == "admin".hashCode() && inPassword.hashCode() == "admin".hashCode() ){
				value = "true";
			}else{
				value ="false";
			}
		} catch (Exception Ex) {
			Ex.printStackTrace();
		}

		return value;
	}
}
