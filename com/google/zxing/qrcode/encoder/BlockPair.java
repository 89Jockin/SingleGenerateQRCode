package com.google.zxing.qrcode.encoder;

/**
 * @date: 2020/7/1 下午2:24
 * Description: $
 */
final class BlockPair {

    private final byte[] dataBytes;
    private final byte[] errorCorrectionBytes;

    BlockPair(byte[] data, byte[] errorCorrection) {
        dataBytes = data;
        errorCorrectionBytes = errorCorrection;
    }

    public byte[] getDataBytes() {
        return dataBytes;
    }

    public byte[] getErrorCorrectionBytes() {
        return errorCorrectionBytes;
    }

}