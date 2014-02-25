package dmmt.mod1.blocks.rawstones;

import java.util.Random;

import dmmt.mod1.basic.Basic;
import dmmt.mod1.basic.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class GreenGranite extends Block {

	public GreenGranite(int id, Material par2Material) {
		super(id, par2Material);
		
		//CHANGE TO CORRECT HARDNESS
		setHardness(4.0F);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("greenGranite");
		setCreativeTab(CreativeTabs.tabBlock);
		setTextureName(ModInfo.NAME.toLowerCase() + ":greenGranite");
	}
	
	public int idDropped(int metadata, Random random, int fortune){
		return Main.greenGranite.blockID;
	}

}
