package zw.amvntm.mod;

public class ModInfo {
    private String modName;
    private String modVersion;
    private String modAuthor;
    private String modDescription;
    private String modIconPath;
    private long lastUpdateTime;

    /**
     * 构造函数，初始化模块信息。
     * @param modName 模块名称
     * @param modVersion 模块版本
     * @param modAuthor 模块作者
     * @param modDescription 模块描述
     * @param modIconPath 模块图标路径
     * @param lastUpdateTime 最后更新时间
     */
    public ModInfo(String modName, String modVersion, String modAuthor, String modDescription, String modIconPath, long lastUpdateTime) {
        this.modName = modName;
        this.modVersion = modVersion;
        this.modAuthor = modAuthor;
        this.modDescription = modDescription;
        this.modIconPath = modIconPath;
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getModName() {
        return modName;
    }

    public void setModName(String modName) {
        this.modName = modName;
    }

    public String getModVersion() {
        return modVersion;
    }

    public void setModVersion(String modVersion) {
        this.modVersion = modVersion;
    }

    public String getModAuthor() {
        return modAuthor;
    }

    public void setModAuthor(String modAuthor) {
        this.modAuthor = modAuthor;
    }

    public String getModDescription() {
        return modDescription;
    }

    public void setModDescription(String modDescription) {
        this.modDescription = modDescription;
    }

    public String getModIconPath() {
        return modIconPath;
    }

    public void setModIconPath(String modIconPath) {
        this.modIconPath = modIconPath;
    }

    public long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}
