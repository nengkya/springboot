public class Rpg {

	public static void main(String[] arguments) {

		Character hero;

		hero = new Character();

		hero.healthPoint = 100;

		hero.hp(100);

	}

}


public class Character {

	public int healthPoint;

	public void hp(int healthPoint) {

		healthPoint = healthPoint;

	}

}
