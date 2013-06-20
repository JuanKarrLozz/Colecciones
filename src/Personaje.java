import java.util.ArrayList;


public class Personaje {
	
	private String name;
	private ArrayList<String> skills;
	private ArrayList<String> items;
	
	Personaje(String nombre){
		name = nombre;;
		skills = new ArrayList<String>();
		items = new ArrayList<String>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name = name;}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	public ArrayList<String> getAllSkills(){
		return skills;}
	
	public String getSkills(int i){
		return skills.get(i);}
	
	public void setSkills(String skills){
		this.skills.add(skills);}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public ArrayList<String> getAllItems(){
		return items;}
	
	public String getItems(int i){
		return items.get(i);}
	
	public void setItems(String item){
		this.items.add(item);}
	

	@Override
	public String toString() {
		return "Personaje *Name:" + name + "  Skills:" + skills + "  Items="+ items+ "*";
	}
	
	
	
}
