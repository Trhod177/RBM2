package trhod177.rbm2.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import trhod177.rbm2.ReinforcedBlocksMod2;

public class ItemObsidianUpgrade extends Item {
	
	protected String name;

	public ItemObsidianUpgrade(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		
	}
	
	public void registerItemModel() {
		ReinforcedBlocksMod2.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ItemObsidianUpgrade setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ReinforcedBlocksMod2.RBM2ItemTab);
		return this;

}
	

}
