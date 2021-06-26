package com.bugunneyesem;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


@CrossOrigin("*")
@RestController
public class Controller {





    @PostMapping("/filters")
    public ResponseEntity<String> applyFilters(@RequestBody String requestBody){

        YemekYaratici yaratici = new YemekYaratici();
        String[] filterList;
        String params = requestBody.toString();
        String filters = params.substring(params.indexOf("filters") + 10, params.indexOf(",") - 1);
        String count = params.substring(params.indexOf("count") + 8, params.indexOf("}") - 1);
        System.out.println("Filters: " + filters);
        System.out.println("Count: " + count);
        if(filters == null){
            filterList = new String[0];
        }else{
            filterList = filters.split("-");
        }
        ArrayList<Yemek> yemekListesi = new ArrayList<Yemek>();
        for (Yemek yemek: yaratici.yemekListesi){
            boolean icerikVarMi = false;
            for (String filter: filterList){
                if (yemek.icerikVar(filter) && !yemek.icerikVar("tatlı") && !yemek.icerikVar("içecek")){
                    icerikVarMi = true;
                }
            }
            if (icerikVarMi){
                yemekListesi.add(yemek);
            }
        }
        Collections.shuffle(yemekListesi);
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < Integer.parseInt(count) && i < yemekListesi.size(); i++){
            s.append(yemekListesi.get(i).getAd());
            s.append("/");
        }
        System.out.println("Results: " + s.toString());
        try{
            return ResponseEntity.ok(s.toString().substring(0,s.toString().length()-1));
        }
        catch (Exception e){
            return ResponseEntity.ok("");
        }
    }

    @PostMapping("/filterstatli")
    public ResponseEntity<String> applyFiltersTatli(@RequestBody String requestBody){

        YemekYaratici yaratici = new YemekYaratici();
        String[] filterList;
        String params = requestBody.toString();
        String filters = params.substring(params.indexOf("filters") + 10, params.indexOf(",") - 1);
        String count = params.substring(params.indexOf("count") + 8, params.indexOf("}") - 1);
        System.out.println("Filters: " + filters);
        System.out.println("Count: " + count);
        if(filters == null){
            filterList = new String[0];
        }else{
            filterList = filters.split("-");
        }
        ArrayList<Yemek> yemekListesi = new ArrayList<Yemek>();
        for (Yemek yemek: yaratici.yemekListesi){
            boolean icerikVarMi = false;
            for (String filter: filterList){
                if (yemek.icerikVar(filter) && yemek.icerikVar("tatlı") && !yemek.icerikVar("içecek")){
                    icerikVarMi = true;
                }
            }
            if (icerikVarMi){
                yemekListesi.add(yemek);
            }
        }
        Collections.shuffle(yemekListesi);
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < Integer.parseInt(count) && i < yemekListesi.size(); i++){
            s.append(yemekListesi.get(i).getAd());
            s.append("/");
        }
        System.out.println("Results: " + s.toString());
        try{
            return ResponseEntity.ok(s.toString().substring(0,s.toString().length()-1));
        }
        catch (Exception e){
            return ResponseEntity.ok("");
        }
    }

    @PostMapping("/filtersicecek")
    public ResponseEntity<String> applyFiltersIcecek(@RequestBody String requestBody){

        YemekYaratici yaratici = new YemekYaratici();
        String[] filterList;
        String params = requestBody.toString();
        String filters = params.substring(params.indexOf("filters") + 10, params.indexOf(",") - 1);
        String count = params.substring(params.indexOf("count") + 8, params.indexOf("}") - 1);
        System.out.println("Filters: " + filters);
        System.out.println("Count: " + count);
        if(filters == null){
            filterList = new String[0];
        }else{
            filterList = filters.split("-");
        }
        ArrayList<Yemek> yemekListesi = new ArrayList<Yemek>();
        for (Yemek yemek: yaratici.yemekListesi){
            boolean icerikVarMi = false;
            for (String filter: filterList){
                if (yemek.icerikVar(filter) && !yemek.icerikVar("tatlı") && yemek.icerikVar("içecek")){
                    icerikVarMi = true;
                }
            }
            if (icerikVarMi){
                yemekListesi.add(yemek);
            }
        }
        Collections.shuffle(yemekListesi);
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < Integer.parseInt(count) && i < yemekListesi.size(); i++){
            s.append(yemekListesi.get(i).getAd());
            s.append("/");
        }
        System.out.println("Results: " + s.toString());
        try{
            return ResponseEntity.ok(s.toString().substring(0,s.toString().length()-1));
        }
        catch (Exception e){
            return ResponseEntity.ok("");
        }
    }

    @PostMapping("/geribildirim")
    public ResponseEntity<String> getFeedback (@RequestBody String requestBody){
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("feedback.txt", true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            String name = requestBody.substring(requestBody.indexOf("name: ") + 6, requestBody.indexOf("feedback") - 1);
            pw.println(name);
            pw.println();
            String feedback = requestBody.substring(requestBody.indexOf("feedback:") + 10, requestBody.length()-2);
            pw.println(feedback);
            pw.println();
            System.out.println("Data Successfully appended into file");
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                pw.close();
                bw.close();
                fw.close();
            } catch (IOException io) { } }



        return ResponseEntity.ok("Success");
    }

    @PostMapping("/test")
    public ResponseEntity<String> test (@RequestBody String requestBody){
        return ResponseEntity.ok(requestBody);
    }


/*
    @PostMapping("/uploadFile")
    public UploadFileResponse uploadFile(@RequestParam("file") MultipartFile file) {
        String fileName = fileStorageService.storeFile(file);

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/downloadFile/")
                .path(fileName)
                .toUriString();

        return new UploadFileResponse(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
    }


    @GetMapping("/downloadFile/{fileName:.+}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
        // Load file as Resource
        Resource resource = fileStorageService.loadFileAsResource(fileName);

        // Try to determine file's content type
        String contentType = null;
        try {
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        } catch (IOException ex) {
            logger.info("Could not determine file type.");
        }

        // Fallback to the default content type if type could not be determined
        if(contentType == null) {
            contentType = "application/octet-stream";
        }

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }
*/
}
