package tp3ArchiLogiciel;

public class Product extends Component {

	@Override
	public void view() {
		//cette fonction affiche la herarchie de la categorie 
		for(int i=0;i<getLevel();i++) {
		 
			
			System.out.print(i);
			
		}
		
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
