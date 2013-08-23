/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.messaging.serialize;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Provides a way to decode structured data from a backing byte stream.
 */
public interface Decoder {
    /**
     * Returns an InputStream which can be used to read raw bytes.
     */
    InputStream getInputStream();

    /**
     * Reads a long value that was written using {@link Encoder#writeLong(long)}.
     *
     * @throws EOFException when the end of the byte stream is reached.
     */
    long readLong() throws EOFException, IOException;
}
