package com.design.adapter;

/**
 * @author Administrator
 * @ClassName Translator
 * @description
 * @time 2020/10/18 0018 16:36
 */
public class Translator extends Player {
    private ForeignCenter wjzf = new ForeignCenter();

    public Translator(String name) {
        super(name);
        wjzf.setName(name);
    }

    @Override
    public void attack() {
        wjzf.jingong();
    }

    @Override
    public void defense() {
        wjzf.fangshou();
    }
}
