package dmmt.dp.blocks.rawores;

import java.util.Random;

import dmmt.dp.main.Main;
import dmmt.dp.main.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class WatermelonStone extends Block {

	public WatermelonStone(int ii, Material par2Material) {
		super(par2Material);
		
		setHardness(4.0F);
		setStepSound(Block.soundTypeStone);
		setBlockName("watermelonStone");
		setCreativeTab(CreativeTabs.tabFood);
		setBlockTextureName(ModInfo.NAME.toLowerCase() + ":melonstone");
	}
	
	/**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Item.melon.itemID;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return 3 + par1Random.nextInt(5);
    }
    
    /**
     * Returns the usual quantity dropped by the block plus a bonus of 1 to 'i' (inclusive).
     */
    public int quantityDroppedWithBonus(int par1, Random par2Random)
    {
        int j = this.quantityDropped(par2Random) + par2Random.nextInt(1 + par1);

        if (j > 9)
        {
            j = 9;
        }

        return j;
    }

}
