package com.leaning.client;

import com.leaning.dto.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@FeignClient(value = "skill-enhancer-boot-client",url = "${skill-enhancer-boot}")
public interface SkillEnhancerBootClient {
    //student controller mapping

    @GetMapping("/student")
    List<StudentModel> getAllRecords();
    @GetMapping("/student/{id}")
    StudentModel getRecordById(@PathVariable Long id);
    @GetMapping("/student/get-records")
    List<StudentModel> getAllRecords(@RequestParam(value = "count", required = false, defaultValue = "0")
                                            int count, @RequestParam(value = "sortBy", required = false, defaultValue = "") String sortBy);
    @PostMapping("/student")
    StudentModel save(@RequestBody StudentModel studentModel);

    @PostMapping("/student/all")
    List<StudentModel> saveAll(@RequestBody List<StudentModel> studentModelList);


    @DeleteMapping("/student/{id}")
    void deleteRecordById(@PathVariable Long id);

    @PostMapping(value = "/student/upload", consumes = "multipart/form-data")
    String saveExcelFile(@RequestPart("file") MultipartFile file);

    @PostMapping("/student/email")
    void emailSender();

    @PostMapping("/student/email/attachment")
    void sendEmailWithAttachment();

    // Batch mapping

    @GetMapping("/batch")
    List<BatchModel> getAllRecordsBatch();

    @GetMapping("/batch/get-records")
    List<BatchModel> getAllRecordsBatch(@RequestParam(value = "count" ,required = false , defaultValue = "0")
                                          int count,@RequestParam(value = "sortBy", required = false, defaultValue = "") String sortBy) ;
    @PostMapping("/batch")
    BatchModel save(@RequestBody BatchModel batchModel);

    @PostMapping("/batch/all")
    List<BatchModel> saveAllBatch(@RequestBody List<BatchModel> batchModelList);
    @PutMapping("/batch/{id}")
    BatchModel updateById(@PathVariable Long id, @RequestBody BatchModel batchModel);

    @GetMapping("/batch/{id}")
    BatchModel getRecordByIdBatch(@PathVariable Long id);

    @DeleteMapping("/batch/{id}")
    void deleteRecordByIdBatch(@PathVariable Long id);

    @PostMapping(value = "/batch/upload", consumes = "multipart/form-data")
    String saveExcelFileBatch(@RequestPart ("file") MultipartFile file);


    // course mapping
    @GetMapping("/course")
    List<CourseModel> getAllRecordsCourse();

    @GetMapping("/course/get-records")
    List<CourseModel> getAllRecordsCourse(@RequestParam(value = "count" ,required = false , defaultValue = "0")
                                          int count,@RequestParam(value = "sortBy", required = false, defaultValue = "") String sortBy) ;
    @PostMapping("/course")
    CourseModel save(@RequestBody CourseModel courseModel);
    @PostMapping("/course/all")
    List<CourseModel> saveAllCourse(@RequestBody List<CourseModel> courseModelList);
    @PutMapping("/course/{id}")
    CourseModel updateById(@PathVariable Long id, @RequestBody CourseModel courseModel);

    @GetMapping("/course/{id}")
    CourseModel getRecordByIdCourse(@PathVariable Long id);

    @DeleteMapping("/course/{id}")
    void deleteRecordByIdCourse(@PathVariable Long id);
    @PostMapping(value = "/course/upload", consumes = "multipart/form-data")
    String saveExcelFileCourse(@RequestPart ("file") MultipartFile file);

    // StudentBatch Mapping

    @GetMapping("/studentBatch")
    List<StudentBatchModel> getAllStudentStudentBatch();

    @GetMapping("/studentBatch/get-records")
    List<StudentBatchModel> getAllRecordsStudentBatch(@RequestParam(value = "count" ,required = false , defaultValue = "0")
                                                 int count, @RequestParam(value = "sortBy", required = false, defaultValue = "") String sortBy);
    @PostMapping("/studentBatch")
    StudentBatchModel save(@RequestBody StudentBatchModel studentBatchModel);
    @PostMapping("/studentBatch/all")
    List<StudentBatchModel> saveAllStudentBatch(@RequestBody List<StudentBatchModel> studentBatchModelList);
    @PutMapping("/studentBatch/{id}")
    StudentBatchModel updateById(@PathVariable Long id, @RequestBody StudentBatchModel studentBatchModel);
    @GetMapping("/studentBatch/{id}")
    StudentBatchModel getRecordByIdStudentBatch(@PathVariable Long id);

    @DeleteMapping("/studentBatch/{id}")
    void deleteRecordByIdStudentBatch(@PathVariable Long id);

    @PostMapping(value = "/studentBatch/upload", consumes = "multipart/form-data")
    String saveExcelFileStudentBatch(@RequestPart ("file") MultipartFile file);

    // Trainer Mapping
    @GetMapping("/trainer")
    List<TrainerModel> getAllRecordsTrainer();
    @GetMapping("/trainer/get-records")
    List<TrainerModel> getAllRecordsTrainer(@RequestParam(value = "count" ,required = false , defaultValue = "0")
                                            int count, @RequestParam(value = "sortBy", required = false, defaultValue = "") String sortBy);

    @PostMapping("/trainer")
    TrainerModel save(@RequestBody TrainerModel trainerModel);

    @PostMapping("/trainer/all")
    List<TrainerModel> saveAllTrainer(@RequestBody List<TrainerModel> trainerModelList);

    @PutMapping("/trainer/{id}")
    TrainerModel updateById(@PathVariable Long id, @RequestBody TrainerModel trainerModel);

    @GetMapping("/trainer/{id}")
    TrainerModel getRecordByIdTrainer(@PathVariable Long id);

    @DeleteMapping("/trainer/{id}")
    void deleteRecordByIdTrainer(@PathVariable Long id);

    @PostMapping(value = "/trainer/upload", consumes = "multipart/form-data")
    String saveExcelFileTrainer(@RequestPart ("file") MultipartFile file);

    // TimeSlot Mapping

    @GetMapping("/timeSlot")
    List<TimeSlotModel> getAllRecordsTimeSlot();

    @GetMapping("/timeSlot/get-records")
    List<TimeSlotModel> getAllRecordsTimeSlot(@RequestParam(value = "count" ,required = false , defaultValue = "0")
                                             int count,@RequestParam(value = "sortBy", required = false, defaultValue = "") String sortBy);
    @PostMapping("/timeSlot")
    TimeSlotModel save(@RequestBody TimeSlotModel timeSlotModel);

    @PostMapping("/timeSlot/all")
    List<TimeSlotModel> saveAllTimeSlot(@RequestBody List<TimeSlotModel> timeSlotModelList);
    @PutMapping("/timeSlot/{id}")
    TimeSlotModel updateById(@PathVariable Long id, @RequestBody TimeSlotModel timeSlotModel);
    @GetMapping("/timeSlot/{id}")
    TimeSlotModel getRecordByIdTimeSlot(@PathVariable Long id);

    @DeleteMapping("/timeSlot/{id}")
    void deleteRecordByIdTimeSlot(@PathVariable Long id);
    @PostMapping(value = "/timeSlot/upload", consumes = "multipart/form-data")
    String saveExcelFileTimeSlot(@RequestPart ("file") MultipartFile file);
}
