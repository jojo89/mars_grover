import java.io.BufferedReader;
import java.io.IOException;

public class Expedition {
  private BufferedReader information;
  private Exploration current_exploration;
  private Map map;

  public Expedition(BufferedReader information) throws IOException {
      this.information = information;
      this.map = map(information);
  }

  public Map map(BufferedReader information) throws IOException {
      String grid_size = information.readLine();
      int x = Character.getNumericValue(grid_size.charAt(0));
   	  int y = Character.getNumericValue(grid_size.charAt(2));
      return new Map(x, y);
  }

  public void expedite() throws IOException { 
	  String line = information.readLine();
      int counter = 0;
      while(line != null)
      {
        if(counter % 2 == 0){
        	this.current_exploration = new Exploration(map);
        	int x = Character.getNumericValue(line.charAt(0));
       	  int y = Character.getNumericValue(line.charAt(2));
       	  String direction = Character.toString(line.charAt(4));
       	  current_exploration.setRover(new Rover(x, y, direction));
  	     }
        else
        {
        	current_exploration.setRoute(line);
  	      current_exploration.cartegraph();
  	      current_exploration.printFinalPositioning();
        }
        counter++;	
        line = information.readLine();
      }
  }
}
