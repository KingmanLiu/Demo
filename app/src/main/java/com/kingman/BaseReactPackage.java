package com.kingman;

import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.shell.MainReactPackage;

import java.util.List;

/**
 * Created by Kingman on 2017/4/25.
 */

public class BaseReactPackage extends MainReactPackage {
    public BaseReactPackage() {
        super();
    }

    @Override
    public List<ModuleSpec> getNativeModules(ReactApplicationContext context) {
        return super.getNativeModules(context);
    }
}
