public class Data {
    public static final int MAX = 500; // THIS VALUE ADDED TO ENABLE TESTING
    private int[][] grid;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public Data(int[][] g) {
        grid = g;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public int[][] getGrid() {
        return grid;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public void setGrid(int[][] newGrid) {
        grid = newGrid;
    }

    public void repopulate() {
        // TYPE UP YOUR PART A CODE HERE
        // then test with DataTester

        for (int r=0;r<grid.length;r++){
            for(int c=0;c<grid[r].length;c++){
                int tens=MAX/10;

                int n=0;
                while(n%10==0){
                    n=(int)(Math.random()*MAX)+1;
                }
                grid[r][c]=n*10;
            }
        }
    }

    public int countIncreasingCols() {
        // TYPE UP YOUR PART B CODE HERE
        // then test with DataTester

        int num=0;
        for(int c=0;c<grid[0].length;c++){
            for(int r=1;r<grid.length;r++){
                if (grid[r][c]<grid[r-1][c]){continue;}
            }
            num++;
        }
        return num;
    }
}
