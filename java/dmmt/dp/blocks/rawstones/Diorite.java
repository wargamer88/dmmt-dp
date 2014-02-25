package dmmt.dp.blocks.rawstones;

import java.util.Random;

import dmmt.dp.main.Main;
import dmmt.dp.main.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Diorite extends Block {

	public Diorite(int i, Material par2Material) {
		super(par2Material);
		
		setHardness(4.0F);
		setStepSound(Block.soundTypeStone);
		setBlockName("diorite");
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockTextureName(ModInfo.NAME.toLowerCase() + ":diorite");
	}
}
