
package com.reactlibrary;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.bridge.JavaScriptModule;
public class RNMyFancyLibraryPackage implements ReactPackage {

    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String DURATION_LONG_KEY = "LONG";

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
      return Arrays.<NativeModule>asList(new RNMyFancyLibraryModule(reactContext));
    }

    // // Deprecated from RN 0.47
    // public List<Class<? extends JavaScriptModule>> createJSModules() {
    //   return Collections.emptyList();
    // }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
      return Collections.emptyList();
    }
}