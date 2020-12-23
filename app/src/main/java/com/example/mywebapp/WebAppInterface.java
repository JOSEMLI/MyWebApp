package com.example.mywebapp;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebAppInterface {

    Context  context ;

    WebAppInterface(Context c )
    {
        context= c;
    }



    @JavascriptInterface
    public void showToastMessage(String message)
    {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

}
