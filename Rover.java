public class Rover {
    private int x;
    private int y;
    private Compass compass;
    
    public Rover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.compass = new Compass(direction);
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }

    public String getDirection() {
    	return compass.getDirection();
    }

    public void turnLeft() {
        compass.turnLeft();
    }
    
    public void turnRight() {
        compass.turnRight();
    }

    public void moveNorth() {
        y = y + 1;
    }
    
    public void moveSouth() {
        y = y - 1;
    }
    
    public void moveEast() {
        x = x + 1;
    }
    
    public void moveWest() {
        x = x - 1;
    }
    
    public void move(int xBoundary, int yBoundary){
        if(getDirection().equals("N")){
            if(y != yBoundary){
        	  moveNorth();
            }
            else{
            	throw new Error("Rover is at edge");
            }
        }
        else if(getDirection().equals("E")){
            if(x != xBoundary){
        	  moveEast();
            }else{
            	throw new Error("Rover is at edge");
            }
        }
        else if(getDirection().equals("S")){
        	if(y != 0){
              moveSouth();
        	}else{
            	throw new Error("Rover is at edge");
            }

        }
        else if(getDirection().equals("W")){
        	if(x != 0){
              moveWest();
        	}else{
            	throw new Error("Rover is at edge");
            }
        }
    }
    
    public String location() {
        return (x + " " + y + " " + getDirection());
    }
}

