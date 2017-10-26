import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ArrayUtils;

public class Monster_gameRUNTIME {

	
	public static void main(String[]args)
	{
		Monster_game.buildBattleBoard();
		
		char[][] tempBattleBoard = new char[10][10];
		
		Monster_game[] Monsters = new Monster_game[4];
		
		Monsters[0] = new Monster_game(1000, 20, 1, "Frank");
		Monsters[1] = new Monster_game(1000, 20, 1, "Pepe");
		Monsters[2] = new Monster_game(1000, 20, 1, "Harambe");
		Monsters[3] = new Monster_game(1000, 20, 1, "Based God");
		
		Monster_game.redrawBoard();
	
	for (Monster_game m : Monsters)
	{
		if(m.getAlive())
		{
			int arrayItemIndex = ArrayUtils.indexOf(Monsters, m);
			m.moveMonster(Monsters, arrayItemIndex);
		}
	}
	Monster_game.redrawBoard();
}

	