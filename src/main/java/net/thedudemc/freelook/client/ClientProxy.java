package net.thedudemc.freelook.client;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy {

	public static KeyBinding keyBinding;

	public static void init() {
		keyBinding = new KeyBinding("key.freelook.desc", Keyboard.KEY_LMENU, "key.freelook.category");
		ClientRegistry.registerKeyBinding(keyBinding);
		
	}

}