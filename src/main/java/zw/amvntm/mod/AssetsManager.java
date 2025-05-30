package zw.amvntm.mod;
public interface AssetsManager {
    /**
     * 加载指定名称和类型的资源
     * @param assetName 资源名称
     * @param clazz 资源类型
     * @return 加载的资源对象
     */
    <T> T loadAsset(String assetName, Class<T> clazz);

    /**
     * 卸载指定名称的资源
     * @param assetName 资源名称
     */
    void unloadAsset(String assetName);

    /**
     * 检查资源是否存在
     * @param assetName 资源名称
     * @return 资源是否存在
     */
    boolean assetExists(String assetName);
}
