import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
    // Background size
      size(800, 800);
    }
  
    // Background color
    public void setup() {
      background(67, 170, 239);
    }
    
    // Set up the method for the house
    private void house(int size, int x, int y, int color, int color2) {

      // Main house Structure
      fill(color, color2, 150);
      rect(x, y, 75 * size, 50 * size);

      // Door
      fill(66, 69, 62);
      rect(x + (65 * size), y + (30 * size), 10 * size, 20 * size);

      // Roof
      fill(163, 112, 49);
      rect(x - 2, y - 5, 78 * size, 5 * size);

    }
  // Draw the houses
  public void draw() {
    int hue = 0;
    int hue2 = 0;

    // Loop the houses to be printed multiple times
    for (int i = 20; i < width; i += 200) {
      for (int j = 20; j < height; j += 220) {
        house(1, i, j, hue, hue2);
        hue = hue + 20;
    }
  }
  
  // Draw extra houses
  house(2, 300, 100, 250, 190);
  house(3, 500, 300, 250, 60);
  house(3, 120, 400, 10,250);
  
}

}