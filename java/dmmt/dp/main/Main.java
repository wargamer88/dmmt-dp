package dmmt.dp.main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import dmmt.dp.blockgen.BlockGenerator;
import dmmt.dp.blocks.rawores.rawores.*;
import dmmt.dp.blocks.rawores.rawstones.*;
 
@Mod(modid=ModInfo.ID, name=ModInfo.NAME, version=ModInfo.VERSION)
public class Main {
 
	//blocks
    public final static Block andesite = new Andesite(500, Material.rock);
    public final static Block dioriteQuartz = new DioriteQuartz(502, Material.rock);
    public final static Block dolomite = new Dolomite(503, Material.rock);
    public final static Block greenGranite = new GreenGranite(504, Material.rock);
    public final static Block marble = new Marble(505, Material.rock);
    public final static Block pumice = new Pumice(506, Material.rock);
    public final static Block siltstone = new Siltstone(507, Material.rock);
    public final static Block diorite = new Diorite(508, Material.rock);
    
    //ores
    public final static Block watermelonStone = new WatermelonStone(1000, Material.rock);
    public final static Block titaniumOre = new TitaniumOre(1001, Material.rock);
    
    //blockgenerator
    BlockGenerator blockGenerator = new BlockGenerator();
	
        // The instance of your mod that Forge uses.
        @Instance("Basic")
        public static Main instance;
       
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide= ModInfo.CLIENTPROXY + "ClientProxy", serverSide= ModInfo.COMMONPROXY + "CommonProxy")
        public static CommonProxy proxy;
       
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        }
       
        @SuppressWarnings("deprecation")
		@EventHandler
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                
                //setBlockHarvestLevel: 0=wood, 1=stone, 2=iron, 3=diamond
                
                //gameregistry of stones
                
                GameRegistry.registerBlock(andesite, "andesite"); LanguageRegistry.addName(andesite, "Andesite");
                GameRegistry.registerBlock(dioriteQuartz, "dioriteQuartz"); LanguageRegistry.addName(dioriteQuartz, "Diorite Quartz");
                GameRegistry.registerBlock(dolomite, "dolomite"); LanguageRegistry.addName(dolomite, "Dolomite");
                GameRegistry.registerBlock(greenGranite, "greenGranite"); LanguageRegistry.addName(greenGranite, "Green Granite");
                GameRegistry.registerBlock(marble, "marble"); LanguageRegistry.addName(marble, "Marble");
                GameRegistry.registerBlock(pumice, "pumice"); LanguageRegistry.addName(pumice, "pumice");
                GameRegistry.registerBlock(siltstone, "siltstone"); LanguageRegistry.addName(siltstone, "Siltstone");
                GameRegistry.registerBlock(diorite, "diorite"); LanguageRegistry.addName(diorite, "Diorite");
                
                //ores
                GameRegistry.registerBlock(watermelonStone, "watermelonStone"); LanguageRegistry.addName(watermelonStone, "Watermelon Ore");
                GameRegistry.registerBlock(titaniumOre, "titaniumOre"); LanguageRegistry.addName(titaniumOre, "Titanium Ore");
        
                GameRegistry.registerWorldGenerator(blockGenerator, 1);
                
                
                //Crafting Recipes
                
                /* Crafting Recipes Example
                 * 
                 * How to add one?
                 * 
                 * First you add the name above it what you are going to craft in a comment.
                 * Like The First one under here.
                 */
                
                //mossy cobblestone and stonebricks
                
                //first you devine what you are going to need for that recipe, like this
                ItemStack mossyStack = new ItemStack(Block.cobblestoneMossy);
                ItemStack mossyBrickStack = new ItemStack(Block.stoneBrick, 1, 1);
                ItemStack cobbleStack = new ItemStack(Block.cobblestone);
                ItemStack stoneBrickStack = new ItemStack(Block.stoneBrick);
                ItemStack vineStack = new ItemStack(Block.vine);
                
                //Then the actual crafting recipe
                GameRegistry.addShapelessRecipe(mossyStack,cobbleStack, vineStack);
                GameRegistry.addShapelessRecipe(mossyBrickStack, stoneBrickStack, vineStack);
                //that's it!
                
        }
        
       
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
       
}