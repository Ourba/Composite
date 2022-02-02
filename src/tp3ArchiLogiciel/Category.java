package tp3ArchiLogiciel;

import java.util.ArrayList;
import java.util.List;

public class Category extends Component{

	List<Component> d= new ArrayList<>();
	
	void addComponent(Component c){
		d.add(c);
	}


	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getLevel() {
		return level;
	}


	@Override
	public void view() {
		
		for(Component component : d) 
			level = level + ((Category) d).getLevel();
		for(Component component : d) {
			for(int i=0 ;i<level;i++)
				System.out.print("	");

			System.out.print(component.getName());
			
		}

		
	}


	@Override
	public String getName() {
		
		return name ;
	}

}
