package com.mongotosql.mongotosqlimporter.repository;

import com.mongotosql.mongotosqlimporter.model.MongoData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends MongoRepository<MongoData, String> {
    // Можете добавить здесь дополнительные методы для работы с данными, если это необходимо
}