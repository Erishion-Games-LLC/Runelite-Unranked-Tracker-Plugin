package com.erishiongamesllc.unrankedkctracker;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(UnrankedKcTrackerPlugin.CONFIG_GROUP)
public interface UnrankedKcTrackerConfig extends Config
{
	@ConfigItem(
		keyName = "enableKCLookUp",
		name = "Enable",
		description = "Enable KC Look up"
	)
	default boolean enableKCLookUp()
	{
		return true;
	}
}
