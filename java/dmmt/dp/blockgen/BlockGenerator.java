package dmmt.mod1.blockgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import dmmt.mod1.basic.Basic;

public class BlockGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
			case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
			case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16);
			case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
		};
		
	}
	
	private void generateEnd(World world, Random random, int x, int z) {
		
	}

	private void generateSurface(World world, Random random, int x, int z) {
		
		//biome getter
		BiomeGenBase biomeGenBase = world.getWorldChunkManager().getBiomeGenAt(x + 16 , z + 16);
		
		//addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
		
		//add stones
		int veinsize = 256;
		
		this.addOreSpawn(Basic.andesite, world, random, x, z, 16, 16, veinsize, chanceToSpawn(100, 40, random), 5, 255);
		if(biomeGenBase.biomeName == "taigaHills" || biomeGenBase.biomeName == "jungleHills" || biomeGenBase.biomeName == "desertHills" || biomeGenBase.biomeName == "extremeHills" || biomeGenBase.biomeName == "forestHills" || biomeGenBase.biomeName == "iceMountains" || biomeGenBase.biomeName == "mushroomIsland" || biomeGenBase.biomeName == "mushroomIslandShore"){
			this.addOreSpawn(Basic.dioriteQuartz, world, random, x, z, 16, 16, veinsize, chanceToSpawn(100, 40, random), 5, 255);
		}		
		this.addOreSpawn(Basic.dolomite, world, random, x, z, 16, 16, veinsize, chanceToSpawn(100, 40, random), 5, 255);
		this.addOreSpawn(Basic.greenGranite, world, random, x, z, 16, 16, veinsize, chanceToSpawn(100, 40, random), 20, 64);
		this.addOreSpawn(Basic.marble, world, random, x, z, 16, 16, veinsize, chanceToSpawn(100, 40, random), 5, 45);
		this.addOreSpawn(Basic.pumice, world, random, x, z, 16, 16, veinsize, chanceToSpawn(100, 40, random), 40, 255);
		this.addOreSpawn(Basic.siltstone, world, random, x, z, 16, 16, veinsize, chanceToSpawn(100, 40, random), 25, 60);
		
		//add ores
		this.addOreSpawn(Basic.titaniumOre, world, random, x, z, 16, 16, 8, 1, 3, 20);
		
		//add watermelonstone in specific biomes
		if(biomeGenBase.biomeName == "ocean" || biomeGenBase.biomeName == "jungle" || biomeGenBase.biomeName == "jungleHills"){
			this.addOreSpawn(Basic.watermelonStone, world, random, x, z, 16, 16, 4, 3, 5, 255);
		}
		
		
	}

	private void generateNether(World world, Random random, int x, int z) {
		
	}

	/**
     * Adds an Ore Spawn to Minecraft. Simply register all Ores to spawn with this method in your Generation method in your IWorldGeneration extending Class
     *
     * @param The Block to spawn
     * @param The World to spawn in
     * @param A Random object for retrieving random positions within the world to spawn the Block
     * @param An int for passing the X-Coordinate for the Generation method
     * @param An int for passing the Z-Coordinate for the Generation method
     * @param An int for setting the maximum X-Coordinate values for spawning on the X-Axis on a Per-Chunk basis
     * @param An int for setting the maximum Z-Coordinate values for spawning on the Z-Axis on a Per-Chunk basis
     * @param An int for setting the maximum size of a vein
     * @param An int for the Number of chances available for the Block to spawn per-chunk
     * @param An int for the minimum Y-Coordinate height at which this block may spawn
     * @param An int for the maximum Y-Coordinate height at which this block may spawn
     **/
    public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
    {
          int maxPossY = minY + (maxY - 1);
          assert maxY > minY: "The maximum Y must be greater than the Minimum Y";
          assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
          assert minY > 0: "addOreSpawn: The Minimum Y must be greater than 0";
          assert maxY < 256 && maxY > 0: "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
          assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
         
          int diffBtwnMinMaxY = maxY - minY;
          for(int x = 0; x < chancesToSpawn; x++)
          {
                 int posX = blockXPos + random.nextInt(maxX);
                 int posY = minY + random.nextInt(diffBtwnMinMaxY);
                 int posZ = blockZPos + random.nextInt(maxZ);
                 (new WorldGenMinable(block.blockID, maxVeinSize)).generate(world, random, posX, posY, posZ);
          }
    }
    
    public int chanceToSpawn(int max, int min, Random random){
    	if(random.nextInt(max) < min){
    		return 1;
    	} else {
    		return 0;
    	}
    }

}
