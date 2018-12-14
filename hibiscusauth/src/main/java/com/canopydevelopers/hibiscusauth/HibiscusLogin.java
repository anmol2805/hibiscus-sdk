package com.canopydevelopers.hibiscusauth;

import android.content.Context;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.canopydevelopers.mysingleton.Mysingleton;
import org.json.JSONException;
import org.json.JSONObject;

public class HibiscusLogin {
    public void logInWithUserCredentials(String student_id,
                                         String password,
                                         Context context,
                                         Response.Listener<JSONObject> listener,
                                         Response.ErrorListener errlsn
                                         ){
        JSONObject credentials = new JSONObject();
        try {
            credentials.put("uid",student_id);
            credentials.put("pwd",password);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JsonObjectRequest loginRequest = new JsonObjectRequest(Request.Method.POST,
                "http://14.139.198.171/api/hibi/login_test",
                credentials, listener, errlsn);
        Mysingleton.getInstance(context).addToRequestqueue(loginRequest);
    }
}
