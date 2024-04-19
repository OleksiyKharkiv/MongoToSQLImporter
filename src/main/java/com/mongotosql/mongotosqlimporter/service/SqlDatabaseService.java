package com.mongotosql.mongotosqlimporter.service;

import com.mongotosql.mongotosqlimporter.model.MongoData;

public interface SqlDatabaseService {
    void saveDataToMSSQL(MongoData data);
}
