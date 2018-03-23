package com.yuanleilei.pattern.factory.simplefactory;

import com.yuanleilei.pattern.factory.product.Milk;
import com.yuanleilei.pattern.factory.product.Telunsu;

public class SimpleFactory {
    public Milk getMilk(String milk) {

        if (milk.equals("特仑殊")) {
            return new Telunsu();
        }
        if (milk.equals("伊利")) {
            return new Telunsu();
        }
        return null;
    }
}
