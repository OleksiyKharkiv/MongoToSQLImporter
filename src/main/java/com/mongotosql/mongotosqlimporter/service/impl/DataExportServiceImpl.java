package com.mongotosql.mongotosqlimporter.service.impl;

import com.mongotosql.mongotosqlimporter.model.MongoData;
import com.mongotosql.mongotosqlimporter.repository.DataRepository;
import com.mongotosql.mongotosqlimporter.service.DataExportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataExportServiceImpl implements DataExportService {

    private final DataRepository dataRepository;
    private final SqlDatabaseServiceImpl sqlDatabaseService;

    @Autowired
    public DataExportServiceImpl(DataRepository dataRepository, SqlDatabaseServiceImpl sqlDatabaseService) {
        this.dataRepository = dataRepository;
        this.sqlDatabaseService = sqlDatabaseService;
    }

    @Override
    public void exportDataFromMongoDBToMSSQL() {
        // Get data from MongoDB
        List<MongoData> dataList = dataRepository.findAll();

        // Export data to MSSQL Server
        for (MongoData data : dataList) {
            sqlDatabaseService.saveDataToMSSQL(data);
        }
    }
}