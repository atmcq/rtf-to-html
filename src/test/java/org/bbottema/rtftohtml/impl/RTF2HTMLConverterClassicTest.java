/*
 * Copyright (C) ${project.inceptionYear} Benny Bottema (benny@bennybottema.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.bbottema.rtftohtml.impl;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.bbottema.rtftohtml.impl.TestUtils.classpathFileToString;
import static org.bbottema.rtftohtml.impl.TestUtils.normalizeText;

public class RTF2HTMLConverterClassicTest {
    
    @Test
    public void testSimpleConversion() {
        String html = RTF2HTMLConverterClassic.INSTANCE.rtf2html(classpathFileToString("test-messages/input/simple-test.rtf"));
        String expectedHtml = classpathFileToString("test-messages/output/classic/simple-test.html");
        
        assertThat(normalizeText(html)).isEqualTo(normalizeText(expectedHtml));
    }
    
    @Test
    public void testComplexRtfConversion() {
        String html = RTF2HTMLConverterClassic.INSTANCE.rtf2html(classpathFileToString("test-messages/input/complex-test.rtf"));
        String expectedHtml = classpathFileToString("test-messages/output/classic/complex-test.html");
        
        assertThat(normalizeText(html)).isEqualTo(normalizeText(expectedHtml));
    }
    
    @Test
    public void testChineseRtfConversion()  {
        String html = RTF2HTMLConverterClassic.INSTANCE.rtf2html(classpathFileToString("test-messages/input/chinese-exotic-test.rtf"));
        String expectedHtml = classpathFileToString("test-messages/output/classic/chinese-exotic-test.html");
        
        assertThat(normalizeText(html)).isEqualTo(normalizeText(expectedHtml));
    }
}