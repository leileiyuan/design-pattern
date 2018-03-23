package com.yuanleilei.pattern.factory.factorymethod;

import com.yuanleilei.pattern.factory.product.Milk;
import com.yuanleilei.pattern.factory.product.Telunsu;

public class TelunsuFactory implements Factory {
    public Milk getMilk() {
        return new Telunsu();
    }
}
