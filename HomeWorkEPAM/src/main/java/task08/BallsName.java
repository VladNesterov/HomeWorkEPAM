package task08;

import java.util.Objects;

class BallsName implements Comparable<BallsName> {
    private int id;
    private int centre;

    public BallsName(int id, int centre) {
        this.id = id;
        this.centre = centre;
    }

    @Override
    public int compareTo(BallsName o) {
        if (this.id > o.id) {
            return 1;
        }
        if (this.id < o.id) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "BallsName{" +
                "id=" + id +
                ", centre=" + centre +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BallsName ballsName = (BallsName) o;
        return id == ballsName.id &&
                centre == ballsName.centre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    public int getCentre() {
        return centre;
    }


    public void setCentre(int centre) {
        this.centre = centre;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
