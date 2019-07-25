package com.manage.system.common;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Objects;

public class Id<R,V> {

    private final Class<R> reference;

    private final V value;

    private Id(Class<R> reference, V value) {
        this.reference = reference;
        this.value = value;
    }

    public static <R, V> Id<R, V> of(Class<R> reference, V value) {

        return new Id<>(reference, value);
    }

    public V value() {
        return value;
    }



    @Override
    public int hashCode() {
        return Objects.hash(reference, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("reference", reference.getSimpleName())
                .append("value", value)
                .toString();
    }

}
