package zw.amvntm.mod;

public class ModLoadException extends Exception {
    private final String modId;
    private final int errorCode;

    /**
     * 无参构造函数
     */
    public ModLoadException() {
        super();
        this.modId = "unknown";
        this.errorCode = 0;
    }

    /**
     * 带错误消息的构造函数
     * @param message 错误消息
     */
    public ModLoadException(String message) {
        super(message);
        this.modId = "unknown";
        this.errorCode = 0;
    }

    /**
     * 带错误消息和模组ID的构造函数
     * @param message 错误消息
     * @param modId 发生错误的模组ID
     */
    public ModLoadException(String message, String modId) {
        super(message);
        this.modId = modId;
        this.errorCode = 0;
    }

    /**
     * 带错误消息和错误码的构造函数
     * @param message 错误消息
     * @param errorCode 错误码
     */
    public ModLoadException(String message, int errorCode) {
        super(message);
        this.modId = "unknown";
        this.errorCode = errorCode;
    }

    /**
     * 带错误消息、模组ID和错误码的构造函数
     * @param message 错误消息
     * @param modId 发生错误的模组ID
     * @param errorCode 错误码
     */
    public ModLoadException(String message, String modId, int errorCode) {
        super(message);
        this.modId = modId;
        this.errorCode = errorCode;
    }

    /**
     * 带错误消息和原因的构造函数
     * @param message 错误消息
     * @param cause 错误原因
     */
    public ModLoadException(String message, Throwable cause) {
        super(message, cause);
        this.modId = "unknown";
        this.errorCode = 0;
    }

    /**
     * 带完整参数的构造函数
     * @param message 错误消息
     * @param modId 发生错误的模组ID
     * @param errorCode 错误码
     * @param cause 错误原因
     */
    public ModLoadException(String message, String modId, int errorCode, Throwable cause) {
        super(message, cause);
        this.modId = modId;
        this.errorCode = errorCode;
    }

    /**
     * 获取发生错误的模组ID
     * @return 模组ID
     */
    public String getModId() {
        return modId;
    }

    /**
     * 获取错误码
     * @return 错误码
     */
    public int getErrorCode() {
        return errorCode;
    }

    @Override
    public String getMessage() {
        return "ModLoadException [modId=" + modId + ", errorCode=" + errorCode + ", message=" + super.getMessage() + "]";
    }

    @Override
    public String toString() {
        return "ModLoadException{" +
                "modId='" + modId + '\'' +
                ", errorCode=" + errorCode +
                ", message='" + getMessage() + '\'' +
                ", cause=" + getCause() +
                '}';
    }
}
