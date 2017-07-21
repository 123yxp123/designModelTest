package builderModel.game;
/**
 * 指挥者类
 * @author yxp
 *
 */
public class GamePersonDirector {
	public void createGamePerson(GamePersonBuilder builder){
		builder.concreateBulderFace();
		builder.concreateBulderFoot();
		builder.concreateBulderHand();
	}
}
