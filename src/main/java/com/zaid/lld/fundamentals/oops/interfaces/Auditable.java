package com.zaid.lld.fundamentals.oops.interfaces;

/**
 * Represents audit capability.
 */
public interface Auditable {

    default void audit() {
        System.out.println("Audit completed successfully.");
    }

}
