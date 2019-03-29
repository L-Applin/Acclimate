package com.example.payne.simpletestapp.networkTest;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.example.payne.simpletestapp.server.requests.DeleteRequest;
import com.example.payne.simpletestapp.server.requests.HttpRequest;
import com.example.payne.simpletestapp.server.requests.exceptions.RequestErrorException;

import org.junit.Test;
import org.junit.runner.RunWith;

import static com.example.payne.simpletestapp.appUtils.AppTag.SERVER;


@RunWith(AndroidJUnit4.class)
public class deleteRequests {

    @Test
    public void deleteRequest(){
        try {
            HttpRequest<String> delReq1 = DeleteRequest.zone("12483");
            String deleted = delReq1.send().getResponse();
            Log.i(SERVER, deleted);
        } catch (RequestErrorException req) {
            Log.i(SERVER, req.prettyPrinter());
        }
    }

}
