package dmmt.dp.blocks.rawstones;

import java.util.Random;

import dmmt.dp.main.Main;
import dmmt.dp.main.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Pumice extends Block {

	public Pumice(int i, Material par2Material) {
		super(par2Material);
		
		//CHANGE TO CORRECT HARDNESS
		setHardness(4.0F);
		setStepSound(Block.soundTypeStone);
		setBlockName("pumice");
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockTextureName(ModInfo.NAME.toLowerCase() + ":pumice");
	}
}
