package com.zoheb.restws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by zoheb on 4/4/16.
 */

@Path("/myresource")
public class MyResource {
    @GET
    @Produces

    public String printMessage(){
        return "thats it !";
    }

}
