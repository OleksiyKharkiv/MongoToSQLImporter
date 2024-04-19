package com.mongotosql.mongotosqlimporter.service.impl;

import com.mongotosql.mongotosqlimporter.model.MongoData;
import com.mongotosql.mongotosqlimporter.service.SqlDatabaseService;
import org.springframework.stereotype.Service;

@Service
public class SqlDatabaseServiceImpl implements SqlDatabaseService {

    @Override
    public void saveDataToMSSQL(MongoData data) {
        // Implement logic to save data to MSSQL Server
    }
}