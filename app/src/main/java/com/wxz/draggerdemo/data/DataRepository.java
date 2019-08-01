package com.wxz.draggerdemo.data;

import com.wxz.draggerdemo.DataSource;
import com.wxz.draggerdemo.Net;
import com.wxz.draggerdemo.di.ApplicationScope;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
@ApplicationScope
public class DataRepository implements DataSource {

    private final ServiceApi serviceApi;

    /**
     * By marking the constructor with {@code @Inject}, Dagger will try to inject the dependencies
     * required to create an instance of the TasksRepository. Because {@link DataSource} is an
     * interface, we must provide to Dagger a way to build those arguments, this is done in
     * {@link }.
     * <p>
     * When two arguments or more have the same type, we must provide to Dagger a way to
     * differentiate them. This is done using a qualifier.
     * <p>
     * Dagger strictly enforces that arguments not marked with {@code @Nullable} are not injected
     * with {@code @Nullable} values.
     */
    @Inject
    DataRepository() {
        serviceApi = createService(ServiceApi.class);
    }


    @Override
    public <T> T createService(Class<T> service) {
        return Net.createService(ServiceApi.BASE_URL, service);
    }

    public ServiceApi getServiceApi() {
        return serviceApi;
    }
}
