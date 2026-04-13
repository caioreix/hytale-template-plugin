package com.example.templateplugin;

import com.example.templateplugin.commands.TemplateCommand;
import com.hypixel.hytale.logger.HytaleLogger;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;

import javax.annotation.Nonnull;

public class TemplatePlugin extends JavaPlugin {

    private static final HytaleLogger LOGGER = HytaleLogger.forEnclosingClass();

    public TemplatePlugin(@Nonnull JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        registerCommands();
    }

    private void registerCommands() {
        this.getCommandRegistry().registerCommand(new TemplateCommand());
    }
}
