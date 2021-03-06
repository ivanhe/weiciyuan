package org.qii.weiciyuan.support.settinghelper;

import android.content.Context;
import org.qii.weiciyuan.R;
import org.qii.weiciyuan.support.utils.GlobalContext;
import org.qii.weiciyuan.ui.preference.SettingActivity;

/**
 * User: qii
 * Date: 12-11-28
 */
public class SettingUtility {

    private static Context getContext() {
        return GlobalContext.getInstance();
    }

    public static boolean isEnableFilter() {
        return SettingHelper.getSharedPreferences(getContext(), SettingActivity.FILTER, false);
    }


    public static int getFontSize() {
        String value = SettingHelper.getSharedPreferences(getContext(), SettingActivity.FONT_SIZE, "15");
        return Integer.valueOf(value);
    }

    public static int getAppTheme() {
        String value = SettingHelper.getSharedPreferences(getContext(), SettingActivity.THEME, "1");

        switch (Integer.valueOf(value)) {
            case 1:
                return R.style.AppTheme_Four;

            case 2:
                return R.style.AppTheme_Pure_Black;

            default:
                return R.style.AppTheme_Four;

        }
    }


    public static boolean isEnablePic() {
        return !SettingHelper.getSharedPreferences(getContext(), SettingActivity.DISABLE_DOWNLOAD_AVATAR_PIC, false);
    }

    public static boolean getEnableBigPic() {
        return SettingHelper.getSharedPreferences(getContext(), SettingActivity.SHOW_BIG_PIC, false);
    }

    public static boolean getEnableCommentRepostListAvatar() {
        return !SettingHelper.getSharedPreferences(getContext(), SettingActivity.CLOSE_COMMENT_AND_REPOST_AVATAR, false);
    }


    public static boolean getEnableAutoRefresh() {
        return SettingHelper.getSharedPreferences(getContext(), SettingActivity.AUTO_REFRESH, false);
    }


    public static boolean getEnableBigAvatar() {
        return SettingHelper.getSharedPreferences(getContext(), SettingActivity.SHOW_BIG_AVATAR, false);
    }

    public static boolean getEnableSound() {
        return SettingHelper.getSharedPreferences(getContext(), SettingActivity.SOUND, true);
    }

    public static void setEnableBigPic(boolean enableBigPic) {
        SettingHelper.setEditor(getContext(), SettingActivity.SHOW_BIG_PIC, enableBigPic);
    }


    public static void setEnableBigAvatar(boolean enableBigAvatar) {
        SettingHelper.setEditor(getContext(), SettingActivity.SHOW_BIG_AVATAR, enableBigAvatar);
    }

    public static void setEnableFilter(boolean isChecked) {
        SettingHelper.setEditor(getContext(), SettingActivity.FILTER, isChecked);
    }
}
