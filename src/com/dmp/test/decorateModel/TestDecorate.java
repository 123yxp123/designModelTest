package test.decorateModel;

import decorateModel.dress.BigTrouserConcreteDecorate;
import decorateModel.dress.CasualShoesConcreteDecorate;
import decorateModel.dress.PersonConcreteComponent;
import decorateModel.dress.TShirtsConcreteDecorate;

public class TestDecorate {
	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		PersonConcreteComponent personCompent = new PersonConcreteComponent("小花");
		System.out.println("打扮【1】");
		TShirtsConcreteDecorate tshirts = new TShirtsConcreteDecorate();
		BigTrouserConcreteDecorate bigTrouser = new BigTrouserConcreteDecorate();
		CasualShoesConcreteDecorate casualShose = new CasualShoesConcreteDecorate();
		casualShose.decorate(personCompent);
		bigTrouser.decorate(casualShose);
		tshirts.decorate(bigTrouser);
		tshirts.show();
	}
}
