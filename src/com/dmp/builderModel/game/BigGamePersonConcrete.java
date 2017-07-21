package builderModel.game;
/**
 * 大人物建造实现类
 * @author yxp
 *
 */
public class BigGamePersonConcrete implements GamePersonBuilder{
	private GamePerson gp = new GamePerson();

	@Override
	public void concreateBulderFace() {
		gp.addPart("Big部件Face");
	}

	@Override
	public void concreateBulderFoot() {
		gp.addPart("Big部件Foot");
	}

	@Override
	public void concreateBulderHand() {
		gp.addPart("Big部件Hand");
	}

	@Override
	public GamePerson giveGamePersonPart() {
		return gp;
	}
	
}
