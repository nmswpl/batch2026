package in.co.nmsworks.training.week3.day5.multiplex;

public class Screen {
    Integer capacity;
    Integer occupied;

    public Screen(Integer capacity, Integer occupied) {
        this.capacity = capacity;
        this.occupied = occupied;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getOccupied() {
        return occupied;
    }

    public void setOccupied(Integer occupied) {
        this.occupied = occupied;
    }
}
