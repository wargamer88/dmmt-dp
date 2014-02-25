package dmmt.dp.blocks.rawstones;

import java.util.Random;

import dmmt.dp.main.Main;
import dmmt.dp.main.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Marble extends Block {

	public Marble(int i, Material par2Material) {
		super(par2Material);
		
		//CHANGE TO CORRECT HARDNESS
		setHardness(4.0F);
		setStepSound(Block.soundTypeStone);
		setBlockName("marble");
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockTextureName(ModInfo.NAME.toLowerCase() + ":marble");
	}
}
