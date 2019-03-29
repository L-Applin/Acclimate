package com.example.payne.simpletestapp.user.karma.karmaAPI;

import com.example.payne.simpletestapp.user.karma.karmaAPI.points.KarmaHandler;
import com.example.payne.simpletestapp.user.karma.karmaAPI.points.PointsProvider;

import java.lang.reflect.Proxy;

public class KarmaBuilder {

    @SuppressWarnings("unchecked")
    public static <T extends PointsProvider> T createPointHandler(Class karmaInterface, T holder){

        return (T) Proxy.newProxyInstance(karmaInterface.getClassLoader(), new Class[]{karmaInterface},
                new KarmaHandler(holder));
    }

}
