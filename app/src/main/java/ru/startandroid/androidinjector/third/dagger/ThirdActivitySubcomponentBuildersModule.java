package ru.startandroid.androidinjector.third.dagger;


import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import ru.startandroid.androidinjector.third.fragments.bottom.BottomFragment;
import ru.startandroid.androidinjector.third.fragments.bottom.dagger.BottomFragmentComponent;
import ru.startandroid.androidinjector.third.fragments.top.TopFragment;
import ru.startandroid.androidinjector.third.fragments.top.dagger.TopFragmentComponent;

@Module(subcomponents = {TopFragmentComponent.class, BottomFragmentComponent.class})
public abstract class ThirdActivitySubcomponentBuildersModule {

    @Binds
    @IntoMap
    @ClassKey(TopFragment.class)
    abstract AndroidInjector.Factory<?>
    bindTopFragmentInjectorFactory(TopFragmentComponent.Builder builder);

    @Binds
    @IntoMap
    @ClassKey(BottomFragment.class)
    abstract AndroidInjector.Factory<?>
    bindBottomFragmentInjectorFactory(BottomFragmentComponent.Builder builder);

}
