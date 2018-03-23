package com.yuanleilei.pattern.factory.abstractfactory;

import com.yuanleilei.pattern.factory.product.Milk;
import com.yuanleilei.pattern.factory.product.Telunsu;
import com.yuanleilei.pattern.factory.product.Yili;

public class MilkFactory extends AbstractFactory {
    public Milk getYili() {
        return new Yili();
    }

    public Milk getTelunsu() {
        return new Telunsu();
    }
}
