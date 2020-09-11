package com.shuofang.project1;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Project1.MODID)
public class Project1 {
	public static final String MODID = "project1";
	public static final String NAME = "shuofang";
	public static final String VERSION = "0.0.1";

	
	@Instance(MODID)  
	public static Project1 instance;     
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{   
	          
	}
	@EventHandler
	 public void init(FMLInitializationEvent event)
	{   
	    
	}    
	 @EventHandler
	public void postInit(FMLPostInitializationEvent event)
	 {   
	  
	 }
}
