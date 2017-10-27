package kata.casinos;

import java.util.ArrayList;
import java.util.List;

public class Casino {

	private List<Casino> group = new ArrayList<>();
	private List<Vip> vips = new ArrayList<>();
	
	public List<Casino> getGroup() {
		return group;
	}
	
	public void addInGroup(Casino casino) {
		group.add(casino);
	}

	public List<Vip> getVips() {
		return vips;
	}
	
	public void addVip(Vip vip) {
		vips.add(vip);
	}

}
