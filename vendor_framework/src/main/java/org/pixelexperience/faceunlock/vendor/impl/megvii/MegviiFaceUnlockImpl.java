package org.pixelexperience.faceunlock.vendor.impl.megvii;

import com.megvii.facepp.sdk.Lite;

public class MegviiFaceUnlockImpl extends Lite {
    private static MegviiFaceUnlockImpl sInstance;

    private MegviiFaceUnlockImpl() {
    }
    
    public static MegviiFaceUnlockImpl getInstance() {
        if (sInstance == null) {
            sInstance = new MegviiFaceUnlockImpl();
        }
        return sInstance;
    }
}
