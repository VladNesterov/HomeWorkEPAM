package task08;

import java.util.Objects;

class People {
    private int luck;
    private int vigilance;

    People(int luck, int vigilance) {
        this.luck = luck;
        this.vigilance = vigilance;
    }

    public int getVigilance() {
        return vigilance;
    }

    public void setVigilance(int vigilance) {
        this.vigilance = vigilance;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return luck == people.luck &&
                vigilance == people.vigilance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(luck, vigilance);
    }

    @Override
    public String toString() {
        return "Person{" +
                "luck=" + luck +
                ", vigilance=" + vigilance +
                '}';
    }
}
