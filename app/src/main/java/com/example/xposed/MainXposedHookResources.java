package com.example.xposed;

import android.widget.Button;

import de.robv.android.xposed.IXposedHookInitPackageResources;
import de.robv.android.xposed.callbacks.XC_InitPackageResources;
import de.robv.android.xposed.callbacks.XC_LayoutInflated;

public class MainXposedHookResources implements IXposedHookInitPackageResources {
    @Override
    public void handleInitPackageResources(XC_InitPackageResources.InitPackageResourcesParam resparam) throws Throwable {
        if (!BuildConfig.APPLICATION_ID.equals(resparam.packageName))
            return;

        resparam.res.hookLayout(R.layout.activity_main, new XC_LayoutInflated() {
            @Override
            public void handleLayoutInflated(LayoutInflatedParam liparam) throws Throwable {
                Button button = liparam.view.findViewById(R.id.button);
                button.setText("Button");
            }
        });
    }
}
