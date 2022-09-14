package dev.jacot;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class ProjectDriver 
{

	public static void main(String[] args) 
	{
		Javalin app = Javalin.create(config -> {
			config.enableCorsForAllOrigins();
			
			config.addStaticFiles("/public", Location.CLASSPATH);
		});
		
		
		app.start(8070);
		
		

	}

}
