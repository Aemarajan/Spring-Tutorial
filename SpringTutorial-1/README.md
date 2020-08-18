In this project we create 3 classes and 1 interface

1. MyApp.java (Main Class)
2. Coach.java (Interface)
3. BaseBallCoach.java (Class which implements Coach.java interface)
4. TrackCoach.java (Class which implements Coach.java interface)

In main class file we normally create a object and call the BaseBallCoach and TrackCoach classes.

eg:
Coach theCoach1 = new BaseBallCoach();
Coach theCoach2 = new TrackCoach();
System.out.println(theCoach1.getDailyWorkout());
System.out.println(theCoach2.getDailyWorkout());

This project can run without spring framework