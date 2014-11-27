public class Compass {
    private String direction;
    
    public Compass(String direction){
        this.direction = direction;
    }

    public int directionIndex() {
        int index = 0;     
        if(direction.equals("N")){
            index = 0;
        }
        else if(direction.equals("E")){
            index = 1;
        }
        else if(direction.equals("S")){
            index = 2;
        }
        else if(direction.equals("W")){
            index = 3;
        }
        else{
        }
        return index;
    }

    public void turnLeft() {
      String[] directions =  { "N", "E", "S", "W" };
        if (directionIndex() - 1 == -1){
          this.direction = directions[directions.length -1];
        }else{
          this.direction = directions[directionIndex() -1];
        }
    }
    
    public void turnRight() {
       String[] directions =  { "N", "E", "S", "W" };
        if (directionIndex() + 1 == directions.length){
          this.direction = directions[0];
        }else{
          this.direction = directions[directionIndex() + 1];

        }
    }
    
    public String getDirection() {
        return direction;
    }

}
