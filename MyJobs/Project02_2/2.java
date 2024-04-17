import java.lang.System;

class Main {
    // Will allow entering from both sides-points, but each time one point will the
    // entry and the other the exit
    // Exit/Entry points: x -> pointsInOut[][0], y->pointsInOut[][1]
    static final int[][] pointsInOut = {
            { 2, 0 }, // In/Out point 1 on left side: x = pointsInOut[0][0] = 2, y =
                      // pointsInOut[0][1]= 0
            { 4, 11 } // In/Out point 2 on the right side: x = pointsInOut[1][0] = 4, y =
                      // pointsInOut[1][1]= 11
    };

    // Assumption:
    // Initial Position: Entry point on the left = (2, 0) (Exit point = (4, 11))
    static int x = 2;
    static int y = 0;
    static int numOfTraverses = 0;

    public static void main(String[] args) {
        /*
         * Assuming:
         * direction = 0: RIGHT
         * direction = 1: DOWN
         * direction = 2: LEFT
         * direction = 3: UP
         */
        int direction = 0;

        char[][] maze = {
                { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
                { '#', '.', '.', '.', '#', '.', '.', '.', '.', '.', '.', '#' },
                { '.', '.', '#', '.', '#', '.', '#', '#', '#', '#', '.', '#' },
                { '#', '#', '#', '.', '#', '.', '.', '.', '.', '#', '.', '#' },
                { '#', '.', '.', '.', '.', '#', '#', '#', '.', '#', '.', '.' },
                { '#', '#', '#', '#', '.', '#', '.', '#', '.', '#', '.', '#' },
                { '#', '.', '.', '#', '.', '#', '.', '#', '.', '#', '.', '#' },
                { '#', '#', '.', '#', '.', '#', '.', '#', '.', '#', '.', '#' },
                { '#', '.', '.', '.', '.', '.', '.', '.', '.', '#', '.', '#' },
                { '#', '#', '#', '#', '#', '#', '.', '#', '#', '#', '.', '#' },
                { '#', '.', '.', '.', '.', '.', '.', '#', '.', '.', '.', '#' },
                { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' }
        };
        // Print maze for first time before traversing
        printMaze(maze);
        traverse(maze, x, y, direction);
    }

    public static void traverse(char[][] maze, int curX, int curY, int direction) {
        // Keeping track of the number of traverses
        numOfTraverses += 1;

        // 1. put 'x' where you are (current position)
        maze[curX][curY] = 'x';
        System.out.printf("Current position: x = %d - y = %d\nDirection: %d", curX, curY, direction);

        // 2. print maze after move
        printMaze(maze);

        // 3. check if you are out of the maze (strictly if you reach the other exit
        // point - different from the initial position)
        if (isSolved(curX, curY)) {
            // If solved stop traversing
            System.out.println("Maze solved!");
            return;
        }

        // 4. check if the current pos is initial pos => you gave returned back to
        // initial pos and there is not any other way out
        // (check only after first traverse)
        if (x == curX && y == curY && numOfTraverses != 1) {
            System.out.println("Back to initial position. The maze has no other exit!");
            return;
        }

        // 5. determine next valid move
        // If direction is RIGHT
        if (direction == 0) {
            // First look DOWN
            if (validMove(maze, curX + 1, curY)) {
                direction = 1;
                traverse(maze, curX + 1, curY, direction);
            }
            // Then look RIGHT
            else if (validMove(maze, curX, curY + 1)) {
                direction = 0;
                traverse(maze, curX, curY + 1, direction);
            }
            // Then look UP
            else if (validMove(maze, curX - 1, curY)) {
                direction = 3;
                traverse(maze, curX - 1, curY, direction);
            }
            // Then look LEFT
            else if (validMove(maze, curX, curY - 1)) {
                direction = 2;
                traverse(maze, curX, curY - 1, direction);
            }
        }
        // If direction is DOWN
        else if (direction == 1) {
            // First look LEFT
            if (validMove(maze, curX, curY - 1)) {
                direction = 2;
                traverse(maze, curX, curY - 1, direction);
            }
            // Then look DOWN
            else if (validMove(maze, curX + 1, curY)) {
                direction = 1;
                traverse(maze, curX + 1, curY, direction);
            }
            // Then look RIGHT
            else if (validMove(maze, curX, curY + 1)) {
                direction = 0;
                traverse(maze, curX, curY + 1, direction);
            }
            // Then look UP
            else if (validMove(maze, curX - 1, curY)) {
                direction = 3;
                traverse(maze, curX - 1, curY, direction);
            }
        }
        // If direction is LEFT
        else if (direction == 2) {
            // First look UP
            if (validMove(maze, curX - 1, curY)) {
                direction = 3;
                traverse(maze, curX - 1, curY, direction);
            }
            // Then look LEFT
            else if (validMove(maze, curX, curY - 1)) {
                direction = 2;
                traverse(maze, curX, curY - 1, direction);
            }
            // Then look DOWN
            else if (validMove(maze, curX + 1, curY)) {
                direction = 1;
                traverse(maze, curX + 1, curY, direction);
            }
            // Then look RIGHT
            else if (validMove(maze, curX, curY + 1)) {
                direction = 0;
                traverse(maze, curX, curY + 1, direction);
            }
        }
        // If direction is UP
        else if (direction == 3) {
            // First look RIGHT
            if (validMove(maze, curX, curY + 1)) {
                direction = 0;
                traverse(maze, curX, curY + 1, direction);
            }
            // Then look UP
            else if (validMove(maze, curX - 1, curY)) {
                direction = 3;
                traverse(maze, curX - 1, curY, direction);
            }
            // Then look LEFT
            else if (validMove(maze, curX, curY - 1)) {
                direction = 2;
                traverse(maze, curX, curY - 1, direction);
            }
            // Then look DOWN
            else if (validMove(maze, curX + 1, curY)) {
                direction = 1;
                traverse(maze, curX + 1, curY, direction);
            }
        }

    }

    public static boolean validMove(char[][] maze, int posX, int posY) {
        // Valid move = move to next pos where not wall
        // posX: x of the position
        // posY: y of the position

        // Check out of bound movement
        if (posX < 0 || posY < 0 || posX > 11 || posY > 11) {
            return false;
        }

        char nextPos = maze[posX][posY];
        if (nextPos == '#') {
            return false; // not valid
        }
        return true;
    }

    public static void printMaze(char[][] maze) {
        System.out.println("----------------------------------");
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.printf("%c  ", maze[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------------------------");
    }

    public static boolean isSolved(int curX, int curY) {
        // Solved if you have reached position (2, 0) or (4, 11)
        for (int i = 0; i < pointsInOut.length; i++) {
            if (x != pointsInOut[i][0] &&
                    y != pointsInOut[i][1] &&
                    curX == pointsInOut[i][0] &&
                    curY == pointsInOut[i][1])
                return true;
        }
        return false;
    }
}