package dmmt.dp.main.creativetab;

import dmmt.dp.main.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class tabDPItems extends CreativeTabs {

	public tabDPItems(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	public Item getTabIconItem() {
		return Main.tabDPItemsPlaceholder;
	}

}
