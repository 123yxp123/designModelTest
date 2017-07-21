package test.builderModel.game;

import builderModel.game.BigGamePersonConcrete;
import builderModel.game.GamePerson;
import builderModel.game.GamePersonBuilder;
import builderModel.game.GamePersonDirector;

public class TestBuilderModel {
	public static void main(String[] args) {
		test1();
	}
	public static void test1(){
		GamePersonDirector gpd = new GamePersonDirector();
		GamePersonBuilder builder = new BigGamePersonConcrete();
		gpd.createGamePerson(builder);
		GamePerson gp = builder.giveGamePersonPart();
		gp.getGamePerson();
	}
}
