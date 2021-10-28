package com.example.examplebook.book;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBookRentalEntity is a Querydsl query type for BookRentalEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBookRentalEntity extends EntityPathBase<BookRentalEntity> {

    private static final long serialVersionUID = 753002537L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBookRentalEntity bookRentalEntity = new QBookRentalEntity("bookRentalEntity");

    public final QBookEntity bookEntity;

    public final DateTimePath<java.util.Date> createAt = createDateTime("createAt", java.util.Date.class);

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final BooleanPath returned = createBoolean("returned");

    public final StringPath userId = createString("userId");

    public final StringPath userName = createString("userName");

    public QBookRentalEntity(String variable) {
        this(BookRentalEntity.class, forVariable(variable), INITS);
    }

    public QBookRentalEntity(Path<? extends BookRentalEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBookRentalEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBookRentalEntity(PathMetadata metadata, PathInits inits) {
        this(BookRentalEntity.class, metadata, inits);
    }

    public QBookRentalEntity(Class<? extends BookRentalEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.bookEntity = inits.isInitialized("bookEntity") ? new QBookEntity(forProperty("bookEntity")) : null;
    }

}

