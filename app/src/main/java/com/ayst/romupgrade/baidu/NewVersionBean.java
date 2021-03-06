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

package com.ayst.romupgrade.baidu;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class NewVersionBean implements Serializable {

    /**
     * package : com.android.system
     * version : 1.0.51.0
     * info : infos
     * taskid : 60900
     * detail : {}
     * filesize : 514044607
     * updtype : 1
     */

    @SerializedName("package")
    private String packageX;
    @SerializedName("version")
    private String version;
    @SerializedName("info")
    private String info;
    @SerializedName("taskid")
    private String taskid;
    @SerializedName("detail")
    private String detail;
    @SerializedName("filesize")
    private int filesize;
    @SerializedName("updtype")
    private int updtype;

    public String getPackageX() {
        return packageX;
    }

    public void setPackageX(String packageX) {
        this.packageX = packageX;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getFilesize() {
        return filesize;
    }

    public void setFilesize(int filesize) {
        this.filesize = filesize;
    }

    public int getUpdtype() {
        return updtype;
    }

    public void setUpdtype(int updtype) {
        this.updtype = updtype;
    }
}
