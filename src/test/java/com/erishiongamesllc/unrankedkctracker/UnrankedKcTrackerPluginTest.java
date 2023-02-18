package com.erishiongamesllc.unrankedkctracker;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class UnrankedKcTrackerPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(UnrankedKcTrackerPlugin.class);
		RuneLite.main(args);
	}
}