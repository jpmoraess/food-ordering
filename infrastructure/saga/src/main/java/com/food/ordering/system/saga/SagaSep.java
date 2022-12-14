package com.food.ordering.system.saga;

import com.food.ordering.system.domain.event.DomainEvent;

public interface SagaSep <T, S extends DomainEvent, U extends DomainEvent>{
    S process(T data);

    U rollback(T data);
}
