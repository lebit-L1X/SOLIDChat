package com.solidchat.model.user.valueobject;

import java.io.Serializable;

public interface IValueObject<T> extends Serializable {
    boolean sameValueAs(T other);
    String toString(T value);
}
