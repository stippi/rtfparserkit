/*
 * Copyright 2013 Jon Iles
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rtfparserkit.parser.standard;

import org.junit.Test;

import com.rtfparserkit.utils.TestUtilities;

public class StandardRtfParserTest
{

   @Test
   public void testEncodingParse() throws Exception
   {
      TestUtilities.assertRtfParserDumpMatches(this, new StandardRtfParser(), "testEncodingParse");
   }

   @Test
   public void testStylesParse() throws Exception
   {
      TestUtilities.assertRtfParserDumpMatches(this, new StandardRtfParser(), "testStyles");
   }

   @Test
   public void testUnicode() throws Exception
   {
      TestUtilities.assertRtfParserDumpMatches(this, new StandardRtfParser(), "testUnicode");
   }

   @Test
   public void testNegativeUnicode() throws Exception
   {
      TestUtilities.assertRtfParserDumpMatches(this, new StandardRtfParser(), "testNegativeUnicode");
   }

   @Test
   public void testUpr() throws Exception
   {
      TestUtilities.assertRtfParserDumpMatches(this, new StandardRtfParser(), "testUpr");
   }

   @Test
   public void testHex() throws Exception
   {
      TestUtilities.assertRtfParserDumpMatches(this, new StandardRtfParser(), "testHex");
   }

   @Test
   public void testMultiByteHex() throws Exception
   {
      TestUtilities.assertRtfParserDumpMatches(this, new StandardRtfParser(), "testMultiByteHex");
   }

   @Test
   public void testSpecialChars() throws Exception
   {
      TestUtilities.assertRtfParserDumpMatches(this, new StandardRtfParser(), "testSpecialChars");
   }
}
