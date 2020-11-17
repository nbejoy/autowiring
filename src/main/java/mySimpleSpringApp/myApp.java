
package mySimpleSpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

import food.Meal;

public class myApp 
{


	public static void main(String[] args)
	{
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("myTestPackage/appContext.xml");
		
		
		
		
		
		Meal mySpringMeal=appContext.getBean("meal",Meal.class);
		
		System.out.println("Spring Meal: "+mySpringMeal.whatsInThisMeal());
		

		Meal mealtypeAutowired=appContext.getBean("mealAutowired",Meal.class);
		
		System.out.println("Autowired By Type Meal: "+mealtypeAutowired.whatsInThisMeal());
		
		Meal mealnameAutowired=appContext.getBean("mealNameAutowired",Meal.class);
		
		System.out.println("Autowired By Name Meal: "+mealnameAutowired.whatsInThisMeal());
		
		

		Meal mealConstructorAutowired=appContext.getBean("mealConstructorAutowired",Meal.class);
		
		System.out.println("Autowired By Constructor Meal: "+mealConstructorAutowired.whatsInThisMeal());
		
		((ClassPathXmlApplicationContext) appContext).close();
		
	}

}
