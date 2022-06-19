package com.example.testovoe.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileInfoService {

    void saveFile(MultipartFile file) throws IOException;
}
