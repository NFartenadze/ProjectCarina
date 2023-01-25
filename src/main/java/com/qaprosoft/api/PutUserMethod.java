package com.qaprosoft.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.Configuration;

@Endpoint(url = "${base_url}/api/users/2", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "api/users/_put/request.json")
@ResponseTemplatePath(path = "api/users/_put/response.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.CREATED_201)
public class PutUserMethod extends AbstractApiMethodV2 {
    public PutUserMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }

}
