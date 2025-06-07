package zw.amvntm.mod;

import com.artemis.WorldConfigurationBuilder;

import java.util.ArrayList;
import java.util.List;

public interface Mod {
    default String getId() {
        return "namespace";
    }
    default List<String> getDependencies(){
        return new ArrayList<>();
    }
    default ModInfo getModInfo() {
        return null;
    }
    default void load(WorldConfigurationBuilder builder) throws ModLoadException {}
    default void unload(){}
    default void reload(){}
    default void onEnable() {}
    default void onDisable(){}
}
