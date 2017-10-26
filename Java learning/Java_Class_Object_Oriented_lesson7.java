
public class Java_Class_Object_Oriented_lesson7 {
	
	
	public final String TOMBSTONE = "Here lies a dead zombie";
	
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	private int xPosition = 0;
	private int yPosition = 2;
	private boolean alive = true;
	
	public String name = "Dank Zombie";
	
	public int getAttack()
	{
		return attack;
	}
	public int getMovement()
	{
		return movement;
	}
	public int getHealth()
	{
		return health;
	}

	public void setHealth(int decreaseHealth)
	{
		health = health - decreaseHealth;
		if (health < 0)
		{
			alive = false;
		}
	}
	
	
	public void setHealth(double decrease)
	{
		int intDecreaseHealth = (int) decrease;
		health = health - intDecreaseHealth;
		if (health < 0)
		{
			alive = false;
		}
	}
	
	public Java_Class_Object_Oriented_lesson7(int health, int attack, int movement)
	{
		this.health = health;
		this.attack = attack;
		this.movement = movement;
	}
	public Java_Class_Object_Oriented_lesson7()
	{
		
	}
	public static void main(String[] args)
	{
		Java_Class_Object_Oriented_lesson7 Danny = new Java_Class_Object_Oriented_lesson7();
		
		System.out.println(Danny.attack);
	}
}
