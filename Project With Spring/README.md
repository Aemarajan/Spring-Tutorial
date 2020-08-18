This project run by Spring Framework

In this project we create 3 classes, 1 interface and 1 configuration file

1. SpringApp.java (Main Class)
2. Coach.java (Interface)
3. BaseBallCoach.java (Class which implements Coach.java interface)
4. TrackCoach.java (Class which implements Coach.java interface)
5. application-context.xml (Spring Bean Configuration file)


In the main class we create a Spring Container object,

eg:
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

Using this object we able to retrive a bean in configuration file,

eg:
Coach coach = context.getBean("myCoach",Coach.class);

Using the bean object we can access the methods and variables,

eg:
System.out.println(coach.getDailyWorkout());


Output:
Spend 30 minutes on batting practice