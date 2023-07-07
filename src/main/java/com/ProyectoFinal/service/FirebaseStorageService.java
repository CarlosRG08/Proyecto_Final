package com.ProyectoFinal.service;

import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {
    public String cargaImagen (MultipartFile archivoLocalCliente, String carpeta, Long id);
    
    final String BucketName = "clinicasantaisabel-15a3e.appspot.com";
    final String rutaSuperiorStorage = "ProyectoFinal";
    final String rutaJsonFile = "firebase";
    final String archivoJsonFile = "clinicasantaisabel-15a3e-firebase-adminsdk-wb2cg-45d9cf1bc0";
}
//ID:clinicasantaisabel-15a3e
//storageBucket:clinicasantaisabel-15a3e.appspot.com