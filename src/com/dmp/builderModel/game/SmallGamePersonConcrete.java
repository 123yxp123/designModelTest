package builderModel.game;
/**
 * 小人物建造实现类
 * @author yxp
 *
 */
public class SmallGamePersonConcrete implements GamePersonBuilder{
	private GamePerson gp = new GamePerson();

	@Override
	public void concreateBulderFace() {
		gp.addPart("Small部件Face");
	}

	@Override
	public void concreateBulderFoot() {
		gp.addPart("Small部件Foot");
	}

	@Override
	public void concreateBulderHand() {
		gp.addPart("Small部件Hand");
	}

	@Override
	public GamePerson giveGamePersonPart() {
		return gp;
	}
}
