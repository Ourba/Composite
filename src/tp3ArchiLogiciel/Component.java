package tp3ArchiLogiciel;

public abstract  class Component {
	protected String name;
	protected int level ;
	 
	 public abstract void view();
	
	 public abstract void delete();


	public abstract int getLevel() ;
	public abstract String getName() ;

	
	
}
