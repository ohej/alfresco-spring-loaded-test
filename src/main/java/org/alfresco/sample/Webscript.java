package org.alfresco.sample;

import org.alfresco.service.cmr.repository.NodeService;
import org.alfresco.service.cmr.search.SearchService;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.extensions.webscripts.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Webscript extends DeclarativeWebScript
{
	NodeService nodeService;
	
	SearchService searchService;

    public void setSearchService(SearchService searchService) {
		this.searchService = searchService;
	}

	public void setNodeService(NodeService nodeService) {
		this.nodeService = nodeService;
	}

	protected Map<String, Object> executeImpl(WebScriptRequest req, Status status,
                                              Cache cache)
    {
        Map<String, Object> model = new HashMap<String, Object>();

        
        model.put("greeting", Petah.getText());

        return model;


    }

	
	
}