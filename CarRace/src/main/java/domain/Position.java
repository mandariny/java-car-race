package domain;

import java.util.Objects;

public class Position {
    private int position;

    public Position(){
        this.position = 0;
    }

    public Position(int i) {
        this.position = i;
    }

    public void increase() {
        this.position++;
    }

    public String getPositionString() {
        return "-".repeat(this.position);
    }


    public Position getMaxPosition(Position maxPosition) {
        if(this.position < maxPosition.position) return maxPosition;
        return this;
    }

    public boolean isLessThen(Position maxStatus) {
        return this.position < maxStatus.position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
