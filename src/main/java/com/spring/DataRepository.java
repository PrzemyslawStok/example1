package com.spring;

import org.springframework.data.repository.CrudRepository;

public interface DataRepository extends CrudRepository<Data,Integer> {
}
