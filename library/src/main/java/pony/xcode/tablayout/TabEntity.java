package pony.xcode.tablayout;

import androidx.annotation.DrawableRes;

public class TabEntity implements CustomTabEntity {
    private String mTabTitle;
    @DrawableRes
    private int mTabSelectedIcon;
    @DrawableRes
    private int mTabUnselectedIcon;

    public TabEntity(String tabTitle) {
        this(tabTitle, 0, 0);
    }

    public TabEntity(String tabTitle, int tabSelectedIcon, int tabUnselectedIcon) {
        this.mTabTitle = tabTitle;
        this.mTabSelectedIcon = tabSelectedIcon;
        this.mTabUnselectedIcon = tabUnselectedIcon;
    }

    @Override
    public String getTabTitle() {
        return mTabTitle;
    }

    @Override
    public int getTabSelectedIcon() {
        return mTabSelectedIcon;
    }

    @Override
    public int getTabUnselectedIcon() {
        return mTabUnselectedIcon;
    }
}
