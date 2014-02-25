package dmmt.mod1.blocks.rawores;

import java.util.Random;

import dmmt.mod1.basic.Basic;
import dmmt.mod1.basic.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TitaniumOre extends Block {

	public TitaniumOre(int par1, Material par2Material) {
		super(par1, par2Material);
		
		setHardness(5.0F);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("titaniumOre");
		setCreativeTab(CreativeTabs.tabBlock);
		setTextureName(ModInfo.NAME.toLowerCase() + ":titaniumOre");
	}
	
	/**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Main.titaniumOre.blockID;
    }

}
