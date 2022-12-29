package com.qaprosoft.demo.zoommer.api;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.demo.demo.api.GetUserMethods;
import com.qaprosoft.demo.demo.api.PostUserMethod;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class APITest implements IAbstractTest {

    @Test
    public void getUsersTest(){
        com.qaprosoft.demo.demo.api.GetUserMethods getUsersMethods = new GetUserMethods();
        getUsersMethods.callAPIExpectSuccess();
        getUsersMethods.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getUsersMethods.validateResponseAgainstSchema("api/users/_get/response.schema");
    }

    @Test
    public void createNewUser(){
        com.qaprosoft.demo.demo.api.PostUserMethod postUserMethod = new PostUserMethod();
        postUserMethod.callAPI();
        postUserMethod.validateResponse();
    }

}
