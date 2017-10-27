package kata.casinos;

import kata.casinos.externals.CasinoDAO;

final class CasinoTableModel extends Temp {
	private static final long serialVersionUID = -7433373649712551999L;
	private Casino current = new Casino();
	
	@Override
	public int getRowCount() {
		try {
			return getVIP(current).size();
		} catch (ManagerNotLoggedInException e) {
			return 0;
		}
	}
	
	@Override
	public Object getValueAt(int row, int column) {
		try {
			Vip vip = getVIP(current).get(row);
			if (column == 0) {
				return vip.nom;
			}
			else if (column == 1) {
				return vip.prenom;
			}
			return null;
		} catch (ManagerNotLoggedInException e) {
			return null;
		}
	}

	@Override
	public int getColumnCount() {
		return 2;
	}
	
	@Override
	public String getColumnName(int column) {
		switch (column) {
		case 0:
			return "Nom";
		case 1:
			return "Prénom";

		default:
			return null;
		}
	}
	
	void setSearched(String text) {
		current = CasinoDAO.findCasinoByName(text);
		if (current == null) {
			current = new Casino();
		}
	}

	
}