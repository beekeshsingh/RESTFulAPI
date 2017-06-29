package com.glaucus.api.glaucusapi;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.glaucus.api.services.EmployeeServices;

@Path("totalemployee")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeCount {

	EmployeeServices employeeServices = new EmployeeServices();
	
	@GET
	public String countEmployee(){
		return employeeServices.countEmployee();
	}
}
