
package com.rtfparserkit.document.impl;

import java.util.ArrayList;
import java.util.List;

import com.rtfparserkit.document.Font;
import com.rtfparserkit.document.FontTable;

public class DefaultFontTable implements FontTable
{

   private final List<DefaultFont> fonts;

   public DefaultFontTable()
   {
      fonts = new ArrayList<DefaultFont>();
   }

   public void addFont(String name, String alternativeName, String fileName, FontFamily fontFamily)
   {
      fonts.add(new DefaultFont(name));
   }

   public int countFonts()
   {
      return fonts.size();
   }

   public Font fontAt(int index)
   {
      return fonts.get(index);
   }
}
