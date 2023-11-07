package controllers.file;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/file/upload")
public class FileController {

    @Value("${file.upload.path}")
    private String fileUploadPath;

    @GetMapping
    public String upload() {
        return "file/upload";
    }

    @PostMapping
    public String uploadPs(@RequestParam("file2") MultipartFile[] files) {
        for (MultipartFile file : files) {
            File path = new File(fileUploadPath + file.getOriginalFilename());

            try {
                file.transferTo(path);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return "file/upload";
    }
}
