package com.reactnativermtextmodule;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = RmTextModuleModule.NAME)
public class RmTextModuleModule extends ReactContextBaseJavaModule {
    public static final String NAME = "RmTextModule";

    public RmTextModuleModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    @NonNull
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void changeText(String name, Callback onChangeText) {
        onChangeText.invoke(name);
    }
}
