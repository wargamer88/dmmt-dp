package dmmt.mod1.blocks.rawstones;

import java.util.Random;

import dmmt.mod1.basic.Basic;
import dmmt.mod1.basic.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Diorite extends Block {

	public Diorite(int par1, Material par2Material) {
		super(par1, par2Material);
		
		setHardness(4.0F);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("diorite");
		setCreativeTab(CreativeTabs.tabBlock);
		setTextureName(ModInfo.NAME.toLowerCase() + ":diorite");
	}
	
	/**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Main.diorite.blockID;
    }

}
