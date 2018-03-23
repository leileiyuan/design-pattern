package com.yuanleilei;

/**
 * 模板方法抽象类，定义过程。
 * 去学校做的工作（prepareGotoSchool）为例，假设需要分三步：穿衣服（dressUp），吃早饭（eatBreakfast），带上东西（takeThings）
 */
public abstract class AbstractPerson {
    // 准备去学校
    public void prepareGotoSchool(){
        this.dressUp();
        this.eatBreakfast();
        this.takeThings();
    }

    // 穿衣
    protected abstract void dressUp();

    // 吃饭
    protected abstract void eatBreakfast();

    // 带上东西
    protected abstract void takeThings();
}
