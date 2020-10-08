package com.sys.security.controller.file;

import com.sys.security.common.util.FileUtil;
import com.sys.security.common.vo.ResultVO;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 当我们需要实现上传文件的时候, 为了安全起见, 我们需要判断上传文件的格式, 防止将病毒木马等有害的文件上传到服务器上.
 * 判断文件类型的三种方式
 *      通过文件后缀名，这个方法只要修改后缀名就可以了
 *      通过Content-Type判断，但是Content-Type取决于文件类型, 文件类型取决于文件扩展名, 所以改变了文件扩展名就改变了Content-Type
 *      通过文件头判断文件, 即使文件扩展名改变了文件头也不会改变
 */
@RestController
@RequestMapping("/file")
@Api(tags = "文件上传")
public class FileController {

    private static final Logger logger = LoggerFactory.getLogger(FileController.class);

    @PostMapping("/upload")
    @ResponseBody
    public ResultVO<?> upload(@RequestParam(value = "file") MultipartFile[] files){

        if(files == null || files.length <= 0){

            return ResultVO.error("上传失败，请选择文件");
        }

        String filePath = "F:/temp/";

        for(MultipartFile file : files){

            String fileName = file.getOriginalFilename();

            String contentType = file.getContentType();

            String newName = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));

            logger.info(fileName + "|" + contentType);

            try {

                InputStream inputStream = file.getInputStream();

                String head = FileUtil.getFileHeader(file.getBytes());

                File dest = new File(filePath + newName);

                file.transferTo(dest);

                logger.info("上传成功 : " + fileName);
            } catch (IOException e) {

                logger.error("上传失败", e);

                return ResultVO.error("上传失败");
            }

        }

        return ResultVO.success("上传成功");
    }
}
