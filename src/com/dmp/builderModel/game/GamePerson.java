package builderModel.game;

import java.util.ArrayList;
import java.util.List;

/**
 * 人物类
 * 产品类
 * 添加产品部件，获得产品所有部件
 * @author yxp
 *
 */
public class GamePerson {
	//部件集合
	List<String> parts = new ArrayList<String>();
	public void addPart(String part){
		parts.add(part);
	}
	public void getGamePerson(){
		for (String part : parts) {
			System.out.println("显示："+part);
		}
	}
}
