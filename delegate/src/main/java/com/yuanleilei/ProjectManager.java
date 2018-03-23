package com.yuanleilei;

import java.util.HashMap;
import java.util.Map;

public class ProjectManager implements Task{

    Map<String,Task> map = new HashMap<>();
    
    public ProjectManager() {
        map.put("盘口行情",new Developer1());
        map.put("A股市场",new Developer2());
    }

    @Override
    public void task(String command) {
        map.get(command).task(command);
    }
}
