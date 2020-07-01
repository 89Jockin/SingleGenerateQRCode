package com.google.zxing;



import com.google.zxing.common.BitMatrix;

import java.util.Map;

/**
 * @date: 2020/7/1 下午1:01
 * Description: $摘去zxing
 */
public interface Writer {

    /**
     * Encode a barcode using the default settings.
     *
     * @param contents The contents to encode in the barcode
     * @param format The barcode format to generate
     * @param width The preferred width in pixels
     * @param height The preferred height in pixels
     * @return {@link BitMatrix} representing encoded barcode image
     * @throws WriterException if contents cannot be encoded legally in a format
     */
    BitMatrix encode(String contents, BarcodeFormat format, int width, int height)
            throws WriterException;

    /**
     * @param contents The contents to encode in the barcode
     * @param format The barcode format to generate
     * @param width The preferred width in pixels
     * @param height The preferred height in pixels
     * @param hints Additional parameters to supply to the encoder
     * @return {@link BitMatrix} representing encoded barcode image
     * @throws WriterException if contents cannot be encoded legally in a format
     */
    BitMatrix encode(String contents,
                     BarcodeFormat format,
                     int width,
                     int height,
                     Map<EncodeHintType,?> hints)
            throws WriterException;

}