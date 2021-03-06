/*
 * Copyright(c) 2020 Bob Shen <ayst.shen@foxmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ayst.romupgrade.config;

import android.util.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * Parse the config.ini configuration file in the U disk
 * Created by ayst.shen@foxmail.com on 2018/5/21.
 */
public class UsbConfigManager {
    private final static String TAG = "UsbConfigManager";

    public final static String UPDATE_TYPE = "UPDATE_TYPE";

    private File mConfigFile;
    private Properties mCfgProperties = null;
    private int mUpdateType = -1;

    public UsbConfigManager(File configFile) {
        mConfigFile = configFile;
        if (mConfigFile.exists()) {
            getProperties();
        }
    }

    private Properties getProperties() {
        if (mCfgProperties != null) {
            return mCfgProperties;
        }
        mCfgProperties = new Properties();
        try {
            InputStream is = new FileInputStream(mConfigFile);
            mCfgProperties.load(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mCfgProperties;
    }

    /**
     * Get upgrade type
     *
     * @return 1: recommend, 2: silent
     */
    public int getUpdateType() {
        if (-1 == mUpdateType) {
            Properties properties = getProperties();
            String updateTypeStr = properties.getProperty(UPDATE_TYPE, "1");
            try {
                mUpdateType = Integer.parseInt(updateTypeStr);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            Log.i(TAG, "getUpdateType, value:" + mUpdateType);
        }

        return mUpdateType;
    }
}
