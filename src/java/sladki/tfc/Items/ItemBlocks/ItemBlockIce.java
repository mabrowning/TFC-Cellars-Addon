package sladki.tfc.Items.ItemBlocks;

import net.minecraft.block.Block;

import com.dunk.tfc.Core.TFCTabs;
import com.dunk.tfc.Items.ItemBlocks.ItemTerraBlock;

public class ItemBlockIce extends ItemTerraBlock {

	public ItemBlockIce(Block block) {
		super(block);
		this.setCreativeTab(TFCTabs.TFC_BUILDING);
	}
	
}
