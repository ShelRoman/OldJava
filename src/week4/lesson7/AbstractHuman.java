package week4.lesson7;

public abstract class AbstractHuman implements Humanable {
	private String gender;
	private AbstractGlass glass;
	private AbstractTable table;

	public AbstractGlass getGlass() {
		return glass;
	}

	private void setGlass(AbstractGlass glass) {
		this.glass = glass;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public AbstractHuman(String gender) {
		this.gender = gender;
	}

	@Override
	public void takeGlass(AbstractGlass glass) {
		if (this.getGlass() == null) {
			this.setGlass(glass);
		} else {
			System.out.println("I already have a glass");
		}
	}

	@Override
	public void putGlass() {
		if (this.getClass() != null) {
			System.out.println("Putting the glass");
			this.setGlass(null);
		} else {
			System.out.println("I don't have a glass");
		}

	}

	@Override
	public void pourWaterOnTable(AbstractTable table) {
		if (this.getGlass() == null) {
			System.out.println("I don't have a glass, can't pour water");
		} else {
			this.getGlass().pourFromMe();
			this.setTable(table);
			this.getTable().setDry(true);
		}

	}

	@Override
	public void fillGlass() {
		if (this.getClass() != null) {
			System.out.println("Filling the glass");
		} else {
			System.out.println("I don't have a glass");
		}

	}

	@Override
	public void printAboutMe() {
		System.out.println("I'm a " + this.getGender());
		if (this.getGlass() == null) {
			System.out.println("I don't have a glass");
		} else {
			System.out.println("I have a " + this.getGlass().getForm() + " glass");
		}
		System.out.println("--------------------------");
	}

	public AbstractTable getTable() {
		return table;
	}

	public void setTable(AbstractTable table) {
		this.table = table;
	}

}
