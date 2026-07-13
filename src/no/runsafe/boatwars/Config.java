package no.runsafe.boatwars;

import no.runsafe.framework.api.IConfiguration;
import no.runsafe.framework.api.event.plugin.IConfigurationChanged;
import no.runsafe.worldguardbridge.IRegionControl;

public class Config implements IConfigurationChanged
{
	public Config(IRegionControl worldGuard)
	{
		Config.worldGuard = worldGuard;
	}

	@Overried
	public void OnConfigurationChanged(IConfiguration config)
	{
		// update configurations
	}

	private static IRegionControl worldGuard;
}