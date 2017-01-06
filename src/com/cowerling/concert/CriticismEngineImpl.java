package com.cowerling.concert;

/**
 * Created by dell on 2017-1-6.
 */
public class CriticismEngineImpl implements CriticismEngine {
    public CriticismEngineImpl() {}

    public String getCriticism() {
        int i = (int)(Math.random() * criticismPool.length);
        return criticismPool[i];
    }

    private String[] criticismPool;

    public void setCriticismPool(String[] criticismPool) {
        this.criticismPool = criticismPool;
    }
}
