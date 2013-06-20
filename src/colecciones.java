import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;


public class colecciones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<String> equipo = new LinkedList();
		//List<String> equipo = new ArrayList<String>();
		
		//equipo.add("Juan");
		//equipo.add("Pedro");
		//equipo.add("Pablo");
		//equipo.add("Mario");
		//equipo.add("Luigi");
		//equipo.add("Princesita");
		
		//Iterator it = equipo.iterator();

		/*		
		String primero = (String)it.next();
		//System.out.println("*"+primero);
		String segundo = (String)it.next();
		//System.out.println("*"+segundo);
		
		
		String aux = "";
		for(String	obj : equipo){
			if(obj != "Princesita"){
				aux = obj;
			System.out.println(obj);
			}
		}
		
		equipo.remove(aux);
		//it.remove();
		System.out.println("");
		for(String	obj : equipo){
			System.out.println(obj);
		}
			*/		
		
		
		List<Personaje> lp= new ArrayList<Personaje>();
		
		lp.add(new Personaje("Mario"));
		lp.get(0).setItems("Estrellita");
		lp.get(0).setItems("Fueguito");
		lp.get(0).setItems("Tortuguini");
		
		lp.get(0).setSkills("Brincar");
		lp.get(0).setSkills("Aplastar");
		lp.get(0).setSkills("Patear");
		
		for(Personaje p : lp){
			System.out.print(p.toString());
		}
		
		
		
		
	}


}
