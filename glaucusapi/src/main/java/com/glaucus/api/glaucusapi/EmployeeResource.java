package com.glaucus.api.glaucusapi;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.glaucus.api.exception.DataNotFoundException;
import com.glaucus.api.exception.DataNotFoundMapper;
import com.glaucus.api.model.Employee;
import com.glaucus.api.services.EmployeeServices;


/**
 * Root resource (exposed at "employees" path)
 */
@Path("employees")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeResource {

	EmployeeServices employeeServices = new EmployeeServices();
    
	@GET
    public List<Employee> getAllEmployee() {
        return employeeServices.getAllEmployee();
    }  
    
    @GET
    @Path("/{employeeId}") 
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getEmployee(@PathParam("employeeId") long id) {
    	try{
    		return employeeServices.getEmployee(id);
    	}catch(Exception ex){
    		
    	}
    	return employeeServices.getEmployee(id);
    }
     
    @POST 
    public Employee addEmployee(Employee employee){
    	return employeeServices.addEmployee(employee);
    }
     
    @PUT
    @Path("/{employeeId}")  
    public Employee updateEmployee(@PathParam("employeeId") long id, Employee employee){
    	employee.setId(id);
    	return employeeServices.updateEmployee(employee);
    }
    @DELETE
    @Path("/{employeeId}")
    public String deleteEmployee(@PathParam("employeeId") long id){
    	return employeeServices.deleteEmployee(id);
    }
    

}
