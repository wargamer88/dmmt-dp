package dmmt.dp.blocks.rawstones;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.event.world.BlockEvent;
import dmmt.dp.main.Main;
import dmmt.dp.main.ModInfo;

public class Andesite extends Block {

	public Andesite(Material par2Material) {
		super(par2Material);
		
		//CHANGE TO CORRECT HARDNESS
		setHardness(4.0F);
		
		setStepSound(Block.soundTypeStone);
		setBlockName("andesite");
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockTextureName(ModInfo.NAME.toLowerCase() + ":andesite");
		setHarvestLevel("pickaxe", 2);
	}
	
	public int idDropped(int metadata, Random random, int fortune){
		return Main.andesite.getBlock;
	}
	
	

}
