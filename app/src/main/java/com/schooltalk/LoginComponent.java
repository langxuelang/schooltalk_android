package com.schooltalk;

import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by gaoteng on 2020/7/22.
 */
@ActivityScope
@Subcomponent
public interface LoginComponent {
    @Subcomponent.Factory
    interface Factory{
        LoginComponent create();
    }

    void inject(LoginActivity loginActivity);
}
