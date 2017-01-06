package com.cowerling.concert;

/**
 * Created by dell on 2017-1-6.
 */
public aspect CriticAspect {
    public CriticAspect() {}

    pointcut performance() : execution(* perform(..));

    after() returning : performance() {
        System.out.println(criticismEngine.getCriticism());
    }

    private CriticismEngine criticismEngine;

    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }
}
