import java.util.*;

public class SimplePokemon 
{
	private String Pokemon;
	private int level;
	private char type;
	
	public void readInput()
	{
		Scanner PokeName = new Scanner(System.in);
		Pokemon =  PokeName.next();
		System.out.println(Pokemon + " I choose you!");
		PokeName.close();
		
		System.out.println("What level is the pokemon?");
		Scanner PokeLevel = new Scanner(System.in);
		level = PokeLevel.nextInt();
		PokeLevel.close();
		
		System.out.println("What type is the pokemon, f = fire, w = water, r = rock, g = grass, and e = electric?");
		Scanner PokeType = new Scanner(System.in);
		type = PokeType.next().charAt(0);
		PokeType.close();
	}
	
		public void Levelup()
		{
			level ++;
		}
		
		public void SwitchType()
		{
			do
			{
				System.out.println("You can only change the pokemon to: f = flying, w = water, r = rock, g = grass, and e = electric.");
				Scanner newPokeType = new Scanner(System.in);
				char newType = newPokeType.next().charAt(0);
				newPokeType.close();
				type = newType;
			}
			while(type != 'f' && type != 'w' && type != 'r' && type != 'g' && type != 'e');
		}
		
			public String getName()
			{
				return Pokemon;
			}
			
			public int getLevel()
			{
				return level;
			}
			
			public char getType()
			{
				return type;
			}
			
			public void Battle(SimplePokemon x)
			{
				System.out.println("What type is the pokemon, f = fire, w = water, r = rock, g = grass, and e = electric?");
				
				do
				{
					System.out.println("You can only change the pokemon to: f = flying, w = water, r = rock, g = grass, and e = electric.");
					Scanner newPokeType = new Scanner(System.in);
					char newType = newPokeType.next().charAt(0);
					newPokeType.close();
					type = newType;
				}
				while(type != 'f' && type != 'w' && type != 'r' && type != 'g' && type != 'e');
				
				if(type == x.getType())
				{
					//If Pokemon has higher level.
					if(level > x.getLevel())
					{
						System.out.println(Pokemon + "Wins!");
					}
					
					//If Pokemon is not the same type as x.
					if(type != x.getType())
					{
						if(x.getLevel() - 2 > level)
						{
							System.out.println(Pokemon + "Wins!");
						}
					}
					
					//If Pokemon's level is lower than x.
					if(level < x.getLevel())
					{
						System.out.println(x + "Wins!");
					}
					
					//If x isn't the same type as Pokemon.
					if(x.getType() != type)
					{
						if(level - 2 > x.getLevel())
						{
							System.out.println(x + "Wins!");
						}
					}
					
					//If Pokemon is strong type:
					if(type == 'w' && x.getType() == 'r')
					{
						if(x.getLevel() - 2 > level)
						{
							System.out.println(Pokemon + "Wins!");
						}
					}
					if(type == 'e' && x.getType() == 'f')
					{
						if(x.getLevel() - 2 > level)
						{
							System.out.println(Pokemon + "Wins!");
						}
					}
					if(type == 'r' && x.getType() == 'e')
					{
						if(x.getLevel() - 2 > level)
						{
							System.out.println(Pokemon + "Wins!");
						}
					}
					if(type == 'f' && x.getType() == 'g')
					{
						if(x.getLevel() - 2 > level)
						{
							System.out.println(Pokemon + "Wins!");
						}
					}
					
					//If x is a strong type:
					if(x.getType() == 'w' && type == 'r')
					{
						if(x.getLevel() > level - 2)
						{
							System.out.println(x.getName() + "Wins!");
						}
					}
					
					if(x.getType() == 'e' && type == 'f')
					{
						if(x.getLevel() > level - 2)
						{
							System.out.println(x.getName() + "Wins!");
						}
					}
					
					if(x.getType() == 'r' && type == 'e')
					{
						if(x.getLevel() > level - 2)
						{
							System.out.println(x.getName() + "Wins!");
						}
					}
					
					if(x.getType() == 'f' && type == 'g')
					{
						if(x.getLevel() > level - 2)
						{
							System.out.println(x.getName() + "Wins!");
						}
					}
				}
			}
}
