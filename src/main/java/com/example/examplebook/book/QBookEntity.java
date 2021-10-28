package com.example.examplebook.book;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBookEntity is a Querydsl query type for BookEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBookEntity extends EntityPathBase<BookEntity> {

    private static final long serialVersionUID = 366482277L;

    public static final QBookEntity bookEntity = new QBookEntity("bookEntity");

    public final StringPath category = createString("category");

    public final DateTimePath<java.util.Date> createAt = createDateTime("createAt", java.util.Date.class);

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final StringPath name = createString("name");

    public final NumberPath<Long> sellCount = createNumber("sellCount", Long.class);

    public QBookEntity(String variable) {
        super(BookEntity.class, forVariable(variable));
    }

    public QBookEntity(Path<? extends BookEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBookEntity(PathMetadata metadata) {
        super(BookEntity.class, metadata);
    }

}

