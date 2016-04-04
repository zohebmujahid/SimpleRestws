package com.zoheb.restws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by zoheb on 4/4/16.
 */

@Path("/summary")
public class GetSummary {

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})

    public Summary getSummaryXML(){
        Summary summary = new Summary();
        summary.setSummary("First Summary");
        summary.setDescription("First Description");
        return summary;
    }

    @GET
    @Produces(MediaType.TEXT_XML)
    public Summary getSummaryText(){
        Summary summary = new Summary();
        summary.setSummary("Text Summary");
        summary.setDescription("Text Summary");
        return summary;
    }

}
