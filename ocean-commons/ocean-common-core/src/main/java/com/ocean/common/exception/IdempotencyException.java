package com.ocean.common.exception;

/**
 * 幂等性异常
 *
 * @author jinchao
 */
public class IdempotencyException extends RuntimeException {
    private static final long serialVersionUID = 6610083281801529147L;

    public IdempotencyException(String message) {
        super(message);
    }
}
