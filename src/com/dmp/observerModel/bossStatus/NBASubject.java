package observerModel.bossStatus;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author yxp
 *
 */
public class NBASubject implements Subject{
	private String subjectState;
	private List<Observer> observer = new ArrayList<Observer>();
	@Override
	public void attach(Observer obs) {
		observer.add(obs);
	}

	@Override
	public void detach(Observer obs) {
		observer.remove(obs);
	}

	@Override
	public void notifyInfo() {
		for (Observer obs : observer) {
			obs.update();
		}
	}

	@Override
	public String getSubjectState() {
		return subjectState;
	}
	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}

}
