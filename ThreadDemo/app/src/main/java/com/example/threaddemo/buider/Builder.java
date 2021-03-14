package com.example.threaddemo.buider;
import com.example.threaddemo.buider.ThatYearBean;

public abstract class Builder {

    public abstract void buildYear();
    public abstract void buildMonthDay();
    public abstract void buildTitle();
    public abstract void buildDesc();
    public abstract void buildType();
    public abstract ThatYearBean getResult();
}
