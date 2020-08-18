# Spring Tutorial
In this project we perform a Constructor Injection Operation Using Spring Container,
We create a some dependancy classes.

1. SpringApp.java (Main Class)
2. Coach.java (Interface)
3. BaseBallCoach.java (Class which implements Coach.java interface)
4. TrackCoach.java (Class which implements Coach.java interface)
5. application-context.xml (Spring Bean Configuration file)
6. Fortune.java (Interface)
7. FortuneService.java (Class which implements Fortune.java interface)

Steps:
	1. Create a Depandancy interface and class
	2. Create a constructor in your class for injections
	3. Configure the dependancy injection in spring config file

Step-1:
	*Create a Fortune interface
	*Create a FortuneService class which implements Fortune interface
	eg:
	//Fortune Interface
	public interface Fortune {
		public String getFortune();
	}

	//FortuneService Class
	public class FortuneService implements Fortune {
		@Override
		public String getFortune() {
			return "Today is your lucky day";
		}
	}



Step-2:
	*Create a constructor in class for injection
	eg:
	Create a constructor in BaseBallCoach.java

	//BaseBallCoach.java Class
	Fortune fortune;
	public BaseBallCoach(Fortune fortune) {
		super();
		this.fortune = fortune;
	}
	
	Note: Create a constructor same as TrackCoach.java class

Step-3:
	*Define a dependancy bean in application-context.xml file

	//application-context.xml	
	<bean id="fortune" class="com.ccoder.FortuneService"></bean>
	<bean id="myCoach" class="com.ccoder.BaseBallCoach">
		<constructor-arg ref="fortune"></constructor-arg>
	</bean>