package com.designpatterns.structural.flyweight.exercise_1;

public class UnitStatsRepository {

    private static UnitStats destroyerStats = new UnitStats(
            "Destroyer", 2000, 500, 200, 20, 1000
    );

    private static UnitStats riflemanStats = new UnitStats(
            "Rifleman", 200, 80, 30, 40, 50
    );
    private static UnitStats teslaTankStats = new UnitStats(
            "TestTank", 4000, 1000, 500, 15, 5000
    );

    private UnitStatsRepository() {
    }

    public static UnitStats getDestroyerStats(){
        return destroyerStats;
    }

    public static UnitStats getRiflemanStats() {
        return riflemanStats;
    }

    public static UnitStats getTeslaTankUnitStats() {
        return teslaTankStats;
    }
}
