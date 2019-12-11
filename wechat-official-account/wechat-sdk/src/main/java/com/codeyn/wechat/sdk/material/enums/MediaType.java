/**
 * Copyright (c) 2016 Arthur Chan 陈 (codeyn@163.com).
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the “Software”), to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and
 * to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO
 * THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */
package com.codeyn.wechat.sdk.material.enums;

/**
 * 媒体文件类型
 * 
 * @author Arthur
 */
public enum MediaType {

    IMAGE("image", "图片"),

    VOICE("voice", "语音"),

    VIDEO("video", "视频");

    private MediaType(String flag, String title) {
        this.flag = flag;
        this.title = title;
    }

    private String flag;
    private String title;

    public String getFlag() {
        return flag;
    }

    public String getTitle() {
        return title;
    }

    public static MediaType get(String flag) {
        for (MediaType type : MediaType.values()) {
            if (type.flag.equals(flag)) {
                return type;
            }
        }
        return null;
    }

}
