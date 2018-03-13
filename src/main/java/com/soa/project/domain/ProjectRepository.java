package com.soa.project.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author :liyanhua
 * createDate:2018/03/10
 */

public interface ProjectRepository extends JpaRepository<Project, Integer>,JpaSpecificationExecutor<Project> {

    /** JpaRepository 继承于PagingAndSortingRepository接口，将返回类型 Iterable 转换成了List， 并新增了写方法
     * List<T> findAll();
     * List<T> findAll(Sort sort);
     * List<T> findAll(Iterable<ID> ids);
     * <S extends T> List<S> save(Iterable<S> entities);
     * void flush();
     * <S extends T> S saveAndFlush(S entity);
     * void deleteInBatch(Iterable<T> entities);
     * void deleteAllInBatch();
     * T getOne(ID id);
     */


    /** JpaSpecificationExecutor 实现了带条件的查询,必须和JpaRepository一起用
     *  T findOne(Specification<T>);
     *  List<T> findAll(Specification<T>);
     *  List<T> findAll(Specification<T>, Sort);
     *  List<T> findAll(Specification<T>, Pageable);
     *  long count(Specification<T>);
     */

}
