package ar.fiuba.tecnicas.giledrose;

public class Sulfuras extends ItemWrapper{
	
	public Sulfuras(int quality){
		this.item = new Item("Sulfuras, Hand of Ragnaros", quality, 0);	
	}
	
	public Sulfuras(Item item){
		this.item = item;
	}
	protected void updateSellin(){
		
	}
	
	protected void updateQuality(){
	}
}

