package com.mongotosql.mongotosqlimporter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.RestController;

import mongoToSQLImporter.service.DataExportService;

@RestController
public class DataExportController {

    private final DataExportService dataExportService;

    @Autowired
    public DataExportController(DataExportService dataExportService) {
        this.dataExportService = dataExportService;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void exportDataOnStartup() {
        dataExportService.exportDataFromMongoDBToMSSQL();
    }
}