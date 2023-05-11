package com.striveonger.study.task.core.scope.trigger;

/**
 * @author Mr.Lee
 * @description:
 * @date 2023-05-04 16:00
 */
public class PerformParam {

    /**
     * 参数名
     */
    private String name;

    /**
     * 参数值 TODO: 后期是考虑支持SpringEL表达式 (少年, 未来可期~, 我再提一嘴呀...表达式的话 alterable 一定为false了)
     */
    private String value;

    /**
     * 运行时是否可变
     */
    private boolean alterable;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isAlterable() {
        return alterable;
    }

    public void setAlterable(boolean alterable) {
        this.alterable = alterable;
    }

}
