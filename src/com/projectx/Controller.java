package com.projectx;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

@Path("/control")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Controller 
{
	@Path("/login")
	@POST
	public JSONObject login(Model m) throws JSONException
	{
		JSONObject obj=new JSONObject();
		obj.put("username",m.getUsername());
		obj.put("password",m.getPassword());
		System.out.println(obj);
		return obj;
	}
	
}
