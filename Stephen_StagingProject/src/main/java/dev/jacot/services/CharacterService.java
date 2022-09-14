package dev.jacot.services;

import dev.jacot.models.ImprovCharacter;
import dev.jacot.repo.CharacterDAO;

public class CharacterService 
{
	private static CharacterDAO cd;
	
	public CharacterService(CharacterDAO cd)
	{
		this.cd = cd;
	}

	public static ImprovCharacter createCharacter(ImprovCharacter ic) {
		// TODO Auto-generated method stub
		
		if(ic.getFirstName().equals("") || ic.getLastName().equals("") || ic.getTypeOfCharacter().equals(""))
		{
			return null;
		}
		return cd.createCharacter(ic);
	}

}
