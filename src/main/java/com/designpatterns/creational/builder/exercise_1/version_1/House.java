package com.designpatterns.creational.builder.exercise_1.version_1;

public class House {

    private String walls;
    private String floors;
    private String rooms;
    private String roof;
    private String windows;
    private String doors;
    private String garage;

    public String getWalls() {
        return walls;
    }

    public String getFloors() {
        return floors;
    }

    public String getRooms() {
        return rooms;
    }

    public String getRoof() {
        return roof;
    }

    public String getWindows() {
        return windows;
    }

    public String getDoors() {
        return doors;
    }

    public String getGarage() {
        return garage;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls='" + walls + '\'' +
                ", floors='" + floors + '\'' +
                ", rooms='" + rooms + '\'' +
                ", roof='" + roof + '\'' +
                ", windows='" + windows + '\'' +
                ", doors='" + doors + '\'' +
                ", garage='" + garage + '\'' +
                '}';
    }


    public static final class HouseBuilder {
        private String walls;
        private String floors;
        private String rooms;
        private String roof;
        private String windows;
        private String doors;
        private String garage;

        private HouseBuilder() {
        }

        public static HouseBuilder aHouse() {
            return new HouseBuilder();
        }

        public HouseBuilder withWalls(String walls) {
            this.walls = walls;
            return this;
        }

        public HouseBuilder withFloors(String floors) {
            this.floors = floors;
            return this;
        }

        public HouseBuilder withRooms(String rooms) {
            this.rooms = rooms;
            return this;
        }

        public HouseBuilder withRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder withWindows(String windows) {
            this.windows = windows;
            return this;
        }

        public HouseBuilder withDoors(String doors) {
            this.doors = doors;
            return this;
        }

        public HouseBuilder withGarage(String garage) {
            this.garage = garage;
            return this;
        }

        public House build() {
            House house = new House();
            house.walls = this.walls;
            house.windows = this.windows;
            house.doors = this.doors;
            house.rooms = this.rooms;
            house.roof = this.roof;
            house.garage = this.garage;
            house.floors = this.floors;
            return house;
        }
    }
}
