package dmmt.dp.blocks.rawores;

import java.util.Random;

import dmmt.dp.main.Main;
import dmmt.dp.main.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TitaniumOre extends Block {

	public TitaniumOre(int i, Material par2Material) {
		super(par2Material);
		
		setHardness(5.0F);
		setStepSound(Block.soundTypeStone);
		setBlockName("titaniumOre");
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockTextureName(ModInfo.NAME.toLowerCase() + ":titaniumOre");
	}
}
