package dmmt.dp.main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import dmmt.dp.main.creativetab.placeholder.tabDPBlocksPlaceholder;
import dmmt.dp.main.creativetab.placeholder.tabDPItemsPlaceholder;
import dmmt.dp.blockgen.BlockGenerator;
import dmmt.dp.blocks.rawores.TitaniumOre;
import dmmt.dp.blocks.rawores.WatermelonStone;
import dmmt.dp.blocks.rawstones.Andesite;
import dmmt.dp.blocks.rawstones.Diorite;
import dmmt.dp.blocks.rawstones.DioriteQuartz;
import dmmt.dp.blocks.rawstones.Dolomite;
import dmmt.dp.blocks.rawstones.GreenGranite;
import dmmt.dp.blocks.rawstones.Marble;
import dmmt.dp.blocks.rawstones.Pumice;
import dmmt.dp.blocks.rawstones.Siltstone;
import dmmt.dp.items.tools.Chizel;
import dmmt.dp.main.creativetab.tabDPBlocks;
import dmmt.dp.main.creativetab.tabDPItems;
 
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
    
    //Itens
    public static Item chizel = new Chizel(1500, ToolMaterial.IRON);
    
    //creative tabs
    public static CreativeTabs tabDPBlocks = new tabDPBlocks(CreativeTabs.getNextID(), "tabDPBlocks");
    public static CreativeTabs tabDPItems = new tabDPItems(CreativeTabs.getNextID(), "tabDPItems");
    
    //creative tabs place holder
    public static Item tabDPBlocksPlaceholder = new tabDPBlocksPlaceholder(2000).setUnlocalizedName("tabDPBlocksPlaceholder");
    public static Item tabDPItemsPlaceholder = new tabDPItemsPlaceholder(2000).setUnlocalizedName("tabDPItemsPlaceholder");
    
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
                
                GameRegistry.registerBlock(andesite, "andesite");
                GameRegistry.registerBlock(dioriteQuartz, "dioriteQuartz");
                GameRegistry.registerBlock(dolomite, "dolomite");
                GameRegistry.registerBlock(greenGranite, "greenGranite");
                GameRegistry.registerBlock(marble, "marble");
                GameRegistry.registerBlock(pumice, "pumice");
                GameRegistry.registerBlock(siltstone, "siltstone");
                GameRegistry.registerBlock(diorite, "diorite");
                
                //ores
                GameRegistry.registerBlock(watermelonStone, "watermelonStone");
                GameRegistry.registerBlock(titaniumOre, "titaniumOre");
        
                GameRegistry.registerWorldGenerator(blockGenerator, 1);
                
                //Creativetabs Placeholder
                GameRegistry.registerItem(tabDPBlocksPlaceholder, "tabDPBlocksPlaceholder");
                GameRegistry.registerItem(tabDPItemsPlaceholder, "tabDPItemsPlaceholder");

                
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
                ItemStack mossyStack = new ItemStack(Blocks.mossy_cobblestone);
                ItemStack mossyBrickStack = new ItemStack(Blocks.stonebrick, 1, 1);
                ItemStack cobbleStack = new ItemStack(Blocks.cobblestone);
                ItemStack stoneBrickStack = new ItemStack(Blocks.stonebrick);
                ItemStack vineStack = new ItemStack(Blocks.vine);
                
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