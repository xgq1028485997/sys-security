package com.sys.security.common.enums;

import org.springframework.util.StringUtils;

public enum FileTypeEnum {

    JPG(".JPG", "FFD8FFE0", "image/jpeg"),
    TXT(".TXT","","text/plain"),
    PNG(".PNG","89504E47","image/png"),
    DOCX(".DOCX","504","application/x-msdownload"),
    ZIP(".ZIP", "868E019C","application/zip"),

    EXE(".EXE","4D5A9000","application/x-msdownload"),
    DLL(".DLL","4D5A9000","application/x-msdownload"),
    BAT(".BAT","52464D46","application/octet-stream");

    private String type;
    private String code;
    private String contentType;

    FileTypeEnum(String type, String code, String contentType) {
        this.type = type;
        this.code = code;
        this.contentType = contentType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public static boolean isAllow(String name){

        if(StringUtils.isEmpty(name)){

            return false;
        }

        for (FileTypeEnum fileTypeEnum : FileTypeEnum.values()) {

            if(StringUtils.endsWithIgnoreCase(name, fileTypeEnum.getType())){

                return true;
            }
        }

        return false;
    }
}
