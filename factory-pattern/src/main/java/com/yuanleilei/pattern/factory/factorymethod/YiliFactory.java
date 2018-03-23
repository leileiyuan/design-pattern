package com.yuanleilei.pattern.factory.factorymethod;

import com.yuanleilei.pattern.factory.product.Milk;
import com.yuanleilei.pattern.factory.product.Yili;

public class YiliFactory implements Factory {
    public Milk getMilk() {
        return new Yili();
    }
}
