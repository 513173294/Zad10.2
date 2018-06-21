public enum Direction {

    NORTH("polnoc"),
    EAST("wschod"),
    SOUTH("poludnie"),
    WEST("zachod"),
    UNDENTIFIED("nieznany");
    private final String direction;

    Direction(String direction) {
        this.direction = direction;
    }

    public String printDirection() {
        return this.direction;
    }


    public Direction convert(int num) {
        if (num == 0) return NORTH;
        if (num == 1) return EAST;
        if (num == 2) return SOUTH;
        if (num == 3) return WEST;

        return UNDENTIFIED;
    }
}
