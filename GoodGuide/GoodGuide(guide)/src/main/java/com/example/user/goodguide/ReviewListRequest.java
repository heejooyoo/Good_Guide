package com.example.user.goodguide;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class ReviewListRequest extends StringRequest {
    final static  private  String URL = "http://210.179.97.55:55555/GoodGuide/ReviewList.php";
    private Map<String, String> parameters;

    public ReviewListRequest(String guideID, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);

        parameters = new HashMap<>();
        parameters.put("guideID", guideID);
    }

    public Map<String, String> getParams() {
        return parameters;
    }
}
