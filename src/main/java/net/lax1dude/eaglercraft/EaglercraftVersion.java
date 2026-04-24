package net.lax1dude.eaglercraft;

public class EaglercraftVersion {

	//////////////////////////////////////////////////////////////////////

	/// Customize these to fit your fork:

	public static final String projectForkName = "Eaglercraft 1.13.2";
	public static final String projectForkVersion = "u1";
	public static final String projectForkVendor = "threefold";

	public static final String projectForkURL = "https://github.com/yeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee/eaglercraft-1.13/";

	//////////////////////////////////////////////////////////////////////

	public static final String projectOriginName = "Eaglercraft 1.13.2";
	public static final String projectOriginAuthor = "threefold";
	public static final String projectOriginVersion = "u1";

	public static final String projectOriginURL = "https://github.com/yeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee/eaglercraft-1.13/";

	// EPK Version Identifier

	public static final String EPKVersionIdentifier = null; // Set to null to disable EPK version check

	// Client brand identification system configuration

	public static final EaglercraftUUID clientBrandUUID = EagUtils.makeClientBrandUUID(projectForkName);

	public static final EaglercraftUUID legacyClientUUIDInSharedWorld = EagUtils
			.makeClientBrandUUIDLegacy(projectOriginName);

	// Miscellaneous variables:

	public static final String mainMenuStringA = "Minecraft 1.12";
	public static final String mainMenuStringB = projectOriginName + " " + projectOriginVersion;
	public static final String mainMenuStringC = "";
	public static final String mainMenuStringD = "Resources Copyright Mojang AB";

	public static final String mainMenuStringE = projectForkName + " " + projectForkVersion;
	public static final String mainMenuStringF = "Made by " + projectForkVendor;

	public static final long demoWorldSeed = (long) "North Carolina".hashCode();

	public static final boolean mainMenuEnableGithubButton = false;

	public static final boolean forceDemoMode = false;

	public static final String localStorageNamespace = "_eaglercraft_1.12";

}
