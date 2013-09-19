package ar.fiuba.tecnicas.giledrose;

public class BackstagePass extends ItemWrapper{
	
	public BackstagePass(int sellIn, int quality){
		this.item = new Item("Backstage passes to a TAFKAL80ETC concert", quality, sellIn);	
	}

	protected void updateSellin(){
		this.item.setSellIn(this.item.getSellIn() -1);
	}
	
	protected void updateQuality(){
		if(this.item.getQuality() < 50)
			this.addToQuality(1);		
		if(this.item.getSellIn() < 11)
		{
			if(this.item.getSellIn() <= 0)
				this.item.setQuality(0);
			else{
				this.addToQuality(1);
				if(this.item.getSellIn() < 6)
					this.addToQuality(1);
			}
		}
	}
}
