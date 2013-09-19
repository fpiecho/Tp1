package ar.fiuba.tecnicas.giledrose;


public abstract class ItemWrapper {
	protected Item item;
	
	protected abstract void updateSellin();
	protected abstract void updateQuality();

	public void update(){
		this.updateQuality();
		this.updateSellin();
	}
	
	protected void addToQuality(int quantity){
		int newQuality = this.item.getQuality() + quantity ;
		this.item.setQuality( newQuality );
	}
}
