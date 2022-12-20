package ru.mirea.lab4;

enum Seasons {
    Winter(-18.0),
    Spring(15.0),
    Summer(27.0) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    Autumn(11.0);

    private final double averageTemp;
    Seasons(double averageTemp) {
        this.averageTemp = averageTemp;
    }
    public String getDescription() {
        return "Холодное время года";
    }

    public double getAverageTemp() {
        return averageTemp;
    }
}
