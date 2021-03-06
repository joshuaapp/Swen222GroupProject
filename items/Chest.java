package items;

import java.util.ArrayList;
import java.util.List;

public class Chest implements StorageItem, InteractableItem{

	private List<Item> contents;
	
	public Chest(){
		contents = new ArrayList<Item>();
	}
	
	public Chest(List<Item> contents){
		this.contents = new ArrayList<Item>();
		this.contents.addAll(0, contents);
	}
	
	@Override
	public boolean isUsable() {
		return true;
	}

	@Override
	public boolean isRetrieveable() {
		return false;
	}
	
	/**Add an item into the chest. Can be used for populating or if a player wishes to
	 * store an item inside the chest. 
	 * 
	 * @param itemToAdd - the item to add to the chest
	 */
	public void addItem(Item itemToAdd){
		
	}
	
	public Item getItem(Item itemToGet){
		//TODO: fix this to return appropriate result (maybe need to get item from position?)
		return contents.get(0);
	}

}
