package TFP;
// creamos una mapa que sea compatible a tener varios actualizaciones en futuro
// el idea es uso de array bidimensional para tener un mapa de 3x3 para cada heroe
import java.util.Arrays;

class Map {
    private int[][] grid;

    // creamos un arrayB que tendra el valor 1 hasta 9 y que sea de 3x3
    public Map() {
        grid = new int[3][3];
        
        int value = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = value++; 
            }
        }
    }

    // Colocamos en la mapa el heroe
    // y que esta posicion tenga el valor de vida de heroe y al resto tengan -2
    public void placePlayer(int position, int health) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == position) {
                    grid[i][j] = health;  
                   
                }else {
                	grid[i][j] = -2;
                }
            }
        }
    }



	// Mostrar la mapa
    public void printMap() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(grid[i]));
        }
    }
}


