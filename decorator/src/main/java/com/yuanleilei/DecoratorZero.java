package com.yuanleilei;

/**
 * 对Decorator进行增强
 */
public class DecoratorZero extends Decorator {
    public DecoratorZero(Human human) {
        super(human);
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        // 增强该方法
        this.goHome();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        this.findMap();
    }

    public void goHome(){
        System.out.println("进房间");
    }

    public void findMap(){
        System.out.println("找地图");
    }
}
