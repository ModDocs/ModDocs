package com.mcmoddocs.moddocs;

import com.mcmoddocs.moddocs.core.proxy.CommonProxy;
import com.mcmoddocs.moddocs.lib.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class ModDocs {

	@Mod.Instance(Reference.MOD_ID)
	public static ModDocs instance;

	@SidedProxy(clientSide = "com.mcmoddocs.moddocs.core.proxy.ClientProxy", serverSide = "com.mcmoddocs.moddocs.core.proxy.ServerProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		proxy.preInit();
	}

	@Mod.EventHandler
	public static void init(FMLInitializationEvent event) {
		proxy.init();
	}

	@Mod.EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		proxy.postInit();
	}
}