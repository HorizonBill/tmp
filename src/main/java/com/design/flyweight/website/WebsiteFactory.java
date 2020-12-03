package com.design.flyweight.website;

import java.util.Hashtable;

/**
 * @author Administrator
 * @ClassName WebsiteFactory
 * @description
 * @time 2020/12/2 0002 21:36
 */
public class WebsiteFactory {
    private Hashtable<String, ConcreteWebsite> table = new Hashtable();

    public Website getWebsiteCategory(String key){
        if (!table.contains(key)){
            table.put(key, new ConcreteWebsite(key));
        }
        return table.get(key);
    }

    public int getWebsiteCount(){
        return table.size();
    }

}
