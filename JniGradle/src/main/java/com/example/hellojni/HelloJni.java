/**
 * Copyright Felix Homann 2013
 */
package com.example.hellojni;

public class HelloJni {
    public native String  stringFromJNI();
    
    static {
    	System.loadLibrary("gnustl_shared");
        System.loadLibrary("hello-jni");
    }
}
