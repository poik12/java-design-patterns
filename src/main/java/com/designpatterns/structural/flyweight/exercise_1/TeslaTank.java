package com.designpatterns.structural.flyweight.exercise_1;

public class TeslaTank {

    private int x;
    private int y;
    private int hpLeft;

    private UnitStats stats;

    public TeslaTank(int x, int y) {
        stats = UnitStatsRepository.getTeslaTankUnitStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }
}
