package com.sys.security.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Arrays;

public class FileUtil {

    private static final Logger logger = LoggerFactory.getLogger(FileUtil.class);

    /**
     * 获取文件头部前四个字节
     * @param bytes
     * @return
     */
    public static String getFileHeader(byte[] bytes){
        String header = null;
        try{
            header = bytesToHexString(bytes);//转成十六进制
            header = header.toUpperCase();//转大写
        }catch(Exception e){
            e.printStackTrace();
        }

        logger.info(header);

        return header;
    }

    /**
     * 将十进制byte数组转成16进制
     * @param bArr
     * @return
     */
    private static String bytesToHexString(byte[] bArr) {
        StringBuffer sb = new StringBuffer(bArr.length);
        String sTmp;

        for (int i = 0; i < bArr.length; i++) {
            sTmp = Integer.toHexString(0xFF & bArr[i]);
            if (sTmp.length() < 2)
                sb.append(0);
            sb.append(sTmp.toUpperCase());
        }
        return sb.toString();
    }


}
