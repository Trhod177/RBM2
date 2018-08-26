package trhod177.rbm2.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import trhod177.rbm2.ReinforcedBlocksMod2;

public class EmeraldReinforcedTerracotta extends CustomBlocks {

	public EmeraldReinforcedTerracotta(String name) {
		super(Material.ROCK, name);
		setHardness(3f);
		setResistance(50f);
		this.setHarvestLevel("pickaxe", 3);
		
		
	}
	
	
	
	@Override
	public EmeraldReinforcedTerracotta setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(ReinforcedBlocksMod2.RBM2TerracottaTab);
		return this;
	}
}
