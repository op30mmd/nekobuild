package tw.nekomimi.nekogram;

import tw.nekomimi.nekogram.helpers.UserHelper;

public class Extra {
    // Secrets
    public static final int APP_ID = 12345;
    public static final String APP_HASH = "dummy_hash";
    public static final String PLAYSTORE_APP_URL = "https://play.google.com/store/apps/details?id=tw.nekomimi.nekogram";
    public static final boolean FORCE_ANALYTICS = false;

    // Missing Strings
    public static final String TWPIC_BOT_USERNAME = "dummy_bot";
    public static final String TLV_URL = "https://dummy.url";

    // Helper Methods
    public static boolean isDirectApp() { return false; }
    public static boolean isTrustedBot(long botId) { return false; }

    // --- FIX 1: UserInfoBot (Class) ---
    public static UserHelper.UserInfoBot getUserInfoBot(boolean fallback) {
        return new UserHelper.UserInfoBot() {
            
            // ERROR FIXED: Implement abstract method with correct return type
            @Override
            public UserHelper.ParsedPeer parsePeer(String[] lines) {
                return null; // Return null to satisfy the compiler
            }

            @Override
            public long getId() { return 12345L; }
            
            @Override
            public String getUsername() { return "dummy_user_bot"; }
        };
    }

    // --- FIX 2: BotInfo (Interface) ---
    public static UserHelper.BotInfo getHelperBot() {
        return new UserHelper.BotInfo() {
            @Override
            public String getUsername() { return "dummy_helper_bot"; }

            @Override
            public long getId() { return 12345L; }
        };
    }
}
