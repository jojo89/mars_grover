Mars Rover
==========

###directions
- - -
1. Open Terminal
2. cd into the directory you uzipped the package and run `cd marsRoverBurtoft`.
3. run `javac Compass.java Rover.java Map.java Exploration.java Expedition.java Application.java ` to compile classes
4. then run `java Application `

###design 
----------
For this application I wanted to decouple the moving parts for each object. I decided that the compass didn't need to know about it's relationship to the rover and that the rover didn't necessarily need to know how large the plateau was. I tried to imagine designing each object as if I weren't designing any of the other ones. I wanted to keep these classes reusable, in the event that someone might want to use a rover, compass, or map in a different part of a larger application.

###process notes
I included the specs I wrote in a separate folder. This was my first experience using Java, so I learned it as I went. I didn't write any specs until I encountered a bug in one of my compass methods and decided that for rest of the app I should at least write up some integrated test. I also noticed that the size of the plateau wasn't necessarily needed information for the given text input, so I decided to add a bit of logic to ensure the rover didn't fall of the plateau (I can't imagine they're cheap).

#Joey Burtoft
