package no.runsafe.boatwars;

import no.runsafe.framework.RunsafeConfigurablePlugin;
import no.runsafe.framework.api.log.IDebug;
import no.runsafe.framework.features.Events;
import no.runsafe.framework.features.Commands;
import no.runsafe.framework.features.Events;

public class Boondries extends RunsafeConfigurablePlugin
{
	public static IDebug Debugger = null;

	@Override
	protected void pluginSetup()
	{
		Debugger = getComponent(IDebug.class);

		// Framework features
		addComponent(Commands.class);
		addComponent(Events.class);

		// Plugin components
		addComponent(Config.class);
	}
}