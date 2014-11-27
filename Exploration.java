public class Exploration {
  private Rover rover;
  private String route;
  private Map map;

  public Exploration(Map map) {
      this.map = map;
  }
  
  public int heightBoundary(){
	  return map.getHeight();
  }
  
  public int widthBoundary(){
	  return map.getWidth();
  }

  public Rover getRover() {
      return rover;
  }
  
  public String getRoute() {
      return route;
  }

  public void setRover(Rover rover) {
      this.rover = rover;
  }
  
  public void setRoute(String route) {
      this.route = route;
  }
  
  public void cartegraph() {
      for (int i = 0; i < route.length(); i++){
          char c = route.charAt(i);
          if(Character.valueOf(c).equals('L')){
              rover.turnLeft();
          }
          if(Character.valueOf(c).equals('R')){
        	  rover.turnRight();              
          }
          if(Character.valueOf(c).equals('M')){
              rover.move(widthBoundary(), heightBoundary());
          }
     }
  }
 
  public String finalPosition() {
      return rover.location();
   }

  public void printFinalPositioning() {
      System.out.println( finalPosition());
   }
}
