package com.yuanleilei;

public class DecoratorTwo extends Decorator {
  
    public DecoratorTwo(Human human) {
        super(human);  
    }  
  
    public void findClothes() {  
        System.out.println("找到一件D&G。。");  
    }  
  
    public void findTheTarget() {  
        System.out.println("在地图上找到神秘花园和城堡。。");
    }  
  
    @Override  
    public void wearClothes() {  
        super.wearClothes();
        findClothes();  
    }  
  
    @Override  
    public void walkToWhere() {  
        super.walkToWhere();
        findTheTarget();  
    }  
}  