class Robot(var gridPosition: GridPosition = GridPosition(0,0),
            var orientation: Orientation = Orientation.NORTH ) {

    fun simulate(instructions: String) {
        instructions.forEach { c ->
            when (c.uppercaseChar()) {
                'R' -> right()
                'L' -> left()
                'A' -> advance()
                else -> throw IllegalArgumentException()
            }
        }
    }

    fun right() {
        orientation = when (orientation) {
            Orientation.NORTH -> Orientation.EAST
            Orientation.EAST  -> Orientation.SOUTH
            Orientation.SOUTH -> Orientation.WEST
            Orientation.WEST  -> Orientation.NORTH
            else -> throw IllegalArgumentException()
        }
    }

    fun left() {
        orientation = when (orientation) {
            Orientation.NORTH -> Orientation.WEST
            Orientation.WEST  -> Orientation.SOUTH
            Orientation.SOUTH -> Orientation.EAST
            Orientation.EAST  -> Orientation.NORTH
            else -> throw IllegalArgumentException()
        }
    }

    fun advance() {
        gridPosition = when (orientation) {
            Orientation.NORTH -> GridPosition(gridPosition.x, gridPosition.y + 1)
            Orientation.SOUTH -> GridPosition(gridPosition.x, gridPosition.y - 1)
            Orientation.EAST  -> GridPosition(gridPosition.x + 1, gridPosition.y)
            Orientation.WEST  -> GridPosition(gridPosition.x - 1, gridPosition.y)
            else -> throw IllegalArgumentException()
        }
    }
}
