public enum Direction {

    NORTH("polnoc"),
    EAST("wschod"),
    SOUTH("poludnie"),
    WEST("zachod");

    private final String direction;

    Direction(String direction) {
        this.direction = direction;
    }

    public String printDirection(){
        return this.direction;
    }



}
