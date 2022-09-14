package dev.jacot.controller;

import dev.jacot.models.ImprovCharacter;
import dev.jacot.services.CharacterService;
import io.javalin.http.Context;

public class CharacterController 
{
	private CharacterService cs;
	
	public CharacterController(CharacterService cs)
	{
		this.cs = cs;
	}
	
	public void createCharacter(Context ctx)
	{
		ImprovCharacter ic = ctx.bodyAsClass(ImprovCharacter.class);
		
		ImprovCharacter result = CharacterService.createCharacter(ic);
		
		
		if(result != null)
		{
			ctx.status(201);
			
			ctx.json(result);
		} else {
			ctx.status(422);
		}
	}

}
