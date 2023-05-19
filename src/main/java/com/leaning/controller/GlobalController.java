package com.leaning.controller;

import com.leaning.client.SkillEnhancerBootClient;
import com.leaning.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class GlobalController {
    private final SkillEnhancerBootClient skillEnhancerBootClient;

    //student controller mapping

    @GetMapping("/student")
    List<StudentModel> getAllRecords() {
        return skillEnhancerBootClient.getAllRecords();
    }

    @GetMapping("/student/{id}")
    StudentModel getRecordById(@PathVariable Long id) {
        return skillEnhancerBootClient.getRecordById(id);
    }

    @GetMapping("/student/get-records")
    List<StudentModel> getAllRecords(@RequestParam(value = "count", required = false, defaultValue = "0")
                                     int count, @RequestParam(value = "sortBy", required = false, defaultValue = "") String sortBy) {
        return skillEnhancerBootClient.getAllRecords(count, sortBy);
    }

    @PostMapping("/student")
    StudentModel save(@RequestBody StudentModel studentModel) {
        return skillEnhancerBootClient.save(studentModel);
    }

    @PostMapping("/student/all")
    public List<StudentModel> saveAll(@RequestBody List<StudentModel> studentModelList) {
        return skillEnhancerBootClient.saveAll(studentModelList);
    }

    @DeleteMapping("/student/{id}")
    void deleteRecordById(@PathVariable Long id) {
        skillEnhancerBootClient.deleteRecordById(id);
    }

    @PostMapping(value = "/student/upload", consumes = "multipart/form-data")
    String uploadExcelFile(@RequestPart("file") MultipartFile file) {
        skillEnhancerBootClient.saveExcelFile(file);
        return "file upload successfully";
    }

    @PostMapping("/student/email")
    void emailSender() {
        skillEnhancerBootClient.emailSender();
    }

    @PostMapping("/student/email/attachment")
    void sendEmailWithAttachment() {
        skillEnhancerBootClient.sendEmailWithAttachment();
    }

    // Batch Controller Mapping
    @GetMapping("/batch")
    List<BatchModel> getAllRecordsBatch() {
        return skillEnhancerBootClient.getAllRecordsBatch();
    }

    @GetMapping("/batch/get-records")
    List<BatchModel> getAllRecordsBatch(@RequestParam(value = "count", required = false, defaultValue = "0")
                                        int count, @RequestParam(value = "sortBy", required = false,
            defaultValue = "") String sortBy) {
        return skillEnhancerBootClient.getAllRecordsBatch(count, sortBy);
    }

    @PostMapping("/batch")
    public BatchModel save(@RequestBody BatchModel batchModel) {
        return skillEnhancerBootClient.save(batchModel);
    }

    @PostMapping("/batch/all")
    List<BatchModel> saveAllBatch(@RequestBody List<BatchModel> batchModelList) {
        return skillEnhancerBootClient.saveAllBatch(batchModelList);
    }

    @PutMapping("/batch/{id}")
    BatchModel updateById(@PathVariable Long id, @RequestBody BatchModel batchModel) {
        return skillEnhancerBootClient.updateById(id, batchModel);
    }

    @GetMapping("/batch/{id}")
    BatchModel getRecordByIdBatch(@PathVariable Long id) {
        return skillEnhancerBootClient.getRecordByIdBatch(id);
    }

    @DeleteMapping("/batch/{id}")
    void deleteRecordByIdBatch(@PathVariable Long id) {
        skillEnhancerBootClient.getRecordByIdBatch(id);
    }

    @PostMapping(value = "/batch/upload", consumes = "multipart/form-data")
    public String uploadExcelFileBatch(@RequestPart("file") MultipartFile file) {
        skillEnhancerBootClient.saveExcelFileBatch(file);
        return "file upload successfully";
    }

    // course controller mapping
    @GetMapping("/course")
    List<CourseModel> getAllRecordsCourse() {
        return skillEnhancerBootClient.getAllRecordsCourse();
    }

    @GetMapping("/course/get-records")
    List<CourseModel> getAllRecordsCourse(@RequestParam(value = "count", required = false, defaultValue = "0")
                                          int count, @RequestParam(value = "sortBy", required = false, defaultValue = "") String sortBy) {
        return skillEnhancerBootClient.getAllRecordsCourse(count, sortBy);
    }

    @PostMapping("/course")
    CourseModel save(@RequestBody CourseModel courseModel) {
        return skillEnhancerBootClient.save(courseModel);
    }

    @PostMapping("/course/all")
    List<CourseModel> saveAllCourse(@RequestBody List<CourseModel> courseModelList) {
        return skillEnhancerBootClient.saveAllCourse(courseModelList);
    }

    @PutMapping("/course/{id}")
    CourseModel updateById(@PathVariable Long id, @RequestBody CourseModel courseModel) {
        return skillEnhancerBootClient.updateById(id, courseModel);
    }

    @GetMapping("/course/{id}")
    CourseModel getRecordByIdCourse(@PathVariable Long id) {
        return skillEnhancerBootClient.getRecordByIdCourse(id);
    }

    @DeleteMapping("/course/{id}")
    void deleteRecordByIdCourse(@PathVariable Long id) {
        skillEnhancerBootClient.deleteRecordByIdCourse(id);
    }

    @PostMapping(value = "/course/upload", consumes = "multipart/form-data")
    String uploadExcelFileCourse(@RequestPart() MultipartFile file) {
        skillEnhancerBootClient.saveExcelFileCourse(file);
        return "file upload successfully";
    }

    // StudentBatch Controller Mapping

    @GetMapping("/studentBatch")
    List<StudentBatchModel> getAllStudentStudentBatch() {
        return skillEnhancerBootClient.getAllStudentStudentBatch();
    }
    @GetMapping("/studentBatch/get-records")
    List<StudentBatchModel> getAllRecordsStudentBatch(@RequestParam(value = "count" ,required = false , defaultValue = "0")
                                                      int count, @RequestParam(value = "sortBy", required = false, defaultValue = "") String sortBy){
        return skillEnhancerBootClient.getAllRecordsStudentBatch(count, sortBy);
    }
    @PostMapping("/studentBatch")
    StudentBatchModel save(@RequestBody StudentBatchModel studentBatchModel){
        return skillEnhancerBootClient.save(studentBatchModel);
    }
    @PostMapping("/studentBatch/all")
    List<StudentBatchModel> saveAllStudentBatch(@RequestBody List<StudentBatchModel> studentBatchModelList){
        return skillEnhancerBootClient.saveAllStudentBatch(studentBatchModelList);
    }
    @PutMapping("/studentBatch/{id}")
    StudentBatchModel updateById(@PathVariable Long id, @RequestBody StudentBatchModel studentBatchModel){
        return skillEnhancerBootClient.updateById(id, studentBatchModel);
    }

    @GetMapping("/studentBatch/{id}")
    StudentBatchModel getRecordByIdStudentBatch(@PathVariable Long id){
        return skillEnhancerBootClient.getRecordByIdStudentBatch(id);
    }
    @DeleteMapping("/studentBatch/{id}")
    void deleteRecordByIdStudentBatch(@PathVariable Long id){
        skillEnhancerBootClient.deleteRecordByIdStudentBatch(id);
    }
    @PostMapping(value = "/studentBatch/upload", consumes = "multipart/form-data")
    String uploadExcelFileStudentBatch(@RequestPart ("file") MultipartFile file){
        skillEnhancerBootClient.saveExcelFileStudentBatch(file);
        return "file upload successfully";
    }

    // Trainer Controller Mapping

    @GetMapping("/trainer")
    List<TrainerModel> getAllRecordsTrainer(){
        return skillEnhancerBootClient.getAllRecordsTrainer();
    }
    @GetMapping("/trainer/get-records")
    List<TrainerModel> getAllRecordsTrainer(@RequestParam(value = "count" ,required = false , defaultValue = "0")
                                            int count, @RequestParam(value = "sortBy", required = false, defaultValue = "") String sortBy){
        return skillEnhancerBootClient.getAllRecordsTrainer(count, sortBy);
    }

    @PostMapping("/trainer")
    TrainerModel save(@RequestBody TrainerModel trainerModel){
        return skillEnhancerBootClient.save(trainerModel);
    }

    @PostMapping("/trainer/all")
    List<TrainerModel> saveAllTrainer(@RequestBody List<TrainerModel> trainerModelList){
        return skillEnhancerBootClient.saveAllTrainer(trainerModelList);
    }

    @PutMapping("/trainer/{id}")
    TrainerModel updateById(@PathVariable Long id, @RequestBody TrainerModel trainerModel){
        return skillEnhancerBootClient.updateById(id, trainerModel);
    }

    @GetMapping("/trainer/{id}")
    TrainerModel getRecordByIdTrainer(@PathVariable Long id){
        return skillEnhancerBootClient.getRecordByIdTrainer(id);
    }

    @DeleteMapping("/trainer/{id}")
    void deleteRecordByIdTrainer(@PathVariable Long id){
        skillEnhancerBootClient.deleteRecordByIdTrainer(id);
    }

    @PostMapping(value = "/trainer/upload", consumes = "multipart/form-data")
    String uploadExcelFileTrainer(@RequestPart ("file") MultipartFile file){
        skillEnhancerBootClient.saveExcelFileTrainer(file);
        return "file upload successfully";
    }

    // TimeSlot Controller Mapping

    @GetMapping("/timeSlot")
    List<TimeSlotModel> getAllRecordsTimeSlot() {
        return skillEnhancerBootClient.getAllRecordsTimeSlot();
    }

    @GetMapping("/timeSlot/get-records")
    List<TimeSlotModel> getAllRecordsTimeSlot(@RequestParam(value = "count" ,required = false , defaultValue = "0")
                                              int count,@RequestParam(value = "sortBy", required = false, defaultValue = "") String sortBy){
        return skillEnhancerBootClient.getAllRecordsTimeSlot(count, sortBy);
    }
    @PostMapping("/timeSlot")
    TimeSlotModel save(@RequestBody TimeSlotModel timeSlotModel){
        return skillEnhancerBootClient.save(timeSlotModel);
    }
    @PostMapping("/timeSlot/all")
    List<TimeSlotModel> saveAllTimeSlot(@RequestBody List<TimeSlotModel> timeSlotModelList){
        return skillEnhancerBootClient.saveAllTimeSlot(timeSlotModelList);
    }
    @PutMapping("/timeSlot/{id}")
    TimeSlotModel updateById(@PathVariable Long id, @RequestBody TimeSlotModel timeSlotModel){
        return skillEnhancerBootClient.updateById(id, timeSlotModel);
    }
    @GetMapping("/timeSlot/{id}")
    TimeSlotModel getRecordByIdTimeSlot(@PathVariable Long id){
        return skillEnhancerBootClient.getRecordByIdTimeSlot(id);
    }

    @DeleteMapping("/timeSlot/{id}")
    void deleteRecordByIdTimeSlot(@PathVariable Long id){
        skillEnhancerBootClient.deleteRecordByIdTimeSlot(id);
    }
    @PostMapping(value = "/timeSlot/upload", consumes = "multipart/form-data")
    String uploadExcelFileTimeSlot(@RequestPart ("file") MultipartFile file){
        skillEnhancerBootClient.saveExcelFileTimeSlot(file);
        return "file upload successfully";
    }
}
