package com.mongotosql.mongotosqlimporter.service;

import com.mongotosql.mongotosqlimporter.model.MongoData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongotosql.mongotosqlimporter.repository.DataRepository;

import java.util.List;

@Service
public class DataExportService {

    private final DataRepository dataRepository;
    private final SqlDatabaseService sqlDatabaseService;

    @Autowired
    public DataExportService(DataRepository dataRepository, SqlDatabaseService sqlDatabaseService) {
        this.dataRepository = dataRepository;
        this.sqlDatabaseService = sqlDatabaseService;
    }

    public void exportDataFromMongoDBToMSSQL() {
        // Get data from MongoDB
        List<MongoData> dataList = dataRepository.findAll();

        // Export data to MSSQL Server
        for (MongoData data : dataList) {
            sqlDatabaseService.saveDataToMSSQL(data);
        }
    }
}