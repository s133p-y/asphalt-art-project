import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
// instanites two painters, one for the background, and one for the toad
  MuralPainter mp = new MuralPainter();
  ToadPainter tp = new ToadPainter();
// creates two painters, first one paints the background light blue, the other one draws the entire picture
    mp.paintBackground("lightSkyBlue", 16);
    tp.drawToad();
    
  }
}